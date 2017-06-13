// glowCat1.java
/*
Glow effect make bright pixels brighter.

Constructors:
Glow(): Glow with default parameters.
Glow(double_level): A Glow with specified intensity level of glow.
Parameters:
level - the level value, which controls the intensity of the glow effect

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine 
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.effect.Effect;
import javafx.scene.effect.Glow;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class glowCat1 extends Application 
{

    public void start(Stage primaryStage) 
    {
        primaryStage.setTitle("Glowing Bella");
        final Group rootgroup = new Group();

        ImageView viewcat = new ImageView(new Image("bella2_500.jpg"));
        final Effect glow = new Glow(5.0);
        viewcat.setEffect(glow);
        rootgroup.getChildren().add(viewcat);

        final Scene scene = new Scene(rootgroup, 500, 485);        
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
