// ImagesStackPane3.java
/*
Display three images in a stack.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ImagesStackPane3 extends Application 
{
    public void start(Stage stage)
    {
     stage.setTitle("StackPane: Three images stacked atop each other.");
     StackPane stackpane1 = new StackPane(); // Construct a StackPane root object.

      // Three images of different sizes with transparentbackgrounds.  to StackPane
       Image image1 = new Image(getClass().getResourceAsStream("Dragon_tsp1.png"));
       Image image2 = new Image(getClass().getResourceAsStream("Dragon_small_tsp2.png"));
       Image image3 = new Image(getClass().getResourceAsStream("Dragon_small_tsp3.png"));

        Image images[] = {image1, image2, image3  };

      for (int i = 0; i < images.length; i++) 
      {
         stackpane1.getChildren().add(new ImageView(images[i]));
      }

    Scene scene = new Scene(stackpane1);
    stage.setScene(scene);
    stage.show();
    }
}
