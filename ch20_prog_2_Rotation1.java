// Rotation1.java
/*
rotate(angle, pivotX, pivotY):
Rotate the object by angle in degrees around a pivot point at  pivotX, pivotY
 
Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/

import javafx.application.Application; 
import javafx.stage.Stage; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.paint.Color; 
import javafx.scene.shape.Circle; 
import javafx.scene.shape.Rectangle;  

import javafx.scene.transform.Rotate;  // Rotation class.
 

public class Rotation1 extends Application { 

   public void start(Stage stage) {  

     //******************************************************************* 
     // Shapes used. Three are unchanged. 
     Circle circle1 = new Circle(200, 200, 100); // Circle1. 
       circle1.setStrokeWidth(10);
       circle1.setStroke(Color.SKYBLUE);      
       circle1.setFill(null); 

     Rectangle rect1 = new Rectangle(100, 100, 200, 200);  // Rectangle1.
       rect1.setStrokeWidth(10);
       rect1.setStroke(Color.SKYBLUE);      
       rect1.setFill(null); 

     Rectangle rect2 = new Rectangle(200, 100, 100, 200);  // Rectangle2. 
       rect2.setStrokeWidth(4);
       rect2.setStroke(Color.BLUE);      
       rect2.setFill(null); 

     // Shapes used. Three will be transformed.
     Circle circle2 = new Circle(200, 200, 100); // Circle2. 
       circle2.setStrokeWidth(10); 
       circle2.setStroke(Color.PALEGREEN);      
       circle2.setFill(null); 

     Rectangle rect3 = new Rectangle(100, 100, 200, 200);  // Rectangle3.
       rect3.setStrokeWidth(10);
       rect3.setStroke(Color.PALEGREEN);      
       rect3.setFill(null); 

     Rectangle rect4 = new Rectangle(200, 100, 100, 200);  // Rectangle3. 
       rect4.setStrokeWidth(4);
       rect4.setStroke(Color.GREEN);      
       rect4.setFill(null); 
    
     //*******************************************************************             
      Rotate rotate = new Rotate();           // Rotate.  
       
      //Rotation: Setting the angle and pivot X,Y coordinates. 
      rotate.setAngle(20); 
      rotate.setPivotX(50);
      rotate.setPivotY(50);   

      //Adding rotation to circle2, rect3,  rect4 
      circle2.getTransforms().addAll(rotate); 
      rect3.getTransforms().addAll(rotate); 
      rect4.getTransforms().addAll(rotate);
      
      Group root = new Group(circle1,circle2, rect1, rect2, rect3, rect4); 
      Scene scene = new Scene(root, 400, 420);  
      stage.setTitle("Rotation transformation"); 
      stage.setScene(scene); 
      stage.show(); 
   }
  
} 

