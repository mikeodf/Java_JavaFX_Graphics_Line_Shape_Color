// ShowImage_jpg_gif_png.java
/*
Displays of image format, png, jpg, gif(animated).

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine 
*/
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene; 
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage; 

public class ShowImage_jpg_gif_png extends Application 
{
      public void start(Stage stage) 
      {

         Image parkrd_image = new Image("park_road_1.png");  
         Image bird_image = new Image("bird_aztec_100.jpg");    
         Image grommet_image = new Image("tri_grommet.gif");

         // Simple ImageView displays the image as is (no adjustment of size).
         ImageView imvw1 = new ImageView();
         imvw1.setImage(parkrd_image);
         
         ImageView imvw2 = new ImageView();
         imvw2.setImage(bird_image);
         
         ImageView imvw3 = new ImageView();
         imvw3.setImage(grommet_image);
         
         Group root = new Group();
         Scene scene = new Scene(root);
         scene.setFill(Color.BLACK);
         HBox box = new HBox();
         box.getChildren().add(imvw1);

         box.getChildren().add(imvw2);
         box.getChildren().add(imvw3);
         root.getChildren().add(box);
 
         stage.setTitle("ImageViews: a jpg, an animated gif and a png");
         stage.setWidth(50); // These values are overriden to display the Images 
         stage.setHeight(50);
         stage.setScene(scene); 
         stage.sizeToScene(); 
         stage.show(); 
     }
 }
