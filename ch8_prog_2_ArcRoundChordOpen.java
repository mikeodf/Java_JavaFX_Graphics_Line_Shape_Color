// ArcRoundChordOpen.java
/*
Arc : class: javafx.scene.shape.Arc
--------------------------------------
An instance of Arc with given position and size.
Constructor:
Arc(CenterX, CenterY,  RadiusX, RadiusY, AtartAngle, ArcLength);
Closure default is OPEN. 
Other optionsa are CHORD and ROUND.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.shape.*; 
import javafx.scene.paint.Color;

public class ArcRoundChordOpen extends Application 
{
    public void start(Stage stage) 
    {
           Group root = new Group();
      //***************************************
      Arc arc = new Arc(230, 80, 200, 50, 45, 270);
      arc.setFill(null);
      arc.setStrokeWidth(6);
      arc.setStroke(Color.DARKBLUE);
      arc.setType(ArcType.ROUND); // Round - "Pie slice shape"
      //arc.setType(ArcType.CHORD); // Chord - A straight line across the end.
      //arc.setType(ArcType.OPEN);  // Open - Simply not closed.
      //***************************************
      root.getChildren().add(arc);
           
            Scene scene = new Scene(root, 400, 160);
            stage.setTitle("Arc:  arc.setType(ArcType.ROUND);");
            //stage.setTitle("Arc:  arc.setType(ArcType.CHORD);");
            //stage.setTitle("Arc:  arc.setType(ArcType.OPEN);");
            stage.setScene(scene);
            stage.show();      
    }
}
