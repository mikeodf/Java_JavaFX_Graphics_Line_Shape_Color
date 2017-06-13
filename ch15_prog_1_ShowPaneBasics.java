// ShowPaneBasics.java
/*
class: javafx.scene.layout.xxxPane
or javafx.scene.control.DialogPane or javafx.scene.text.TextFlow.
---------------------------------------------------------------------
Constructors: Each of 11 constructors are given in the numbered tests below. 
Uncomment each numbered example at a time to demonstrate the default
values for showing a simple image using the selected layout class..
Each layout type is a tool for displaying graphic notes in a particular
manner designed for programmer convenience.
 
Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
/* Make available the appropriate Pane class. */
import javafx.scene.layout.Pane;           // 1. 
//import javafx.scene.layout.StackPane;    // 2.
//import javafx.scene.layout.FlowPane;     // 3.
//import javafx.scene.layout.GridPane;     // 4.
//import javafx.scene.layout.BorderPane;   // 5.
//import javafx.scene.layout.AnchorPane;   // 6.
//import javafx.scene.layout.TilePane;     // 7.   
//import javafx.scene.layout.VBox;         // 8.  
//import javafx.scene.layout.HBox;         // 9.   
//import javafx.scene.control.DialogPane;  // 10.
//import javafx.scene.text.TextFlow;       // 11.

import javafx.stage.Stage;

public class ShowPaneBasics extends Application 
{
    public void start(Stage stage)
    {
    stage.setTitle("Load Image");
   /* Use a comment switch (//) to activate each line separately. */
    Pane rootpane = new Pane();               // 1. 
    //StackPane rootpane = new StackPane();   // 2.
    //FlowPane rootpane = new FlowPane();     // 3.
    //GridPane rootpane = new GridPane();     // 4.
    //BorderPane rootpane = new BorderPane(); // 5.
    //AnchorPane rootpane = new AnchorPane(); // 6.
    //TilePane rootpane = new TilePane();     // 7.
    //VBox rootpane = new VBox();             // 8.
    //HBox rootpane = new HBox();             // 9.
    //DialogPane rootpane = new DialogPane(); // 10.    
    //TextFlow rootpane = new TextFlow();     // 11. 

    Image bird_image = new Image("bird_aztec_100.jpg");
    ImageView imview1 = new ImageView(bird_image);

    rootpane.getChildren().add(imview1);
    Scene scene = new Scene(rootpane);
    stage.setScene(scene);
    stage.show();
    }
}
