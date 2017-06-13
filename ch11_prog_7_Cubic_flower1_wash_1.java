// Cubic_flower_1_wash_1.java
/*
To be used in reference to "Cubic_PolyShape_Draw8.java".

Repeated constructors creating a set of progressively different
randomized cubic curves.
Random number method for Gaussian distribution:
nextGaussian(): Gives a Gaussian ("normally") distributed number with mean valye 0.0 and standard deviation 1.0

Line and Shape Properties/attribute parameters:
======================================
path1.setStrokeWidth(4);                                       // Width of the line, pixels.
path1.setStrokeLineCap(StrokeLineCap.ROUND); // Rounded ends of lines.
path1.setStroke(Color.BLUE);    
//path1.getStrokeDashArray().addAll(14d);               // Dash pattern: fill, blank, etc
path1.getStrokeDashArray().addAll(14);               // Dash pattern: fill, blank, etc 
path1.setStrokeDashOffset(10); //Dash pattern: to shift the beginning of the dash.
path1.setFill(Color.PINK);   // Fill the interior of a closed shape with color.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine 
*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*; // Graphic primitives library.
import java.lang.reflect.Array; 
import java.util.Random;

public class Cubic_flower1_wash_1 extends Application 
{

    //======================================================
    //     Functions/Methods.
    //======================================================

    Path Points2paths(double[][] path_points, MoveTo  selected_moveTo)
    {
        /* Applies to : One path - the raw points that will be used to construct all the 
                      CubicCurveTos that make up the sequence of drawn CubicCurveTo parts. 
        The first position in the path is the starting MoveTo (which could be the first vertex/point
        of the first CubicCurveTo.

         The Output: An assembled path ready to be added to the JavaFX stage for display.
        */

        int num_cctos = Array.getLength(path_points) ; // Number of CubicCurveTos making up the path.
        CubicCurveTo crv_pth1 =  new CubicCurveTo();   // The set of curves for a path. 
    
        // Assemble one path.
        Path  path_n =  new Path(); 
        path_n.getElements().add(selected_moveTo); // Select the appropriate start position.
        for (int j=0; j< num_cctos ; j++)
        {    
            crv_pth1 = new CubicCurveTo(path_points[j][0], path_points[j][1], path_points[j][2],
                                     path_points[j][3], path_points[j][4], path_points[j][5]); 

            path_n.getElements().add(crv_pth1);    
            path_n.setStrokeWidth(5); 
        };
     return path_n ;
    }


    public Color[] kulaInterpolate(double rr1, double gg1, double bb1,double alfa1, 
                                    double rr2,  double gg2, double bb2, double alfa2,
                                    int numkulas )   
    {
         /* Create an interpolated sequence (array) of colors.
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
              

    double[] make_scale_factors(double start_value, int num_elements)
        {
          double[] scale_factors = new double[num_elements];
          double decrement = start_value/num_elements;
          for (int i=0; i<num_elements-1; i++)
             { scale_factors[i] = start_value -= decrement ;
             }
      return scale_factors;
    }

 //================================================================================= 
    //======================================================
    //     Main Execution.
    //======================================================
    public void start(Stage primaryStage) 
    {
        Group rootgroup = new Group();

    //======================================================
    //     Variable Declarations.
    //======================================================

    //flower_path1.svg
    double[]  startAt1_1={214,198};
    MoveTo moveTo1_1 = new MoveTo(startAt1_1[0], startAt1_1[1]);
    double[][] flower1_cube1  = {{214,198 , 225.3,208.9 , 237,206.1},
    {248.7,203.3 , 284.2,180.9 , 294.1,168.4},
    {304.1,155.9 , 310.7,135.2 , 310.7,135.2},
    {310.7,135.2 , 318.9,141.3 , 323,138.8},
    {327,136.2 , 340.8,130.1 , 336.7,127.6},
    {332.7,125 , 317.3,114.8 , 317.3,114.8},
    {317.3,114.8 , 322.7,102.8 , 324,95.15},
    {325.3,87.5 , 318.1,61.73 , 309.9,61.99},
    {301.8,62.24 , 291.3,75 , 282.4,73.98},
    {273.5,72.96 , 271.4,57.4 , 265.3,57.65},
    {259.2,57.91 , 249,66.33 , 249,66.33},
    {249,66.33 , 241.3,68.88 , 235.5,69.39},
    {229.6,69.9 , 216.1,69.64 , 214,72.7},
    {212,75.77 , 210.7,86.48 , 207.7,90.05},
    {204.6,93.62 , 190.6,107.7 , 190.6,107.7},
    {190.6,107.7 , 181.1,110.2 , 176.8,118.4},
    {172.4,126.5 , 161,162.8 , 166.3,169.1},
    {171.7,175.5 , 171.2,180.1 , 182.9,183.7},
    {194.6,187.2 , 182.1,188.3 , 186.5,198},
    {190.8,207.7 , 197.2,206.9 , 202.6,205.1},
    {207.9,203.3 , 214,198 , 214,198  }};

    Path  path1   = new Path();
    Color kula_charcoal = Color.color(0.2, 0.2, 0.35);

    double[] scale_factors = make_scale_factors(1.4, 20) ;  // Make a sequence of decreasing factors.
    //======================================================
    //     Paint Color Washes.
    //======================================================
    int numberOfKulas = 20;
    Color[] kula_flower1 = kulaInterpolate(1,0,0,1,   1,.9,.9,1,  numberOfKulas ) ; // Shades of color.

    //for (int k=0; k<20; k++)
    for (int k=0; k<numberOfKulas; k++)
          {
              Path  path2   = new Path();
              path2 =  Points2paths(flower1_cube1, moveTo1_1);
              path2.setScaleX(scale_factors[k]);
              path2.setScaleY(scale_factors[k]);
              path2.setStroke(null);
              path2.setFill(kula_flower1[numberOfKulas-1-k]);
              path2.setTranslateX(-100);
              path2.setTranslateY(-10);
              rootgroup.getChildren().addAll( path2);
           }
      
    //======================================================
    //     Draw the Inked Outline.
    //======================================================   
      path1 =  Points2paths(flower1_cube1, moveTo1_1);
      path1.setFill(null);
      path1.setStroke(kula_charcoal);
      path1.setTranslateX(-100);
      path1.setTranslateY(-10);
      rootgroup.getChildren().addAll( path1);

      ////////////////////////////////////////////////
        Scene scene = new Scene(rootgroup, 300, 260);
        primaryStage.setTitle("An Expanded Shaded Color fill.");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
