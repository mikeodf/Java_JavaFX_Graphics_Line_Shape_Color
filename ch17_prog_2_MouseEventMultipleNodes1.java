// MouseEventMultipleNodes1.java
/*
Make two mouse event handlers, one for each of two nodes (rectangles in this example). 

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.*;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class MouseEventMultipleNodes1 extends Application {

  public void start(Stage primaryStage) 
  {
    double xx1, yy1, xx2, yy2,  width, height, strokew ;
    xx1 = 30 ;
    yy1 = 30 ;
    xx2 = 100 ;
    yy2 = 100 ;
    width = 200 ;
    height = 100 ;
    strokew = 20 ; 

    Group root = new Group();
    Scene scene = new Scene(root, 400, 250);  

    Rectangle rect1 = new Rectangle();
           rect1.setX(xx1);
           rect1.setY(yy1);
           rect1.setWidth(width);
           rect1.setHeight(height);
           rect1.setStrokeWidth(strokew);
           rect1.setStroke( Color.BLUE);
           rect1.setFill(Color.rgb(50, 50, 150, 0.5 ));
           root.getChildren().add(rect1);

    Rectangle rect2 = new Rectangle();
           rect2.setX(xx2);
           rect2.setY(yy2);
           rect2.setWidth(width);
           rect2.setHeight(height);
           rect2.setStrokeWidth(strokew);
           rect2.setStroke(Color.RED );
           rect2.setFill(Color.rgb(150, 50, 50, 0.5 ));
           root.getChildren().add(rect2);

    // Specify what flags are to be set when the mouse is clicked.
    rect1.setOnMousePressed(mouseHandler1);
    rect2.setOnMousePressed(mouseHandler2);

    primaryStage.setTitle("Events on Overlapping Nodes.");
    primaryStage.setScene(scene);
    primaryStage.show();
  }
//////////////////////////////////////////////////////////////////////
////////////////  mouseHandler1   ///////////////////////////////////   
  EventHandler<MouseEvent> mouseHandler1 = new EventHandler<MouseEvent>() 
  {
      public void handle(MouseEvent mouseEvent) 
      {
          if (mouseEvent.getEventType() == MouseEvent.MOUSE_PRESSED) 
          {   System.out.println("Mouse inside rectangle 1");
          }      
      }
  };
//////////////////////////////////////////////////////////////////////
////////////////  mouseHandler2   ///////////////////////////////////
  EventHandler<MouseEvent> mouseHandler2 = new EventHandler<MouseEvent>() 
  {
      public void handle(MouseEvent mouseEvent) 
      {
         if (mouseEvent.getEventType() == MouseEvent.MOUSE_PRESSED) 
         {  System.out.println("Mouse inside rectangle 2");      
         }  
     }
  };
//////////////////////////////////////////////////////////////////////
}
