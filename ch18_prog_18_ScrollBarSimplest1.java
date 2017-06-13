// ScrollBarSimplest1.java
/*
Either a horizontal or vertical bar with increment and decrement buttons and a "thumb" with which the user can interact. Typically not used alone but used for building up more complicated controls such as the ScrollPane and ListView.

Class ScrollBar: avafx.scene.control.ProgressBar
------------------------------------------
Constructors:
ScrollBar(): A new horizontal ScrollBar (ie getOrientation() == Orientation.HORIZONTAL)

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/
import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.stage.Stage;

public class ScrollBarSimplest1 extends Application {

    public void start(Stage stage) {
        Group root = new Group();
        Scene scene = new Scene(root, 260, 40);
        stage.setScene(scene);

        ScrollBar s1 = new ScrollBar();
       
        root.getChildren().add(s1);
        stage.setTitle("ScrollBar basic"); 
        stage.show();
    }

}
