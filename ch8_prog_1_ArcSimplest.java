// ArcSimplest.java
/*
Arc : class: javafx.scene.shape.Arc
--------------------------------------
An instance of Arc with given position and size.
Constructor:
Arc(CenterX, CenterY,  RadiusX, RadiusY, AtartAngle, ArcLength);

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.shape.*; 

public class ArcSimplest extends Application 
{
    public void start(Stage stage) 
    {
           Group root = new Group();
      //***************************************
      Arc arc = new Arc(100, 50, 50, 25, 45, 270);
      //***************************************
      root.getChildren().add(arc);
           
            Scene scene = new Scene(root, 200, 100);
            stage.setTitle("An arc Stage (canvas), JavaFX");
            stage.setScene(scene);
            stage.show();      
    }
}
