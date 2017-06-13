// MouseEvent_TestDrive1.java
/*
Test 8 basic mouse actions:
1. Mouse button (any). Press only.
2. Release any Mouse Button.
3. Press AND followed by release, any button.
4. Once during any uninterrupted drag.
5. Continuous event generation during a drag.
6. One event when Mouse enters the target node.
7. One event when Mouse exits the target node.
8. Continuous event generation while Mouse moves across the target node.
 
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

public class MouseEvent_TestDrive1 extends Application 
{

  public void start(Stage primaryStage) 
  {

    double xx, yy, width, height, strokew;
    xx = 30 ;
    yy = 30 ;
    width = 300 ;
    height = 30 ;
    strokew = 4 ; 

    Group root = new Group();
    Scene scene = new Scene(root, 400, 350);  

    Rectangle rect1 = new Rectangle();
           rect1.setX(xx);
           rect1.setY(yy);
           rect1.setWidth(width);
           rect1.setHeight(height);
           rect1.setStrokeWidth(strokew);
           rect1.setStroke(Color.RED);
           rect1.setFill(Color.rgb(50, 50, 150, 0.5 ));
           root.getChildren().add(rect1);
   
    // Set various mouse flags on mouse action.
    rect1.setOnMousePressed(mouseHandler1);  // 1. Press only.
    rect1.setOnMouseReleased(mouseHandler1); // 2. Release Mouse Button.
    rect1.setOnMouseClicked(mouseHandler1);  // 3. Press AND followed by release.
    rect1.setOnDragDetected(mouseHandler1);  // 4. Once per drag stripe.
    rect1.setOnMouseDragged(mouseHandler1);  // 5. Continuous during drag.
    rect1.setOnMouseEntered(mouseHandler1);  // 6. When Mouse enters the target node.
    rect1.setOnMouseExited(mouseHandler1);   // 7. When Mouse exits the target node.
    rect1.setOnMouseMoved(mouseHandler1);    // 8. While Mouse moves across the target node.
 
   primaryStage.setScene(scene);
   primaryStage.show();
  }
   ////////////////////////////////////////////////////////////
   ////////////////////////////////////////////////////////////   
   ///////////       "mouseHandler1         ///////////////////  
  EventHandler<MouseEvent> mouseHandler1 = new EventHandler<MouseEvent>() 
  {
    public void handle(MouseEvent mouseEvent) 
    {    
         // 1. MOUSE_PRESSED -> On press only.
         if ((mouseEvent.getEventType() == MouseEvent.MOUSE_PRESSED)  )            
            {   System.out.println("1. M Pressed: " +  MouseEvent.MOUSE_PRESSED);}

         // 2. MOUSE_RELEASED -> On Release Mouse Button.
         if ((mouseEvent.getEventType() == MouseEvent.MOUSE_RELEASED)  )            
            {   System.out.println("2. M Released: " +  MouseEvent.MOUSE_RELEASED);}

         // 3. MOUSE_CLICKED -> Press AND followed by release.
         if ((mouseEvent.getEventType() == MouseEvent.MOUSE_CLICKED)  )            
            {   System.out.println("3. M  Clicked: " +  MouseEvent.MOUSE_CLICKED);}

         // 4. MOUSE_DRAG_DETECTED -> Once per drag stripe.       
         if ((mouseEvent.getEventType() == MouseEvent.DRAG_DETECTED)  )            
            {   System.out.println("4. DragDetected: " +  MouseEvent.DRAG_DETECTED);}

         // 5. MOUSE_DRAGGED -> Continuous event generation during drag.
        if ((mouseEvent.getEventType() == MouseEvent.MOUSE_DRAGGED)  ) 
           {  System.out.println("5. M Dragged: " +  MouseEvent.MOUSE_DRAGGED);}

         // 6. MOUSE_ENTERED -> Once when Mouse enters the target node.
         if ( (mouseEvent.getEventType() == MouseEvent.MOUSE_ENTERED) )  
            {    System.out.println("6. Node Entered: " + MouseEvent.MOUSE_ENTERED);}

         // 7. MOUSE_EXITED -> Once when Mouse exits the target node.        
         if ( (mouseEvent.getEventType() == MouseEvent.MOUSE_EXITED) )  
            {    System.out.println("7. Node Exited: " + MouseEvent.MOUSE_EXITED);} 

         // 8. MOUSE_MOVED -> Continuous while Mouse moves across the target node.       
         if ((mouseEvent.getEventType() == MouseEvent.MOUSE_MOVED)  )            
            {   System.out.println("8. M Moved: " +  MouseEvent.MOUSE_MOVED);}
    }
  };  
  ////////////////////////////////////////////////////////////
}
