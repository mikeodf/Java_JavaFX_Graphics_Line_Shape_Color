// ArcToPathSimplest.java
/*
ArcTo : class: javafx.scene.shape.ArcTo
--------------------------------------
Constructor:
ArcTo(radiusX,radiusY, AxisRotation, x,y, largeArcFlag, sweepFlag) ;

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine 
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.shape.*; // Graphic primitives library.

public class ArcToPathSimplest extends Application 
{
    public void start(Stage stage) 
    {
       Group root = new Group();
       Path path = new Path();
       MoveTo moveTo1 = new MoveTo(40, 20); // Start position x,y
       ///////////////////////////////////////////////////////////////////////
       ArcTo arcTo1 = new ArcTo(80,30,   30,    100,100,   true, true);
       // ArcTo(radiusX,radiusY, AxisRotation, Endx,Endy, largeArcFlag, sweepFlag) ;
       ///////////////////////////////////////////////////////////////////////
       path.getElements().add(moveTo1);
       path.getElements().add(arcTo1);              
       root.getChildren().add(path);
           
       Scene scene = new Scene(root, 240, 130);
       stage.setTitle("ArcTo Path on Stage (canvas), JavaFX");
       stage.setScene(scene);
       stage.show();      
    }
}


