// ToolTip1.java
/*
Demonstrate the tool tip display on hovering.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine 
*/
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene; 
import javafx.stage.Stage;

import javafx.scene.layout.HBox;  // Root node.
import javafx.scene.text.Font;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;

public class ToolTip1 extends Application {
 
public void start(Stage stage) {

         Button button = new Button();
         button.setText("Hover over me!");
         Tooltip tt = new Tooltip();
         tt.setText("This message appears when the pointer hovers over the button");
         tt.setStyle("-fx-font: normal bold 24 Langdon; "
          + "-fx-base: #AE3522; "
          + "-fx-text-fill: orange;");

          button.setTooltip(tt);

         // Nominate the root node and make it a performer on the stage/scene. 
         HBox hbox_root = new HBox();                    //   Give the container a name.
         Scene scene = new Scene(hbox_root,1100, 200);   //  Make the container the root node.
         hbox_root.getChildren().add(button);            // Give the root node a child to show.
 
         // Lights, camera, action.
         stage.setTitle("Tooltip show.");
         stage.setScene(scene); 
         stage.show(); 
     } 
 }
