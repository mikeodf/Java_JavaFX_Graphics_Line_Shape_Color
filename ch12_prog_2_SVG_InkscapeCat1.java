// SVG_InkscapeCat1.java
/*

Tested on: java version "java-8-oracle"
Author: MadProgrammer [Mike Ohlson de Fine] 
*/
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.SVGPath;
import javafx.stage.Stage;
import javafx.scene.paint.*;

public class SVG_InkscapeCat1 extends Application {

  public void start(Stage stage) {
    final Group group = new Group();
    Scene scene = new Scene(group, 350, 200);
    stage.setScene(scene);
    stage.setTitle("Vector line: Inkscape");

    SVGPath svg = new SVGPath();
svg.setContent("M 58.82,30.96 L 60.62,42.1 C 60.62,42.1 50.02,44.7 45.62,51.3 C 42.22,61.9 39.42,64.3 39.42,64.3 C 41.82,67.9 47.42,66.5 52.62,67.9 C 53.42,68.1 54.02,66.1 54.42,64.9 C 54.82,63.5 54.22,62.1 53.42,61.7 C 51.02,61.3 51.22,64.1 50.82,65.5 C 50.22,68.3 41.22,67.1 39.42,64.3 L 34.02,70.3 C 34.02,70.3 36.22,83.5 41.22,84.1 C 46.02,84.7 77.21,82.3 96.22,99.9 C 115.2,117.7 118.4,123.7 122.6,132.5 C 129.6,147.1 113.4,173.5 122,176.5 C 130.6,179.5 148.8,170.1 153.2,153.3 C 159.6,129.3 149.4,114.1 132.4,116.5 C 115.2,118.9 47.22,169.7 42.42,171.7 C 37.42,173.5 14.83,180.9 12.43,175.9 C 10.03,171.1 30.82,156.9 38.62,148.9 C 46.62,141.1 84.01,92.1 131.2,76.7 C 178.2,61.5 240.8,101.9 253,115.9 C 265.2,129.9 274,145.1 273.4,151.3 C 272.6,159.5 268.6,176.9 280.8,176.9 C 293.2,176.9 300.8,165.5 297.6,148.9 C 293.4,115.9 262.8,85.9 257.2,66.3 C 251.8,46.7 256.6,25.36 277.4,22.96 C 299.2,21.36 300.2,44.3 300.2,44.3 C 300.2,44.3 305,50.5 310.6,44.9 C 316,39.3 311.8,21.16 302.6,16.16 C 293.4,11.36 261.8,-4.642 232.2,38.7 C 201.6,99.3 225.2,158.5 213.4,169.7 C 206.8,176.1 199.8,181.9 190.8,175.3 C 184,170.3 203.2,148.1 183.2,120.1 C 155.2,70.3 61.02,30.96 61.02,30.96"); 
svg.setFill(null)  ; 
    svg.setStroke(Color.BLACK) ;  
    svg.setStrokeWidth(4.0) ; 
    group.getChildren().add(svg);
    stage.show();
  }

}

