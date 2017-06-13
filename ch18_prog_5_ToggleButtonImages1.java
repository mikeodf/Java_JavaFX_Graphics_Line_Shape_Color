// ToggleButtonImages1 .java
/*
Two buttons with icons (for easy identification) are used to trigger either of two EventHandlers.
The Stackpane layout default is the Center position. 
That is, all child nodes will be in the center:
"The stackpane will attempt to resize each child to fill its content area. If the child could not be sized to fill the stackpane (either because it was not resizable or its max size prevented it) then it will be aligned within the area using the alignment property, which defaults to Pos.CENTER." To change this, use for example:
StackPane.setAlignment(node_name, Pos.TOP_LEFT);

Position alignment choices:
----------------------------
BASELINE_CENTER: on the baseline vertically and on the center horizontally.
BASELINE_LEFT:   on the baseline vertically and on the left horizontally.
BASELINE_RIGHT:  on the baseline vertically and on the right horizontally.
BOTTOM_CENTER:   on the bottom vertically and on the center horizontally.
BOTTOM_LEFT:     on the bottom vertically and on the left horizontally.
BOTTOM_RIGHT:    on the bottom vertically and on the right horizontally.
CENTER:          on the center both vertically and horizontally.
CENTER_LEFT:     on the center vertically and on the left horizontally.
CENTER_RIGHT:    on the center vertically and on the right horizontally.
TOP_CENTER:      on the top vertically and on the center horizontally.
TOP_LEFT:        on the top vertically and on the left horizontally.
TOP_RIGHT:       on the top vertically and on the right horizontally.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.*;
import javafx.scene.shape.*;

import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;

public class ToggleButtonImages1 extends Application 
{ 
       public void start(Stage stage) 
       {
             double width =520 ;
             double height =320 ;

            StackPane stackpane1 = new StackPane(); // Construct a StackPane root object
            Scene scene = new Scene(stackpane1, width, height); // Width, height of pane.
            ToggleGroup grouptog1 = new ToggleGroup(); //Create a ToggleGroup #1.

            Image apple_image = new Image("apple1.png");       // Small blue image on a button.
            Image tomato_image = new Image("tomato1.png");     // Small blue image on a button.
            Image apple40_image = new Image("apple_40.png");   // Large red image.
            Image tomato40_image = new Image("tomato_40.png"); // Large red image.
            ImageView im_v1 = new ImageView(apple_image);
            im_v1.setX(200);
            im_v1.setY(60);

             ImageView im_v2 = new ImageView(tomato_image);
             im_v2.setX(300);
             im_v2.setY(80);

             final Rectangle rect1 = new Rectangle(width - 20, height - 20); 
            StackPane.setAlignment(rect1, Pos.TOP_LEFT);
            //  Gaps/borders around images.  Insets( top, right, bottom, left)
             StackPane.setMargin(rect1, new  Insets(10,   10,   10,   10));

//===========================================================================
            // Create toggle button "togg_apple1" with a blue apple icon images .   
              ToggleButton togg_apple1 = new ToggleButton("Apple ", 
                                         new   ImageView(apple40_image));    
             
              StackPane.setAlignment(togg_apple1, Pos.TOP_LEFT);
              togg_apple1.setTranslateX(15);
              togg_apple1.setTranslateY(15);

              // Create toggle button "togg_tomato1" with a purple tomato icon images .  
              ToggleButton togg_tomato1 = new ToggleButton("Big Tomato ",
                                          new ImageView(tomato40_image));
              StackPane.setAlignment(togg_tomato1, Pos.TOP_LEFT);
              togg_tomato1.setTranslateX(15);
              togg_tomato1.setTranslateY(85);

              // Collect the buttons in a common group.
              togg_apple1.setToggleGroup(grouptog1);
              togg_tomato1.setToggleGroup(grouptog1);
              togg_tomato1.setSelected(true);  // Make tog_tom1 active on startup.

              stackpane1.getChildren().add(rect1);    // Add graphic nodes onto the pane.
              stackpane1.getChildren().add(togg_apple1);
              stackpane1.getChildren().add(togg_tomato1);  // Last node will be on top. 

////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  //=========  Two Event Handlers for the ToggleButtons   ==========

       togg_apple1.setOnAction(new EventHandler<ActionEvent>() // Event Handler No. 1
        {    // Display the apple and make the rectangle violet.
             public void handle(ActionEvent e) 
             {  System.out.println("ToggleButton #1 Apple");  
                rect1.setFill(Color.VIOLET);
                stackpane1.getChildren().remove(im_v2); // Remove the tomato.
                stackpane1.getChildren().add(im_v1);    // Show the apple.
             } 
        });
        
        togg_tomato1.setOnAction(new EventHandler<ActionEvent>()  // Event Handler No. 2
        {    // Display the tomato and make the rectangle blue.
             public void handle(ActionEvent e) 
             {  System.out.println("ToggleButton #2 Tomato");
                rect1.setFill(Color.BLUE);
                stackpane1.getChildren().remove(im_v1); // Remove the apple.
                stackpane1.getChildren().add(im_v2);    // Show the tomato
              } 
        });
       
    //===================================================
    stage.setScene(scene);
    stage.setTitle("ToggleButtons on Stackpane.");
    stage.show();
  }
}
