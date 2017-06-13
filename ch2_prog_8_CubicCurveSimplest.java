// CubicCurveSimplest.java
/*
CubicCurve : class: javafx.scene.shape.CubicCurve
--------------------------------------
An instance of a QuadCurve with given positions.
Constructor:
CubicCurve(startX, startY, controlX1, controlY1, controlX2, controlY2, endX, endY);

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.shape.*; // Graphic primitives library.

public class CubicCurveSimplest extends Application 
{
    public void start(Stage stage) 
    {
           Group root = new Group();
      ///////////////////////////////////////
      CubicCurve cubicCurve1 = new CubicCurve(10, 10, 50, 100, 100, -60, 200, 80);
      ///////////////////////////////////////
      root.getChildren().add(cubicCurve1);
           
            Scene scene = new Scene(root, 220, 100);
            stage.setTitle("CubicCurve on Stage (canvas), JavaFX");
            stage.setScene(scene);
            stage.show();      
    }
}


