// ColorHaloFrame1.java
/*
When creating more than one array of any particular type of object,
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

public class ColorHaloFrame1 extends Application {

        Group root = new Group();
        double xx = 100;
        double yy = 60;
        Color kula_1, kula_2, kula_3, kula_4, kula_5, kula_6, kula_7, kula_8, kula_9 ; 

        // We want three independeny color arrays.
        Color[]  kulaArray1 =  { kula_1, kula_2, kula_3, kula_4, kula_5, kula_6, kula_7, kula_8, kula_9 } ;
        Color[]  kulaArray2 =  { kula_1, kula_2, kula_3, kula_4, kula_5, kula_6, kula_7, kula_8, kula_9 } ;
        Color[]  kulaArray3 =  { kula_1, kula_2, kula_3, kula_4, kula_5, kula_6, kula_7, kula_8, kula_9 } ;
        Color[]  kulaArray4 =  { kula_1, kula_2, kula_3, kula_4, kula_5, kula_6, kula_7, kula_8, kula_9 } ;
        Color[]  kulaArray5 =  { kula_1, kula_2, kula_3, kula_4, kula_5, kula_6, kula_7, kula_8, kula_9 } ;
        Color[]  kulaArray6 =  { kula_1, kula_2, kula_3, kula_4, kula_5, kula_6, kula_7, kula_8, kula_9 } ;
        Color[]  kulaArray7 =  { kula_1, kula_2, kula_3, kula_4, kula_5, kula_6, kula_7, kula_8, kula_9 } ;
        Color[]  kulaArray8 =  { kula_1, kula_2, kula_3, kula_4, kula_5, kula_6, kula_7, kula_8, kula_9 } ;
        Color[]  kulaArray9 =  { kula_1, kula_2, kula_3, kula_4, kula_5, kula_6, kula_7, kula_8, kula_9 } ;
                 
    public void start(Stage stage) 
    {            
        //  Define Primary color arrays.        
        double[] kul1 = { 100,   0,   0 };     //Red    
        double[] kul2 = {   0, 100,   0 };     //Green
        double[] kul3 = {   0,   0, 100 };     //Blue
        double[] kul4 = { 100, 100,   0 };     //Yellow 
        double[] kul5 = {  44,   4,  67 };     //Purple
        double[] kul6 = {   0,   0,   0 };     //Black
       
        // This is a method for displaying the synthesized colors.
        double[] radi1 = { 1.00, .99, .98, .96, .94, .91, .88, .84, .80 };
        double[] radi2 = { 1.00, .92, .86, .80, .76, .73, .70, .68, .66 };


       Color[] kulaSet1 = kulaInterpolate(kul1[0], kul1[1], kul1[2],    kul2[0], kul2[1], kul2[2], 8, kulaArray1); // Red to Green.
       Color[] kulaSet2 = kulaInterpolate(kul1[0], kul1[1], kul1[2],    kul3[0], kul3[1], kul3[2], 8, kulaArray2); // Red to Blue. 
       Color[] kulaSet3 = kulaInterpolate(kul3[0], kul3[1], kul3[2],    kul2[0], kul2[1], kul2[2], 8, kulaArray3); // Blue to Green. 
       Color[] kulaSet4 = kulaInterpolate(kul3[0], kul3[1], kul3[2],    kul4[0], kul4[1], kul4[2], 8, kulaArray4); // Blue to Yellow. 
       Color[] kulaSet5 = kulaInterpolate(kul5[0], kul5[1], kul5[2],    kul1[0], kul1[1], kul1[2], 8, kulaArray5); // Purple to Red. 
       Color[] kulaSet6 = kulaInterpolate(kul6[0], kul6[1], kul6[2],    kul5[0], kul5[1], kul5[2], 8, kulaArray6); // Black to Purple.
       Color[] kulaSet7 = kulaInterpolate(kul6[0], kul6[1], kul6[2],    kul3[0], kul3[1], kul3[2], 8, kulaArray7); // Black to Blue. 
       Color[] kulaSet8 = kulaInterpolate(kul6[0], kul6[1], kul6[2],    kul1[0], kul1[1], kul1[2], 8, kulaArray8); // Black to Red. 
       Color[] kulaSet9 = kulaInterpolate(kul3[0], kul3[1], kul3[2],    kul5[0], kul5[1], kul5[2], 8, kulaArray8); // Blue to Purple. 
       
        double[] mainCenter = { 344.8, 559.1, 163.6 }; // x, y, radius.

        double[] xxc    = { 344.5,   203.1, 106.2,  62.4,  56.8,  71.4,  93.9, 119.5, 144.1, 168.2, 190.3, 211.1, 230.6, 249.2, 266.6, 283.4, 299.4, 315.3, 330.7, 346.0 };
        double[] yyc    = { 840.7,   802.7, 713.2, 612.2, 523.9, 455.5, 404.4,   367, 339.1, 318.2, 302.2, 290.4, 280.8, 273.6, 267.8, 263.6, 260.6, 258.5, 257.4, 257.1 };
        double[] radius = {  75.1,    70.9,  60.1,  48.8,  38.5,  30.6,  24.2,  20.2,  16.7,  14.2,  12.6,  11.1,  10.2,   9.3,   8.6,   8.1,   7.8,   7.5,   7.3,   7.3 };

       int halolen = xxc.length;

       double xxr, xxl, yoffset; 
       double xoffset = 100; 
       double yyv;
       int arrlen = kulaSet1.length;

       for (int k=0; k< halolen; k++ )  // The array of red-green circles.
       {
           xxl = xxc[k] + xoffset ;
           yyv = 3*mainCenter[0] - yyc[k];
           Circle circ1 = new Circle(xxl, yyv, radius[k], Color.web("rgb(0%, 0%,  30%)")); 
           circ1.setFill(null);
           circ1.setStroke(Color.web("rgb(0%, 0%,  50%)"));
           root.getChildren().add(circ1); 
                  
           for (int j=0; j< arrlen; j++ )  // Black-to-purple transition.
           {   Circle circ2 = new Circle(xxl, yyv, radi1[j]*radius[k], kulaSet9[j]); 
           root.getChildren().add(circ2);  
           }
       
           for (int j=0; j< arrlen; j++ ) // Purple-to-red transition.
           {   Circle circ3 = new Circle(xxl, yyv, radi2[j]*radius[k], kulaSet5[j]); 
               root.getChildren().add(circ3);  
           } 

           xxr = 153 + xoffset + 2*mainCenter[0] - xxc[k];
           Circle circ4 = new Circle(xxr, yyv, radius[k], Color.ORANGE); 
           circ4.setFill(null);
           circ4.setStroke(Color.web("rgb(0%, 0%,  50%)"));
           root.getChildren().add(circ4);

           for (int j=0; j< arrlen; j++ )  // Black-to-purple transition.
           {   Circle circ5 = new Circle(xxr, yyv, radi1[j]*radius[k], kulaSet9[j]); 
           root.getChildren().add(circ5);  
           }
       
           for (int j=0; j< arrlen; j++ ) // Purple-to-red transition.
           {   Circle circ6 = new Circle(xxr, yyv, radi2[j]*radius[k], kulaSet5[j]); 
               root.getChildren().add(circ6);  
           } 
        }
    
        Scene scene = new Scene(root, 1000, 900, Color.web("rgb(6%, 3%,  8%)"));
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


