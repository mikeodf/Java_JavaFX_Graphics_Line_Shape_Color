// BorderPaneImageInsets2.java
/*
A border pane with 5 image nodes.
On re-sizing the window the BorderPane layout manager
tries to keep the center image (default position) in the center.

Pos: import javafx.geometry.Pos;
Positioning a node inside its allowed area - 
BOTTOM_CENTER: on the bottom vertically and on the center horizontally.
BOTTOM_LEFT:   on the bottom vertically and on the left horizontally.
BOTTOM_RIGHT:  on the bottom vertically and on the right horizontally.

CENTER:       on the center both vertically and horizontally.
CENTER_LEFT:  on the center vertically and on the left horizontally.
CENTER_RIGHT: on the center vertically and on the right horizontally.

TOP_CENTER: on the top vertically and on the center horizontally.
TOP_LEFT:   on the top vertically and on the left horizontally.
TOP_RIGHT:  on the top vertically and on the right horizontally.

Insets: javafx.geometry.Insets
A set of inside offsets for the 4 sides of a rectangular area
1. Insets(topRightBottomLeft);Constructs a new Insets instance with same value for all four offsets.
2. Insets(top, right, bottom, left): Constructs a new Insets instance with four different offsets.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.layout.BorderPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BorderPaneImageInsets2 extends Application 
{
  public void start(Stage primaryStage) 
  {
   Image image_cent = new Image("swoosh_cent.png");
   Image image_top = new Image("swoosh_top.png");
   Image image_bot = new Image("swoosh_bot.png");
   Image image_left = new Image("swoosh_left.png");
   Image image_rite = new Image("swoosh_rite.png");

   ImageView imv_cent = new ImageView(image_cent) ;
   ImageView imv_top = new ImageView(image_top) ;
   ImageView imv_bot = new ImageView(image_bot) ;
   ImageView imv_left = new ImageView(image_left) ;
   ImageView imv_rite = new ImageView(image_rite) ;

    primaryStage.setTitle("BorderPane Individul Insets selected to form a cross.");
    BorderPane bordp = new BorderPane();
                
    int top_edge  = 5; //  Below top edge of pane.
    int rite_edge = 5; // Inside right edge of pane.
    int bot_edge  = 5; // Above bottom edge of pane.
    int left_edge = 5; // Inside left edge of pane.
 
    // Inset borders for the entire pane.
    bordp.setPadding(new Insets(top_edge, rite_edge, bot_edge, left_edge)); 
 
    // Inset adjustments for selected images relate to pane edges.
    bordp.setMargin(imv_top, new Insets(top_edge, rite_edge, bot_edge, left_edge+210));
    bordp.setMargin(imv_bot, new Insets(top_edge, rite_edge, bot_edge, left_edge+210));
    bordp.setMargin(imv_left, new Insets(top_edge, rite_edge, bot_edge, left_edge));
    bordp.setMargin(imv_rite, new Insets(top_edge, rite_edge, bot_edge, left_edge));
    bordp.setMargin(imv_cent, new Insets(top_edge, rite_edge, bot_edge, left_edge));
    
    // Overall allocation of images to the 5 BorderPane general positions.
    bordp.setTop(imv_top);
    bordp.setLeft(imv_left);
    bordp.setCenter(imv_cent);
    bordp.setRight(imv_rite);
    bordp.setBottom(imv_bot);
       
    // Anchor positions of individual images within their local spaces.
    bordp.setAlignment(imv_top, Pos.TOP_LEFT);
    bordp.setAlignment(imv_bot, Pos.TOP_LEFT);
    bordp.setAlignment(imv_cent, Pos.TOP_LEFT);
    bordp.setAlignment(imv_left, Pos.TOP_LEFT);
    bordp.setAlignment(imv_rite, Pos.TOP_LEFT);
   
    Scene scene = new Scene(bordp, 650, 650);
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
