// TextAreaSimple.java
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
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class TextAreaSimple extends Application 
{

    public void start(Stage stage) 
    {
        TextArea textArea1 = new TextArea();

        VBox vbox = new VBox(textArea1);

        primaryStage.setTitle("TextArea Experiment 1");
        Scene scene = new Scene(vbox, 200, 100);
        stage.setScene(scene);
        stage.show();
    }
}
