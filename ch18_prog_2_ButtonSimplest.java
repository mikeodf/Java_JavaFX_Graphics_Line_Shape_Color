// ButtonSimplest.java
/*
The default button properties.

Constructors 
1. Button( text), or
2. Button(text, imageIcon)

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonSimplest extends Application 
{

    public void start(Stage primaryStage) 
    {
        primaryStage.setTitle("A Simple Button");
        Button buton = new Button();
        buton.setText("Press me");
        buton.setOnAction(new EventHandler<ActionEvent>() 
        {
            public void handle(ActionEvent event) 
            {
                System.out.println("Somewhere someone pushed a button");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(buton);
        primaryStage.setScene(new Scene(root, 200, 60));
        primaryStage.show();
    }
}
