// TextShowFonts2.java
/*
Inspect the appearance of fonts.
Note that a "null" font gives us a visually acceptable default font.
-----------------------------------
Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine
*/
import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.paint.Color; 
import javafx.stage.Stage; 
import javafx.scene.text.Font; 
import javafx.scene.text.FontPosture; 
import javafx.scene.text.FontWeight; 
import javafx.scene.text.Text; 

public class TextShowFonts2 extends Application
{ 

   public void start(Stage stage) 
   {       
      String[] textArray = {"The Quick Brown Fox Jumps Over The Lazy Dog","Beautiful Every Time",  
                            "Abyssinica SIL","American Brewery Rough Demo", "Carnivalee Freakshow",
                            "Christmas Season", "Circus", "DK Cool Crayon", "MathJax_Caligraphic",
                            "Little Lord Fontleroy NF", "Victorian Parlor Vintage Alternate_free", "null"} ;
      String font = "  font =  ";

      Group root = new Group() ;
      System.out.println("textArray.length: " + textArray.length );  // Checking on length of array.

      // Because our text objects are arrays we can process large numbers of objects compactly.
      Text[] txt = new Text[textArray.length]; 

      for (int i=0 ; i<(textArray.length)-1 ; i++)
      {  txt[i] =  new Text(font  + textArray[i+1] + " :: " + textArray[0] ); 
         txt[i].setFont(Font.font(textArray[i+1], 40));  
         txt[i].setY((i+1)*40); 
         root.getChildren().add(txt[i]);  
      } ; 
          
      Scene scene = new Scene(root, 1000, 460);      
      stage.setTitle("A display of some interesting fonts.");       
      stage.setScene(scene);                        
      stage.show();                             
   }      
}      
