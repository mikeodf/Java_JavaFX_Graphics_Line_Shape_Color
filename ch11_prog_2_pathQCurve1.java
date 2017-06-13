// pathQCurve_Ele1.java
/*

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine 
*/
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.*; 
import javafx.stage.Stage;

public class pathQCurve_Ele1 extends Application 
{
     public void start(Stage stage)  throws Exception 
     {
         final Group group = new Group();
         Scene scene = new Scene(group, 300, 100);
         stage.setScene(scene);
         stage.setTitle("A QuadCurve Path");

//***********************************************************************************
        Path path1 = new Path(); // Instantiate a path.
        MoveTo moveTo1 = new MoveTo(273.4,66.24); // Define start of path.
        QuadCurveTo qcrv1 = new QuadCurveTo(233.7,105,   197.3,88.14);// QuadCurve from start.
        QuadCurveTo qcrv2 = new QuadCurveTo(180.3,80.24, 190.7,60.04);
        QuadCurveTo qcrv3 = new QuadCurveTo(194.9,46.06, 182.3,35.61);
        QuadCurveTo qcrv4 = new QuadCurveTo(161.1,18.04, 120.6,24.68);

        path1.getElements().add(moveTo1); // Go to Start
        path1.getElements().add(qcrv1); // Add QuadCurve to last point (ie to the start).
        path1.getElements().add(qcrv2); // Add QuadCurve to last point.
        path1.getElements().add(qcrv3); // Add another QuadCurve to last point.
        path1.getElements().add(qcrv4); // Add the final QuadCurve.

        group.getChildren().addAll(path1); // Add the path to the group
//***********************************************************************************

          stage.show();
     }
       
}
