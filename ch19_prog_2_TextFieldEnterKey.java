// TextFieldEnterKey.java
/*
The default Textfield properties. Type the line of text into the 
textfield provided, the hit ENTER. The ENTER key automatically
triggers a"TextField" event.

Constructors:
TextField() 
TextField(initial line of text)

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class TextFieldEnterKey extends Application  {

    public void start(Stage primaryStage)
    {
        primaryStage.setTitle("TextField Input");

        TextField textFieldEntry = new TextField();

        // Event Handler for "Enter-key"
        textFieldEntry.setOnAction(action -> 
                  {
                      System.out.println(textFieldEntry.getText());
                  }          );

        HBox hbox = new HBox(textFieldEntry);
        Scene scene = new Scene(hbox, 200, 100);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}
