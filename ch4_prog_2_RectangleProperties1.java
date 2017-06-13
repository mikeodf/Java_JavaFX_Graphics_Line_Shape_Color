// RectangleProperties1.java
/*
A Rectangle with properties explicitly defined (no default values used).

Rectangle properties(inherited from javafx.scene.shape.Shape):
stroke, fill, strokeType, strokeWidth, strokeDashOffset, strokeLineCap,
strokeLineJoin, strokeMitreLimit, smooth.

Setting the Rectangle properties.
setFill(Paint value) : Sets the fill color.
setStrokeType(StrokeType value) : Stroke position - CENTERED, INSIDE, OUTSIDE.
setStrokeWidth(double value) : Sets the stroke width.
setStroke(Paint value) : Sets the color and transparency of the interior fill.
setStrokeDashOffset(double value) : Sets the dashed outline if needed.

//??????????setSmooth(boolean value) : Sets the value of the property smooth.
setStrokeLineCap(StrokeLineCap value) : Sets the stroke end-cap shape (only affects dashed lines).

setStrokeLineJoin(...): Corner style - ROUND,BEVEL or MITER where:
MITER: Joins path segments by extending their outside edges until they meet.
       setStrokeMiterLimit(double value) : Sets the value of the property strokeMiterLimit.
ROUND:Joins path segments by rounding off the corner at a radius of half the line width.
BEVEL: Joins path segments by connecting the outer corners of their wide outlines with a straight segment.

Constructors
Rectangle() // An empty instance of a rectangle.
Rectangle(double width, double height) 
Rectangle(double x, double y, double width, double height) 
Rectangle(double width, double height, Paint fill)


[http://o7planning.org/en/11159/javafx-line-tutorial ]
Tested on: java version "java-8-oracle"
Author: MadProgrammer [Mike Ohlson de Fine] 
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;

public class RectangleProperties1 extends Application {
    public void start(Stage stage) 
    {
           Group root = new Group();

           Rectangle rect1 = new Rectangle();

           // Size and location on the JavaFX scene.
           rect1.setX(40.0f);
           rect1.setY(20.0f);
           rect1.setWidth(220.0f);
           rect1.setHeight(100.0f);

           // Appearance of the outline.
           rect1.setStrokeWidth(10.0f);
           rect1.setStrokeLineCap(StrokeLineCap.ROUND);
           rect1.setStroke(Color.BLUE);

           rect1.setSmooth(true);
           rect1.getStrokeDashArray().addAll(40d);// fill, blank.
           //rect1.setStrokeType(StrokeType.CENTERED); // Stroke halfway across inner rectangle.
           //rect1.setStrokeType(StrokeType.INSIDE); //Stroke insides inner rectangle.
           rect1.setStrokeType(StrokeType.OUTSIDE); //Strokeoutside inner rectangle.
           
           // Corner Style: Default - square corners.
          
           // Fill Properties
           rect1.setFill(Color.VIOLET);

           root.getChildren().add(rect1);   // Add the rectangle to the group.
          
        Scene scene = new Scene(root, 290, 150);
        stage.setTitle("Outside stroke, JavaFX");
        stage.setScene(scene);
        stage.show();
      
    }
}


