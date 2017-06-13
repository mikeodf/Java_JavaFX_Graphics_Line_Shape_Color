// MouseDragCubicCurve1.java
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

public class MouseDragCubicCurve1 extends Application 
{
    public void start(Stage primaryStage)
    {
        Pane root = new Pane();

        Circle circ_A = new Circle(100,100, 13, Color.BLUE) ;
        Circle circ_B = new Circle(80, 200, 9, Color.RED) ;
        Circle circ_C = new Circle(170,220, 9, Color.ORANGE) ;
        Circle circ_D = new Circle(150, 80, 13, Color.VIOLET) ;

        Line line_AB = new Line(100,100,  80, 200) ;
        Line line_BC = new Line(80 ,200, 170, 220) ;
        Line line_CD = new Line(170,220, 150,  80) ;
        Line line_DA = new Line(150, 80, 100, 100) ;

        CubicCurve cubic1 = new CubicCurve(80,200,  100, 100,  150,80,  170,220);      
        cubic1.setFill(null);
        cubic1.setStrokeWidth(4);
        cubic1.setStroke(Color.BLACK);

        root.getChildren().add(circ_A);
        root.getChildren().add(circ_B);
        root.getChildren().add(circ_C);
        root.getChildren().add(circ_D);

        root.getChildren().add(line_AB);
        root.getChildren().add(line_BC);
        root.getChildren().add(line_CD);
        root.getChildren().add(line_DA);

        root.getChildren().add(cubic1);
   
        ///////////////////////////////////////////////////////////////
        /* Event handler for dragging inside circ_A */
        circ_A.setOnMouseDragged(new EventHandler<MouseEvent>() 
        {
            public void handle(MouseEvent event) 
            {
                circ_A.setCenterX(event.getX());
                circ_A.setCenterY(event.getY());
                line_AB.setStartX(event.getX());
                line_AB.setStartY(event.getY());
                line_DA.setEndX(event.getX());
                line_DA.setEndY(event.getY());

                cubic1.setControlX1(event.getX());
                cubic1.setControlY1(event.getY());
            }
        });

        /* Event handler for dragging inside circ_B */
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

                cubic1.setStartX(event.getX());
                cubic1.setStartY(event.getY());
            }
        });

        /* Event handler for dragging inside circ_C */
        circ_C.setOnMouseDragged(new EventHandler<MouseEvent>() 
        {
            public void handle(MouseEvent event) 
            {
                circ_C.setCenterX(event.getX());
                circ_C.setCenterY(event.getY()); 
                line_CD.setStartX(event.getX());
                line_CD.setStartY(event.getY());
                line_BC.setEndX(event.getX());
                line_BC.setEndY(event.getY());

                cubic1.setEndX(event.getX());
                cubic1.setEndY(event.getY());
            }
        });

        /* Event handler for dragging inside circ_D */
        circ_D.setOnMouseDragged(new EventHandler<MouseEvent>() 
        {
            public void handle(MouseEvent event) 
            {
                circ_D.setCenterX(event.getX());
                circ_D.setCenterY(event.getY());
                line_DA.setStartX(event.getX());
                line_DA.setStartY(event.getY());
                line_CD.setEndX(event.getX());
                line_CD.setEndY(event.getY());

                cubic1.setControlX2(event.getX());
                cubic1.setControlY2(event.getY());
            }
        });
        //////////////////////////////////////////////////////////////
        Scene scene = new Scene(root, 500, 300);
        primaryStage.setTitle("Cubic Curve - Mouse adjustable, JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
