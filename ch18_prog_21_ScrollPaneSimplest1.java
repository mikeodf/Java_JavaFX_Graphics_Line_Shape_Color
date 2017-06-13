// ScrollPaneSimplest1.java
/*
A Control that provides a scrolled, clipped viewport of its contents. It allows the user to scroll the content around either directly (panning) or by using scroll bars. The ScrollPane allows specification of the scroll bar policy, which determines when scroll bars are displayed: always, never, or only when they are needed. 
ScrollPane: class:javafx.scene.control.ScrollPane
---------------------------------------
Constructor 
1. ScrollPane(): A new ScrollPane.
ScrollPane(Node_content): A new ScrollPane.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.ScrollPane;
import javafx.scene.paint.Color;

public class ScrollPaneSimplest1 extends Application 
{
  public void start(Stage stage) 
  {
    Group root = new Group();
    Scene scene = new Scene(root, 120, 120, Color.PINK);
    ScrollPane scrollPane = new ScrollPane();
    root.getChildren().add(scrollPane);

    stage.setTitle("A ScrollPane"); 
    stage.setScene(scene);
    stage.show();
  }
}
