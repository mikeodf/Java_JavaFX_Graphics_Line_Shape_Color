// DisplacementMap3.java
/*
DisplacementMap Parameters:
input: The input (image?) to the effect that we shall design.
mapData: Also called a FloatMap. This is the heart of the filter-mangler. It is algebra equations that determines how input pixels are mapped to output pixels. 
OffsetX: A fixed shift horizontally that will be added to every pixel it is applied to.
OffsetY: A fixed shift vertically that will be added to every pixel it is applied to.
ScaleX: A scale or multiplication applied horizontally to pixels form the input.
ScaleY: A scale or multiplication applied vertically to pixels form the input.
Wrap: A boolean flag that signals whether or not the displacement operation should wrap around at the boundaries.
srcWidth: The width of the input, or source, image.
srcHeight: The height of the input, or source, image.

DisplacementMap Constructors:
1. DisplacementMap(F): A DisplacementMap with the default parameters.
2. DisplacementMap(FloatMap_mapData): A DisplacementMap with the specified mapData.
3. DisplacementMap(FloatMap_mapData, offsetX, offsetY, scaleX, scaleY):
A DisplacementMap with the specified parameters.
Where the parameters are:
mapData - the map data for this displacement map effect(????????)
offsetX - the offset, in pixels, by which all x coordinate offset values in the FloatMap are displaced after they are scaled
offsetY - the offset, in pixels, by which all y coordinate offset values in the FloatMap are displaced after they are scaled
scaleX - the scale factor by which all x coordinate offset values in the FloatMap are multiplied
scaleY - the scale factor by which all y coordinate values in the FloatMap are multiplied

FloatMap Constructors:
1. FloatMap(): A FloatMap with default parameters.
2. FloatMap(width, height): A FloatMap with the specified width and height.
Further specifiable parameters:
a) setSample(x,  y, int_band, float_s): This sets the sample for a specific band at the given (x,y) location.
The band - the band to set (must be 0, 1, 2, or 3)
s - the sample value to set
b) setSamples(x,  y, float_s0, float_s1, float_s2): This sets the sample for the first three bands at the given (x,y) location.
c) setSamples(x,  y, float_s0, float_s1, float_s2, float_s3): This sets the sample for the first four bands at the given (x,y) location.

Hints from: http://javafxjq.blogspot.co.za/2016/06/63-displacementmap.html
Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.effect.DisplacementMap;
import javafx.scene.effect.FloatMap;

public class DisplacementMap4 extends Application 
{
    public void start(Stage primaryStage)
    {
    primaryStage.setTitle("DisplacementMap Image - anomalous horiz. and vert. distortion.");
    Group rootgroup = new Group();
    Scene scene = new Scene(rootgroup, 600, 600);

    int w = 500;
    int h = 500;
    FloatMap map = new FloatMap();
    map.setWidth(w);
    map.setHeight(h);

    for (int i = 0; i < w; i++) 
    {
      double v = (Math.sin(i / 20.0 * Math.PI + 90.) - 0.5) / 40.0; // i for horizontal indices.
      for (int j = 0; j < h; j++) 
      {
        double u = (Math.sin(j / 40.0 * Math.PI) - 0.5) / 40.0;  // j for vertical indices.
        //map.setSamples(i, j, 0.0f, (float) u, (float) v); // Both Vertical and horizontal. 
        map.setSamples(i, j, 0.0f, (float) u, (float) v); 
       /* map.setSample(x,y,  band_s0, band_s1, band_s2  */
      }

    DisplacementMap dismap = new DisplacementMap();
    dismap.setMapData(map);

    rootgroup.setEffect(dismap);

    Image image = new Image("source_displacement_map_500.png" );
    ImageView imv_map = new ImageView(image);
    rootgroup.getChildren().add(imv_map);

    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
}

