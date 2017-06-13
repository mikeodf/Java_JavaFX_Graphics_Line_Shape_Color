// ToggleButtonGroup1.java
/*
Demonstrate how to make toggle groups.
No event handlers have been provided for this simplified demonstration.

ToggleButton: class:javafx.scene.control.ToggleButton
---------------------------------------
Constructor used for this example: 
ToggleButton(text, graphic);

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;

public class ToggleButtonGroup1 extends Application 
{
  public void start(Stage stage) 
  {     
      stage.setTitle("Toggle Buttons Grouped");    
      HBox root = new HBox();                   // Use Hbox layout     
      ToggleGroup grouptog = new ToggleGroup(); //Create a ToggleGroup

        Image birdy_image = new Image("bird_aztec_100.jpg");
        Image butterfly_image = new Image("butterfly_100.jpeg");
        Image redpaint_image = new Image("red_paint_100.jpg");
      
      // Create the toggle buttons with icon images.   
      ToggleButton togbutt1 = new ToggleButton("#1:Yes ", new ImageView(birdy_image));    
      ToggleButton togbutt2 = new ToggleButton("#2: No ", new ImageView(butterfly_image));
      ToggleButton togbutt3 = new ToggleButton("#3: No ", new ImageView(redpaint_image)); 
      
      // Make the toggle buttons belong to grouptog.
      togbutt1.setToggleGroup(grouptog);
      togbutt2.setToggleGroup(grouptog);
      togbutt3.setToggleGroup(grouptog);

      //Set value to togbutt1 and togbutt2 but not togbutt3.
      togbutt1.setUserData("butt1 user data: togbutt1 is unselected (default value) out the blocks.");
      togbutt2.setUserData("butt2 user data: togbutt2 is selected to begin with.");
      
      //Verify the data values by printing the user values of togbutt1 ,togbutt2. and togbutt3.
      System.out.println(togbutt1.getUserData());
      System.out.println(togbutt2.getUserData());
      System.out.println(togbutt3.getUserData());
      
      //pre-select togbutt2 button.
      togbutt2.setSelected(true);

      //Add all children to Hbox layout (root).
      root.getChildren().addAll(togbutt1, togbutt2, togbutt3);
      
      Scene scene = new Scene(root, 600, 120);
      stage.setScene(scene);
      stage.show();
  }
}
