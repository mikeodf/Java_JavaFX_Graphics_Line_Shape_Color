// ToggleButtonSimplest1.java
/*
ToggleButton: class:javafx.scene.control.ToggleButton;
--------------------------------------------------------
ToggleButton(): A toggle button with no label.
ToggleButton(text):A toggle button with the specified text as its label.
ToggleButton(Stext, icon): A toggle button with the specified text and icon for its label.
How Togglebuttons work:
A normal (non-toggle) Button is a "command" button which triggers an event when clicked. A ToggleButton on the other hand is simply a control with a Boolean (true/false) indicating whether it has been selected.
Grouping Toggles: 
When in groups, only one ToggleButton at a time within that group can be selected.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.ToggleButton;
import javafx.scene.paint.Color;

public class ToggleButtonSimplest1 extends Application 
{

  public void start(Stage stage) 
  {
    Group root = new Group();
    Scene scene = new Scene(root, 160, 60, Color.GREEN);
  
    ToggleButton radButton1 = new ToggleButton("A Toggle Button");
    root.getChildren().add(radButton1);

    stage.setTitle("A Single Toggle Button"); 
    stage.setScene(scene);
    stage.show();
  }
}
