//BoxBlur1.java
/*
A blur effect using a simple box filter in which each pixel in the resulting
image has a value equal to the average value of its neighboring pixels 
in the input image. Box blurs are used to approximate a Gaussian blur. 
They are simpler and quicker to calculate provided the number of iterations is low.
BoxBlur has separately configurable sizes in both dimensions. 

Constructors:
BoxBlur(): A BoxBlur with default parameters.
BoxBlur(width, height,iterations): A BoxBlur with specified width, height and number of iterations

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine 
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import javafx.scene.effect.BoxBlur;

public class BoxBlur1 extends Application 
{
    public void start(Stage stage) 
    {

        VBox root = new VBox(30);
        root.setPadding(new Insets(10));
        
        DoubleProperty radius = new SimpleDoubleProperty(0);
        
        Text blurredText = new Text("BoxBlur can look the same as Gaussian.");
        blurredText.setFont(Font.font(50));        
        
        Slider slider = new Slider(1, 20, 1);
        radius.bind(slider.valueProperty());        
        
        slider.valueProperty().addListener(event -> {
           blurredText.setEffect(new BoxBlur(radius.get(), radius.get(), 10));
        });

        root.getChildren().addAll(slider, blurredText);
        
        Scene scene = new Scene(root, 1100, 160, Color.BLUE);  // Color has no effect -  VBox?

        stage.setTitle("The Box Blur effect");
        stage.setScene(scene);
        stage.show();
    }
}
