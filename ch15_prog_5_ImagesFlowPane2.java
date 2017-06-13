// ImagesFlowPane2.java
/*
Mixed jpg and png images.
Png images with transparent backgrounds.
Note: jpg does not support transparency

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Orientation;
import javafx.stage.Stage;

public class ImagesFlowPane2 extends Application 
{
    public void start(Stage stage)
    {
    stage.setTitle("FlowPane: Vertical flow 12 images with transparency.");

    Image drag_tsp1 = new Image("Nerina_400_300.jpg");
    Image drag_tsp2 = new Image("bang_bang_180_80.png");
    Image drag_tsp3 = new Image("swoosh_80_200.jpg");
    Image drag_tsp4 = new Image("sprang_100_78.jpg");
    Image drag_tsp5 = new Image("bird_aztec_48_50.jpg");
    Image drag_tsp6 = new Image("butterfly_100_30.jpg");
    Image drag_tsp7 = new Image("eyes_90_27.jpg");
    Image drag_tsp8 = new Image("Dragon_bg_300_180.jpg");
    Image drag_tsp9 = new Image("Dragon_tsp9.png");
    Image drag_tsp10 = new Image("Dragon_200_133.jpg");
    Image drag_tsp11 = new Image("Dragon_tsp11.png");
    Image drag_tsp12 = new Image("Dragon_tsp12.png");

     Image images[] = {drag_tsp1, drag_tsp2, drag_tsp3, drag_tsp4, drag_tsp5, drag_tsp6,
                       drag_tsp7, drag_tsp8, drag_tsp9, drag_tsp10, drag_tsp11, drag_tsp12 };
     //FlowPane flowp = new FlowPane(); // Default Orientation.HORIZONTAL
     FlowPane flowp = new FlowPane(Orientation.VERTICAL); // Note - The default image flow is Horizontal.
     flowp.setVgap(10); //Gap of 10 pixels between images.
     flowp.setHgap(10);
     flowp.setPrefWrapLength(800); // preferred width = 700
     for (int i = 0; i < images.length; i++) 
     {
         flowp.getChildren().add(new ImageView(images[i]));
     }

    Scene scene = new Scene(flowp);
    stage.setScene(scene);
    stage.show();
    }
}
