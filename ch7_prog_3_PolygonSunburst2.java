// PolygonSunburst2.java
/*
Polygon : javafx.scene.shape.Polygon
This is a long segmented Line. Because it is a polygon
the last point is joined to the first by straight line.

Transforms that can be applied to the Polygon.
1. Rotate(angle, pivotX,  pivotY) // Rotation.
2. Translate( x, y) // Translation
3. Scale( x,  y)    // Scaling (size changing in x and y separately).
4. Scale( x,  y,  pivotX,  pivotY)  // Scale about a pivot point.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine 
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.transform.*;

public class PolygonSunburst2 extends Application {

    public void start(Stage stage) 
    {               
           double width =  2;         
           double alphadeg = 7.5 ;
           double alphaIncrement = alphadeg ;          
           Group root = new Group();
           Double[] sunbeam1 = {0.2, 0.3, 29.0, -1.6, 43.6, 0.0, 54.9, 2.7, 63.7, 3.3, 76.3, 0.3, 87.7, -4.5, 97.3, -6.8, 108.2, -5.4, 116.9, -0.5, 125.3, 4.8, 134.4, 5.6, 144.1, 3.2, 154.9, -2.5, 165.2, -6.6, 174.7, -8.2, 182.8, -5.9, 190.7, -1.2, 199.5, 4.8, 208.0, 7.9, 219.4, 6.5, 225.1, 3.6, 237.3, -2.6, 249.6, -6.1, 262.2, -6.0, 274.5, -3.7, 285.9, -1.0, 297.2, 2.3, 307.9, 4.2, 317.9, 4.2, 328.6, 2.3, 336.8, 0.4 } ; 


           //int len = sunbeam1.length ;
           for (int i = 0; i < 48; i++) // 48 segments at 7.5 degree intervals
           {
            Polygon polygon1 = new Polygon();
            polygon1.getPoints().addAll(sunbeam1);
               
               polygon1.setStroke(Color.RED) ;  
               polygon1.setStrokeWidth(width) ;
               polygon1.getTransforms().add(new Translate(300, 300)); //  shift to x,y 
               polygon1.getTransforms().add(new Rotate(alphadeg,0,0)); //  angle, pivotX, pivotY    
               root.getChildren().add(polygon1) ; 

               alphadeg += alphaIncrement ;
           }

           alphadeg = 3.75;
           alphaIncrement = 7.5;

           for (int i = 0; i < 48; i++) // 48 segments at 7.5 degree intervals
           {
            Polygon polygon2 = new Polygon();
            polygon2.getPoints().addAll(sunbeam1);
               
               polygon2.setStroke(Color.YELLOW) ;  
               polygon2.setStrokeWidth(width) ;

               polygon2.getTransforms().add(new Translate(300, 300)); //  shift to x,y 
               polygon2.getTransforms().add(new Scale(0.94, 0.94)); //
               polygon2.getTransforms().add(new Rotate(alphadeg,0,0)); //  angle, pivotX, pivotY    
               root.getChildren().add(polygon2) ; 

               alphadeg += alphaIncrement ;
           }
           
        Scene scene = new Scene(root, 600, 600, Color.DARKBLUE);
        stage.setTitle("A Polygon Rotated and Translated. JavaFX");
        stage.setScene(scene);
        stage.show();
      
    }
}
