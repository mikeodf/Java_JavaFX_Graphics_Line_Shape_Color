// GradientFillOpacityRectangle1.java
/*
Three Rectangles with various opacities.

Constructor 
LinearGradient(double startX, double startY, double endX, double endY, boolean proportional, CycleMethod cycleMethod, Stop... stops).

Opacity.
Opacity is a measure of how non-transparent a 'paint' is.
It is specified as a number between 0.0 (fully transparent) and 1.0 (fully opaque).
For example, Color.rgb(  0,   255,  255,  0.8) is yellow an 80% opaque.

Linear Gradient:
The LinearGradient class fills a shape with a linear color gradient pattern. 
The user may specify two or more gradient colors, and this Paint will provide an interpolation between each color.

Tested on: java version "java-8-oracle"
Author: MadProgrammer [Mike Ohlson de Fine] 
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;

public class GradientFillOpacityRectangle1 extends Application {
    public void start(Stage stage) 
    {
           Group root = new Group();

           Rectangle rect1 = new Rectangle();
           rect1.setX(40.0f);            // Size and location on the JavaFX scene.
           rect1.setY(20.0f);
           rect1.setWidth(260.0f);
           rect1.setHeight(160.0f);
           rect1.setStrokeWidth(6.0f); // Appearance of the outline.
           rect1.setStroke(Color.BLUE);
           rect1.setStrokeType(StrokeType.INSIDE); //Stroke insides inner rectangle.

           Rectangle rect2 = new Rectangle();
           rect2.setX(80.0f);            // Size and location on the JavaFX scene.
           rect2.setY(60.0f);
           rect2.setWidth(260.0f);
           rect2.setHeight(160.0f);
           rect2.setStrokeWidth(6.0f); // Appearance of the outline.
           rect2.setStroke(Color.RED);
           rect2.setStrokeType(StrokeType.INSIDE); //Stroke insides inner rectangle.

           Rectangle rect3 = new Rectangle();
           rect3.setX(120.0f);            // Size and location on the JavaFX scene.
           rect3.setY(100.0f);
           rect3.setWidth(260.0f);
           rect3.setHeight(160.0f);
           rect3.setStrokeWidth(6.0f); // Appearance of the outline.
           rect3.setStroke(Color.GREEN);
           rect3.setStrokeType(StrokeType.INSIDE); //Stroke insides inner rectangle.

           // Fill Properties 1
           LinearGradient lingrad1 = new LinearGradient(
                0,    // start X 
                0,    // start Y
                0,    // end X
                1,    // end Y
                true, // proportional
                CycleMethod.NO_CYCLE, // cycle colors
                // stops: given by the two lines below
                //                      red, green, blue, opacity  
                new Stop(0.1f, Color.rgb(0,   250,     0,  .8)),
                new Stop(1.0f, Color.rgb(0,     0,   250,  .7)));

           // Fill Properties 2
           LinearGradient lingrad2 = new LinearGradient(
                0,    // start X 
                0,    // start Y
                1,    // end X
                0,    // end Y
                true, // proportional
                CycleMethod.NO_CYCLE, // cycle colors
                // stops: given by the two lines below
                //                       red, green, blue, opacity  
                new Stop(0.1f, Color.rgb(  0,   250,  250,  0.8)),
                new Stop(1.0f, Color.rgb(250,     0,    0,   .4)));

           // Fill Properties 3
           LinearGradient lingrad3 = new LinearGradient(
                0,    // start X 
                0,    // start Y
                1,    // end X
                1,    // end Y
                true, // proportional
                CycleMethod.NO_CYCLE, // cycle colors
                // stops: given by the two lines below
                //                      red, green, blue, opacity  
                new Stop(1.0f, Color.rgb(  0,    0,  250,  .6)),
                new Stop(0.1f, Color.rgb(250,  250,    0,  .8)));

           rect1.setFill(lingrad1);
           rect2.setFill(lingrad2);
           rect3.setFill(lingrad3);

           root.getChildren().add(rect1);   // Add the rectangles to the group.
           root.getChildren().add(rect2);  
           root.getChildren().add(rect3);   
          
        Scene scene = new Scene(root, 420, 300);
        stage.setTitle("Linear Gradients with opacity variation, JavaFX");
        stage.setScene(scene);
        stage.show();
      
    }
}


