// ColorPicker1.java
/*
Enables users to select a color from a graphical pallette.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ColorPicker1 extends Application {

  public void start(Stage stage) 
  {
   
    HBox hbox = new HBox(20);

    ColorPicker colorPicker = new ColorPicker();
    colorPicker.setValue(Color.RED);

    Text text = new Text("Color picker:");
    text.setFill(colorPicker.getValue());

    // Event handler.
    colorPicker.setOnAction((ActionEvent t) -> {
           text.setFill(colorPicker.getValue());
    });

    hbox.getChildren().addAll(colorPicker, text);
    Scene scene = new Scene(hbox, 260, 80);
    stage.setScene(scene);
    stage.show();
  }
}
