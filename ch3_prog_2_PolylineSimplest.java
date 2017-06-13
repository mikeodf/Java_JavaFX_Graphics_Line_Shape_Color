import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.shape.*; // Graphic primitives library.

public class PolylineSimplest extends Application 
{
    public void start(Stage stage) 
    {
           Group root = new Group();
      ///////////////////////////////////////
      //Polyline polyline1 = new Polyline(10, 10, 50, 50, 100, 10);
      Polygon polygon1 = new Polygon(10, 10, 50, 50, 100, 10);
      ///////////////////////////////////////
      //root.getChildren().add(polyline1);
      root.getChildren().add(polygon1);
           
            Scene scene = new Scene(root, 160, 60);
            stage.setTitle("Polygon on Stage(canvas), JavaFX");
            stage.setScene(scene);
            stage.show();      
      }
}


