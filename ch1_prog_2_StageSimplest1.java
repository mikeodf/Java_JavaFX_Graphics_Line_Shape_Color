// StageSimplest1.java
/*

Stage.
The JavaFX Stage class is the top level JavaFX container. 
The primary Stage is constructed by the platform operating system. 
Additional Stage objects may be constructed by the application.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine 
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;


public class StageSimplest1 extends Application {  
  
   public void start(Stage primaryStage)
   { 
      /* 
      This is where our code for our JavaFX application will be. 
      The stage, scene, scene graph, the creation and control of 
      graphic objects etc.) 
      */  
    primaryStage.show(); // Without this instruction no window appears.    
   }         

} 



