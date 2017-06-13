// scenes2Stages2.java
/*
Show two stages, each with its separate group.

Tested on: java version "java-8-oracle"
Author:Mike Ohlson de Fine
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;

import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class scenes2Stages2 extends Application {

    public void start(Stage primaryStage)
       {
        /* The primary stage is instantiated (constructed) automatically
           when the "start()" method executes.
        */
        primaryStage.setTitle("The first Stage containing a scene");   

        Group rootGroup1 = new Group();    
        Label label1 = new Label("This Label is a node on the primary stage.");
        rootGroup1.getChildren().add(label1);
        Scene scene1 = new Scene(rootGroup1, 300, 120, Color.LIGHTBLUE);
        primaryStage.setScene(scene1);       
        primaryStage.show();

        new SecondStage(); // This constructs the second stage.
        }

    public class SecondStage extends Stage 
    {
         SecondStage()
         {
             Group rootGroup2 = new Group();  
             setTitle("The Second Stage(2)");
             Label label2 = new Label("This Label is a node on the second stage.");
             rootGroup2.getChildren().add(label2);
             Scene scene2 = new Scene(rootGroup2, 270, 80, Color.PINK);
             setScene(scene2);   
             show();
         }    
    }
}
