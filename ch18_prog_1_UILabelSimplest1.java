// UILabelSimplest1.java
/*
Label : class: javafx.scene.control.Label
--------------------------------------
Show Text at a specified position.
Constructors:
1. Label(); A basic instance of Text. The parameters can be supplied later.
2. Label(text); An instance positioned at the given coordinates and containing the given string of test.
3. Label(text, graphic); An instance containing the given string of test.
where:
graphic is an image icon.
text is the string of characters to be displayed.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine
*/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.*;

import javafx.scene.control.Label;

public class  UILabelSimplest1 extends Application
{
	public void start(Stage stage) 
	{
		Group root = new Group();

		Label label1 = new Label("One");
		root.getChildren().addAll(label1);		
		
		Scene scene = new Scene(root, 200, 40);
		stage.setScene(scene);
		stage.setTitle("A Simplest UI Label.");
		stage.show();
	}
}
