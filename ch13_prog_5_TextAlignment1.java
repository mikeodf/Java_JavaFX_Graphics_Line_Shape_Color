// TextAlignment1.java
/*
Arc : class: javafx.scene.text.Text
--------------------------------------
An instance of Text with given position.
Constructors:
1. Text(); A basic instance of Text. The parameters can be supplied later.
2. Text(x, y, text); An instance positioned at the given coordinates and containing the given string of test.
3. Text(text); An instance containing the given string of test.

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

public class TextAlignment1 extends Application
{
	public void start(Stage stage) 
	{
		Group root = new Group();

		Text text1 = new Text(10,  20, "One");
		Text text2 = new Text(20,  30, "Two");	
		Text text3 = new Text(30,  40, "Three");
		root.getChildren().addAll(text1, text2, text3);		
		
		Scene scene = new Scene(root,300,60);
		stage.setScene(scene);
		stage.setTitle("A Simple Text Node.");
		stage.show();
	}
}
 
