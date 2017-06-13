// ShowImageSimple1.java
/*
class: javafx.scene.image.ImageView
-------------------------------------------
Constructors 
1. ImageView(); Create a new image object.
2. ImageView(image); Create an image object and Identify the image to be viewed.
3. ImageView(url); An image object and identified by its url (web address).

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ShowImageSimple1 extends Application 
{
    public void start(Stage stage)
    {
    stage.setTitle("Load Image");
    StackPane stakp = new StackPane();

    Image bird_image = new Image("bird_aztec_100.jpg");
    ImageView imview1 = new ImageView(bird_image);
    stakp.getChildren().add(imview1);

    Scene scene = new Scene(stakp);
    stage.setScene(scene);
    stage.show();
    }
}
