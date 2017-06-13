// Translation1.java
/*
translate( move_x,  move_y):
Translate the object by  move_x horizontally,  move_y vertically).
 
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

import javafx.scene.transform.Translate; // Translation class.

public class Translation1 extends Application { 

   public void start(Stage stage) {  

     //******************************************************************* 
     // Shapes used. Three are unchanged.
     Circle circle1 = new Circle(100, 100, 100); // Circle1, unchanged. 
       circle1.setStrokeWidth(10);
       circle1.setStroke(Color.SKYBLUE);      
       circle1.setFill(null); 
     Rectangle rect1 = new Rectangle(0, 0, 200, 200);  // Rectangle1, unchanged.
       rect1.setStrokeWidth(10);
       rect1.setStroke(Color.SKYBLUE);      
       rect1.setFill(null); 

     Rectangle rect2 = new Rectangle(100, 0, 100, 200);  // Rectangle2, unchanged. 
       rect2.setStrokeWidth(4);
       rect2.setStroke(Color.BLUE);      
       rect2.setFill(null); 

     // Shapes used. Three are transformed.
     Rectangle rect3 = new Rectangle(0, 0, 200, 200);  // Rectangle3, transformed.
       rect3.setStrokeWidth(10);
       rect3.setStroke(Color.PALEGREEN);      
       rect3.setFill(null); 

     Rectangle rect4 = new Rectangle(100, 0, 100, 200);  // Rectangle3, transformed. 
       rect4.setStrokeWidth(4);
       rect4.setStroke(Color.GREEN);      
       rect4.setFill(null); 
       
     Circle circle2 = new Circle(100, 100, 100); // Circle2, transformed. 
       circle2.setStrokeWidth(10); 
       circle2.setStroke(Color.PALEGREEN);      
       circle2.setFill(null); 
     //*******************************************************************  
      // Construction/instantiation to enable translation to take place     
      Translate translate = new Translate(); 

      //Translation: Setting the X,Y coordinates. 
      translate.setX(220); 
      translate.setY(120);   
      
      //Executing the translation on circle2, rect3,  rect4 
      circle2.getTransforms().addAll(translate); 
      rect3.getTransforms().addAll(translate); 
      rect4.getTransforms().addAll(translate);
      
      Group root = new Group(circle1,circle2, rect1, rect2, rect3, rect4); 
      Scene scene = new Scene(root, 460, 370);  
      stage.setTitle("Translation transformation"); 
      stage.setScene(scene); 
      stage.show(); 
   }
  
} 

