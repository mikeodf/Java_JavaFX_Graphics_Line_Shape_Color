// VBoxButtonGraphics1.java
/*
Displays an image on vertically arranged buttons.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine 
*/
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


import javafx.scene.control.ToggleButton;

public class ButtonGraphics1 extends Application 
{
   public void start(Stage stage) 
    {
        Scene scene = new Scene(new Group());
        stage.setTitle("Decorated Buttons and Events");

        VBox vbox = new VBox();

        Image birdy_image = new Image(getClass().getResourceAsStream("bird_aztec_100.jpg"));
        Image butterfly_image = new Image("butterfly_100.jpeg");
        Image redpaint_image = new Image("red_paint_100.jpg");


         //ToggleButton toggle = new ToggleButton("Toggle");
         //toggle.setGraphic(new ImageView(owl_image));


        Button button1 = new Button("Press");
        button1.setGraphic(new ImageView(birdy_image)); // This places the image on the button.

        Button button2 = new Button("Push");
        button2.setGraphic(new ImageView(butterfly_image));

        Button button3 = new Button("splash");

        button3.setGraphic(new ImageView(redpaint_image));

        vbox.getChildren().add(button1);
        vbox.getChildren().add(button2);
        vbox.getChildren().add(button3);
        vbox.setSpacing(10);  // Vertical spacing between graphic objects.
        ((Group)scene.getRoot()).getChildren().add(vbox);

        ////////////////////////////////////////////////////////////////   
        /////  Event Handlers for three image decorated buttons   //////
        button1.setOnAction(new EventHandler<ActionEvent>() 
        {
             public void handle(ActionEvent e) 
             {  System.out.println("The birdy button was pressed");  } 
        });

        button2.setOnAction(new EventHandler<ActionEvent>() 
        {
             public void handle(ActionEvent e) 
             {  System.out.println("The butterfly button was nudged");  } 
        });

        button3.setOnAction(new EventHandler<ActionEvent>() 
        {
             public void handle(ActionEvent e) 
             {  System.out.println("The red paint was splashed");  } 
        });

        //////////////////////////////////////////////////////////////// 
        stage.setScene(scene);
        stage.show();
    }
}
