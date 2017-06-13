// PolylineSimplest.java
/*
Polyline : class: javafx.scene.shape.Polyline
--------------------------------------
An instance of a Polyline with given positions.
Constructor:
Polyline(x1, y1, x2, y2, x3, y3, etc);

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.shape.*; // Graphic primitives library.

public class PolylineSimplest extends Application 
{
    public void start(Stage stage) 
    {
           Group root = new Group();
      ///////////////////////////////////////
      Polyline polyline1 = new Polyline(10, 10, 50, 50, 100, 10);
      ///////////////////////////////////////
      root.getChildren().add(polyline1);
           
            Scene scene = new Scene(root, 160, 60);
            stage.setTitle("Polyline on Stage (canvas), JavaFX");
            stage.setScene(scene);
            stage.show();      
    }
}


