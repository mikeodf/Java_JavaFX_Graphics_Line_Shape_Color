// TextListFonts1.java
/*
Display a list of all available fonts on this computer.
------------------------------------------------------

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine
*/
import javafx.application.Application; 
import javafx.stage.Stage; 
import javafx.scene.text.Font;  
import java.util.List;
         
public class TextListFonts1 extends Application
{ 
   public void start(Stage stage) 
   {       
        List<String> familiesList = Font.getFamilies();
        System.out.println(familiesList);  
	stage.show();  // Only for the convenience of exiting.                       
   }   
     
}      
