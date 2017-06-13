// ArcToSimplest.java
/*
Arc : class: javafx.scene.shape.ArcTo
--------------------------------------
An instance of ArcTo with given position and size.
Constructors:
1. ArcTo();  or
2. ArcTo(RadiusX, RadiusY, StartAngle, xAxisRotation, x, y, largeArcFlag, sweepFlag);
where:
RadiusX and RadiusY are the radii of the ellipse being used to form the arc,

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.shape.*; 

public class ArcToSimplest extends Application 
{
    public void start(Stage stage) 
    {
      Group root = new Group();
          //***************************************
          ArcTo arcTo = new ArcTo();
          arcTo.setX(340);       // End position
          arcTo.setY(100);       // End position
          arcTo.setRadiusX(100);
          arcTo.setRadiusY(40);    

          Path path1 = new Path(new MoveTo(60,  20), arcTo);  // Start position, an arc
          root.getChildren().add(path1);     
          //***************************************
         
      Scene scene = new Scene(root, 450, 150);
      stage.setTitle("ArcTo(...), JavaFX");
      stage.setScene(scene);
      stage.show();      
    }
}


