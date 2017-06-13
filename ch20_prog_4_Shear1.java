// Shear1.java
/*
shear( shear_x,  shear_y):
Shear the object by shear_x  in the horizontal and shear_y  in the vertical.

shear( shear_x,  shear_y,  pivotX,  pivotY):
Shear the object by shear_x   and shear_y   about the given pivot point.
 
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

import javafx.scene.transform.Shear; // Shear class

public class Shear1 extends Application { 

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
      // Construction/instantiation to enable shear to take place      
      Shear shear = new Shear();               
      
      //Shear: Setting the horizontal and vertical shear distortion. 
      shear.setX(1.0); 
      shear.setY(0.0);     
      shear.setPivotX(0);
      shear.setPivotY(0);    
      
      //Adding shear to circle2, rect3,  rect4 
      circle2.getTransforms().addAll(shear); 
      rect3.getTransforms().addAll(shear); 
      rect4.getTransforms().addAll(shear);
      
      Group root = new Group(circle1,circle2, rect1, rect2, rect3, rect4); 
      Scene scene = new Scene(root, 700, 400);  
      stage.setTitle("Shear (x=1, y=0) transformation"); 
      stage.setScene(scene); 
      stage.show(); 
   }
  
} 

