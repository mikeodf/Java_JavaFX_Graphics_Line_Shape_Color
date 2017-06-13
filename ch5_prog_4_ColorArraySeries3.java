// ColorArraySeries3.java
/*
When creating more than one arry of any particular type of object,
for example an array of colors, care must be taken to ensure each
object is independent and merely a new label added to a prviously
defined object.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine 
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;

public class ColorArraySeries3 extends Application {

        Group root = new Group();
        double xx = 100;
        double yy = 60;
        Color kula_1, kula_2, kula_3, kula_4, kula_5, kula_6, kula_7, kula_8, kula_9 ; 

        // We want three independent color arrays. This is why these are defined separately.
        Color[]  kulaArray1 =  { kula_1, kula_2, kula_3, kula_4, kula_5, kula_6, kula_7, kula_8, kula_9 } ;
        Color[]  kulaArray2 =  { kula_1, kula_2, kula_3, kula_4, kula_5, kula_6, kula_7, kula_8, kula_9 } ;
        Color[]  kulaArray3 =  { kula_1, kula_2, kula_3, kula_4, kula_5, kula_6, kula_7, kula_8, kula_9 } ;
                 
    public void start(Stage stage) 
    {            
        //  Define Primary color arrays.        
        double[] kul1 = { 100,   0,   0 };     //Red    
        double[] kul2 = {   0, 100,   0 };     //Green
        double[] kul3 = {   0,   0,   100 };   //Blue
       
        // This is a method for displaying the synthesized colors.
        double[] radi = { 90, 80, 70, 60, 50, 40, 30, 20, 10 };

       Color[] kulaSet1 = kulaInterpolate(kul1[0], kul1[1], kul1[2],    kul2[0], kul2[1], kul2[2], 8, kulaArray1); 
       Color[] kulaSet2 = kulaInterpolate(kul1[0], kul1[1], kul1[2],    kul3[0], kul3[1], kul3[2], 8, kulaArray2); 
       Color[] kulaSet3 = kulaInterpolate(kul3[0], kul3[1], kul3[2],    kul2[0], kul2[1], kul2[2], 8, kulaArray3); 
       
       int arrlen = kulaSet1.length;

       for (int k=0; k< arrlen; k++ )  // The array of red-green circles.
       {
           Circle circ1 = new Circle(xx, yy, radi[k], kulaSet1[k]); 
           root.getChildren().add(circ1);  
       }
       
       xx = 260 ;
       for (int k=0; k< arrlen; k++ )  // The array of red-blue circles.
       {
           Circle circ2 = new Circle(xx, yy, radi[k], kulaSet2[k]); 
           root.getChildren().add(circ2);  
       }
       
       xx = 420 ;
       for (int k=0; k< arrlen; k++ )  // The array of red-green circles.
       {
           Circle circ3 = new Circle(xx, yy, radi[k], kulaSet3[k]); 
           root.getChildren().add(circ3);  
       }
       
     
        Scene scene = new Scene(root, 520, 120, Color.web("rgb(6%, 3%,  8%)"));
        stage.setTitle("JavaFX Interpolated color synthesis.");
        stage.setScene(scene);
        stage.show();   
       }

     public Color[] kulaInterpolate(double rr1, double gg1, double bb1, 
                                    double rr2, double gg2, double bb2, int numkulas,
                                    Color[]  kulaArray )   
     {
         /* The colors must be specified as the Color.web("rgb(rr%, gg%,  bb%)") format.
          The start and end colors are respectively Color.web("rgb(1rr%, 1gg%,  1bb%)")
          and Color.web("rgb(2rr%, 2gg%,  2bb%)"). 
         */
         double rrdel = (rr1-rr2)/numkulas ; // The increment vlaue in red channel.
         double ggdel = (gg1-gg2)/numkulas ; // The increment vlaue in red channel.
         double bbdel = (bb1-bb2)/numkulas ; // The increment vlaue in red channel.
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


