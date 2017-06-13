// MouseDrawPath2.java
/*
Draw two independent paths controlled from colored rectangles.

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


public class MouseDrawPath2 extends Application {

   Path path1, path2; // Declaring two Paths.

  public void start(Stage primaryStage) 
  {
    double xx1, yy1, xx2, yy2, width, height, strokew ;
    xx1 = 30 ;
    yy1 = 30 ;
    xx2 = 150 ;
    yy2 = 150 ;
    width = 400 ;
    height = 300 ;
    strokew = 10 ; 
  
    Group root = new Group();
    Scene scene = new Scene(root, 600, 500);  

    Rectangle rect1 = new Rectangle();
           rect1.setX(xx1);
           rect1.setY(yy1);
           rect1.setWidth(width);
           rect1.setHeight(height);
           rect1.setStrokeWidth(strokew);
           rect1.setStroke(Color.BLUE );
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

    // "path1" started by a mouseClick in the blue rectangle.
    path1 = new Path();
    path1.setStrokeWidth(3);
    path1.setStroke(Color.BLUE);
    root.getChildren().add(path1);

   // "path2" started by a mouseClick in the red rectangle.
    path2 = new Path();
    path2.setStrokeWidth(5);
    path2.setStroke(Color.RED);
    root.getChildren().add(path2);

    // Set Event controlled boolean flags.
    rect1.setOnMouseDragged(mouseHandler1);
    rect1.setOnMousePressed(mouseHandler1);
    rect2.setOnMouseDragged(mouseHandler2);
    rect2.setOnMousePressed(mouseHandler2);

    primaryStage.setTitle("Start inside a rectangle and Draw Free Form.");
    primaryStage.setScene(scene);
    primaryStage.show();
  }
   
  ////////////////////////////////////////////////////////////   
  ///////////       mouseHandler1         ///////////////////  
  EventHandler<MouseEvent> mouseHandler1 = new EventHandler<MouseEvent>() 
  {
    public void handle(MouseEvent mouseEvent) 
    { 
      if (mouseEvent.getEventType() == MouseEvent.MOUSE_PRESSED) 
        { 
         System.out.println("Mouse inside rectangle 1");
          path1.getElements().add(new MoveTo(mouseEvent.getX(), mouseEvent.getY())); 
        } 
      else if (mouseEvent.getEventType() == MouseEvent.MOUSE_DRAGGED) 
        {  path1.getElements().add(new LineTo(mouseEvent.getX(),mouseEvent.getY())); }
     }      
  };

  ////////////////////////////////////////////////////////////   
  ///////////       mouseHandler2         ///////////////////  
  EventHandler<MouseEvent> mouseHandler2 = new EventHandler<MouseEvent>() 
  {
    public void handle(MouseEvent mouseEvent) 
    {
      if (mouseEvent.getEventType() == MouseEvent.MOUSE_PRESSED) 
     {  System.out.println("Mouse inside rectangle 2");
        path2.getElements().add(new MoveTo(mouseEvent.getX(), mouseEvent.getY())); }
     else if (mouseEvent.getEventType() == MouseEvent.MOUSE_DRAGGED) 
        { path2.getElements().add(new LineTo(mouseEvent.getX(), mouseEvent.getY()));  }
     }
  };
   ///////////////////////////////////////////
}
