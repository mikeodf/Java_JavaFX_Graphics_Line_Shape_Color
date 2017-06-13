// MouseDragQuadCurve1.java
/*
Use setOnMouseDragged : class: javafx.scene.input.MouseEvent;
------------------------------------------------------------
Line line = new Line(StartX, startY, endX, endY); // Line constructor
line.setStartX(x0);
line.setStartY(y0);
line.setEndX(x1);
line.setEndY(y1);

QuadCurve quad = new QuadCurve();      // QuadCurve constructor.
quad.setStartX(x0);    // First point.
quad.setStartY(y0);
quad.setControlX1(X);  //Control lever.
quad.setControlY1(Y);
quad.setEndX(x1);      // Last point.
quad.setEndY(y1);

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine
*/import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import java.awt.geom.GeneralPath ;

import javafx.event.EventHandler;     // For Mouse detection.
import javafx.scene.input.MouseEvent; // For mouse position capture.


public class MouseDragQuadCurve1 extends Application 
{

    public void start(Stage primaryStage)
    {
        Pane root = new Pane();

        Circle circ_A = new Circle(100,100, 11, Color.BLUE) ;
        Circle circ_B = new Circle(80, 200, 9, Color.RED) ;
        Circle circ_C = new Circle(170,220, 9, Color.VIOLET) ;

        Line line_AB = new Line(100,100,  80, 200) ;
        Line line_BC = new Line(80 ,200, 170, 220) ;
        Line line_CA = new Line(170,220, 100,  100) ;

                           // Vertices    B         A        C  
        QuadCurve quad1 = new QuadCurve(80,200,  100,100, 170,220);      
        quad1.setFill(null);
        quad1.setStrokeWidth(5);
        quad1.setStroke(Color.BLACK);

        root.getChildren().add(circ_A);
        root.getChildren().add(circ_B);
        root.getChildren().add(circ_C);

        root.getChildren().add(line_AB);
        root.getChildren().add(line_BC);
        root.getChildren().add(line_CA);

        root.getChildren().add(quad1);
   
        ///////////////////////////////////////////////////////////////
        /* Below are three mouse handling methods - one for each vertex
           of the triangle that controls the shape of the Quadratic curve */

        /* Event handler for dragging inside circ_A - Blue */
        circ_A.setOnMouseDragged(new EventHandler<MouseEvent>() 
        {
            public void handle(MouseEvent event) 
            {
                circ_A.setCenterX(event.getX());
                circ_A.setCenterY(event.getY());
                line_AB.setStartX(event.getX());
                line_AB.setStartY(event.getY());
                line_CA.setEndX(event.getX());
                line_CA.setEndY(event.getY());

                quad1.setControlX(event.getX());
                quad1.setControlY(event.getY());
            }
        });

        /* Event handler for dragging inside circ_B - Red*/
        circ_B.setOnMouseDragged(new EventHandler<MouseEvent>() 
        {
            public void handle(MouseEvent event) 
            {
                circ_B.setCenterX(event.getX());
                circ_B.setCenterY(event.getY());
                line_BC.setStartX(event.getX());
                line_BC.setStartY(event.getY());
                line_AB.setEndX(event.getX());
                line_AB.setEndY(event.getY());

                quad1.setStartX(event.getX());
                quad1.setStartY(event.getY());
            }
        });

        /* Event handler for dragging inside circ_C - Violet */
        circ_C.setOnMouseDragged(new EventHandler<MouseEvent>() 
        {
            public void handle(MouseEvent event) 
            {
                circ_C.setCenterX(event.getX());
                circ_C.setCenterY(event.getY()); 
                line_CA.setStartX(event.getX());
                line_CA.setStartY(event.getY());
                line_BC.setEndX(event.getX());
                line_BC.setEndY(event.getY());

                quad1.setEndX(event.getX());
                quad1.setEndY(event.getY());
            }
        });
      
        //////////////////////////////////////////////////////////////
        Scene scene = new Scene(root, 500, 300);
        primaryStage.setTitle("Quadratic Curve - Mouse adjustable, JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
