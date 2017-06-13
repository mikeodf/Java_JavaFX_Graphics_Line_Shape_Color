// ImageFlowPane1.java
/*
Display a single image -  a trivial case that is
simply extended to arrays of images.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
//import javafx.geometry.Orientation; // Only need for non-default orientation.
import javafx.stage.Stage;

public class ImageFlowPane1 extends Application 
{
    public void start(Stage stage)
    {
    stage.setTitle("FlowPane: Single Horizontal flow.");
    Image drag_tsp10 = new Image("Dragon_200_133.jpg");
     FlowPane flowp = new FlowPane(); // Default Orientation.HORIZONTAL
     flowp.getChildren().add(new ImageView(drag_tsp10));

    Scene scene = new Scene(flowp);
    stage.setScene(scene);
    stage.show();
    }
}
