// anchorPaneImage1.java
/*
A basic pane with images located using absolute coordinates..

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.AnchorPane;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class anchorPaneImage1 extends Application 
{
    public void start(Stage stage) 
    {

        AnchorPane root = new AnchorPane();

        Image image_cent = new Image("swoosh_cent.png");
        ImageView imv_cent = new ImageView(image_cent) ;
        root.getChildren().add(imv_cent);
        root.setRightAnchor(imv_cent, 60.);

        Scene scene = new Scene(root, 320, 260);
        stage.setTitle("AnchorPane Simple");
        stage.setScene(scene);
        stage.show();
    }

}
