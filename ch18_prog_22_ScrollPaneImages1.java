// ScrollPaneImages1.java
/*

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine 
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class ScrollPaneImages1 extends Application 
{ 
    final ScrollPane skrolp = new ScrollPane();
    final Image[] images = new Image[5];
    final ImageView[] imv_pics = new ImageView[5];
    final VBox vwbox = new VBox();
    final String [] imageNames = {"apple1.jpg", "Dragon_small_2.jpg", "fern_100.jpg", "hamish_100.jpg", "mossA_100.jpg"};
 
    public void start(Stage stage) 
    {
        VBox box = new VBox();
        box.getChildren().addAll(skrolp);

        for (int i = 0; i < 5; i++) 
        {
            images[i] = new Image(imageNames[i]);
            imv_pics[i] = new ImageView(images[i]);
            imv_pics[i].setFitWidth(100);
            imv_pics[i].setPreserveRatio(true);
            vwbox.getChildren().add(imv_pics[i]);
         }
        
        skrolp.setContent(vwbox);   
        Scene scene = new Scene(box, 180, 180);
        stage.setScene(scene);
        stage.setTitle("Scroll Pane");    
        stage.show();
     }  
}
