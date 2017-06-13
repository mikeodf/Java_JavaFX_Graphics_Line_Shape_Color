// CircleSimplest.java
/*
Circle : class: javafx.scene.shape.Circle
--------------------------------------
An instance of Circle with given position and size.
Constructor:
Circle(centerX, centerY,  radius);

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.shape.*; // Graphic primitives library.

public class CircleSimplest extends Application 
{
    public void start(Stage stage) 
    {
           Group root = new Group();
      //***************************************
      Circle circle1 = new Circle(100, 50, 40);
      //***************************************
      root.getChildren().add(circle1);
           
            Scene scene = new Scene(root, 200, 100);
            stage.setTitle("Circle on Stage (canvas), JavaFX");
            stage.setScene(scene);
            stage.show();      
    }
}
