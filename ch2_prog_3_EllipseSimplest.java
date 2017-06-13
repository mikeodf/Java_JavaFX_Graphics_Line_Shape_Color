// EllipseeSimplest.java
/*
Ellipse : class: javafx.scene.shape.Ellipse
--------------------------------------
An instance of an Ellipse with given position and size.
Constructor:
Ellipse(centerX, centerY, radiusX, radiusY);

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
      ///////////////////////////////////////
      Ellipse ellipse1 = new Ellipse(100, 50, 80, 20);
      ///////////////////////////////////////
      root.getChildren().add(ellipse1);
           
            Scene scene = new Scene(root, 200, 100);
            stage.setTitle("Ellipse on Stage (canvas), JavaFX");
            stage.setScene(scene);
            stage.show();      
    }
}


