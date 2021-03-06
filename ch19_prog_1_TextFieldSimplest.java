// TextFieldSimplest.java
/*
The default Textfield properties.
Constructors:
TextField() 
TextField(initial line of text)

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TextFieldSimplest extends Application {

  public void start(Stage stage) {
    Scene scene = new Scene(new Group(), 450, 250);

    TextField notification = new TextField ("Enter your name here");
    
    GridPane grid = new GridPane();
    grid.setVgap(4);
    grid.setHgap(10);
    grid.setPadding(new Insets(5, 5, 5, 5));
    grid.add(new Label("Name: "), 0, 0);
    grid.add(notification, 1, 0);
    
    Group root = (Group) scene.getRoot();
    root.getChildren().add(grid);
    stage.setScene(scene);
    stage.show();
  }
}
