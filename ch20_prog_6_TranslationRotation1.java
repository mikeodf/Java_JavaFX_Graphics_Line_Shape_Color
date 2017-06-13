// TranslationRotation1.java
/*
First transate the objects, then rotate them
 
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
import javafx.scene.transform.Rotate;  // Rotation class.

public class RotationTranslation1 extends Application { 

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
      Rotate rotate = new Rotate();

      //Translation set up (not execution): Set the X,Y coordinates. 
      translate.setX(220); 
      translate.setY(120); 

      //Rotation: set up (not execution): Set the angle of rotation. 
      rotate.setAngle(40); 
 
      /* SEQUENCE OF TRANSFORM EXECUTION:
         first translate then rotate.
         The actual execution of the transform occurs when the
         instruction "nodeN.getTransforms().addAll(rotate);"
         is executed.
      */
      
      //FIRST: Executing the translation on circle2, rect3,  rect4 
      circle2.getTransforms().addAll(translate); 
      rect3.getTransforms().addAll(translate); 
      rect4.getTransforms().addAll(translate);
     //SECOND: Execute rotation to circle2, rect3,  rect4 
      circle2.getTransforms().addAll(rotate); 
      rect3.getTransforms().addAll(rotate); 
      rect4.getTransforms().addAll(rotate);  

     
      Group root = new Group(circle1,circle2, rect1, rect2, rect3, rect4); 
      Scene scene = new Scene(root, 460, 460);  
      stage.setTitle("Translation followed by Translation transformation"); 
      stage.setScene(scene); 
      stage.show(); 
   }
  
} 

