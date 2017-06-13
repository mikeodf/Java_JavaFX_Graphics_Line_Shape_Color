// TextAttributes1.java
/*
The attributes are stroke color, fill color, line width (stroke), typeface and size.

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
         
public class TextAttributes1 extends Application
{ 

   public void start(Stage stage) 
   {       

      Text text = new Text();                   //Creating a Text object. 
       
      //Setting font to the text. 
      int type_size = 50 ;
      text.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, type_size));       
      text.setX(30);                           // Position of the text. 
      text.setY(80);          
      text.setFill(Color.YELLOW);               //Setting the color of the fill.     
      text.setStrokeWidth(4);                   // Outline thickness.  
      text.setStroke(Color.BLUE);               // Outline color       
      text.setText("Verdana in fancy clothes"); //The actual text string. 
               
      Group root = new Group(text);             // The Group object to which the text belongs.          
      Scene scene = new Scene(root, 800, 800);  //The scene to for the display of objects.       
      stage.setTitle("Setting verdana font: Style, size, color, outline (width and color).");       
      stage.setScene(scene);                    //Adding the scene to the stage.      
      stage.show();                             //Display the contents of the stage. 
   }      
}      
