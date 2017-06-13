// groupSceneStage3.java
/*
Group 5 graphic objects together.
A Group node contains the list of visible graphic children.
They are rendered in sequence (as wridden in the java code) whenever this parent node is rendered.

Tested on: java version "java-8-oracle"
Author: MadProgrammer [Mike Ohlson de Fine] 
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.paint.*;
import javafx.scene.shape.*;

public class groupSceneStage3 extends Application {

    public void start(Stage primaryStage)
       {
        primaryStage.setTitle("A Stage containing a scene"); 
    
        Group rootGroup1 = new Group(); // A root node.
        Group rootGroup2 = new Group(); // Another root node.

        Label label1 = new Label("This Label is a node on the primary stage.");
        Circle circ1 = new Circle(20, 60, 10, Color.BLUE);
        Circle circ2 = new Circle(40, 60, 15, Color.YELLOW);
        Circle circ3 = new Circle(60, 60, 20, Color.GREEN);
        Circle circ4 = new Circle(80, 60, 25, Color.RED);

        rootGroup1.getChildren().add(label1);
        rootGroup1.getChildren().add(circ1);

        rootGroup2.getChildren().add(circ2);
        rootGroup2.getChildren().add(circ3);
        rootGroup2.getChildren().add(circ4);
       
        Scene scene1 = new Scene(rootGroup1, 300, 100, Color.LIGHTBLUE);  
        Scene scene2 = new Scene(rootGroup1, 300, 100, Color.LIGHTBLUE);
        primaryStage.setScene(scene1);       
        primaryStage.show();
        }  
}
