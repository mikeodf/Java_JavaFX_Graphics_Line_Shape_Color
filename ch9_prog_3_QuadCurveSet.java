// CubicCurveSet.java
/*
Repeated constructors creating a set of progressively different
cubic curves.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine 
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*; // Graphic primitives library.

public class CubicCurveSet extends Application 
{ 
      double m1, c1, deltx;
      double x1 = 50 ; 
      double y1 = 300 ; 
      double x2 = 210 ; 
      double y2 = 280 ; 
      double x3 = 500 ;
      double y3 = 250 ;
      double x4 = 500 ;
      double y4 = 250 ;
      
    public void start(Stage stage) 
    {
           Group root = new Group();
     
      for (int i = 0; i<60; i++ )
      {  
         CubicCurve CCSet = new CubicCurve() ;
         CCSet.setStartX(x1);     //  x start point.
         CCSet.setStartY(y1);     //  y start point.
         CCSet.setEndX(x2);       //  x end point.
         CCSet.setEndY(y2);       //  y end point.
         CCSet.setControlX(x3);   //  x control point.
         CCSet.setControlY(y3);   //  y control point.
         CCSet.setFill(null);
         CCSet.setStrokeWidth(1);
         CCSet.setStroke(Color.BLACK);
         root.getChildren().add(CCSet); 
         y2 -= 4 ;
         y3 += 8 ;
         x3 += 5 ; 
      };
            Scene scene = new Scene(root, 500, 500);
            stage.setTitle("Quadratic Bezier curve on Stage, JavaFX");
            stage.setScene(scene);
            stage.show();      
    }
}


