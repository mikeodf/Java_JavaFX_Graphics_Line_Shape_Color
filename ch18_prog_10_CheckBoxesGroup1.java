// CheckBoxesGroup1.java
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
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.CheckBox;
import javafx.scene.paint.Color;
import javafx.scene.layout.VBox;

public class CheckBoxesGroup1 extends Application {

  public void start(Stage stage) {

    VBox vbox = new VBox();    // Use Vbox layout 
    Scene scene = new Scene(vbox, 260, 60, Color.PINK);
                
   
    CheckBox checkBx1 = new CheckBox("CheckBox #1");
    CheckBox checkBx2 = new CheckBox("CheckBox #2");
    CheckBox checkBx3 = new CheckBox("CheckBox #3");

    vbox.getChildren().addAll(checkBx1, checkBx2, checkBx3 );

    stage.setTitle("A bunch of CheckBoxes"); 
    stage.setScene(scene);
    stage.show();
  }
}
