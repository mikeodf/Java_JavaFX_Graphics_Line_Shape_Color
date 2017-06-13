// MouseDragCubicSets1.java
/*
Use setOnMouseDragged : class: javafx.scene.input.MouseEvent;
--------------------------------------

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

public class MouseDragCubicSets1 extends Application 
{
   double xx ;
   double yy ;
   double xa = 300 ; // Control point A.
   double ya = 100 ;
   double xb = 80  ; // Start point B.
   double yb = 200 ;
   double xc = 400 ; // End point C.
   double yc = 320 ;
   double xd = 100 ; // Second control point D.
   double yd = 400 ;
   int num_curves = 40; // Number of cubics to be drawn.

    private double[][] line_parameters(double xm, double ym, double xn, double yn, int num_curves)
    {   /* Generate arrays of control points for the families of quadratic curves */
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
         return xy_intermediates ;    
      }
    public void start(Stage primaryStage)
    {
        Pane root = new Pane();

        Circle circ_A = new Circle(xa, ya, 13, Color.BLUE) ;
        Circle circ_B = new Circle(xb, yb, 9, Color.RED) ;
        Circle circ_C = new Circle(xc, yc, 9, Color.ORANGE) ;
        Circle circ_D = new Circle(xd, yd, 13, Color.VIOLET) ;

        Line line_AB = new Line(xa,ya,  xb,yb) ;
        Line line_BC = new Line(xb,yb,  xc,yc) ;
        Line line_CD = new Line(xc,yc,  xd,yd) ;

        root.getChildren().add(circ_A);
        root.getChildren().add(circ_B);
        root.getChildren().add(circ_C);
        root.getChildren().add(circ_D);

        root.getChildren().add(line_AB);
        root.getChildren().add(line_BC);
        root.getChildren().add(line_CD);

//****************************************************************
//****************************************************************
// A Loop controlled method of generating Quadcurves
    //QuadCurve[] quads   = new QuadCurve[num_curves];  
    CubicCurve[] cubics = new CubicCurve[num_curves]; 

    /* Here we instantiate an array og Quadrurves "quads[ ]" 
       Each must be given distinct properties even though they 
       will be modulated as a group. 
       They have been added as items that will show on the stage. 
    */
    for (int i = 0 ; i<num_curves ;  i++)
    {
       cubics[i] = new CubicCurve(xb,yb,  xa,ya,  xc,yc, xd,yd);  
       cubics[i].setFill(null);
       cubics[i].setStrokeWidth(3);
       cubics[i].setStroke(Color.GREEN);
       root.getChildren().add(cubics[i]);
     }
//****************************************************************
//****************************************************************
        double[][] xy_intermeds1 =  line_parameters(xd, yd, xa, ya, num_curves);

        for (int i = 0; i<num_curves; i++)
        {
             cubics[i].setControlX1(xy_intermeds1[0][i]) ;
             cubics[i].setControlY1(xy_intermeds1[1][i]) ;  
        };    
      //////////////////////////////////////////////////////////
      //////////////////////////////////////////////////////////
      ///          EVENT HANDLING                            ///
      ////////////////////////////////////////////////////////// 
        /* Event handler for dragging inside circ_A */
        circ_A.setOnMouseDragged(new EventHandler<MouseEvent>() 
        {
            public void handle(MouseEvent event) 
            {
                xx = event.getX();
                yy = event.getY();
                xa = xx ; 
                ya = yy ;
                circ_A.setCenterX(event.getX());
                circ_A.setCenterY(event.getY());
                line_AB.setStartX(event.getX());
                line_AB.setStartY(event.getY());

            double[][] xy_intermeds1 =  line_parameters(xd, yd, xa, ya, num_curves);

            for (int i = 0; i<num_curves; i++)
            {
               cubics[i].setControlX1(xy_intermeds1[0][i]) ;
               cubics[i].setControlY1(xy_intermeds1[1][i]) ;  
            };   

            }
        });

        /* Event handler for dragging inside circ_B */
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
                cubics[i].setStartX(xx) ;
                cubics[i].setStartY(yy) ;  
             }; 

                line_BC.setStartX(xx);
                line_BC.setStartY(yy);
                line_AB.setEndX(xx);
                line_AB.setEndY(yy);

            }
        });

        /* Event handler for dragging inside circ_C */
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
                  cubics[i].setEndX(xx) ;
                  cubics[i].setEndY(yy) ;  
               };        

                line_CD.setStartX(xx);
                line_CD.setStartY(yy);
                line_BC.setEndX(xx);
                line_BC.setEndY(yy);

            }
        });

        /* Event handler for dragging inside circ_D */
        circ_D.setOnMouseDragged(new EventHandler<MouseEvent>() 
        {
            public void handle(MouseEvent event) 
            {      
                xx = event.getX();
                yy = event.getY();        
                xd = xx ;
                yd = yy ;

                line_CD.setEndX(xx);
                line_CD.setEndY(yy);

                cubics[0].setControlX2(xx);
                cubics[0].setControlY2(yy);

                circ_D.setCenterX(xx);
                circ_D.setCenterY(yy);

            double[][] xy_intermeds1 =  line_parameters(xd, yd, xa, ya, num_curves);

            for (int i = 0; i<num_curves; i++)
            {
               cubics[i].setControlX2(xy_intermeds1[0][i]) ;
               cubics[i].setControlY2(xy_intermeds1[1][i]) ;  
            }; 

            }
        });
        //////////////////////////////////////////////////////////////
        Scene scene = new Scene(root, 800, 800);
        primaryStage.setTitle("Cubic Curve Sets - Mouse adjustable, JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
