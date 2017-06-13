// EllipseSimplest.java
/*
Ellipse : class: javafx.scene.shape.Ellipse
--------------------------------------
Constructors:
1. Ellipse(); An ellipse with no size or location given.
2. Ellipse(radiusX, radiusY); An ellipse with the major and minor radii given.
3. Ellipse(centerX, centerY, radiusX, radiusY); An ellipse with radii and position specified. 

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.shape.*; // Graphic primitives library.

public class EllipseSimplest extends Application 
{
    public void start(Stage stage) 
    {
           Group root = new Group();
      //***************************************
      Ellipse ellipse1 = new Ellipse(180, 50, 80, 30);
      //***************************************
      root.getChildren().add(ellipse1);
           
            Scene scene = new Scene(root, 360, 100);
            stage.setTitle("Ellipsee on Stage (ie. canvas), JavaFX");
            stage.setScene(scene);
            stage.show();      
    }
}
