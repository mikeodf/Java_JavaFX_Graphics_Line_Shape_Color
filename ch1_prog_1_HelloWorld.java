// JavaFX_HelloWorld.java
/*
Stage.
The JavaFX Stage class is the top level JavaFX container. 
The primary Stage is constructed by the platform operating system. 
Additional Stage objects may be constructed by the application.
Note: 1. without a final "primaryStage.show(); " instruction no window appears
and the application cannot be terminated without shutting down the terminal. 
2. A main() method is redundant - just unnecessary and a waste.   

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine 
*/
import javafx.application.Application;
import javafx.stage.Stage;

public class JavaFX_HelloWorld extends Application {  
 
   public void start(Stage primaryStage)
   { 
       System.out.println("Hello World from JavaFX!") ; 
       primaryStage.show();
   }         
   
} 



