// SliderValue1.java
/*
Sliders don't have ActionEvents. Instead they have a number 
called valueProperty that contains the current value of the slider.

Slider class: javafx.scene.control.Slider
-------------------------------------------
Constructors 
Slider(): A default Slider instance.
Slider(min, max, value): A Slider control with the specified slider min, max and initial value value.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.GridPane;

public class SliderValue1 extends Application 
{
 
    final Slider slidebar = new Slider (0.5, 1, 1); //Slider(min, max, initial value)
    final Label sliderCaption = new Label("Slider Value:");
    final Label sliderValue = new Label( Double.toString(slidebar.getValue())); 

    public void start(Stage stage) 
    {
        Group root = new Group();
        Scene scene = new Scene(root, 500, 60);
        stage.setScene(scene);
        stage.setTitle("Slider Input and Output.");
 
        GridPane grid = new GridPane();
        scene.setRoot(grid);
        /////////////////////////////////////////////////////////////////
        // Listener type Event handler.
        slidebar.valueProperty().addListener(new ChangeListener<Number>()
        {
            public void changed(ObservableValue<? extends Number> ov,
                                  Number old_val, Number new_val) 
            {
                    sliderValue.setText(String.format("%.2f", new_val));
            }
        });
        /////////////////////////////////////////////////////////////////
        grid.getChildren().add(sliderCaption);

        GridPane.setConstraints(slidebar, 1, 3); // The slider INPUT.
        grid.getChildren().add(slidebar);

        GridPane.setConstraints(sliderValue, 2, 3); // Slider Value OUTPUT.
        grid.getChildren().add(sliderValue);
 
        stage.show();
    }
}
