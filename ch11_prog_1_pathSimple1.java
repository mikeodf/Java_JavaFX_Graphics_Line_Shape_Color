// pathSimple1.java
/*
A Simple Quadratic Bezier path.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine 
*/
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.*; 
import javafx.stage.Stage;

public class pathSimple1 extends Application 
{
     public void start(Stage stage)  throws Exception 
     {
         final Group group = new Group();
         Scene scene = new Scene(group, 350, 80);
         stage.setScene(scene);
//*******************************************************************
        Path path1 = new Path(); 
        MoveTo moveTo1 = new MoveTo(20,50);  // Move to the start
        path1.getElements().add(moveTo1);

        QuadCurveTo qcrv1 = new QuadCurveTo(130,-30,   300,60); // Quad section.

        path1.getElements().add(qcrv1);
        group.getChildren().addAll(path1);
//********************************************************************
          stage.show();
     }       
}
