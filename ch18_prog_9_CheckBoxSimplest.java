// CheckBoxSimplest.java
/*
CheckBox: class:javafx.scene.control.CheckBox
---------------------------------------
Constructors 
1. CheckBox( ), or
2. CheckBox(text)

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.CheckBox;
import javafx.scene.paint.Color;

public class CheckBoxSimplest extends Application {

  public void start(Stage stage) {
    Group root = new Group();
    Scene scene = new Scene(root, 160, 60, Color.PINK);
  
    CheckBox checkBx1 = new CheckBox("A CheckBox");
    root.getChildren().add(checkBx1);

    stage.setTitle("A single CheckBox"); 
    stage.setScene(scene);
    stage.show();
  }
}
