// MagnifyGlass2.java
/*
DisplacementMap Parameters:
input: The input (image or other array) to the effect that we shall be designing.
mapData: Also called a FloatMap. This is the heart of the filter-mangler. It is two algebra equations, one for X and another for Y that determine how input pixels are mapped to output pixels. 
OffsetX: A fixed shift horizontally that will be added to every pixel it is applied to.
OffsetY: A fixed shift vertically that will be added to every pixel it is applied to.
ScaleX: A scale or multiplication applied horizontally to pixels from the input.
ScaleY: A scale or multiplication applied vertically to pixels from the input.
Wrap: A boolean flag that signals whether or not the displacement operation should wrap around at the boundaries.
srcWidth: The width of the input image or source.
srcHeight: The height of the input image or source.

DisplacementMap Constructors:
1. DisplacementMap(): A DisplacementMap with the default parameters.
2. DisplacementMap(FloatMap_mapData): A DisplacementMap with the specified mapData.
3. DisplacementMap(FloatMap_mapData, offsetX, offsetY, scaleX, scaleY):

The parameters of the DisplacementMapare listed below:
mapData - the map data for this displacement effect. The distorting transform.
offsetX - the offset, as a proportion of the image width, by which all x coordinate offset values in the FloatMap are displaced after they are scaled
offsetY - the offset, as a proportion of the image width,by which all y coordinate offset values in the FloatMap are displaced after they are scaled
scaleX - the scale factor by which all x coordinate offset values in the FloatMap are multiplied, or scaled up.
scaleY - the scale factor by which all y coordinate values in the FloatMap are multiplied, or scaled up.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.effect.DisplacementMap;
import javafx.scene.effect.Effect;
import javafx.scene.effect.FloatMap;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

public class MagnifyGlass2 extends Application 
{
    final float sine_amplitude = 0.08f ;  // Set Magnification factor of FloatMaplens.
    final float offsetX = 0.0f ;          // offsetX in DisplacementMap
    final float offsetY = 0.0f ;
    final float scaleX = 1.0f ;           // Scale (multiplicaion) factor.
    final float scaleY = 0.1f ;             

    public void start(Stage primaryStage) throws Exception {
        StackPane root = new StackPane();
        root.setPrefSize(500, 500);
      
        // Various test images, each 500 pixels wide.
        ImageView view = new ImageView(new Image("circular_target_grid_500.png"));
        //ImageView view = new ImageView(new Image("bella2_500.jpg"));
        //ImageView view = new ImageView(new Image("zoey_500.jpg"));
        //ImageView view = new ImageView(new Image("dog_500.jpg"));
        view.setEffect(createEffect(500, 500));
        root.getChildren().add(view);

        primaryStage.setTitle("DispMap Lens: ampliude: "+sine_amplitude+", offsetY: " + offsetY+", scaleY: "+scaleY );
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Effect createEffect(int width, int height) 
    {
        FloatMap floatMapLens = new FloatMap(width, height);

          for (int x = 0; x < width; x++) 
          { 
            /* The sine functions behaves similarly to a glass magnifying lens.
               The maginfication is powerful in the center and weak at the edges.
            */ 
            float u = (float) Math.sin(Math.PI * x / width * 2.0) * sine_amplitude;
            for (int y = 0; y < height; y++) 
            {
                float v = (float) Math.sin(Math.PI * y / height * 2.0) * sine_amplitude;
                floatMapLens.setSamples(x, y, u, v);
            }
        }

        DisplacementMap displacementMap = new DisplacementMap(floatMapLens, offsetX, offsetY, scaleX, scaleY);
        return displacementMap;
    }
}
