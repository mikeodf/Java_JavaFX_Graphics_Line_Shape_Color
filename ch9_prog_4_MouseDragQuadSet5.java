// MouseDragQuadSet5.java
/*
Generate and control families of cubic curves.
----------------------------------------------

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


public class MouseDragQuadSet5 extends Application 
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
   int num_divisions = 3; // Number of quadratics to be drawn.

    private double[][] line_parameters(double xm, double ym, double xn, double yn, int num_divisions)
    {   /* Generate arrays of control points for the families of quadratic curves */
        double len =  Math.sqrt( (yn-ym)*(yn-ym) + (xn-xm)*(xn-xm) );
        double m = (yn - ym)/(xn - xm);
        double c = ym - m * xm;
        double theta = Math.atan(m); 
        double delta_x = len/num_divisions; 

        double[][] xy_intermediates  ;        
        xy_intermediates = new double[2][num_divisions] ;        
        double next_x ; 

          for (int i=0; i<num_divisions; i++)
          {   next_x = i* delta_x ;
              xy_intermediates[0][i] = xm +  next_x *Math.cos(theta); // X-compoment. 
              xy_intermediates[1][i] = ym +  next_x *Math.sin(theta); // Y-compoment.  
           }
         return xy_intermediates ;    
      }

    public void start(Stage primaryStage)
    {
        Pane root = new Pane();
        Circle circ_A = new Circle(xa, ya, 11, Color.BLACK) ;
        Circle circ_B = new Circle(xb, yb, 9, Color.ORANGE) ;
        Circle circ_C = new Circle(xc, yc, 9, Color.VIOLET) ;

        Line line_AB = new Line(xb, yb,  xa, ya) ;
        Line line_BC = new Line(xb, yb,  xc, yc) ;
        Line line_CA = new Line(xc, yc,  xa, ya) ;

        Circle circ_D = new Circle(xd, yd, 11, Color.BROWN) ;
        Line line_AD  = new Line(xa, ya,  xd, yd) ;
         
                           // Vertices    B       A      C  
        QuadCurve quad1 = new QuadCurve(xb,yb,  xa,ya, xc,yc);      
        quad1.setFill(null);
        quad1.setStrokeWidth(4);
        quad1.setStroke(Color.BLACK);

        QuadCurve quad2 = new QuadCurve(xb,yb,  80,80, xc,yc);      
        quad2.setFill(null);
        quad2.setStrokeWidth(3);
        quad2.setStroke(Color.RED);

        QuadCurve quad3 = new QuadCurve(xb,yb,  60,60, xc,yc);      
        quad3.setFill(null);
        quad3.setStrokeWidth(3);
        quad3.setStroke(Color.BLUE);

        root.getChildren().add(circ_A);
        root.getChildren().add(circ_B);
        root.getChildren().add(circ_C);
        root.getChildren().add(circ_D);

        root.getChildren().add(line_AB);
        root.getChildren().add(line_BC);
        root.getChildren().add(line_CA);
        root.getChildren().add(line_AD);

        root.getChildren().add(quad1);
        root.getChildren().add(quad2);
        root.getChildren().add(quad3);

        double[][] xy_intermediates =  line_parameters(xd, yd, xa, ya, num_divisions);

       Circle cirqu2 = new Circle(xy_intermediates[0][1], xy_intermediates[1][1], 8, Color.RED) ;
        root.getChildren().add(cirqu2);

       Circle cirqu3 = new Circle(xy_intermediates[0][2], xy_intermediates[1][2], 8, Color.BLUE) ;
        root.getChildren().add(cirqu3);


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
             line_AB.setEndX(xx);
             line_AB.setEndY(yy);
             line_CA.setEndX(xx);
             line_CA.setEndY(yy);
             line_AD.setStartX(xx);
             line_AD.setStartY(yy);
                 
              xa = xx ; 
              ya = yy ;
              double[][] xy_intermeds1 =  line_parameters(xd, yd, xa, ya, num_divisions);              
              quad1.setControlX(xx);
              quad1.setControlY(yy);
              quad2.setControlX(xy_intermeds1[0][1]) ;
              quad2.setControlY(xy_intermeds1[1][1]) ;
              quad3.setControlX(xy_intermeds1[0][2]) ;
              quad3.setControlY(xy_intermeds1[1][2]) ;

              cirqu2.setCenterX(xy_intermeds1[0][1]) ;
              cirqu2.setCenterY(xy_intermeds1[1][1]) ;
              cirqu3.setCenterX(xy_intermeds1[0][2]) ;
              cirqu3.setCenterY(xy_intermeds1[1][2]) ;
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
             line_AD.setEndX(xx);
             line_AD.setEndY(yy);

              double[][] xy_intermeds1 =  line_parameters(xd, yd, xa, ya, num_divisions);
              quad1.setControlX(xa); // This remains unchanged when circle D is adjusted.
              quad1.setControlY(ya);
              quad2.setControlX(xy_intermeds1[0][1]);
              quad2.setControlY(xy_intermeds1[1][1]);
              quad3.setControlX(xy_intermeds1[0][2]);
              quad3.setControlY(xy_intermeds1[1][2]);
              cirqu2.setCenterX(xy_intermeds1[0][1]) ;
              cirqu2.setCenterY(xy_intermeds1[1][1]) ;
              cirqu3.setCenterX(xy_intermeds1[0][2]) ;
              cirqu3.setCenterY(xy_intermeds1[1][2]) ;        
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
             line_BC.setStartX(xx);
             line_BC.setStartY(yy);
             line_AB.setStartX(xx);
             line_AB.setStartY(yy);
             quad1.setStartX(xx);
             quad1.setStartY(yy);
             quad2.setStartX(xx);
             quad2.setStartY(yy);
             quad3.setStartX(xx);
             quad3.setStartY(yy);
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
             line_CA.setStartX(xx);
             line_CA.setStartY(yy);
             line_BC.setEndX(xx);
             line_BC.setEndY(yy);
             quad1.setEndX(xx);
             quad1.setEndY(yy);
             quad2.setEndX(xx);
             quad2.setEndY(yy);           
             quad3.setEndX(xx);
             quad3.setEndY(yy);
            }
        });
     
    //////////////////////////////////////////////////////////////
        Scene scene = new Scene(root, 800, 800);
        primaryStage.setTitle("Sets of similar Quadratic Curve - Mouse adjustable, JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
