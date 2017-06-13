// LineDashed.java
/*
Line : javafx.scene.shape.Line

This is a fully specified dashed Line.
The array syntax is line-gap.
Thus( 50, 20, 10, 60) which is
50 pixels line then 20 pixels blank then 10 pixels solid then 60 pixels blank
and then the whole pattern will repeat.
eg
line1.getStrokeDashArray().addAll(25d, 20d, 5d, 20d);
line2.getStrokeDashArray().addAll(50d, 40d);
line4.getStrokeDashArray().addAll(2d);

pane.getChildren().addAll(line1, line2, line3, line4, line5);

Line properties (inherited from javafx.scene.shape.Shape):
stroke, fill, strokeType, strokeWidth, strokeDashOffset, strokeLineCap,
strokeLineJoin, strokeMitreLimit

Constructors
a) Line(double startX, double startY, double endX, double endY) // An instance of Line from start to finish.
b) Line() // An empty instance of a line.
]
Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine 
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;

public class LineProperties extends Application {
    public void start(Stage stage) 
    {
           Group root = new Group();

           Line line1 = new Line();
           

           // Set the line properties below:
           line1.setStartX(10);
           line1.setStartY(20);
           line1.setEndX(580);
           line1.setEndY(20);
           line1.setStrokeWidth(4);                                       // Width of the line, pixels.
           line1.setStrokeLineCap(StrokeLineCap.ROUND); // Rounded ends of lines.
           line1.setStroke(Color.BLUE);                                  // Color of line.
           //line1.getStrokeDashArray().addAll(14d);               // Dash pattern: fill, blank, etc
           line1.getStrokeDashArray().addAll(14);               // Dash pattern: fill, blank, etc 
           line1.setStrokeDashOffset(10); //Dash pattern: to shift the beginning of the dash.

           root.getChildren().add(line1);   
          
        Scene scene = new Scene(root, 600, 80);
        stage.setTitle("A Fully specified Line, JavaFX");
        stage.setScene(scene);
        stage.show();
      
    }
}
