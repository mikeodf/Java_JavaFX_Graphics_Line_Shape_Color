// SVG_InkscapeLine1.java
/*
Defines the filling rule constant for determining the interior of the path. The value must be one of the following constants: FillRile.EVEN_ODD or FillRule.NON_ZERO. The default value is FillRule.NON_ZERO.

Tested on: java version "java-8-oracle"
Author: MadProgrammer [Mike Ohlson de Fine] 
*/
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.SVGPath;
import javafx.stage.Stage;
import javafx.scene.paint.*;

public class SVG_InkscapeLine1 extends Application {

  @Override
  public void start(Stage stage) {
    final Group group = new Group();
    Scene scene = new Scene(group, 300, 330);
    stage.setScene(scene);
    stage.setTitle("Vector line from Inkscape");

    SVGPath svg = new SVGPath();
    //svg.setContent("M40,60 C42,48 44,30 25,32");
svg.setContent("M 0,1.804 L 53.54,11.91 L 110.1,33.12 L 137.4,72.51");
svg.setFill(Color.rgb(255,255,255,0.0))  ;  
    svg.setStroke(Color.BLACK) ;  
    svg.setStrokeWidth(4.0) ; 
    group.getChildren().add(svg);
    stage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}

