// CubicBezier_girlface_1.java
/*
The Collections of cubic Bezier positions is contained in "girl_face_2.java"
which has been compiled separately as a class in the same package.

The linear transforms of scaling, translation, rotation, skew, 
veretical and horizontal flipping are demonstrated here.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine 
*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.shape.*; // Graphic primitives library.
import javafx.scene.paint.*;
import java.lang.reflect.Array; 
//========================================================================
public class CubicBezier_girlface_1 extends Application 
{
 
    Path Points2paths(double[][] path_points, MoveTo  selected_moveTo, double Stroke_width, Color kula) 
    {
      /* Purpose: Convert a 2D array of Bezier points (from a SVG file) into a JavaFX Cubic path.
                  The MoveTo (start) is obtained from the make_moveto( path_point_line0) method
                  by prior arrangement.
         Applies to : One path - the raw cubic bezier points that will be used to construct all the 
                      CubicCurveTos that make up the sequence of drawn CubicCurveTo parts. 
         The Output: An assembled path ready to be added to stage for display.
      */

      int num_cctos = Array.getLength(path_points) ; // Number of CubicCurveTos making up the path.
      CubicCurveTo crv_pth1 =  new CubicCurveTo();   // The set fo curves for a path. 
    
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

//========================================================================
   MoveTo make_moveto(double[] path_point_line0)  
       {      
          double XX = path_point_line0[0] ;
          double YY = path_point_line0[1] ;
          MoveTo moveTo_out = new MoveTo(XX, YY);
          return moveTo_out ;
        } 
//===================================================================================

    public void start(Stage primaryStage) 
    {
        girl_face_2 gface = new girl_face_2() ;  // The drawing composed of many paths

        Group rootgroup = new Group();
        Path[] rand_paths =  new Path[6]; 

       Path line_path;
       double[][] cube_points;
       MoveTo moveTo1 = new MoveTo();
       int num_paths = Array.getLength(gface.all_points) ; // Number of paths.

      // Make every path visible..
      for (int i=0; i<num_paths ; i++)
      {
           // One path at a time is added to the rootgroup, root node.
           moveTo1 = make_moveto(gface.all_points[i][0]);
           line_path =  Points2paths(gface.all_points[i], moveTo1, 2, Color.color(0.2, 0.2, 0.2)); 
           rootgroup.getChildren().addAll( line_path); 
      } 
         
       //////////////////////////////////////////////////////////////////////////
        Scene scene = new Scene(rootgroup, 900, 900);
        primaryStage.setTitle("Drawing converted from SVG to CubicCurveTo paths .");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}


