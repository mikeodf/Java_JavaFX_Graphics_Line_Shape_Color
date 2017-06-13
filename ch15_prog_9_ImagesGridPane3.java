// ImagesGridPane3.java
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

public class ImagesGridPane3 extends Application 
{
    public void start(Stage stage)
    {
     stage.setTitle("GridPane: png images with positions specified.");     
     GridPane gridpane1 = new GridPane();// Construct a GridPane root object 

     Image image1 = new Image("Dragon_tsp1.png");
     Image image2 = new Image("Dragon_small_tsp9.png");
     Image image3 = new Image("Dragon_small_tsp3.png");

     ImageView imview1 = new ImageView(image1) ;
     ImageView imview2 = new ImageView(image2) ;
     ImageView imview3 = new ImageView(image3) ;
     
     gridpane1.getChildren().add(imview1);
     gridpane1.getChildren().add(imview2);
     gridpane1.getChildren().add(imview3);

     // Set one row or column constraint one at a time...
     GridPane.setRowIndex(imview1, 1);
     GridPane.setColumnIndex(imview1, 2);
     GridPane.setRowIndex(imview2, 2);
     GridPane.setColumnIndex(imview2, 3);
     GridPane.setRowIndex(imview3, 3);
     GridPane.setColumnIndex(imview3, 4);

     Scene scene = new Scene(gridpane1);
     stage.setScene(scene);
     stage.show();
    }
}
