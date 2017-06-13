// PolygonSunburst5.java
/*
Construntion of a custom method or function to make polygons with 
particular properties.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine 
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.transform.*;
import java.lang.reflect.Array; 

public class PolygonSunburst5 extends Application {

//======================================================
//   Method/Function
//======================================================
Polygon make_Polygon(Double[] poly_shape, Color kulaStroke, Color kulaFill, int width, 
                  double shiftX, double shiftY, double rotateAlpha)
     {
               Polygon poly = new Polygon(); 
               poly.getPoints().addAll(poly_shape);
               poly.setStroke(kulaStroke) ;  
               poly.setFill(kulaFill) ;  
               poly.setStrokeWidth(width) ;
               poly.getTransforms().add(new Translate(shiftX, shiftY)); //  shift to x,y 
               poly.getTransforms().add(new Rotate(rotateAlpha,0,0)); //  angle, pivotX, pivotY  
               return poly;  
     } 

//======================================================
//   Main Execution
//======================================================

    public void start(Stage stage) 
    {               
           int width =  2;         
           double alphadeg = 7.5 ;
           double alphaIncrement = alphadeg ;          
           Group root = new Group();
           Double[] spindle = { 589.2,0.294, 575.3,2.794, 562.8,5.594, 551.4,10.29,
540.7,15.6,530.,22.4, 516.7,27.1, 506.4,26.4, 495.7,19.9, 487.1,10.59,
473.2,-5.106, 462.5,-17.2, 452.5,-25.4, 441.,-30.4, 426.7,-30.1, 
419.2,-26.9, 413.5,-22.9, 406.,-16.5, 377.5,16.7, 366.7,26.4, 353.5,32.4,
340.7,32.1, 328.2,25.3, 318.2,15.3, 292.5,-15.4, 279.6,-26.9, 265.3,-35.8, 
252.8,-39., 240.3,-39., 226.4,-30.8, 218.9,-25.4, 201.7,-7.91, 188.9,5.994, 
163.5,30.6, 151.4,38.85, 137.8,44.21, 121.7,43.85, 105.,38.49, 92.14,31., 
75.74,17.4, 66.44,10.59, 47.54,3.094, 1.397,0.4256, 47.54,-1.886, 66.44,
-9.386, 75.74,-16.19, 92.14,-29.79, 105.,-37.28, 121.7,-42.64, 137.8,-43., 
151.4,-37.64, 163.5,-29.39, 188.9,-4.786, 201.7,9.114, 218.9,26.61, 
226.4,32.01, 240.3,40.21, 252.8,40.21, 265.3,37.01, 279.6,28.11,
292.5,16.61, 318.2,-14.09, 328.2,-24.09, 340.7,-30.89, 353.5,-31.19, 
366.7,-25.19, 377.5,-15.49, 406.,17.71, 413.5,24.11, 419.2,28.11,
 426.7,31.31, 441.,31.61, 452.5,26.61, 462.5,18.41, 473.2,6.314, 
487.1,-9.386, 495.7,-18.69, 506.4,-25.19, 516.7,-25.89, 530.,-21.19, 
540.7,-14.39, 551.4,-9.086, 562.8,-4.386, 575.3,-1.586, 589.2,0.9143, 616.2,0.4254
  };

           int len_spindle =  Array.getLength(spindle); 
           Double[] spindle2 = new Double[len_spindle]; // make an independent array.
           Double[] spindle3 = new Double[len_spindle]; // make an independent array.
           Double[] spindle4 = new Double[len_spindle]; // make an independent array.
           Double[] spindle5 = new Double[len_spindle]; // make an independent array.

           for ( int k=0; k<len_spindle/2; k++)
           { 
                spindle2[2*k]   =  spindle[2*k] * 1.0;  
                spindle2[1+2*k] =  spindle[1+2*k] * 0.8;    

                spindle3[2*k]   =  spindle[2*k] * 1.0;  
                spindle3[1+2*k] =  spindle[1+2*k] * 0.6;          

                spindle4[2*k]   =  spindle[2*k] * 1.0;  
                spindle4[1+2*k] =  spindle[1+2*k] * 0.4;  

                spindle5[2*k]   =  spindle[2*k] * 1.0;  
                spindle5[1+2*k] =  spindle[1+2*k] * 0.2;                               
           };

           for (int i = 0; i < 48; i++) // 48 segments at 7.5 degree intervals
           {

               Polygon poly5 = make_Polygon(spindle5, Color.CYAN, Color.CYAN, width, 
                 300, 300, alphadeg) ;
               root.getChildren().add(poly5) ; 

               Polygon poly4 = make_Polygon(spindle4, Color.WHITE, null, width, 
                 300, 300, alphadeg) ;
               root.getChildren().add(poly4) ; 

               Polygon poly3 = make_Polygon(spindle3, Color.YELLOW, null, width, 
                 300, 300, alphadeg) ;
               root.getChildren().add(poly3) ; 

               Polygon poly2 = make_Polygon(spindle2, Color.ORANGE, null, 3, 
                 300, 300, alphadeg) ;
               root.getChildren().add(poly2) ; 

               Polygon poly1 = make_Polygon(spindle, Color.RED, null, 4, 
                 300, 300, alphadeg) ;
               root.getChildren().add(poly1) ; 
   
               alphadeg += alphaIncrement ;
           };
 
//======================================================
//   Graphic Drawing
//======================================================   
        Scene scene = new Scene(root, 1000, 1000, Color.DARKBLUE);
        stage.setTitle("A Multi-Polygon Rotated and Translated. JavaFX");
        stage.setScene(scene);
        stage.show();      
    }
}
