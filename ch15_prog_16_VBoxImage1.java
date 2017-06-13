// VBoxImage1.java
/*
Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class VBoxImage1 extends Application 
{
    public void start(Stage stage) 
    {   
         VBox vboxp = new VBox(); 
        Image image_rite = new Image("swoosh_rite.png");
        ImageView imv_rite = new ImageView(image_rite) ;

        vboxp.getChildren().add(imv_rite);
        
        Scene scene = new Scene(vboxp, 210, 210);
        stage.setTitle("VBox on an Image");
        stage.setScene(scene);
        stage.show();
    }
}
