// ArcTo_Creative2.java
/*
Arc : class: javafx.scene.shape.Arc
--------------------------------------
An instance of Arc with given position and size.
Constructors:
ArcTo();
ArcTo(RadiusX, RadiusY, xAxisRotation, x, y, largeArcFlag, sweepFlag);

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
import javafx.scene.paint.*; 

public class ArcTo_Creative2 extends Application 
{
    public void start(Stage stage) 
    {
           Group root = new Group();
      //***************************************

    double cenX = 700 ;
    double cenY = 200 ; 
    double radX = 200 ;
    double radY = 100 ; 
    double startX = cenX ;
    double startY = cenY+radY ; 
    double endX = cenX ;
    double endY = cenY-radY ; 


    Ellipse ellip1 =  new Ellipse(cenX, cenY, radX, radY);
    ellip1.setFill(null) ;
    ellip1.setStroke(Color.GREY) ;
    ellip1.setStrokeWidth(6) ;
    ellip1.setFill(null) ;
    root.getChildren().add(ellip1);

    Line lineV = new Line(cenX, cenY-radY, cenX, cenY+radY);
    root.getChildren().add(lineV);
     Line lineH = new Line(cenX-radX, cenY, cenX+radX, cenY);
    root.getChildren().add(lineH);


    ArcTo arcTo1 = new ArcTo();
    arcTo1.setX(endX);
    arcTo1.setY(endY);    
    arcTo1.setRadiusX(radX);
    arcTo1.setRadiusY(radY);  
    arcTo1.setSweepFlag(false);
    arcTo1.setLargeArcFlag(true);
    System.out.println("largeArcFlag = " + arcTo1.isLargeArcFlag()); // false is the default.
    System.out.println("sweepFlag = " + arcTo1.isSweepFlag());       // false is the default.   
    
    ArcTo arcTo2 = new ArcTo();
    arcTo2.setX(endX);
    arcTo2.setY(endY);    
    arcTo2.setRadiusX(radX);
    arcTo2.setRadiusY(radY);  
    arcTo2.setSweepFlag(true);
    arcTo2.setLargeArcFlag(false);
    System.out.println("largeArcFlag = " + arcTo2.isLargeArcFlag()); // false is the default.
    System.out.println("sweepFlag = " + arcTo2.isSweepFlag());       // false is the default.   
    

    for (int i = 0; i<20; i++)
    {   Path path1 = new Path(new MoveTo(startX, startY), arcTo1);
        path1.setStrokeWidth(2); 
        path1.setStroke(Color.BLUE); 
        root.getChildren().add(path1);
         startX -= 30 ;
         //startY -= 10 ;

        Path path2 = new Path(new MoveTo(startX, startY), arcTo2);
        path2.setStrokeWidth(2); 
        path2.setStroke(Color.RED); 
        root.getChildren().add(path2);
         //startX -= 12 ;
    }
      //***************************************
         
            Scene scene = new Scene(root, 1000, 400);
            stage.setTitle("ArcTo's:  RED:largeArc=false,sweep=true. BLUE: largeArc=true, sweep=false). ");
            stage.setScene(scene);
            stage.show();      
    }
}


