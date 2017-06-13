// anchorPaneImages2.java
/*
A basic AnchorPane with images located using absolute coordinates.
Constraint format
setTopAnchor(node, distance):	 distance from the anchor pane's top inset to the child's top edge.
setLeftAnchor(node, distance):	 distance from the anchor pane's left inset to the child's left edge.
setBottomAnchor(node, distance): distance from the anchor pane's bottom inset to the child's bottom edge.
setRightAnchor(node, distance):  distance from the anchor pane's right inset to the child's right edge.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.AnchorPane;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class anchorPaneImages2 extends Application 
{
    public void start(Stage stage) 
    {
        AnchorPane root = new AnchorPane();

        Image image_cent = new Image("swoosh_cent.png");
        Image image_top  = new Image("swoosh_top.png");
        Image image_bot  = new Image("swoosh_bot.png");
        Image image_left = new Image("swoosh_left.png");
        Image image_rite = new Image("swoosh_rite.png");

        // Create ImageView nodes that can be placed inside a BorderPane.
        ImageView imv_cent = new ImageView(image_cent) ;
        ImageView imv_top  = new ImageView(image_top) ;
        ImageView imv_bot  = new ImageView(image_bot) ;
        ImageView imv_left = new ImageView(image_left) ;
        ImageView imv_rite = new ImageView(image_rite) ;

        root.getChildren().addAll(imv_left, imv_top, imv_bot, imv_rite, imv_cent);

        root.setLeftAnchor(imv_cent, 160.);
        root.setTopAnchor(imv_cent, 140.);

        root.setLeftAnchor(imv_left, 60.);
        root.setTopAnchor(imv_left, 140.);

        root.setTopAnchor(imv_top, 50.);
        root.setLeftAnchor(imv_top, 160.);

        root.setBottomAnchor(imv_bot, 60.);
        root.setLeftAnchor(imv_bot, 160.);

        root.setLeftAnchor(imv_rite, 280.);
        root.setTopAnchor(imv_rite, 140.);

        Scene scene = new Scene(root, 560, 500);
        stage.setTitle("AnchorPane on 5 Images");
        stage.setScene(scene);
        stage.show();
    }
}
