// MouseEvent_WhichButton1.java
/*
Discover which button was pressed:

1. PRIMARY -> Left side button.
2. SECONDARY -> Right side button.
3. MIDDLE -> Middle button.
 
Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.*;
import javafx.scene.paint.*;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class MouseEvent_WhichButton1 extends Application 
{
  public void start(Stage primaryStage) 
  {
    Group root = new Group();
    Scene scene = new Scene(root, 400, 100);  

    Rectangle rect1 = new Rectangle(30, 30, 300, 60);
    root.getChildren().add(rect1);
   
    // Set mouse flag when any mouse button is pushed.
    rect1.setOnMousePressed(mouseHandler1);  // 1. Press only.

   primaryStage.setTitle( "Discover Which mouse button was pressed." ) ; 
   primaryStage.setScene(scene);
   primaryStage.show();
  }
    ////////////////////////////////////////////////////////////   
    ///////////       "mouseHandler1         ///////////////////  
  EventHandler<MouseEvent> mouseHandler1 = new EventHandler<MouseEvent>() 
  {
    public void handle(MouseEvent mouseEvent) 
    {    
         // 1. MOUSE_PRESSED, Which button was pressed?
         if ((mouseEvent.getEventType() == MouseEvent.MOUSE_PRESSED)  )            
            {  System.out.println("Which button: " +  mouseEvent.getButton()); }
    }
  };  
  ////////////////////////////////////////////////////////////
}
