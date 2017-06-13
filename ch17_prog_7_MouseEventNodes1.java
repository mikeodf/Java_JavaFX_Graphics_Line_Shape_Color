// MouseEventNodes1.java
/*
Explore complex responses to mouse events.
The idea is to build a framework that can be adapted for various
types of nodes.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.shape.*;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class MouseEventNodes1 extends Application {

      Path path1, path2;
      boolean node_being_shifted = false ;  // Flag is true while node active.
      double previous_mouse_position_x, previous_mouse_position_y ;

      double xx = 30 ;      // Common parameters for rectangles.
      double yy = 30 ;
      double width = 30 ;
      double height = 30 ;
      double strokew = 4 ; 
      double arcsize = 10 ;
      Rectangle rect1 = new Rectangle();  // Node 1.
      Rectangle rect2 = new Rectangle();  // Node 2.

  public void start(Stage primaryStage) 
  {

      Group root_group = new Group(); 

           rect1.setX(xx);
           rect1.setY(yy);
           rect1.setWidth(width);
           rect1.setHeight(height);
           rect1.setStrokeWidth(strokew);
           rect1.setStroke(Color.BLUE);
           rect1.setFill(Color.rgb(50, 50, 150, 0.5 ));
           rect1.setArcWidth(arcsize);
           rect1.setArcHeight(arcsize);
           root_group.getChildren().add(rect1); 

           rect2.setX(xx+140);
           rect2.setY(yy+height+60);
           rect2.setWidth(width+30);
           rect2.setHeight(height);
           rect2.setStrokeWidth(strokew);
           rect2.setStroke(Color.RED );
           rect2.setFill(Color.rgb(150, 50, 50, 0.5 ));
           rect2.setArcWidth(arcsize);
           rect2.setArcHeight(arcsize);
           root_group.getChildren().add(rect2);

         path1 = new Path();
         path1.setStrokeWidth(3);
         path1.setStroke(Color.BLUE);
         root_group.getChildren().add(path1);

         path2 = new Path();
         path2.setStrokeWidth(5);
         path2.setStroke(Color.RED);
         root_group.getChildren().add(path2);

    // Set various boolean flags that record the state of the mouse.
    rect1.setOnMouseDragged(mouseHandler1);
    rect1.setOnMousePressed(mouseHandler1);
    rect1.setOnMouseReleased(mouseHandler1);

    rect2.setOnMouseDragged(mouseHandler2);
    rect2.setOnMousePressed(mouseHandler2);
    rect2.setOnMouseReleased(mouseHandler2);
 
   Scene scene = new Scene(root_group, 400, 350); 

   primaryStage.setScene(scene);
   primaryStage.setTitle( "Manipulate Nodes with the Mouse." ) ; 
   primaryStage.show();
  }

  /////////////////////  EVENT HANDLING     ////////////////////////////////////////
  ///////////////////////////////////////////////////////////////////////////////////////////////
  ////////       mouseHandler1  - Node should follow drag path   ///////
  EventHandler<MouseEvent> mouseHandler1 = new EventHandler<MouseEvent>() 
  {
    public void handle(MouseEvent mouseEvent) 
    {
      
      //////////   Node1: MOUSE_PRESSED  Event    ////////////////////////////////////
      if (mouseEvent.getEventType() == MouseEvent.MOUSE_PRESSED) 
      {   
          if (     node_being_shifted == false )
               {
                   previous_mouse_position_x = mouseEvent.getSceneX() ;
                   previous_mouse_position_y = mouseEvent.getSceneY() ;
                   node_being_shifted = true ;
               }
          path1.getElements().add(new MoveTo(mouseEvent.getX(), mouseEvent.getY()));        
       } 

      //////////   Node1: MOUSE_DRAGGED  Event    /////////////////////////////////////////
      else if (mouseEvent.getEventType() == MouseEvent.MOUSE_DRAGGED) 
        { path1.getElements().add(new LineTo(mouseEvent.getX(), mouseEvent.getY())); 

         double mouse_movement_x  =  mouseEvent.getSceneX()  // difference X shifted.
                                          -  previous_mouse_position_x ;
      
         double mouse_movement_y  =  mouseEvent.getSceneY()  // difference Y shifted.
                                         -  previous_mouse_position_y ;
      
         previous_mouse_position_x  =  mouseEvent.getSceneX() ; // Update previous position.
         previous_mouse_position_y  =  mouseEvent.getSceneY() ;

              rect1.setX( rect1.getX()  +  mouse_movement_x ) ;  // Adjust node position.
              rect1.setY( rect1.getY()  +  mouse_movement_y ) ;
        }
     }
  };

  //////////////////////////////////////////////////////////////////////////////////////////////////
  //////       mouseHandler2  - Node2 does not follow drag path.   ///////
  EventHandler<MouseEvent> mouseHandler2 = new EventHandler<MouseEvent>() 
  {
    public void handle(MouseEvent mouseEvent) 
    {
      if (mouseEvent.getEventType() == MouseEvent.MOUSE_PRESSED) 
     {  
        path2.getElements().add(new MoveTo(mouseEvent.getX(), mouseEvent.getY())); }

     else if (mouseEvent.getEventType() == MouseEvent.MOUSE_DRAGGED) 
        { path2.getElements().add(new LineTo(mouseEvent.getX(), mouseEvent.getY()));  }
     }
  };
   //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
