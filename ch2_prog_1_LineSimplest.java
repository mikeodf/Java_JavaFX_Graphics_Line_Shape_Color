// LineSimplest.java
/*
Line : class: javafx.scene.shape.Line
--------------------------------------
Constructor:
Line(startX, startY, endX, endY) ;

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine 
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.shape.*; // Graphic primitives library.

public class LineSimplest extends Application 
{
    public void start(Stage stage) 
    {
           Group root = new Group();
      ///////////////////////////////////////
      Line line1 = new Line(10, 10, 120, 30);
      ///////////////////////////////////////
      root.getChildren().add(line1);
           
            Scene scene = new Scene(root, 200, 50);
            stage.setTitle("Line on Stage (canvas), JavaFX");
            stage.setScene(scene);
            stage.show();      
    }
}


