// Cubic_Cat_Draw1.java
/*

Line Properties/attribute parameters:
======================================
path1.setStrokeWidth(4);                                       // Width of the line, pixels.
path1.setStrokeLineCap(StrokeLineCap.ROUND); // Rounded ends of lines.
path1.setStroke(Color.BLUE);    
     OR                             
path1.setStroke(Color.web("rgb(0, 0, 100%)");   // blue as an rgb percent web value.
     OR
Color.color(0.8,      0.8,    0.8) // Range from 0.0 to 1.0
//path1.getStrokeDashArray().addAll(14d);               // Dash pattern: fill, blank, etc
path1.getStrokeDashArray().addAll(14);               // Dash pattern: fill, blank, etc 
path1.setStrokeDashOffset(10); //Dash pattern: to shift the beginning of the dash.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine 
*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*; // Graphic primitives library, including Paths.
import java.lang.reflect.Array; 

public class Cubic_Cat_Draw1 extends Application 
{
    
    Path Points2paths(double[][] path_points, MoveTo  selected_moveTo, double Stroke_width, Color kula)
    {
      /* Applies to : One path - the raw points that will be used to construct all the 
                      CubicCurveTos that make up the sequence of drawn CubicCurveTo parts. 
        The first position in the path is the starting MoveTo (which could be the first vertex/point
        of the first CubicCurveTo. The "path_index" selects the correct path
        to be worked on. path_points[A][B] - "A" is the index pointing to each CubicCurveTo section,
        "B" refers to each of the three coordinates of the cubic curves. 

         The Output: An assembled path ready to be added to thw scene for display.
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

       MoveTo moveTo1 = new MoveTo(108,153); 
       double[][] pp1 = {{108.,153, 102,157, 95,161},
                  {88,164,   79,169, 73,168},
                  {57,166,   57,156, 51,151},
                  {39,141,   37,124, 37,124}};
   
       MoveTo moveTo2 = new MoveTo(38,122); 
       double[][] pp2 = {{38,122, 58,106, 60,102},
                  {61,100, 60,96,  61,91},
                  {61,87,  64,82,  72,76},
                  {89,64, 125,58, 125,58}};

       MoveTo moveTo3 = new MoveTo(127,57); 
       double[][] pp3 = {{127,57, 131,48, 132,43},
                  {133,38, 133,29, 133,29}}; 

       MoveTo moveTo4 = new MoveTo(134,27); 
       double[][] pp4 = {{ 134,27, 146,34,  155,54},
                  {163,74,  158,85,  165,98},
                  {172,111, 194,145, 175,182},
                  {162,209,  71,240,  60,257},
                  {43,277,   40,302,  49,337},
                  {58,371,   71,392,  71,411},
                  {70,431,   71,440,  69,455},
                  {67,465,   50,454,  47,471},
                  {44,490,   72,487,  72,487}};

       MoveTo moveTo5 = new MoveTo(181,369); 
       double[][] pp5 = {{181,369, 117,345, 105,398},
                  {97,437,  163,462, 163,462},
                  {154,460, 144,459, 135,458},
                  {105,454,  89,454,  88,470},
                  {88,478,   90,488, 102,489},
                  {114,489, 124,484, 124,484}};

       MoveTo moveTo6 = new MoveTo(145,241); 
       double[][] pp6 = {{145,241, 160,184, 210,208},
                  {239,218, 278,263, 271,350},
                  {266,409, 260,443, 260,443}};

       MoveTo moveTo7 = new MoveTo(262,444); 
       double[][] pp7 = {{262,444, 294,411, 297,339},
                  {300,270, 238,177, 234,120},
                  {230,63,  252,35,  303,44},
                  {324,48,  354,89,  349,117},
                  {345,138, 333,150, 315,140},
                  {297,140, 293,124, 297,119},
                  {302,115, 306,115, 306,115}};

       MoveTo moveTo8 = new MoveTo(308,114); 
       double[][] pp8 = {{308,114, 327,126, 328,114},
                  {330,102, 319,65,  288,65},
                  {262,63,  242,104, 258,156},
                  {274,208, 321,272, 314,345},
                  {306,417, 288,448, 272,465},
                  {249,491, 132,483, 132,483}};


    // Note that for this format of declaration the keyword new" is not needed.
    MoveTo[] all_movetos = { moveTo1, moveTo2, moveTo3, moveTo4, moveTo5, moveTo6, moveTo7, moveTo8 };
    double[][][] all_pps = { pp1, pp2, pp3, pp4, pp5, pp6,  pp7, pp8 };


    Path  path1   = new Path();
    double[] lin_w = {10, 6, 4, 2, 1, 4, 3, 5 };
    Color[] kula = { Color.color(0.8, 0.8, 0.9), Color.color(0.1, 0.1, 0.1), Color.color(0.99, 0.0, 0.0), Color.color(0.0, 0.0, 0.99), Color.color(0.1, 0.9, 0.1), Color.color(0.7, 0.4, 0.1), Color.color(0.9, 0.1, 0.9), Color.color(0.1, 0.6, 0.9)   };
  
    for  (int j=0; j<Array.getLength(all_pps) ; j++)
    {    
      path1 =  Points2paths(all_pps[j], all_movetos[j], lin_w[j], kula[j]);
      rootgroup.getChildren().addAll( path1);
    }; 

        Scene scene = new Scene(rootgroup, 400, 550);
        primaryStage.setTitle("8 complex Bezier Cubic Paths.");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
