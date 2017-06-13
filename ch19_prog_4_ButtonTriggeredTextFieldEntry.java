// ButtonTriggeredTextFieldEntry.java
/*
The Textfield captured triggered by Button event.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class ButtonTriggeredTextFieldEntry extends Application  {

    public void start(Stage stage)
     {
        TextField textFieldContents = new TextField("Enter your name here");

        Button button = new Button("Click to transfer text");

        // Button event handler. 
        button.setOnAction(action -> {
            System.out.println(textFieldContents.getText());
        });

        HBox hbox = new HBox(textFieldContents, button);

        stage.setTitle("Button triggered input");
        Scene scene = new Scene(hbox, 200, 100);
        stage.setScene(scene);
        stage.show();

    }
}
