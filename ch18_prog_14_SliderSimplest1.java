// SliderSimplest1 .java
/*
The Slider Control is used to display a continuous or discrete range of valid numeric choices.
The user vary input values by moving thre pointer knob using the mouse. 
The Slider can optionally show tick marks and labels indicating the different slider position values.

------------------------------------------------
Constructors:
Slider(): A default Slider instance.
Slider(min, max, value): A Slider control with the specified slider min, max and initial value value.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Slider;

public class SliderSimplest1 extends Application 
{
    public void start(Stage stage) 
    {
        Group root = new Group();
        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.setTitle("Slider Sample");
        
        Slider slider = new Slider(0.5, 11., 3.2); // minimum, maximum and initial values.
        root.getChildren().add(slider);

        stage.show();
    }
}
