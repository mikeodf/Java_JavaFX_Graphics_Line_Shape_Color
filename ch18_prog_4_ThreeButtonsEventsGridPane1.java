// ThreeButtonsEventsGridPane1.java
/*
The GridPane layout class is used toarrange the buttons in a (column, row)
grid pattern.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ThreeButtonsEventsGridPane1 extends Application {
 
  public void start(Stage stage) {

    GridPane gridpane = new GridPane();
    Scene scene = new Scene(gridpane, 180, 100);

    Button button1     = new Button("butt. #1");
    Button button2 = new Button("butt. #2");
    Button button3     = new Button("butt. #3");

    gridpane.add(button1, 0, 0);  // button1 positioned at Column 0, Row 0 
    gridpane.add(button2, 0, 1);  // button2 positioned at Column 0, Row 1 
    gridpane.add(button3, 1, 1);  // button3 positioned at Column 1, Row 1 

    ////////////////////////////////////////////////////////   
    //////////  Event Handlers for three Buttons   /////////

        button1.setOnAction(new EventHandler<ActionEvent>() // button1 event handler.
        {
             public void handle(ActionEvent e) 
             {  System.out.println("button #1 was pressed.");  } 
        });

        button2.setOnAction(new EventHandler<ActionEvent>() // button2 event handler.
        {
             public void handle(ActionEvent e) 
             {  System.out.println("button #2 was pressed");  } 
        });

         button3.setOnAction(new EventHandler<ActionEvent>() // button3 event handler.
        {
             public void handle(ActionEvent e) 
             {  System.out.println("button #3 was pressed");  } 
        });

    /////////////////////////////////////////////////////////////
    stage.setScene(scene);
    stage.show();
  }
}
