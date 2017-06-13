// ArcTo_Creative3.java
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

public class ArcTo_Creative3 extends Application 
{
    public void start(Stage stage) 
    {
           Group root = new Group();
      //***************************************
    double cenX = 200 ;
    double cenY = 100 ; 
    double radX = 100 ;
    double radY = 50 ; 
    double startX = cenX - radX ;
    double startY = cenY  ; 
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

    endX = endX +80;
    endY = endY +50;
    ArcTo arcTo1 = new ArcTo(); // 1
    arcTo1.setX(endX);
    arcTo1.setY(endY);    
    arcTo1.setRadiusX(radX);
    arcTo1.setRadiusY(radY);  
    arcTo1.setSweepFlag(false);
    arcTo1.setLargeArcFlag(false);
    System.out.println("arcTo1: largeArcFlag = " + arcTo1.isLargeArcFlag()); // false is the default.
    System.out.println("arcTo1: sweepFlag = " + arcTo1.isSweepFlag());       // false is the default.  
 
    endX = endX +120;
    //endY = endY +10;    
    ArcTo arcTo2 = new ArcTo();  // 2
    arcTo2.setX(endX);
    arcTo2.setY(endY);    
    arcTo2.setRadiusX(radX);
    arcTo2.setRadiusY(radY);  
    arcTo2.setSweepFlag(false);
    arcTo2.setLargeArcFlag(false);
    System.out.println("arcTo1: largeArcFlag = " + arcTo2.isLargeArcFlag()); // false is the default.
    System.out.println("arcTo1: sweepFlag = " + arcTo2.isSweepFlag());       // false is the default.   

    endX = endX +160;
    endY = endY +30;    
    ArcTo arcTo3 = new ArcTo();  // 3
    arcTo3.setX(endX);
    arcTo3.setY(endY);    
    arcTo3.setRadiusX(radX);
    arcTo3.setRadiusY(radY);  
    arcTo3.setSweepFlag(false);
    arcTo3.setLargeArcFlag(false);
    System.out.println("arcTo3: largeArcFlag = " + arcTo3.isLargeArcFlag()); // false is the default.
    System.out.println("arcTo3: sweepFlag = " + arcTo3.isSweepFlag());       // false is the default.  

    endX = endX +160;
    //endY = endY +50;    
    ArcTo arcTo4 = new ArcTo();  // 4
    arcTo4.setX(endX);
    arcTo4.setY(endY);    
    arcTo4.setRadiusX(radX);
    arcTo4.setRadiusY(radY);  
    arcTo4.setSweepFlag(false);
    arcTo4.setLargeArcFlag(false);
    System.out.println("arcTo4: largeArcFlag = " + arcTo4.isLargeArcFlag()); // false is the default.
    System.out.println("arcTo4: sweepFlag = " + arcTo4.isSweepFlag());       // false is the default.  
    
     Path path1 = new Path(new MoveTo(startX, startY), arcTo1, arcTo2, arcTo3, arcTo4);
        path1.setStrokeWidth(6); 
        path1.setStroke(Color.BLUE); 
        root.getChildren().add(path1);
   
      //***************************************        
            Scene scene = new Scene(root, 800, 300);
            stage.setTitle("1:  ArcTo's Single Path:LargeArcFlags = false, SweepFlags = false.");
            stage.setScene(scene);
            stage.show();      
    }
}


