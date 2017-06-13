// Color_Fine_Interpolation1.java
/*
A color interpolator. We start with a source and a target color and construct an
interpolation method that will bridge a transitional series of colors between the two.
The basic assumption is that the numerical increment from one intermediate color
to the next is a steady value (the color intervals in each color channel are identical.

The format of color specification is:
Color kula_1 = Color.color(red, green, blue, alpha); 
where red, green, and blue values are in the range 0 to 1.
The alpha channels are not modified. 

For Color design see http://paletton.com/ or http://colorschemedesigner.com/

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import java.lang.Math;
import java.util.Random;

public class Color_Fine_Interpolation1 extends Application {

        Group root = new Group();
       
     public Color[] kulaInterpolate(double rr1, double gg1, double bb1,double alfa1, 
                                    double rr2,  double gg2, double bb2, double alfa2,
                                    int numkulas )   
     {
         /* Create an interpolated sequence of colors.
           Color format:  Color.color(red, green, blue, alpha) format.
          The start and end colors are respectively Color.color(rr1, gg1, bb1, alfa1)
          and Color.color(rr2, gg2, bb2, alfa2). 
         */
       
         double rrdelta = (rr1-rr2)/numkulas ;
         double ggdelta = (gg1-gg2)/numkulas ;
         double bbdelta = (bb1-bb2)/numkulas ;
         double rr, gg, bb , alfa;
         double rr0, gg0, bb0, alfa0;
         Color[] kulaArray = new Color[numkulas];

         for (int i=0; i<numkulas; i++ )
         {   
              rr = rr1 - i*rrdelta ;
              gg = gg1 - i*ggdelta ;
              bb = bb1 - i*bbdelta ;
             kulaArray[i] = Color.color(rr, gg, bb, alfa1); 
         }
     return kulaArray; 
     }

    
     public void CircleSet(double x_center, double y_center, Color[] kulaSet,  int numkulas   ) 
     {              
        /* Display a Color set as a sequence of concentric circles.
        */
        double radius1 = 500 ;
        double radius2 = 20;
        double radius_delta = (radius1-radius2)/numkulas;
      
        for (int i=0; i<numkulas; i++)
        {
             Circle circ1 = new Circle();
             circ1.setCenterX(x_center);
             circ1.setCenterY(y_center);
             circ1.setRadius(radius1 - i*radius_delta);           
             circ1.setFill(kulaSet[i]);
             root.getChildren().add(circ1);
        }
     }
        
         
    public void start(Stage stage) 
    {    
        int numkulas =  70;          // The number of colors generated.
        double x_center = 500;   // The center of all circles.
        double y_center = 500;

        // Demonstrastion sets.
        //Color[] kula_sequence = kulaInterpolate(.83, .42, .42, 1, .33,  0, 0, 1, numkulas ) ;
        //Color[] kula_sequence = kulaInterpolate(1, 0, 0, 1, 0,  0, 1, 1, numkulas ) ; // red->blue
        //Color[] kula_sequence = kulaInterpolate(0, 1, 0, 1, 0,  0, 1, 1, numkulas ) ; // green->blue
        //Color[] kula_sequence = kulaInterpolate(0, 1, 0, 1, 1,  0, 0, 1, numkulas ) ; // green->red

        //Color[] kula_sequence = kulaInterpolate(1, 1, 0, 1,    0,  0, 1, 1, numkulas ) ; // yellow->blue
        //Color[] kula_sequence = kulaInterpolate(0, 0.7, 0, 1,   1,  1, 0, 1, numkulas ) ; // green->yellow
        //Color[] kula_sequence = kulaInterpolate(1, 0, 1, 1,   1,  0, 0, 1, numkulas ) ; // purple->red
        Color[] kula_sequence = kulaInterpolate(0, 0, 1, 1,   1,  0, 1, 1, numkulas ) ; // blue->purple

        CircleSet(x_center, y_center, kula_sequence,  numkulas   );
        
        Scene scene = new Scene(root, 1000, 1000, Color.color(0.6, 0.3,  0.8));
        stage.setTitle("Interpolation between Colors.");
        stage.setScene(scene);
        stage.show();     
    }
}
