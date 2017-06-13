// DropShadow1.java
/*
DropShadow renders a shadow behind the object with the specified colour, radius, and offset.

Constructors:
DropShadow():A DropShadow with default parameters.
DropShadow(blurType,color, radius, spread, offsetX, offsetY): A DropShadow with the specified blurType, color, radius, spread, offsetX and offsetY.
DropShadow(radius, color):A DropShadow with the specified radius and color.
DropShadow(radius, offsetX, offsetY, color): A DropShadow with the specified radius, offsetX, offsetY and color.

Parameters:
blurType - the default algorithm used to blur the shadow = THREE_PASS_BOX.
color - the shadow Color
radius - the radius of the shadow blur kernel

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine 
*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class DropShadow1 extends Application {

    public void start(Stage stage) 
    {
        StackPane root = new StackPane();
        
        Rectangle rect1 = new Rectangle(0, 0, 200, 160);
        rect1.setFill(Color.WHITE);
        DropShadow dropsh1 = new DropShadow(60, Color.DARKBLUE);  // Radius, color      
        rect1.setEffect(dropsh1);       
        root.getChildren().add(rect1);
        
        Rectangle rect2 = new Rectangle(100, 0, 150, 100);
        rect2.setFill(Color.WHITE);
        DropShadow dropsh2 = new DropShadow(30, Color.BROWN);        
        rect2.setEffect(dropsh2);       
        root.getChildren().add(rect2);
        
        Rectangle rect3 = new Rectangle(200, 0, 80, 60);
        rect3.setFill(Color.WHITE);
        DropShadow dropsh3 = new DropShadow(15, Color.DARKGREEN);        
        rect3.setEffect(dropsh3);       
        root.getChildren().add(rect3);
        
        Scene scene = new Scene(root, 400, 250, Color.rgb(200, 250, 200, 1.0));

        stage.setTitle("DropShadows.");
        stage.setScene(scene);
        stage.show();
    }

}
