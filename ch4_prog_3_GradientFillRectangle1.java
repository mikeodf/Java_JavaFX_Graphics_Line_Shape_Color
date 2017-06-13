// GradientFillRectangle1.java
/*
A Rectangle with properties explicitly defined (no default values used).

Constructors 
1. LinearGradient(startX,  startY,  endX, endY, proportional, cycleMethod, List of stops)
2. LinearGradient(startX, startY, endX, endY, proportional, cycleMethod, stops)

Linear Gradient:
The LinearGradient class fills a shape with a linear color gradient pattern. 
The user may specify two or more gradient colors.

Linear gradient creates a gradient going through all the stop colors along the line between the "from" and the "to" . 
If the points are percentages, then they are relative to the size of the area being filled. 
Percentage and length sizes cannot be mixed in a single gradient function

The an array of Stops specifys how to distribute the colors along the gradient. 
The Stop#offset variable must be the range 0.0 to 1.0 and act like keyframes along the gradient. 
The offsets mark where the gradient should be exactly a particular color.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
public class GradientFillRectangle1 extends Application {
    public void start(Stage stage) 
    {
           Group root = new Group();
           Rectangle rect1 = new Rectangle();

           // Size and location of rectangle on the JavaFX scene.
           rect1.setX(40.0f);
           rect1.setY(20.0f);
           rect1.setWidth(220.0f);
           rect1.setHeight(100.0f);

           // Appearance of the outline.
           rect1.setStrokeWidth(6.0f);
           rect1.setStroke(Color.BLUE);

           // Gradient Fill (Linear) Properties
           Stop[] stops = new Stop[] { new Stop(0, Color.BLACK), new Stop(0.5, Color.RED)};
           LinearGradient lingrad1 = new LinearGradient(0, 0, 1, 0, true,    
                                                                                          CycleMethod.NO_CYCLE, stops);

           rect1.setFill(lingrad1);
           root.getChildren().add(rect1);   // Add the rectangle to the group.
          
        Scene scene = new Scene(root, 300, 160);
        stage.setTitle("Linear Gradient Fill, JavaFX");
        stage.setScene(scene);
        stage.show();
      
    }
}
