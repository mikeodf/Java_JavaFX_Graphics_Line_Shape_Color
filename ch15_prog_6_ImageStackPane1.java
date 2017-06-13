// ImageStackPane1.java
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
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ImageStackPane1 extends Application 
{
    public void start(Stage stage)
    {
    stage.setTitle("StackPane: Single Image.");
    Image drag_tsp10 = new Image("Dragon_200_133.jpg");
       
    StackPane stackpane1 = new StackPane(); // Construct a StackPane root object
    stackpane1.getChildren().add(new ImageView(drag_tsp10));

    Scene scene = new Scene(stackpane1);
    stage.setScene(scene);
    stage.show();
    }
}
