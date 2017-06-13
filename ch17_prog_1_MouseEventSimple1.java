// MouseEventSimple1.java
/*
Make a mouse event handler that reacts when a flag is raised.
The flag is called MOUSE_CLICKED. An equivalent flag 
called MOUSE_PRESSED could have been used in the same way.

Class MouseEvent: javafx.scene.input.MouseEvent
---------------------------------------------------
Constructor
1. A new MouseEvent event with null source and target:
MouseEvent(EventType<? extends MouseEvent> eventType, ....)

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.scene.paint.*;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;


public class MouseEventSimple1 extends Application 
{
  public void start(Stage primaryStage) 
  { 
    double xx, yy, width, height ;
    xx = 30 ;
    yy = 30 ;
    width = 200 ;
    height = 40 ;

    Group root = new Group();
    Scene scene = new Scene(root, 400, 150);  

    Rectangle rect1 = new Rectangle();
           rect1.setX(xx);
           rect1.setY(yy);
           rect1.setWidth(width);
           rect1.setHeight(height);         
           root.getChildren().add(rect1);

     // THE EVENT – in rect1a mouse button is clicked.
     // The EventType can be MOUSE-CLICKED, which is the same as MOUSE_PRESSED..
     rect1.setOnMouseClicked(mouseHandler1);
    //rect1.setOnMousePressed(mouseHandler1); // An equivalent alternative.

   primaryStage.setTitle("A Press Event of the Mouse.");
   primaryStage.setScene(scene);
   primaryStage.show();
  }
   
//////////////////////////////////////////////////////////////////////
////////////////  mouseHandler1   ///////////////////////////////////
  EventHandler<MouseEvent> mouseHandler1 = new EventHandler<MouseEvent>() 
  {
      public void handle(MouseEvent mouseEvent) 
      {
         if (mouseEvent.getEventType() == MouseEvent.MOUSE_CLICKED) 
         //if (mouseEvent.getEventType() == MouseEvent.MOUSE_PRESSED) // The alternative.
         {   System.out.println("Mouse inside rectangle 1");      
         }     
      }
  };
//////////////////////////////////////////////////////////////////////
 
}
