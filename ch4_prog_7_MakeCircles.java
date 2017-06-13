// MakeCircles.java
/*
An experiment in class architecture.
Create a function that draws any circles with no default parameters.
All parameters are specified explicitly.
This class is instantiated and used in "Javafx_Shapes1".

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine
*/

import javafx.scene.paint.*;
import javafx.scene.shape.*;

public class MakeCircles
{

       /* Method: Set up circles. The parameters give a unique appearance.
           Parameters: position x, y, fill colors, stroke colors, stroke width.
           Note that the parameters can still be modified within the method as
           we have done with the setStrokeWidth(...) parameter.  */

       public Circle make_cir1(double xx, double yy, double radius,
                           Color kula1fill, 
                           Color kula1stroke,
                           double outlineWidth)
       { 
       // Outer Circle: Position, radius and fill color.
       Circle circ1 = new Circle();
       circ1.setCenterX(xx);
       circ1.setCenterY(yy);
       circ1.setRadius(radius);           
       circ1.setFill(kula1fill);

       // Outer Circle: outline width, color and dash pattern.
       circ1.setStroke(kula1stroke);
       circ1.setStrokeWidth(outlineWidth+8);
       circ1.setStrokeLineCap(StrokeLineCap.ROUND);
       circ1.getStrokeDashArray().addAll(40d);// fill, blank.
       return circ1 ;
       }
}
