// PolygonSimplest.java
/*
Polygon : class: javafx.scene.shape.Polygon
--------------------------------------
An instance of a Triangle with given position.
The Parameters are simply a list of (x,y) postitions called vertexes.
Constructor:
Polygon(x1, y1, x2, y2, x3, y3, etc);

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.shape.*; // Graphic primitives library.

public class PolygonSimplest extends Application 
{
    public void start(Stage stage) 
    {
           Group root = new Group();
      ///////////////////////////////////////
      Polygon polygon1 = new Polygon(10, 10, 50, 50, 100, 10);
      ///////////////////////////////////////
      root.getChildren().add(polygon1);
           
            Scene scene = new Scene(root, 160, 60);
            stage.setTitle("Polygon on Stage (canvas), JavaFX");
            stage.setScene(scene);
            stage.show();      
    }
}
