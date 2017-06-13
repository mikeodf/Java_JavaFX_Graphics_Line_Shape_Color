// TextAreaButtonEvent.java
/*
The TextArea allows the user to type in multiple lines of text.
In other words the "Enter" key does signal the end of the entry.
It just causes a new line character to be become part of the text.

Constructors:
TextArea() 
TextArea(initial prompt text)

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class TextAreaButtonEvent extends Application  
{

    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("TextArea with button");

        TextArea textarea2 = new TextArea("Type in your story and then click the button");

        Button button = new Button("Click to enter text");
        button.setMinWidth(50);

        // Event handler 
        button.setOnAction(action -> {
            System.out.println(textarea2.getText());
            textarea2.setText("The text has been transmitted.");
        });

        VBox vbox = new VBox(textarea2, button);

        Scene scene = new Scene(vbox, 300, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
