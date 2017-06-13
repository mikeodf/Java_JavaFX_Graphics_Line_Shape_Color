// sepiaCat1.java
/*
Sepia tones are the ranges of orange-to-brown found in antique photographs.
Bloom
Constructors:
SepiaTone(): A SepiaTone with default sepia value of 1.0.
SepiaTone(double level): A SepiaTone with the specified level between 0 and 1.0
Parameters:
levey - the intensity of the effect.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine 
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.effect.Effect;
import javafx.scene.effect.SepiaTone; 
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class sepiaCat1 extends Application 
{

    public void start(Stage primaryStage) 
    {
        primaryStage.setTitle("Sepia Bella at 0.8");
        final Group rootgroup = new Group();

        ImageView viewcat = new ImageView(new Image("bella2_500.jpg"));
        SepiaTone sepia = new SepiaTone(); 
        sepia.setLevel(0.8); // value for 0-1.0, default 1.0
        viewcat.setEffect(sepia);          
        rootgroup.getChildren().add(viewcat);

        final Scene scene = new Scene(rootgroup, 500, 485);        
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
