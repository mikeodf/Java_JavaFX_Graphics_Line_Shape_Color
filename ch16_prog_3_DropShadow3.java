// DropShadow2.java
/*
Various DropShadows applied to rectangle nodes.

Constructors used:
1. DropShadow():A DropShadow with default parameters.

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
import javafx.scene.Group;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class DropShadow3 extends Application 
{
     public Rectangle createShadowedBox(double x, double y, double size, 
                                        double shadowWidth, double shadowHeight,
                                        double offsetX, double offsetY, double radius)
        {
            Rectangle r = new Rectangle(x, y, size, size);
            r.setFill(Color.LIGHTGRAY);
            r.setStroke(Color.BLACK);
            r.setStrokeWidth(2);

            DropShadow e = new DropShadow();
            e.setWidth(shadowWidth);
            e.setHeight(shadowHeight);
            e.setOffsetX(offsetX);
            e.setOffsetY(offsetY);
            e.setRadius(radius);
            r.setEffect(e);
            return r;
        }

    public void start(Stage stage) 
    {
        Group rootgroup = new Group() ;

        //   Memory aid for parameters:  ( x,  y    size, shadW, shadH, offserX, offsetY, radius      
        Rectangle rct1 = createShadowedBox(20,  20,  60,   10,    10,    5,       5,      10);
        Rectangle rct2 = createShadowedBox(120, 20,  60,   20,    20,   10,      10,      10);
        Rectangle rct3 = createShadowedBox(230, 20,  60,   30,    30,   15,      15,      10);
        Rectangle rct4 = createShadowedBox(20,  120, 60,   20,    20,    0,       0,      10);
        Rectangle rct5 = createShadowedBox(120, 120, 60,   20,    20,    0,      10,      10);
        Rectangle rct6 = createShadowedBox(230, 120, 60,   20,    20,   10,       0,      10);
        Rectangle rct7 = createShadowedBox(20,  220, 60,   20,    20,   10,      10,       0);
        Rectangle rct8 = createShadowedBox(120, 220, 60,   20,    20,   10,      10,      20);
        Rectangle rct9 = createShadowedBox(230, 220, 60,   20,    20,   10,      10,      50);
      
        rootgroup.getChildren().addAll(rct1, rct2, rct3, rct4, rct5, rct6, rct7, rct8, rct9 );
        Scene scene = new Scene(rootgroup, 340, 320, Color.rgb(200, 250, 200, 1.0));

        stage.setTitle("DropShadows Various.");
        stage.setScene(scene);
        stage.show();
    }
}
