// TextFieldEntry2variable.java
/*
The Textfield starts off with a user prompt message. 
Once a line of text has been entered and the "Enter" key pressed the value of a new string variable called "entered_text" will be assigned 
to be whatever text was typed into the text field.

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


public class TextFieldEnterKey2variable extends Application  {

    public void start(Stage primaryStage)
    {
        primaryStage.setTitle("TextField Input");
        TextField textFieldEntry = new TextField("Enter your name here");

        // Event Handler for "Enter-key"
        textFieldEntry.setOnAction(action -> 
                  {
                       String entered_text = new String(textFieldEntry.getText());
                       System.out.println(entered_text);                      
                  }          );

        HBox hbox = new HBox(textFieldEntry);
        Scene scene = new Scene(hbox, 200, 100);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}

