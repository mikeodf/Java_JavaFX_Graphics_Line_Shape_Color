// RadialGradientFillRectangle1.java
/*
A Rectangle with a radial fill pattern.
We may specify 2 or more gradient colors.
We specify the circle controlling the gradient pattern, which is defined by a center point and a radius. 
We can also specify a separate focus point within that circle, which controls the location of the first color of the gradient. By default the focus is set to be the center of the circle.

The center and radius are specified relative to a unit square, unless the proportional variable is false. 
By default proportional is true, and the gradient will be scaled to fill whatever shape it is applied to. 
The focus point is always specified relative to the center point by an angle and a distance relative to the radius.

The first color of the gradient will be the focus point, and the last color at the perimeter of the circle.
Any line drawn from the focus point to the circumference will thus span all of the gradient colors.

The focus distance will be clamped to the range (-1, 1) so that the focus point is always strictly inside the circle.

The stops: The array of Stops specifies how to distribute the colors along the gradient. 
They mark where the gradient should be exactly a particular color.

Constructor 
RadialGradient(focusAngle,
               focusDistance,
               centerX,
               centerY,
               radius,
               proportional,
               cycleMethod,
               stops)
where:
focusAngle - the angle in degrees from the center of the gradient to the focus point to which the first color is mapped
focusDistance - the distance from the center of the gradient to the focus point to which the first color is mapped
centerX - the X coordinate of the center point of the gradient's circle
centerY - the Y coordinate of the center point of the gradient's circle
radius - the radius of the circle defining the extent of the color gradient
proportional - whether the coordinates and sizes are proportional to the shape which this gradient fills
cycleMethod - cycle method applied to the gradient
stops - the gradient's color specification using a list of stops.

Tested on: java version "java-8-oracle"
Author: MadProgrammer [Mike Ohlson de Fine] 
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;

public class RadialGradientFillRectangle1 extends Application {
    public void start(Stage stage) 
    {
           Group root = new Group();
           Rectangle rect1 = new Rectangle();

           // Size and location of rectangle on the JavaFX scene.
           rect1.setX(40.0f);
           rect1.setY(20.0f);
           rect1.setWidth(300.0f);
           rect1.setHeight(200.0f);

           // Appearance of the outline.
           rect1.setStrokeWidth(6.0f);
           rect1.setStroke(Color.BLUE);

            //Stops: Set the radial gradient stop list.
            Stop[] stops = new Stop[] 
            { 
            new Stop(0.0, Color.WHITE),  
            new Stop(0.3, Color.RED), 
            new Stop(1.0, Color.DARKRED) 
            };  

            // Radial gradient set up. 
             RadialGradient radialGradient = new RadialGradient(
                   0,  // start X 
                   0,  // start Y 
                 180,  // end X
                 100,  // end Y
                  60,  // radius of the circle defining the extent of the color gradient
               false,  // proportional
               CycleMethod.NO_CYCLE, // Don't cycle colors
               stops);    // stops: given by the the 'stops' list above.

            //For rect1 set the radial fill pattern as specified above.
            rect1.setFill(radialGradient);
            root.getChildren().add(rect1);   // Add the rectangle to the group.
          
        Scene scene = new Scene(root, 400, 260);
        stage.setTitle("Radial Gradient Fill, JavaFX");
        stage.setScene(scene);
        stage.show();
      
    }
}


