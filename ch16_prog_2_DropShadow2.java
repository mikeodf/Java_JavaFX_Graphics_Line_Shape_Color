// DropShadow2.java
/*
Two DropShadows applied to separate objects.

Constructors used:
1. DropShadow():A DropShadow with default parameters.
2. DropShadow(radius, offsetX, offsetY, color): A DropShadow with the specified radius, offsetX, offsetY and color.

Parameters:
blurType - the algorithm used to blur the shadow. THREE_PASS_BOX (default), GAUSSEAN, .
color - the shadow Color
radius - the radius of the shadow blur kernel
spread - the portion of the radius where the contribution of the source material will be 100%
offsetX - the shadow offset in the x direction
offsetY - the shadow offset in the y direction

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine 
*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;


public class DropShadow2 extends Application 
{
    public void start(Stage stage) 
    {
        StackPane root = new StackPane();
        
        Rectangle rect1 = new Rectangle(0, 0, 100, 100);
        rect1.setFill(Color.WHITE);

        Circle circ1 = new Circle(140, 150, 40);
        circ1.setFill(Color.rgb(250, 220, 220, 1.0));
        
        DropShadow dropsh1 = new DropShadow(40, Color.DARKBLUE);
        DropShadow dropsh2 = new DropShadow(25, 40, 60, Color.DARKBLUE);
        
        rect1.setEffect(dropsh1);      
        root.getChildren().add(rect1);

        circ1.setEffect(dropsh2);      
        root.getChildren().add(circ1);

        Scene scene = new Scene(root, 300, 300, Color.rgb(200, 250, 200, 1.0));

        stage.setTitle("DropShadows.");
        stage.setScene(scene);
        stage.show();
    }
}
