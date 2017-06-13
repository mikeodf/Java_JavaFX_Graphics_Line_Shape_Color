// ScrollBarVertical1.java
/*
To change to vertical: scrollbar1.setOrientation(Orientation.VERTICAL);

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.geometry.Orientation;


public class ScrollBarVertical1 extends Application 
{
    public void start(Stage stage) 
    {
        Group root = new Group();
        Scene scene = new Scene(root, 240, 120);
        stage.setScene(scene);

        ScrollBar scrollvert1 = new ScrollBar();      
        scrollvert1.setOrientation(Orientation.VERTICAL);
        
        root.getChildren().add(scrollvert1);
        stage.setTitle("ScrollBar Vertical");
        stage.show();
    } 
}
