// AbsoluteImageLayout1.java
/*
A basic pane with images located using absolute coordinates..

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class AbsoluteImageLayout1 extends Application 
{
   public void start(Stage stage) 
    {
        Pane root = new Pane();

        Image frn100 = new Image("fern_100.jpg"); // Default location (0, 0).
        ImageView frn_iv1 = new ImageView(frn100);

        frn_iv1.setX(60);
        frn_iv1.setY(30);     
        root.getChildren().addAll(frn_iv1);

        Scene scene = new Scene(root, 230, 180);
        stage.setTitle("Absolute layout");
        stage.setScene(scene);
        stage.show();
    }

}
