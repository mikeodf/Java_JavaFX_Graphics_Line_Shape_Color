// PathSimplest.java
/*
Path : class: javafx.scene.shape.Path
--------------------------------------
Note: QuadCurve(startX, startY, controlX1, controlY1, endX, endY) ;
Constructor for path omits first point for each add segment because
the first point is taken from the current position,
that is, the last point of the previous segment:
MoveTo(startX, startY);
QuadCurve(controlX1, controlY1, endX, endY) ; //StartX,Y from MoveTo.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine 
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.shape.*; // Graphic primitives library.

public class PathSimplest extends Application 
{
    public void start(Stage stage) 
    {
       Group root = new Group();
       Path path = new Path();

       ///////////////////////////////////////////////////////////
       MoveTo moveTo1 = new MoveTo(40, 20); // Start position x,y
       QuadCurveTo quad1 = new QuadCurveTo(80,80,   120,20); // 1st point is current position.
       QuadCurveTo quad2 = new QuadCurveTo(80,80,  160,130);
       QuadCurveTo quad3 = new QuadCurveTo(80,80,   80,170);
       QuadCurveTo quad4 = new QuadCurveTo(80,80,   20,130);
       QuadCurveTo quad5 = new QuadCurveTo(80,80,    40,20);
       //////////////////////////////////////////////////////////
       path.getElements().add(moveTo1);
       path.getElements().add(quad1);
       path.getElements().add(quad2);
       path.getElements().add(quad3);
       path.getElements().add(quad4);
       path.getElements().add(quad5);
             
       root.getChildren().add(path);
           
       Scene scene = new Scene(root, 200, 200);
       stage.setTitle("Quad Path on Stage (canvas), JavaFX");
       stage.setScene(scene);
       stage.show();      
    }
}


