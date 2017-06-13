// MagnifyGlass1.java
/*
We use the sine function of trigonometry to produce a type of
magnifying optical lens that can be applied to images.
We ude the default DisplacementMap(floatMap) that has offsets of 0,
and scale factors of 1.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.effect.DisplacementMap;
import javafx.scene.effect.Effect;
import javafx.scene.effect.FloatMap;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

public class MagnifyGlass1 extends Application 
{
    final float sine_amplitude = 0.08f ;  // Set Magnification factor.

    public void start(Stage primaryStage) throws Exception {
        StackPane root = new StackPane();
        root.setPrefSize(500, 500);
      
        ImageView view = new ImageView(new Image("circular_target_grid_500.png"));
        //ImageView view = new ImageView(new Image("bella2_500.jpg"));
        //ImageView view = new ImageView(new Image("zoey_500.jpg"));
        //ImageView view = new ImageView(new Image("dog_500.jpg"));
        view.setEffect(createEffect(500, 500));
        root.getChildren().add(view);

        primaryStage.setTitle("DisplacementMap Magnifying Lens (ampliude: "+sine_amplitude+").");
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Effect createEffect(int width, int height) 
    {
        FloatMap floatMap = new FloatMap(width, height);
       
          for (int x = 0; x < width; x++) 
          { 
            /* The sine functions behaves similarly to a glass magnifying lens.
               The maginfication is powerful in the center and weak at the edges.
            */ 
            float u = (float) Math.sin(Math.PI * x / width * 2.0) * sine_amplitude;
            for (int y = 0; y < height; y++) 
            {
                float v = (float) Math.sin(Math.PI * y / height * 2.0) * sine_amplitude;
                floatMap.setSamples(x, y, u, v);
            }
        }
        
        DisplacementMap displacementMap = new DisplacementMap(floatMap);
        return displacementMap;
    }
}
