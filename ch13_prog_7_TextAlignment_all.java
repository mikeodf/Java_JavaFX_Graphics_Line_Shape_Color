// TextAlignment_all.java
/*
Justification options:
LEFT, RIGHT, CENTER, JUSTIFY.
The "JUSTIFY" flag does not mean much.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine
*/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class TextAlignment_all extends Application
{
	public void start(Stage stage) 
	{
		Group root = new Group();

		Text text1 = new Text(20,  20, "Everyone says love hurts, \n but that is not true. \n  Loneliness hurts. \n    Rejection hurts. \n     Losing someone hurts. \n       Envy hurts. \n \n      Everyone gets these things confused with love \n      but in reality, love is the only thing in the world \n      that covers up all the pain \n      and makes someone feel wonderful again. \n      Love is the only thing in the world that does not hurt.\n          Liam Neeson.");
                //text1.setTextAlignment(TextAlignment.RIGHT);
                //text1.setTextAlignment(TextAlignment.LEFT);
                //text1.setTextAlignment(TextAlignment.CENTER);
                text1.setTextAlignment(TextAlignment.JUSTIFY); // Default -  identical to LEFT justification.

		Text text2 = new Text(420,  30, "A terrible beauty is born. \nPain is the price paid \nfor the vividness of life, \nthe darkness against which \nlight may leap more brightly.\n  Patrick Vincent");
	        //text2.setTextAlignment(TextAlignment.RIGHT);
	        //text2.setTextAlignment(TextAlignment.LEFT);
	        //text2.setTextAlignment(TextAlignment.CENTER);
	        text2.setTextAlignment(TextAlignment.JUSTIFY);// Default - identical to LEFT justification.

 
		Text text3 = new Text(460,  160, "I am the story teller. \nWarriors and young boys creep away from\nthe hearths  of wine-halls to hear me.\n I give them what is more precious than gold: \ntreasure unlocked from my heart. \nMy words burn like flame in the darkness. \nI speak and hearts beat high.\n  Jim Fitzpatrick.");
                 //text3.setTextAlignment(TextAlignment.RIGHT);
                 //text3.setTextAlignment(TextAlignment.LEFT);
                 //text3.setTextAlignment(TextAlignment.CENTER);
                 text3.setTextAlignment(TextAlignment.JUSTIFY);// Default - identical to LEFT justification.


		root.getChildren().addAll(text1, text2, text3);		
		
		Scene scene = new Scene(root,800,300);
		stage.setScene(scene);
		stage.setTitle("Text with JUSTIFY justification.");
		stage.show();
	}
}
 
