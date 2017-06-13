// DatePickerSimplest.java
/*
Allows the user to enter a date as text or to select a date from a calendar popup.
Note: Aside from mouse control that the arrow keys on the keyboard 
can also be used to select choices.

Constructor:
public DatePicker()

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DatePickerSimplest extends Application {

  public void start(Stage stage) 
  {
    VBox vbox = new VBox(20);

    DatePicker seeDatePicker = new DatePicker();

    vbox.getChildren().add(seeDatePicker);

    Scene scene = new Scene(vbox, 260, 80);
    stage.setScene(scene);
    stage.show();
  }
}
