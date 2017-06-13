// HyperlinkSimplest.java
/*
The default menu.
Note that the arrow keys on the keyboard toggle the choices.
Constructor
public PasswordField()
Creates a default PasswordField instance.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HyperlinkSimplest extends Application {

    public void start(Stage stage) {
        stage.setTitle("HTML");
        stage.setWidth(500);
        stage.setHeight(500);
        Scene scene = new Scene(new Group());
        VBox root = new VBox();    
        Hyperlink link = new Hyperlink("www.java2s.com");   
 
        
        root.getChildren().addAll(link);
        scene.setRoot(root);
 
        stage.setScene(scene);
        stage.show();
    }

}
