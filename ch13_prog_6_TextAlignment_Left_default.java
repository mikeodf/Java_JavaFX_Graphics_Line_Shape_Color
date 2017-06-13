// TextAlignment_Left_default.java
/*
Left justification is the default.
(default = the option that is used if we do not specify anything).

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine
*/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.*;

public class TextAlignment_Left_default extends Application
{
	public void start(Stage stage) 
	{
		Group root = new Group();

		Text text1 = new Text(10,  20, "Everyone says love hurts, \n but that is not true. \n  Loneliness hurts. \n    Rejection hurts. \n     Losing someone hurts. \n       Envy hurts. \n \n      Everyone gets these things confused with love \n     but in reality, love is the only thing in the world \n    that covers up all the pain \n   and makes someone feel wonderful again. \n  Love is the only thing in the world that does not hurt.\n          Liam Neeson.");

		Text text2 = new Text(300,  30, "A terrible beauty is born. \nPain is the price paid for the vividness of life, \nthe darkness against which light may leap more brightly.\n  Patrick Vincent");
	
		Text text3 = new Text(400,  100, "I am the story teller. \nWarriors and young boys creep away from\nthe hearths  of wine-halls to hear me.\n I give them what is more precious than gold: \ntreasure unlocked from my heart. \nMy words burn like flame in the darkness. \nI speak and hearts beat high.\n  Jim Fitzpatrick.");
		root.getChildren().addAll(text1, text2, text3);		
		
		Scene scene = new Scene(root,700,250);
		stage.setScene(scene);
		stage.setTitle("Text with default justification (LEFT).");
		stage.show();
	}
}
 
