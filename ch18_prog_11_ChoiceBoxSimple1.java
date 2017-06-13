// ChoiceBoxSimple1.java
/*
The default Choicebox properties.
Note: Aside from mouse control, the arrow keys on the keyboard can cycle through the choices,
and the enter key can select a choice.

Constructors 
ChoiceBox(ObservableList<T> items)

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;


public class ChoiceBoxSimple1 extends Application {

  public void start(Stage stage) {

    HBox hbox = new HBox();
    Scene scene = new Scene(hbox, 500, 100 );

    Label label = new Label("Press button to reveal choices");
    label.setStyle("-fx-font: 25 arial;");
    label.setLayoutX(40);

    String[] greetings = new String[] { "A", "B", "C", "D", "E" };
    ChoiceBox<String> choicebx = new ChoiceBox<String>(
        FXCollections.observableArrayList("a", "b", "c", "d", "e"));

    choicebx.getSelectionModel().selectedIndexProperty()
        .addListener(new ChangeListener<Number>() {
          public void changed(ObservableValue obsvalue, Number value, Number new_value) {
            label.setText(greetings[new_value.intValue()]);
          }
        });

    hbox.getChildren().addAll(choicebx, label);
    hbox.setSpacing(30);
    hbox.setAlignment(Pos.CENTER);
    hbox.setPadding(new Insets(10, 0, 0, 10));

    stage.setScene(scene);
    stage.show();

  }
}

