// CubicCurveSimplest.java
/*
CubicCurve : class: javafx.scene.shape.CubicCurve
--------------------------------------
Constructor:
CubicCurve cubic = new CubicCurve(startX, startY, controlX1,  controlY1, controlX2, controlY2, endX, endY);
or
CubicCurve cubic = new CubicCurve();
cubic.setStartX(0.0f);      // First point.
cubic.setStartY(50.0f);
cubic.setControlX1(25.0f);  // First control lever.
cubic.setControlY1(0.0f);
cubic.setControlX2(75.0f);  // Second control lever.
cubic.setControlY2(100.0f);
cubic.setEndX(100.0f);      // Last point.
cubic.setEndY(50.0f);
}

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
      CubicCurve cubic = new CubicCurve(20,50, 80,-100, 280,300, 200,100);
      ///////////////////////////////////////
      root.getChildren().add(cubic);
           
            Scene scene = new Scene(root, 260, 180);
            stage.setTitle("Cubic Bezier curve on Stage, JavaFX");
            stage.setScene(scene);
            stage.show();      
    }
}


