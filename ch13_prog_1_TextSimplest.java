// TextSimplest.java
/*
class: javafx.scene.text.Text
--------------------------------------
Constructors:
1. Text(); A basic instance of Text. The parameters can be supplied later.
2. Text(x, y, text); A text instance positioned at the given coordinates and containing the given string of text.
3. Text(text); The given string of test.

where:
x,y is the position of the start of the text.
text is the string of characters to be displayed.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine
*/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.*;

public class TextSimplest extends Application
{
	public void start(Stage stage) 
	{
		Group root = new Group();

		Text text1 = new Text(20,  10, "A Simple Display of Text");
		root.getChildren().addAll(text1);	
		
		Scene scene = new Scene(root,300,80);
		stage.setScene(scene);
		stage.setTitle("A Simple Text Node.");
		stage.show();
	}
}
 
