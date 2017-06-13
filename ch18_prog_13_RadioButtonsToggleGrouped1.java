// RadioButtonsToggleGrouped1.java
/*
RadioButton: class:javafx.scene.control.RadioButton
---------------------------------------
When grouped in a ToggleGroup, each button is dependent on the state of the
other buttons in the same group. Only one may be on. Selecting a particular button
will switch off whichever other button was on.
may be selected.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.paint.Color;
import javafx.scene.layout.VBox;

public class RadioButtonsToggleGrouped1 extends Application 
{
  public void start(Stage stage) 
  {
    VBox vbox = new VBox();    // Use Vbox layout 
    Scene scene = new Scene(vbox, 250, 60, Color.PALEGREEN);

    // All three buttons will become members of this group.
    ToggleGroup togGroup = new ToggleGroup();  
 
    RadioButton radButton1 = new RadioButton("Radio Button #1");
    radButton1.setToggleGroup(togGroup); // First member of togGroup.
    vbox.getChildren().add(radButton1);

    RadioButton radButton2 = new RadioButton("Radio Button #2");
    radButton2.setToggleGroup(togGroup); // Second member of togGroup.
    vbox.getChildren().add(radButton2);

    RadioButton radButton3 = new RadioButton("Radio Button #3");
    radButton3.setToggleGroup(togGroup); // Third member of togGroup.
    vbox.getChildren().add(radButton3);

    stage.setTitle("Radio Buttons Grouped"); 
    stage.setScene(scene);
    stage.show();
  }
}
