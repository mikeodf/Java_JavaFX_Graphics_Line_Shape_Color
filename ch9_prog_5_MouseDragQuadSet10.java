// MouseDragQuadSet7.java
/*
Generate and control families of cubic curves.
----------------------------------------------
Various ways of declaring QuadCurve arrays:
QuadCurve[] quadCArray = new QuadCurve[30]; // Number of quad-curves = 30.
QuadCurve[] quadCArray = {...member quad-curves...};
QuadCurve[] quadCArray = new QuadCurve[]{...member quad-curves...};

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine
*/import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import java.awt.geom.GeneralPath ;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import java.lang.Math ;

public class MouseDragQuadSet10 extends Application 
{
   double xx ;
   double yy ;
   double xa = 300 ; // Control point A.
   double ya = 100 ;
   double xb = 80  ; // Start point B.
   double yb = 200 ;
   double xc = 400 ; // End point B.
   double yc = 320 ;
   double xd = 100 ; // Auxiliary control point D.
   double yd = 400 ;
   int num_curves = 40; // Number of quadratics to be drawn.

    private double[][] line_parameters(double xm, double ym, double xn, double yn, int num_curves)
    {   /* Generate arrays of control points for the families of quadratic curves.
           Equi-spaced control points are distributed along the line
           which joins the points (xm,ym) to (xn,yn).  */
        double len =  Math.sqrt( (yn-ym)*(yn-ym) + (xn-xm)*(xn-xm) );
        double m = (yn - ym)/(xn - xm);
        double c = ym - m * xm;
        double theta = Math.atan(m); 
        double delta_x = len/num_curves; 

        double[][] xy_intermediates  ;        
        xy_intermediates = new double[2][num_curves] ;        
        double next_x ; 

          for (int i=0; i<num_curves; i++)
          {   next_x = i* delta_x ;
              xy_intermediates[0][i] = xm +  next_x *Math.cos(theta); // X-compoment. 
              xy_intermediates[1][i] = ym +  next_x *Math.sin(theta); // Y-compoment.  
           }
         return xy_intermediates ;  // The array of (x,y) control points.  
      }

    public void start(Stage primaryStage)
    {
        Pane root = new Pane();
        Circle circ_A = new Circle(xa, ya, 5, Color.BLUE) ;
        Circle circ_B = new Circle(xb, yb, 3, Color.GREEN) ;
        Circle circ_C = new Circle(xc, yc, 3, Color.GREEN) ;
        Circle circ_D = new Circle(xd, yd, 5, Color.BROWN) ;
            
//****************************************************************
//****************************************************************
// A Loop controlled method of generating Quadcurves
    QuadCurve[] quads = new QuadCurve[num_curves];  
       
    /* Here we instantiate an array og Quadrurves "quads[ ]" 
       Each must be given distinct properties even though they 
       will be modulated as a group. 
       They have been added as items that will show on the stage.       */
    for (int i = 0 ; i<num_curves ;  i++)
    {
       quads[i] = new QuadCurve(xb,yb,  xa,ya,  xc,yc);  
       quads[i].setFill(null);
       quads[i].setStrokeWidth(1);
       quads[i].setStroke(Color.GREEN);
       root.getChildren().add(quads[i]);
     }
//****************************************************************
//****************************************************************
        root.getChildren().add(circ_A);
        root.getChildren().add(circ_B);
        root.getChildren().add(circ_C);
        root.getChildren().add(circ_D);

        double[][] xy_intermeds1 =  line_parameters(xd, yd, xa, ya, num_curves);

        for (int i = 0; i<num_curves; i++)
        {
             quads[i].setControlX(xy_intermeds1[0][i]) ;
             quads[i].setControlY(xy_intermeds1[1][i]) ;  
        }; 
        
      //////////////////////////////////////////////////////////
      ///          EVENT HANDLING                            ///
      ////////////////////////////////////////////////////////// 
      // Event handler for dragging inside circ_A - Black 
      circ_A.setOnMouseDragged(new EventHandler<MouseEvent>() 
      {
         public void handle(MouseEvent event) 
         {
            xx = event.getX();
            yy = event.getY();

            circ_A.setCenterX(xx);
            circ_A.setCenterY(yy);
                 
            xa = xx ; 
            ya = yy ;
             
            double[][] xy_intermeds1 =  line_parameters(xd, yd, xa, ya, num_curves);

            for (int i = 0; i<num_curves; i++)
            {
               quads[i].setControlX(xy_intermeds1[0][i]) ;
               quads[i].setControlY(xy_intermeds1[1][i]) ;  
            }; 
        
         }
      });
      //////////////////////////////////////////////////////////
      // Event handler for dragging inside circ_B - Brown
      circ_D.setOnMouseDragged(new EventHandler<MouseEvent>() 
      {
         public void handle(MouseEvent event) 
         {
            xx = event.getX();
            yy = event.getY();        
            xd = xx ;
            yd = yy ;

            circ_D.setCenterX(xx);
            circ_D.setCenterY(yy);

            double[][] xy_intermeds1 =  line_parameters(xd, yd, xa, ya, num_curves);

            for (int i = 0; i<num_curves; i++)
            {
               quads[i].setControlX(xy_intermeds1[0][i]) ;
               quads[i].setControlY(xy_intermeds1[1][i]) ;  
            }; 
         }
      });

      //////////////////////////////////////////////////////////
      // Event handler for dragging inside circ_B - Orange 
      circ_B.setOnMouseDragged(new EventHandler<MouseEvent>() 
      {
          public void handle(MouseEvent event) 
          {
             xx = event.getX();
             yy = event.getY();
  
             circ_B.setCenterX(xx);
             circ_B.setCenterY(yy);

             for (int i = 0; i<num_curves; i++)
             {
                quads[i].setStartX(xx) ;
                quads[i].setStartY(yy) ;  
             }; 
            
          }
      });

      // Event handler for dragging inside circ_C - Violet 
      circ_C.setOnMouseDragged(new EventHandler<MouseEvent>() 
      {
         public void handle(MouseEvent event) 
         {
            xx = event.getX();
            yy = event.getY();

            circ_C.setCenterX(xx);
            circ_C.setCenterY(yy); 

            for (int i = 0; i<num_curves; i++)
            {
               quads[i].setEndX(xx) ;
               quads[i].setEndY(yy) ;  
            }; 
        
         }
      });
     
    //////////////////////////////////////////////////////////////
        Scene scene = new Scene(root, 800, 800, Color.WHITE);
        primaryStage.setTitle("Sets of similar Quadratic Curve - Mouse adjustable, JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
