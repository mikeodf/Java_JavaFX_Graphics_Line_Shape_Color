// AbsoluteImagesLayout2.java
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
import javafx.scene.paint.Color;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class AbsoluteImagesLayout2 extends Application 
{
   public void start(Stage stage) 
    {
        Pane root = new Pane();

        Image frn100 = new Image("fern_100.jpg"); // Default location (0, 0).
        ImageView frn_iv1 = new ImageView(frn100);

        Image ham100 = new Image("hamish_100.jpg");
        ImageView ham_iv1 = new ImageView(ham100);
        ham_iv1.setX(50);
        ham_iv1.setY(30);
        
        Image mos100 = new Image("mossA_100.jpg");
        ImageView mos_iv1 = new ImageView(mos100);
        mos_iv1.setX(100);
        mos_iv1.setY(60);
       
        Image whb100 = new Image("whiteboug_100.jpg");
        ImageView whb_iv1 = new ImageView(whb100);
        whb_iv1.setX(150);
        whb_iv1.setY(90);
        
        Image bik50 = new Image("bike_50.jpg");
        ImageView bik_iv1 = new ImageView(bik50);
         bik_iv1.setX(250);
         bik_iv1.setY(200);
       
        Image bom50 = new Image("boom_50.jpg");
        ImageView bom_iv1 = new ImageView(bom50);
         bom_iv1.setX(200);
         bom_iv1.setY(250);
        
        Image fwm50 = new Image("fwoom_50.jpg");
        ImageView fwm_iv1 = new ImageView(fwm50);
        fwm_iv1.setX(150);
        fwm_iv1.setY(300);
          
        Image sgl50 = new Image("sad_girl_50.jpg");
        ImageView sgl_iv1 = new ImageView(sgl50);
        sgl_iv1.setX(100);
        sgl_iv1.setY(350);
     
        root.getChildren().addAll(frn_iv1, ham_iv1, mos_iv1, whb_iv1, bik_iv1, 
                                  bom_iv1, fwm_iv1, sgl_iv1);

        Scene scene = new Scene(root, 320, 410, Color.LIGHTBLUE);
        stage.setTitle("Absolute layout");
        stage.setScene(scene);
        stage.show();
    }

}
