// BorderPaneDefault_pos1.java
/*
A border pane with 5 image nodes.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BorderPaneDefault_pos1 extends Application 
{

  public void start(Stage primaryStage) 
  {
   Image image_cent = new Image("swoosh_cent.png");
   Image image_top = new Image("swoosh_top.png");
   Image image_bot = new Image("swoosh_bot.png");
   Image image_left = new Image("swoosh_left.png");
   Image image_rite = new Image("swoosh_rite.png");

   // Create ImageView nodes that can be placed inside a BorderPane.
   ImageView imv_cent = new ImageView(image_cent) ;
   ImageView imv_top = new ImageView(image_top) ;
   ImageView imv_bot = new ImageView(image_bot) ;
   ImageView imv_left = new ImageView(image_left) ;
   ImageView imv_rite = new ImageView(image_rite) ;

   primaryStage.setTitle("BorderPane Default positioning");
   BorderPane bordp = new BorderPane();
 
   // Allocate each image to one of the 5 available positions in BorderPane.
   bordp.setTop(imv_top);
   bordp.setLeft(imv_left);
   bordp.setCenter(imv_cent);
   bordp.setRight(imv_rite);
   bordp.setBottom(imv_bot);

   Scene scene = new Scene(bordp, 600, 600);
   primaryStage.setScene(scene);
   primaryStage.show();
  }
}
