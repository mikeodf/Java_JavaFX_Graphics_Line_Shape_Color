// ColorArraySeries2.java
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

public class ColorArraySeries2 extends Application {

        Group root = new Group();
        double xx = 140;
        double yy = 60;
        Color kula_1, kula_2, kula_3, kula_4, kula_5, kula_6, kula_7, kula_8, kula_9 ; 
        Color[]  kulaArray =  { kula_1, kula_2, kula_3, kula_4, kula_5, kula_6, kula_7, kula_8, kula_9 } ;
                 
    public void start(Stage stage) 
    {            
        //  Define Primary color arrays.        
        double[] kul1 = { 100,   0,   0 };   //Red    
        double[] kul2 = {   0, 100,   0 };   //Green
       
        // This is a method for displaying the synthesized colors.
        double radiu1 = 100;
        double radiu2 = 90;
        double radiu3 = 80;
        double radiu4 = 70;
        double radiu5 = 60;
        double radiu6 = 50;
        double radiu7 = 40;
        double radiu8 = 30;
        double radiu9 = 20;

       Color[] kulaSet1 = kulaInterpolate(kul1[0], kul1[1], kul1[2],    kul2[0], kul2[1], kul2[2],  8 )  ; 

       Circle circ1 = new Circle(xx, yy, radiu1, kulaSet1[0]); // Red
       root.getChildren().add(circ1);     
       Circle circ2 = new Circle(xx, yy, radiu2, kulaSet1[1]); 
       root.getChildren().add(circ2);    
       Circle circ3 = new Circle(xx, yy, radiu3, kulaSet1[2]); 
       root.getChildren().add(circ3);     
       Circle circ4 = new Circle(xx, yy, radiu4, kulaSet1[3]); 
       root.getChildren().add(circ4);
       Circle circ5 = new Circle(xx, yy, radiu5, kulaSet1[4]); 
       root.getChildren().add(circ5);     
       Circle circ6 = new Circle(xx, yy, radiu6, kulaSet1[5]); // Green
       root.getChildren().add(circ6); 
       Circle circ7 = new Circle(xx, yy, radiu7, kulaSet1[6]); // Red
       root.getChildren().add(circ7);     
       Circle circ8 = new Circle(xx, yy, radiu8, kulaSet1[7]); 
       root.getChildren().add(circ8);    
       Circle circ9 = new Circle(xx, yy, radiu9, kulaSet1[8]); 
       root.getChildren().add(circ9);     


        Scene scene = new Scene(root, 300, 120, Color.web("rgb(6%, 3%,  8%)"));
        stage.setTitle("JavaFX Interpolated color synthesis.");
        stage.setScene(scene);
        stage.show();   
       }

     public Color[] kulaInterpolate(double rr1, double gg1, double bb1, 
                                    double rr2, double gg2, double bb2, int numkulas )   
     {
         /* The colors must be specified as the Color.web("rgb(rr%, gg%,  bb%)") format.
          The start and end colors are respectively Color.web("rgb(1rr%, 1gg%,  1bb%)")
          and Color.web("rgb(2rr%, 2gg%,  2bb%)"). 
         */
       
         double rrdel = (rr1-rr2)/numkulas ; // The increment vlaue in red channel.
         double ggdel = (gg1-gg2)/numkulas ; // The increment vlaue in green channel.
         double bbdel = (bb1-bb2)/numkulas ; // The increment vlaue in blue channel.
         double rr, gg, bb ;
         double rr0, gg0, bb0 ;
         rr0 = rr1 + rrdel ;
         gg0 = gg1 + ggdel ;
         bb0 = bb1 + bbdel ;
         for (int i=0; i<numkulas; i++ )
         {   
              rr = rr1 - i*rrdel ;
              gg = gg1 - i*ggdel ;
              bb = bb1 - i*bbdel ;
             kulaArray[i+1] = Color.web("rgb("+rr+"%,"+gg+"%,"+bb+"%)"); 
         }
     return kulaArray; 
     }
}


