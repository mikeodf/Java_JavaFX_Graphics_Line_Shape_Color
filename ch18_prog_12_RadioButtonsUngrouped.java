// RadioButtonsUngrouped.java
/*
RadioButton: class:javafx.scene.control.RadioButton
---------------------------------------
When ungrouped in a ToggleGroup, each button can be switched on or off
independently of the other buttons it is displayed with.
Once placed in a group then they are linked such that only one
may be selected.

Constructors 
1. RadioButton( ), or
2. RadioButton(text)

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/
import javafx.application.Application;
//import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.RadioButton;
import javafx.scene.paint.Color;
import javafx.scene.layout.VBox;

public class RadioButtonsUngrouped extends Application 
{

  public void start(Stage stage) 
  {
    VBox vbox = new VBox();    // Use Vbox layout 
    Scene scene = new Scene(vbox, 250, 60, Color.PALEGREEN);
  
    RadioButton radButton1 = new RadioButton("Radio Button #1");
    vbox.getChildren().add(radButton1);

    RadioButton radButton2 = new RadioButton("Radio Button #2");
    vbox.getChildren().add(radButton2);

    RadioButton radButton3 = new RadioButton("Radio Button #3");
    vbox.getChildren().add(radButton3);

    stage.setTitle("Radio Buttons Ungrouped"); 
    stage.setScene(scene);
    stage.show();
  }
}
