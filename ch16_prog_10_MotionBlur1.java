// MotionBlur1.java
/*
A MotionBlur with the an adjustable blur radius.

Constructors:
MotionBlur():  A MotionBlur with default parameters.
MotionBlur(angle, radius): A MotionBlur with the specified angle and radius

Parameters:
radius - the radius of the blur kernel

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine 
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.geometry.Insets;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import javafx.scene.effect.MotionBlur;

public class MotionBlur1 extends Application 
{
    public void start(Stage stage) 
    {
        double blur_angle = 15 ;
        VBox root = new VBox(30);
        root.setPadding(new Insets(20));
        
        DoubleProperty radius = new SimpleDoubleProperty(0);
        
        Text blurredText = new Text("The Speed of the Rocket.");
        blurredText.setFont(Font.font(60));        
        
        Slider slider = new Slider(1, 20, 1);
        radius.bind(slider.valueProperty());        
        
        slider.valueProperty().addListener(event -> {
            blurredText.setEffect(new MotionBlur(blur_angle, radius.get()));
        });

        root.getChildren().addAll(slider, blurredText);
      
        Scene scene = new Scene(root, 800, 160);  
        stage.setTitle("The Motion Blur effect");
        stage.setScene(scene);
        stage.show();
    }
}
