// MakeRctangles.java
/*
An experiment in class architecture.
Create a function that draws any rectangles with no default parameters.
All parameters are specified explicitly.
This class is instantiated and used in "Javafx_Shapes1".

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine
*/

import javafx.scene.paint.*;
import javafx.scene.shape.*;

public class MakeRectangles
{

       /* Method: Set up Rectangles, each with unique appearance.
           Parameters: position x, y, 3 fill colors, 3 stroke colors, stroke width.
           Note that the parameters can still be modified within the method as
           we have done with the setStrokeWidth(...) parameter.  */

       public Rectangle make_rec1(double xx, double yy, double xwidth, double yheight,
                           Color kula1fill, 
                           Color kula1stroke,
                           double strokew)

       { 
       // Rectangle instantiation.
       Rectangle rect1 = new Rectangle();

       // Size and location on the JavaFX scene.
           rect1.setX(xx);
           rect1.setY(yy);
           rect1.setWidth(xwidth);
           rect1.setHeight(yheight);

           // Appearance of the outline.
           rect1.setStrokeWidth(strokew);
           rect1.setStrokeLineCap(StrokeLineCap.ROUND);
           rect1.setStroke(kula1stroke);

           rect1.setSmooth(true);
           rect1.getStrokeDashArray().addAll(20d);// fill, blank.
           rect1.setStrokeType(StrokeType.CENTERED); // CENTERED, INSIDE or OUTSIDE.
          
           // Corner Style.
           rect1.setStrokeLineJoin(StrokeLineJoin.ROUND) ; // BEVEL, MITER, ROUND

           // Fill Properties
           rect1.setFill(kula1fill);
       
           // Return a Rectangle object with detailed parameter specifications. 
           return rect1 ;
       }
}


