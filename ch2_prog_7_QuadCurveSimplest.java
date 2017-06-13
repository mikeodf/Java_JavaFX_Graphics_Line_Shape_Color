// QuadCurveSimplest.java
/*
QuadCurve : class: javafx.scene.shape.QuadCurve
--------------------------------------
An instance of a QuadCurve with given positions.
Constructor:
QuadCurve(startX, startY, controlX, controlY, endX, endY) 

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.shape.*; // Graphic primitives library.

public class QuadCurveSimplest extends Application 
{
    public void start(Stage stage) 
    {
           Group root = new Group();
      ///////////////////////////////////////
      QuadCurve quadCurve1 = new QuadCurve(10, 10, 50, 100, 100, 10);
      ///////////////////////////////////////
      root.getChildren().add(quadCurve1);
           
            Scene scene = new Scene(root, 160, 60);
            stage.setTitle("QuadCurve on Stage (canvas), JavaFX");
            stage.setScene(scene);
            stage.show();      
    }
}


