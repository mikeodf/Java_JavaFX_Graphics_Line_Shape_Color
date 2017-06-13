// ArcToSweepFlag1.java
/*
The state of the SweepFlag determines whether the path is 
clockwise [ SweepFlag(true) ],
or
anticlockwise [ SweepFlag(false) ].

Arc : class: javafx.scene.shape.ArcTo
--------------------------------------
An instance of ArcTo with given position and size.
Constructors:
1. ArcTo();  or
2. ArcTo(RadiusX, RadiusY, StartAngle, xAxisRotation, x, y, largeArcFlag, sweepFlag);

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*; 

public class ArcToSweepFlag1 extends Application 
{
    public void start(Stage stage) 
    {
      Group root = new Group();
          
          // ArcTo1 with LargeArcFlag(true)
          ArcTo arcTo1 = new ArcTo();
          arcTo1.setX(360);      // End position
          arcTo1.setY(60);       // End position
          arcTo1.setRadiusX(160);
          arcTo1.setRadiusY(40);  
          //************************************************************
          arcTo1.setSweepFlag(true); // "true" go clockwise from the start.
          arcTo1.setLargeArcFlag(true); // "true" go the long way around
          //************************************************************
          Path path1 = new Path(new MoveTo(80,  60), arcTo1);  // Start position, an arc
          path1.setStroke(Color.GREEN);
          path1.setStrokeWidth(6.);  
          root.getChildren().add(path1); 

          
          // ArcTo2 with LargeArcFlag(false)
          ArcTo arcTo2 = new ArcTo();
          arcTo2.setX(360);      // End position
          arcTo2.setY(60);       // End position
          arcTo2.setRadiusX(160);
          arcTo2.setRadiusY(40);  
          //************************************************************
          arcTo2.setLargeArcFlag(false); // "true" go the long way around
          //arcTo2.setSweepFlag(false); // "false" is the default, anti-clockwise.
          //************************************************************
          Path path2 = new Path(new MoveTo(80,  60), arcTo2);  // Start position, an arc
          path2.setStroke(Color.GREY);
          path2.setStrokeWidth(10.);  
          root.getChildren().add(path2); 
         
      Scene scene = new Scene(root, 450, 150);
      stage.setTitle("ArcTo(...), SweepFlag=true ->clockwise sweep");
      stage.setScene(scene);
      stage.show();      
    }
}


