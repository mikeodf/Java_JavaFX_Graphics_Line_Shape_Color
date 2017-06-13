// pathCubicCurve1.java
/*
Constructor:
CubicCurveTo(controlX1, controlY1, controlX2, controlY2, x, y)

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine 
*/
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.*; 
import javafx.stage.Stage;
import javafx.stage.Stage;
import javafx.scene.paint.*;

public class pathCubicCurve1 extends Application 
{
     public void start(Stage stage)  throws Exception 
     {
         final Group group = new Group();
         Scene scene = new Scene(group, 330, 130);
         stage.setScene(scene);
         stage.setTitle("A Combined CubicCurve and Line Path");

        //Brow on left.
        Path path1 = new Path(); 
        MoveTo moveTo1 = new MoveTo( 125.8,73.1   ); 
        CubicCurveTo crv1 = new CubicCurveTo( 125,73, 127,62, 108,56   );
        CubicCurveTo crv2 = new CubicCurveTo( 93,21, 69,46, 69,46  );
        LineTo crv3 = new LineTo(  47,68   );
        LineTo crv4 = new LineTo(  68,47   );
        CubicCurveTo crv5 = new CubicCurveTo(  68,47, 114,60, 121,72  );
        CubicCurveTo crv6 = new CubicCurveTo(  128,84, 131,104, 132,117   );

        path1.getElements().add(moveTo1); 
        path1.getElements().add(crv1);  
        path1.getElements().add(crv2); 
        path1.getElements().add(crv3);  
        path1.getElements().add(crv4); 
        path1.getElements().add(crv5);  
        path1.getElements().add(crv6); 
        path1.setStrokeWidth(3);
        group.getChildren().addAll(path1);

        stage.show();
     }      
}
