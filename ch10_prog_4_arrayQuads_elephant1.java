arrayQuads_elephant1.java
/*
The SVG curves contain the parameters for two end-to-end Quad curves.
For example:
 d="M 273.4,66.24 C 273.4,66.24 233.7,105 197.3,88.14 C 180.3,80.24 190.7,60.04 190.7,60.04"
should be interpreted as containing the parapeters for two Bezier quadratics as follows:
d="M startX,startY C startX1,startY1  controlX1,controlY1  endX1, endY1 C controlX2,controlY2  endX2, endY2 endX2, endY2"
Note that endX1, endY1 = startX2, startY2
so that the curve constructors would be:
1. QuadCurve(startX1,startY1,  controlX1,controlY1,  endX1, endY1);  and
2. QuadCurve(endX1, endY1, controlX2,controlY2,  endX2, endY2);

To generate curve segments using 'for' loops a hierarchy of arrays is constructed - 2 dimensional.
The idea is to be able to rever to any quadcurve by its loop index 'i'.

Declaring multidimensional arrays:
==================================
int[][] num = new int[5][2];
Or
int num[][] = new int[5][2];
or 
int[] num[] = new int[5][2];
or 
int[][] num = {element1, element2, element3, ... , elementN};

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine 
*/
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.*; 
import javafx.stage.Stage;
import javafx.scene.paint.*;

public class arrayQuads_elephant1 extends Application 
{
     public void start(Stage stage)  throws Exception 
     {
         final Group rootgroup = new Group();
         Color kula1 = Color.color(.05,  .05,  .9); 

         //*************************************************************
         /* These are the parameters (start, end and control positions) 
            for a family of Bezier QuadCurves that comprise the shape 
            of an elephant.
            They are organized into a two dimensional array "dbl1" so each 
            value can be accessed by using the array indices  */ 
        double[] Qary_1 = { 273.4,66.24,  233.7,105,   197.3,88.14 };
        double[] Qary_2 = { 197.3,88.14, 180.3,80.24, 190.7,60.04 };

        double[] Qary_3 = { 190.5,59.14,  194.9,46.06, 182.3,35.61};
        double[] Qary_4 = {182.3,35.61, 161.1,18.04, 120.6,24.68 };

        double[] Qary_5 = { 119.3,24.9,   71.93,30.04,   47.07,63.94 };
        double[] Qary_6 = { 47.07,63.94, 13,112.7,  37.86,155.8 };

        double[] Qary_7 = { 38.93,155.6, 46.65,123.6, 64.22,119.6 };
        double[] Qary_8 = { 64.22,119.6, 92.29,112.5, 87.36,153.9 };

        double[] Qary_9 = { 85.86,153.6, 62.72,137.6, 66.36,123.2 };
        double[] Qary_10 = { 66.36,123.2, 70.21,110, 97,104.1 };

        double[] Qary_11 = { 97.86,103.5, 120.1,96.94, 131.8,106.7  };
        double[] Qary_12 = { 131.8,106.7, 148.6,120.8, 147.2,155.8  };

        double[] Qary_13 = { 148.7,153.2, 166,109.6, 179.1,106.3 };
        double[] Qary_14 = { 179.1,106.3, 185.8,104.6, 194.8,110.3 };

        double[] Qary_15 = {  194.8,110.3, 202.9,112.3, 201.2,119.4  };
        double[] Qary_16 = {  201.2,119.4, 199.5,126.4, 171.4,132.6  };

        double[] Qary_17 = { 171.2,131.6, 207.8,95.94, 197.1,87.94   };
        double[] Qary_18 = {197.1,87.94, 188.7,81.64, 170.3,87.44   };

        double[] Qary_19 = {  169.4,87.64, 150,93.74, 140.5,73.74 };
        double[] Qary_20 = {  140.5,73.74, 130.1,51.94, 167.4,32.4  };

        double[] Qary_21 = { 167.8,31.97, 195.2,17.35, 217,34.97  };
        double[] Qary_22 = { 217,34.97, 250.5,62.04, 251.3,110.2  };

        double[] Qary_23 = {  251.1,111.2, 254.9,130, 242.8,140.6    };
        double[] Qary_24 = {  242.8,140.6, 227.5,154, 221.8,138    };

        double[] Qary_25 = {  221.8,137.5, 221.1,130.1, 227.5,129.9  };
        double[] Qary_26 = {  227.5,129.9, 232.6,129.8, 232,134  };

        double[][] dbl1= { Qary_1,  Qary_2,  Qary_3,  Qary_4,  Qary_5,  Qary_6,  Qary_7,
                           Qary_8,  Qary_9,  Qary_10,  Qary_11,  Qary_12,  Qary_13, 
                           Qary_14,  Qary_15,  Qary_16, Qary_17,  Qary_18,  Qary_19,
                           Qary_20,  Qary_21,  Qary_22,  Qary_23,  Qary_24, Qary_25,  Qary_26  }; 

        /* This will be a super array of QuadCurves. The plan is to be able to superimpose 
           a number of identical shapes on top of each other and thus create interesting 
           effects like glow.
           The curves will differ in width and color to create the effects.
          Declaration example: int[][] num = new int[5][2];
        */

         QuadCurve[][] QCrv = new QuadCurve[5][26];  
        /* Instantiate 26 QuadCurves. This DOES NOT construct the component QuadCurves 
           that comprise the final elephant shape. Each component curve gets constructed
           by the statement "QCrv[clyr][i] = new QuadCurve() ; ", which is inside the "for" loop. 

          (It is a happy quirk of the Java language that allows to repeatedly re-declare objects 
            inside for loops.)
         */

        int clyr = 0;  // Layer index (not used in this example).

          for (int i=0; i<26; i++)
          {
               QCrv[clyr][i] = new QuadCurve() ;  // CONSTRUCT the first QuadCurve object.
          
               QCrv[clyr][i].setStartX(dbl1[i][0]);
               QCrv[clyr][i].setStartY(dbl1[i][1]);

               QCrv[clyr][i].setControlX(dbl1[i][2]);
               QCrv[clyr][i].setControlY(dbl1[i][3]);

               QCrv[clyr][i].setEndX(dbl1[i][4]);
               QCrv[clyr][i].setEndY(dbl1[i][5]);

               QCrv[clyr][i].setFill(null)  ; 
               QCrv[clyr][i].setStroke(kula1) ;  
               QCrv[clyr][i].setStrokeWidth(9.0) ; 
               rootgroup.getChildren().add(QCrv[clyr][i]);
           }

           Scene scene = new Scene(rootgroup, 300, 200);
           stage.setScene(scene);
           stage.setTitle("SVG Vector Elephant from Inkscape");
           stage.show();
     }
}
