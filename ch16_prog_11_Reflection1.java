// Reflection1.java
/*
Reflection renders a reflected copy of the input below the actual input content.

Constructors:
Reflection(): A Reflection with default parameters
public Reflection(topOffset, fraction, topOpacity, bottomOpacity): A Reflection with the specified topOffset, fraction, topOpacity and bottomOpacity.

Parameters:
topOffset - the distance between the bottom of the input and the top of the reflection
fraction - the fraction of the input that is visible in the reflection
topOpacity - the opacity of the reflection at its top extreme
bottomOpacity - the opacity of the reflection at its bottom extreme

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine 
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Reflection1 extends Application 
{
    public void start(Stage stage)
    {
        StackPane root = new StackPane();
        
        Text text = new Text();
        text.setText("Clouds Illusions Recalled");
        text.setFill(Color.BLUE);
        text.setFont(Font.font("Serif", FontWeight.BOLD, 50));

        Reflection reflect = new Reflection();
        text.setEffect(reflect);
        
        root.getChildren().add(text);        
        Scene scene = new Scene(root, 800, 200, Color.PALEGREEN);

        stage.setTitle("The Reflection Effect");
        stage.setScene(scene);
        stage.show();
    }
}
