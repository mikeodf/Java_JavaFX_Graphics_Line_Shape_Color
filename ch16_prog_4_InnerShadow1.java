// InnerShadow1.java
/*
InnerShadow  .

Constructors
1. InnerShadow(radius, color)
2. InnerShadow(radius, offsetX, offsetY, color)
3. InnerShadow(blurType, color, radius, choke, offsetX, offsetY)

Parameters:
radius - the radius of the shadow blur kernel.
choke - the portion of the radius where the contribution of the source material will be 100%.
color - the shadow Color.
offsetX - the shadow offset in the x direction.
offsetY - the shadow offset in the y direction.
blurType - the algorithm used to blur the shadow.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine 
*/
import javafx.application.Application;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.effect.Reflection;
import javafx.scene.effect.InnerShadow;

public class InnerShadow1 extends Application 
{
    public void start(Stage stage)
    {
        StackPane root = new StackPane();
        
        Text text = new Text();
        text.setText("Laser-cut Carvings");
        text.setFill(Color.YELLOW);
        text.setFont(Font.font("Serif", FontWeight.BOLD, 80));

        InnerShadow innershad =  new InnerShadow(10., Color.RED);
        innershad. setOffsetX(4);
        innershad. setOffsetY(4);

        text.setEffect(innershad);
        
        root.getChildren().add(text);        
        Scene scene = new Scene(root, 1000, 180, Color.LIGHTBLUE);
        stage.setTitle("The Inner Shadow Effect");
        stage.setScene(scene);
        stage.show();
    }
}
