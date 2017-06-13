// HBoxImages2.java
/*

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.layout.HBox;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HBoxImages2 extends Application 
{
    public void start(Stage stage) 
    {
         HBox hboxp = new HBox(6); // spacing between images = 8
    
        Image image_cent = new Image("swoosh_cent.png");
        Image image_top  = new Image("swoosh_top.png");
        Image image_bot  = new Image("swoosh_bot.png");
        Image image_left = new Image("swoosh_left.png");
        Image image_rite = new Image("swoosh_rite.png");

        // Create ImageView nodes that can be placed inside a TilePane.
        ImageView imv_cent = new ImageView(image_cent) ;
        ImageView imv_top  = new ImageView(image_top) ;
        ImageView imv_bot  = new ImageView(image_bot) ;
        ImageView imv_left = new ImageView(image_left) ;
        ImageView imv_rite = new ImageView(image_rite) ;

        hboxp.getChildren().addAll(imv_left, imv_top, imv_bot, imv_rite, imv_cent);
        
        Scene scene = new Scene(hboxp, 1020, 220);
        stage.setTitle("HBox on 5 Images");
        stage.setScene(scene);
        stage.show();
    }
}
