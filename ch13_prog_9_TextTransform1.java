// TextTransform1.java
/*
Rotate(alphs, pivotX, pivotY);
Translate(x, y);
Shear(ShearX, ShearY);
Scale(ScaleX, scaleY);

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine
*/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;
import javafx.scene.transform.Shear;
import javafx.scene.transform.Scale;

public class TextTransform1 extends Application
{
	public void start(Stage stage) 
	{
		Group root = new Group();
                String string1 =  "My words burn.";
                Text text0 = new Text(0,10,string1);
                root.getChildren().addAll(text0);

                double alpha = 10;
                double pivotX = 100;
                double pivotY = 100;
                double scaleX = 1;
                double scaleY = 1;
                double shiftX = 10;
                double shiftY = 10;
                double shearX = 8;
                double shearY = 12;

                for (int i = 0; i<10; i++)
                {
		Text text1 = new Text(100,  10, string1);
		Text text2 = new Text(10,  10, string1);
		Text text3 = new Text(10,  10, string1);
		Text text4 = new Text(10,  10, string1);

                text1.getTransforms().add(new Rotate(alpha, pivotX, pivotY));  // angle, pivot X, pivot Y.
                //text2.getTransforms().add(new Translate(shiftX, shiftY));  // 
                //text3.getTransforms().add(new Scale(scaleX, scaleY));  // 
                //text3.getTransforms().add(new Shear(shearX, shearY));  // 
                alpha +=10 ;
                shiftX += 5;
                shiftY += 3;
                scaleX += 0.2; 
                scaleY += 0.3;
                shearX += 1.2; 
                shearY += 1.5;
                root.getChildren().addAll(text1);
                //root.getChildren().addAll(text2);
                //root.getChildren().addAll(text3);
                //root.getChildren().addAll(text4);
                }

		Scene scene = new Scene(root,600,600);
		stage.setScene(scene);
		stage.setTitle("Text Transforms: Rotate, Translate, Scale, Shear");
		stage.show();
	}
}
 
