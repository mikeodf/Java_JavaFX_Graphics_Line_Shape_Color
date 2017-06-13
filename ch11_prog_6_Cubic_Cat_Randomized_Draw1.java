// Cubic_Cat_Randomized_Draw1.java
/*

Random number method for Gaussian distribution:
nextGaussian(): Gives a Gaussian ("normally") distributed number with mean value 0.0 
and standard deviation 1.0

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

public class Cubic_Cat_Draw16 extends Application 
{

    double[][] RandomizePoints(double[][] pnt, double stdev)
    {  /* Applies to: One path (a sequence of CubicCurveto segments). 
          Inputs: A 2D raw path - a collection of potential cubiccurvetos. first Dim is the
          CubicCurveTo index, the second Dim gives access to each of six control points in a CCTo.
          Take the 2D array of (xy) vertices, the control points of CubicCurveTos, and add a controlled
          but random offset to each x and y.  What will be returned is a collection of 
          randomized vertices comprising a new path - slightly distorted by a random offset to each point.
          Output: The input raw path but randomised/distorted. 
       */
        Random rand1 = new Random();
        int lenn = Array.getLength(pnt) ;      // The number of CubicCurveTos in a single path.
        double[][] pp_rand = new double[lenn][6]; 
        // Randomize Vertices: Every vertex gets randomized afresh here.
        for (int k=0; k<lenn; k++)  // k is the Index stepping through the potential CubicCurves.
        {   
           for  (int sxy=0; sxy<6; sxy++) // sx is the Index stepping through the 3 (x,y) vertices for each CubicCurveto.
           {
              pp_rand[k][sxy] = pnt[k][sxy]+ stdev*rand1.nextGaussian(); // x and y are randomized independently.
           }
        } 
      return pp_rand ;
     }


    Path Points2paths(double[][] path_points, MoveTo  selected_moveTo, double Stroke_width, Color kula)
    {
      /* Applies to : One path - the raw points that will be used to construct all the 
                      CubicCurveTos that make up the sequence of drawn CubicCurveTo parts. 
         The Output: An assembled path ready to be added to stage for display.
      */

      int num_cctos = Array.getLength(path_points) ; // Number of CubicCurveTos making up the path.
      CubicCurveTo crv_pth1 =  new CubicCurveTo(); // The set fo curves for a path. 
    
     // Assemble one path.
     Path  path_n =  new Path(); 
     path_n.getElements().add(selected_moveTo); // Select the appropriate start position.
     for (int j=0; j< num_cctos ; j++)
     {    
         crv_pth1 = new CubicCurveTo(path_points[j][0], path_points[j][1], path_points[j][2],
                                     path_points[j][3], path_points[j][4], path_points[j][5]); 

         path_n.getElements().add(crv_pth1);    
         path_n.setStrokeWidth(Stroke_width); 
         path_n.setStroke(kula);
     };
     return path_n ;
    }

 public void start(Stage primaryStage) 
    {
        Group rootgroup = new Group();
        Path[] rand_paths =  new Path[6]; 

       /*
       The raw arrays representing the eight shapes making up the cat should 
       be included here.
       That is the definitions of the arrays pp1, pp2, pp3, pp4, pp5, pp6, pp7, pp8. 
       */


    // Note that for this format of declaration the keyword new" is not needed.
    MoveTo[] all_movetos = { moveTo1, moveTo2, moveTo3, moveTo4, moveTo5, moveTo6, moveTo7, moveTo8 };
    double[][][] all_pps = { pp1, pp2, pp3, pp4, pp5, pp6,  pp7, pp8 };

    double[][] pp1_b;
    Path  path1   = new Path();

    double[] std_dev = {0, 2, 3, 2, 1.5, 3, 1, 2.5};
    double[] lin_w = {10, 1, 1, 1, 1, 1, 1, 1 };
    Color[] kula = { Color.color(0.8, 0.8, 0.9), Color.color(0.1, 0.1, 0.1), Color.color(0.99, 0.0, 0.0),
                     Color.color(0.0, 0.0, 0.99),Color.color(0.1, 0.1, 0.1), Color.color(0.1, 0.1, 0.1), 
                     Color.color(0.1, 0.1, 0.1), Color.color(0.1, 0.1, 0.1)   };
  Path[] path_rand1 = { path1, path1, path1, path1, path1, path1, path1, path1 };
  
for  (int j=0; j<Array.getLength(all_movetos) ; j++)
 {    
   for (int i=0; i<8 ; i++) // 8 = number of randomized curves. Index=0 has no distortion.
    {    
      pp1_b = RandomizePoints(all_pps[j], std_dev[i]);
      path_rand1[i] =  Points2paths(pp1_b, all_movetos[j], lin_w[i], kula[i]);
      rootgroup.getChildren().addAll( path_rand1[i]);
    }; 
 };

        Scene scene = new Scene(rootgroup, 400, 550);
        primaryStage.setTitle("8 complex Bezier Cubic Paths with Randomised Deviations.");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
