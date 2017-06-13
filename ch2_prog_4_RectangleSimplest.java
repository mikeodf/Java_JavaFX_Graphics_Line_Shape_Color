// RectangleSimplest.java
/*
Rectangle : class: javafx.scene.shape.Rectangle
--------------------------------------
An instance of a Rectangle with given position and size.
Constructor:
Rectangle(double x, double y, double width, double height);

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.shape.*; // Graphic primitives library.

public class RectangleSimplest extends Application 
{
    public void start(Stage stage) 
    {
           Group root = new Group();
      ///////////////////////////////////////
      Rectangle rectangle1 = new Rectangle(30, 20, 80, 20);
      ///////////////////////////////////////
      root.getChildren().add(rectangle1);
           
            Scene scene = new Scene(root, 160, 50);
            stage.setTitle("Rectangle on Stage (canvas), JavaFX");
            stage.setScene(scene);
            stage.show();      
    }
}


