// Cubic_flower123_pen_wash_2.java
/*
Repeated constructors creating a set of progressively different
randomized cubic curves.
Random number method for Gaussian distribution:
nextGaussian(): Gives a Gaussian ("normally") distributed number with
mean value 0.0 and standard deviation 1.0

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

public class Cubic_flower123_pen_wash_2 extends Application 
{
//======================================================
//     Functions/Methods.
//====================================================== 
     ////    RandomizePoints( pnt, stdev)    ////////////////
     double[][] RandomizePoints(double[][] pnt, double stdev)
     {  /* Applies to: One array of points that will become a path.
           
          The array of points will be transformed into a sequence of CubicCurveto segments
           by the Points2paths method. 
          Inputs: A 2D raw path - a collection of potential CubicCurvetos. 
          The first index of the array is the CubicCurveTo index. 
          The second index gives access to each of six control points in a CCTo.
          Randomization: Take the 2D array of (xy) vertices, the control points of CubicCurveTos,
          and add a controlled but random offset to each x and y.  What will be returned is a collection of 
          randomized vertices comprising a new array of points - but slightly distorted by a random offset to each point.

          Output: The input raw path but randomised/distorted. 
        */
             Random rand1 = new Random();
             int lenn = Array.getLength(pnt) ;      // The number of CubicCurveTos in a single path.
             double[][] pp_rand = new double[lenn][6]; 
             // Randomize Vertices: Every vertex gets randomized afresh here.
             for (int k=0; k<lenn; k++)  // k is the Index stepping through the potential CubicCurves.
             {   
                for  (int sxy=0; sxy<6; sxy++) 
                // sxy is the Index stepping through the 3 (x,y) vertices for each CubicCurveto.
                {
                     pp_rand[k][sxy] = pnt[k][sxy]+ stdev*rand1.nextGaussian(); 
                     // x and y are randomized independently.
                };
             }; 
         return pp_rand ;
    }
 
     //============================================================
     ////    Points2paths( path_points,  selected_moveTo)    ////////////////
     Path Points2paths(double[][] path_points, MoveTo  selected_moveTo)
     {
      /* Applies to : One path - the raw points that will be used to construct all the 
                      CubicCurveTos that make up the sequence of drawn CubicCurveTo parts. 
        The first position in the path is the starting MoveTo (which could be the first vertex/point
        of the first CubicCurveTo). 
        The "path_index" selects the correct path to be worked on. 
        path_points[A][B] - "A" is the index pointing to each CubicCurveTo section,
        "B" refers to each of the three coordinates of the cubic curves. 

         After the points have been randomized they must now be assembled into
         CubicCurveTo paths which are the output. 

         The Output: An assembled path ready to be added to stage for display.
      */

             int num_cctos = Array.getLength(path_points) ; // Number of CubicCurveTos making up the path.
             CubicCurveTo crv_pth1 =  new CubicCurveTo();   // The set fo curves for a path. 
    
             // Assemble one path.
             Path  path_n =  new Path(); 
             path_n.getElements().add(selected_moveTo);     // Select the appropriate start position.
             for (int j=0; j< num_cctos ; j++)
             {    
                  crv_pth1 = new CubicCurveTo(path_points[j][0], path_points[j][1], path_points[j][2],
                                     path_points[j][3], path_points[j][4], path_points[j][5]); 

                  path_n.getElements().add(crv_pth1);    
             };
         return path_n ;
     }

     //=========================================================== 
     ////    kulaInterpolate(rr1, gg1, bb1, alfa1, rr2,  gg2, bb2, alfa2, numkulas )     ////////////////
     public Color[] kulaInterpolate(double rr1, double gg1, double bb1,double alfa1, 
                                    double rr2,  double gg2, double bb2, double alfa2,
                                    int numkulas )   
     {
         /* Applies to: Six numbers in the range 0 to 1. They are the color values for each color channel.

           This method create an interpolated sequence (array) of colors. 
           The sequence that starts with one color and ends with another.
           Color format:  Color.color(red, green, blue, alpha) format.
           The start and end colors are respectively Color.color(rr1, gg1, bb1, alfa1)
           and Color.color(rr2, gg2, bb2, alfa2). 
         */
       
             double rrdelta = (rr1-rr2)/numkulas ;
             double ggdelta = (gg1-gg2)/numkulas ;
             double bbdelta = (bb1-bb2)/numkulas ;
             double alphadelta = (alfa1-alfa2)/numkulas ;
             double rr, gg, bb , alfa;  // Intermediate color values
             Color[] kulaArray = new Color[numkulas+1];

             for (int i=0; i<numkulas+1; i++ )
             {   
                 rr = rr1 - i*rrdelta ;
                 gg = gg1 - i*ggdelta ;
                 bb = bb1 - i*bbdelta ;
                 alfa = alfa1 - i * alphadelta ; 
                 kulaArray[i] = Color.color(rr, gg, bb, alfa); 
             };
       return kulaArray; 
     }
              
     //==========================================================
     ////     make_scale_factors(start_value, num_elements)    ////////////////
     double[] make_scale_factors(double start_value, int num_elements)
     {
         /* Applies to: Two numbers, a double and an integer.

           This method creates a sequence of linearly decreasing scale factors
           that will be used to draw nested areas of color. Each color will be 
           taken from an arry of colors created from "kulainterpolate".
           Output: An array of decreasing numbers.
         */
          double[] scale_factors = new double[num_elements];
          double decrement = start_value/num_elements;
          for (int i=0; i<num_elements-1; i++)
          { scale_factors[i] = start_value -= decrement ;
          };
           return scale_factors;
     }

//======================================================
//     Main Execution Thread.
//====================================================== 
    public void start(Stage primaryStage) 
    {
        Group rootgroup = new Group();

   //======================================================
   // SHAPES TO BE DRAWN - ORIGINALS CREATED IN INKSCAPE
   //======================================================
  
     //flower_path1.svg
     double[]  startAt1_1={214,198};
     MoveTo moveTo1_1 = new MoveTo(startAt1_1[0], startAt1_1[1]);
     double[][] flower1_cube1  = {
     {214,198 , 225.3,208.9 , 237,206.1},
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

     // Flower 1 MoveTos.
     MoveTo[] all_movetos1 = { moveTo1_1 }; // These arrays can have more elements.
     // Flower 1 CubicCurveTos.
     double[][][] all_pps1 = { flower1_cube1 }; // These arrays can have more elements.


//======================================================
//     Variable Declarations.
//======================================================
     int x_shift = 100 ;
     int y_shift = 50 ;
     double[][] pp1_b;
     Path  path1   = new Path();
     Path[] path_rand1 = { path1, path1, path1, path1, path1, path1, path1, path1, path1 }; 

     double std_dev1 = 6 ;     // Select a standard deviation.
     double[] std_dev2 = {0, 2, 3, 4, 5, 4, 3.5, 2.5};
     double[] lin_w   = {2, 2, 2, 1, 1, 1,   1,  2 };
     Color kula_charcoal = Color.color(0.1, 0.1, 0.15);

     Path[] rand_paths =  new Path[6]; 
     double[] scale_factors = make_scale_factors(1.4, 20) ;
//======================================================
//     Paint Color Washes - Interpolated color arrays.
//======================================================
     int numkulas = 31; // The number of colors in the series (array).
                                                                            // lighter               darker  
     Color[] kula_flower1 = kulaInterpolate(  1, 0.86,  .9,   1,     1,  0,  0, 1, numkulas ) ; // reds

     // Flower 1 Color Wash.
      for (int k=0; k<20; k++)
          {
              Path  path2   = new Path();
              double[][] polycube2 = RandomizePoints(flower1_cube1, std_dev1) ;
              path2 =  Points2paths(polycube2, moveTo1_1);
              path2.setScaleX(scale_factors[k]);
             path2.setScaleY(scale_factors[k]);
              path2.setStroke(null);               // No outline wanted.
              path2.setFill(kula_flower1[k]);
              path2.setTranslateX(x_shift);
              path2.setTranslateY(y_shift);
              rootgroup.getChildren().addAll( path2);
           }
     //vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv
      // Many other lines may be inserted here.
     //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

//======================================================
//     Draw Inklines.
//======================================================

     for  (int j=0; j<Array.getLength(all_movetos1) ; j++)
      {    
        for (int i=0; i<8 ; i++) // 8 = number of randomized curves. Index=0 has no distortion.
         {    
           pp1_b = RandomizePoints(all_pps1[j], std_dev2[i]);
           path_rand1[i] =  Points2paths(pp1_b, all_movetos1[j]);
           path_rand1[i].setFill(null);
           path_rand1[i].setStroke(kula_charcoal);
           path_rand1[i].setTranslateX(x_shift);
           path_rand1[i].setTranslateY(y_shift);
           rootgroup.getChildren().addAll( path_rand1[i]);
        }; 
    };
   //vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv
      // Many other lines may be inserted here.
     //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
//======================================================
//     Graphic Execution.
//======================================================
        Scene scene = new Scene(rootgroup, 500, 300);
        primaryStage.setTitle("Three Flowers - Pen and Wash Emulation.");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
