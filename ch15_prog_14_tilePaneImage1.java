// tilePaneImage1.java
/*

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.TilePane;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class tilePaneImage1 extends Application 
{
    public void start(Stage stage) 
    {
        TilePane tilep = new TilePane();

        Image image_cent = new Image("swoosh_cent.png");      
        // Create ImageView nodes that can be placed inside a TilePane.
        ImageView imv_cent = new ImageView(image_cent) ;

        tilep.getChildren().addAll(imv_cent);
        
        Scene scene = new Scene(tilep, 210, 210);
        stage.setTitle("TilePane on an Image.");
        stage.setScene(scene);
        stage.show();
    }
}
