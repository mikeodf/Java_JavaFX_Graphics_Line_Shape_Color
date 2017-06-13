// ImageGridPane1.java
/*
Place images on a grid pane.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;


public class ImageGridPane1 extends Application 
{
    public void start(Stage stage)
    {
     stage.setTitle("GridPane: png images with transparency.");     
     GridPane gridpane1 = new GridPane();// Construct a GridPane root object 

     Image image1 = new Image("Dragon_tsp1.png");
     gridpane1.getChildren().add(new ImageView(image1));

     Scene scene = new Scene(gridpane1);
     stage.setScene(scene);
     stage.show();
    }
}
