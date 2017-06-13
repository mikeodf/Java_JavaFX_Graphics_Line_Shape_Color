// ArcToCreative1.java
/*

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.shape.*; 

public class ArcToCreative1 extends Application 
{
    public void start(Stage stage) 
    {
           Group root = new Group();
    //***************************************
    ArcTo arcTo1 = new ArcTo();
    arcTo1.setX(400);
    arcTo1.setY(200);    
    arcTo1.setRadiusX(200);
    arcTo1.setRadiusY(100);  

    //arcTo1.setSweepFlag(false); // true=anti-clockwise, false=clockwise.
    arcTo1.setLargeArcFlag(true); // ==default. True and false seem to be the same.
  
    double endX1 = 300 ;
    double endY = 400 ; 
    for (int i = 0; i<20; i++)
    {   Path path1 = new Path(new MoveTo(endX1, endY), arcTo1);
        path1.setStrokeWidth(2); 
        root.getChildren().add(path1);
         endX1 += 20 ;
   }
   //***************************************
         
            Scene scene = new Scene(root, 1100, 450);
            stage.setTitle(" ArcTo's, default setSweepFlag=default, setLargeArcFlag=true");
            stage.setScene(scene);
            stage.show();      
    }
}


