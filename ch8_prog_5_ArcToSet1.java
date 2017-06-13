// ArcToSet1.java
/*
Arc : class: javafx.scene.shape.Arc
--------------------------------------
An instance of Arc with given position and size.
Constructors:
ArcTo();
ArcTo(RadiusX, RadiusY, StartAngle, xAxisRotation, x, y, largeArcFlag, sweepFlag);
where:
RadiusX and RadiusY are the radii of the ellipse being used to form the arc,
xAxisRotation rotates the entire arc clockwise or anticlockwise.
x,y is the arc end point.

largArcFlag, if true will go the long way around to make the arc, the short arc if false.
sweepFlag will determine the direction of the arc.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.shape.*; 

public class ArcToSet1 extends Application 
{
    public void start(Stage stage) 

    {
           Group root = new Group();
      //***************************************
   
    // The common end position of 9 separate arcs.  
    ArcTo arcTo = new ArcTo();
    arcTo.setX(80);
    arcTo.setY(180);    
    arcTo.setRadiusX(200);
    arcTo.setRadiusY(100);    

    // 9 separate arcs, each starting in a different position.
    Path path1 = new Path(new MoveTo(20,  220), arcTo);
    Path path2 = new Path(new MoveTo(120, 220), arcTo);
    Path path3 = new Path(new MoveTo(220, 220), arcTo);
    Path path4 = new Path(new MoveTo(320, 220), arcTo);
    Path path5 = new Path(new MoveTo(420, 220), arcTo);
    Path path6 = new Path(new MoveTo(520, 220), arcTo);
    Path path7 = new Path(new MoveTo(620, 220), arcTo);
    Path path8 = new Path(new MoveTo(720, 220), arcTo);
    Path path9 = new Path(new MoveTo(820, 220), arcTo);

      root.getChildren().add(path1);
      root.getChildren().add(path2);
      root.getChildren().add(path3);
      root.getChildren().add(path4);
      root.getChildren().add(path5);
      root.getChildren().add(path6);
      root.getChildren().add(path7);
      root.getChildren().add(path8);
      root.getChildren().add(path9);
      //***************************************
         
            Scene scene = new Scene(root, 850, 250);
            stage.setTitle("A set of ArcTo's, JavaFX");
            stage.setScene(scene);
            stage.show();      
    }
}
