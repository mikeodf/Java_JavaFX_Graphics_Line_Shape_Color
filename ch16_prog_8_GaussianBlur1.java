// GaussianBlur1.java
/*
A GaussianBlur with the an adjustable blur radius.

Constructors:
GaussianBlur():  A GaussianBlur with default parameters.
GaussianBlur(radius): A GaussianBlur with specified radius.

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
import javafx.scene.effect.GaussianBlur;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;



public class GaussianBlur1 extends Application 
{
    public void start(Stage stage) 
    {

        VBox root = new VBox(30);
        root.setPadding(new Insets(20));
        
        DoubleProperty radius = new SimpleDoubleProperty(0);
        
        Text blurredText = new Text("My Eyes grow dim.");
        blurredText.setFont(Font.font(60));        
        
        Slider slider = new Slider(1, 20, 1);
        radius.bind(slider.valueProperty());        
        
        slider.valueProperty().addListener(event -> {
            blurredText.setEffect(new GaussianBlur(radius.get()));
        });

        root.getChildren().addAll(slider, blurredText);
      
        Scene scene = new Scene(root, 600, 160);  
        stage.setTitle("The Gaussian Blur effect");
        stage.setScene(scene);
        stage.show();
    }
}
