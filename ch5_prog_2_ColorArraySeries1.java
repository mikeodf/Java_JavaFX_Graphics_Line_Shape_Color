// ColorArraySeries1.java
/*
Colors are synthesized from numerical % values kept in 
simple arrays in the format: double[] kul1 = { 50,   80,   100 };    
Thes numerical arrays are used to assemble color specifications in the 
form:
Color kula_1 = Color.web("rgb(47%, 27%,  75%)");  

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine 
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;

public class ColorArraySeries1 extends Application {

        Group root = new Group();
        double xx = 80;
        double yy = 60;
                 
    public void start(Stage stage) 
    {            
        //  Define Primary color arrays.        
        double[] kul1 = { 100,   0,   0 };   //Red    
        double[] kul2 = {   0, 100,   0 };   //Green
        double[] kul3 = {   0,   0, 100 };   //Blue
        double[] kul4 = {  50,  50,  50 };   //Grey    
        
        Color red1   = Color.web("rgb("+kul1[0]+"%,"+kul1[1]+"%,"+kul1[2]+"%)");  
        Color green1 = Color.web("rgb("+kul2[0]+"%,"+kul2[1]+"%,"+kul2[2]+"%)");   
        Color blue1  = Color.web("rgb("+kul3[0]+"%,"+kul3[1]+"%,"+kul3[2]+"%)");   
        Color grey1  = Color.web("rgb("+kul4[0]+"%,"+kul4[1]+"%,"+kul4[2]+"%)");      
   
        // This is a method for displaying the synthesized colors.
        double radiu1 = 50;
                  
       Circle circ1 = new Circle(xx, yy, radiu1, red1); // Red
       root.getChildren().add(circ1);
    
       xx = 160;       
       Circle circ2 = new Circle(xx, yy, radiu1, green1); // Green
       root.getChildren().add(circ2);

       xx = 240;      
       Circle circ3 = new Circle(xx, yy, radiu1, blue1); // Blue
       root.getChildren().add(circ3);

       xx = 320;      
       Circle circ4 = new Circle(xx, yy, radiu1, grey1); // Grey
       root.getChildren().add(circ4);

        Scene scene = new Scene(root, 400, 120, Color.web("rgb(6%, 3%,  8%)"));
        stage.setTitle("JavaFX Primary color synthesis.");
        stage.setScene(scene);
        stage.show();   

       }
      

}


