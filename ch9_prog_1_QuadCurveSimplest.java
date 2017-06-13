// QuadCurves1.java
/*
Quadcurve : class: javafx.scene.shape.QuadCurve
--------------------------------------
Constructor:
QuadCurve( StartX, StartY, , ControlX, ControlY, EndX, EndY);
quad.setStartX(x_B);
quad.setStartY(y_B);
quad.setEndX(x_C);
quad.setEndY(y_C);
quad.setControlX(x_A);
quad.setControlY(y_A);

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine 
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*; // Graphic primitives library.

public class QuadCurves1 extends Application 
{
    public void start(Stage stage) 
    {
           Group root = new Group();
      ///////////////////////////////////////
      QuadCurve quad1 = new QuadCurve(20,50,    25, 0,     50,50);      
      QuadCurve quad2 = new QuadCurve(50,50,   100,110,   150,50);
      QuadCurve quad3 = new QuadCurve(50,50,   100, 90,   150,50);
      QuadCurve quad4 = new QuadCurve(50,50,   100, 70,   150,50);
      QuadCurve quad5 = new QuadCurve(50,50,   100, 50,   150,50);
      QuadCurve quad6 = new QuadCurve(50,50,   100, 40,   150,50);
      ///////////////////////////////////////
      quad1.setFill(null);
      quad2.setFill(null);
      quad3.setFill(null);
      quad4.setFill(null);
      quad5.setFill(null);
      quad6.setFill(null);

      quad1.setStroke(Color.BLACK);
      quad2.setStroke(Color.BLACK);
      quad3.setStroke(Color.BLACK);
      quad4.setStroke(Color.BLACK);
      quad5.setStroke(Color.BLACK);
      quad6.setStroke(Color.BLACK);

      root.getChildren().add(quad1);
      root.getChildren().add(quad2);
      root.getChildren().add(quad3);
      root.getChildren().add(quad4);
      root.getChildren().add(quad5);
      root.getChildren().add(quad6);
           
            Scene scene = new Scene(root, 160, 160);
            stage.setTitle("Quadratic Bezier curve on Stage, JavaFX");
            stage.setScene(scene);
            stage.show();      
    }
}


