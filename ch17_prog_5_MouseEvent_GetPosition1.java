// MouseEvent_GetPosition1.java
/*
Get mouse event location parameters:
getSceneX() = getX() : Relative to JavaFX scene.
getSceneY() = getY() : Relative to JavaFX scene.

getScreenX() : Relative to entire video screen.
getScreenY() : Relative to entire video screen.

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

public class MouseEvent_GetPosition1 extends Application 
{

  public void start(Stage primaryStage) 
  {
    double xx, yy, width, height, strokew;
    xx = 100 ;
    yy = 100 ;
    width = 300 ;
    height = 200 ;
    strokew = 4 ; 

    Group root = new Group();
    Scene scene = new Scene(root, 600, 400);  

    Rectangle rect1 = new Rectangle();
           rect1.setX(xx);
           rect1.setY(yy);
           rect1.setWidth(width);
           rect1.setHeight(height);
           rect1.setStrokeWidth(strokew);
           rect1.setStroke(Color.RED);
           rect1.setFill(Color.rgb(50, 50, 150, 0.5 ));
           root.getChildren().add(rect1);
   
    // Set mouse flag on mouse action.
    rect1.setOnMousePressed(mouseHandler1);  // 1. Press only.

    primaryStage.setScene(scene);
    primaryStage.show();
  }

   ////////////////////////////////////////////////////////////   
   ///////////       "mouseHandler1         ///////////////////  
  EventHandler<MouseEvent> mouseHandler1 = new EventHandler<MouseEvent>() 
  {
    public void handle(MouseEvent mouseEvent) 
    {    
         // 1. MOUSE_PRESSED -> On press only.
         if ((mouseEvent.getEventType() == MouseEvent.MOUSE_PRESSED)  )            
            {   System.out.println("1. M Pressed: " +  MouseEvent.MOUSE_PRESSED);

                System.out.println("Where X, absolute: " +  mouseEvent.getScreenX());
                System.out.println("Where Y, absolute: " +  mouseEvent.getScreenY());
                System.out.println("Where X, in scene: " +  mouseEvent.getSceneX()); 
                System.out.println("Where Y, in scene: " +  mouseEvent.getSceneY());
                System.out.println("Where X, relative to event source: " +  mouseEvent.getX());
                System.out.println("Where Y, relative to event source: " +  mouseEvent.getY());
            }
    }
  };  
  ////////////////////////////////////////////////////////////
}
