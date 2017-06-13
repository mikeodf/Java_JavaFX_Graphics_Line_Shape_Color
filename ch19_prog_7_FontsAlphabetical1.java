// FontsAlphabetical1.java
/*
Alphabetic list of fonts available on this computer.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine 
*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import java.util.List;

public class FontsAlphabetical1 extends Application
{
   public void start(final Stage stage) 
   {
      stage.setTitle("Text Fonts available, alphabetical");
     
      List<String> familiesList = Font.getFamilies();

		for(int i=0;i<familiesList.size();i++)
                {
                       System.out.println(familiesList.get(i)); 
		}
		
      stage.show();
   }
}
