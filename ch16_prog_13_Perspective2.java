// Perspective2.java
/*
The PerspectiveTransform is used to provide a simulated three-dimensional effect for otherwise two-dimensional content.
A perspective transformation is capable of mapping an arbitrary quadrilateral into another arbitrary quadrilateral, 
while preserving the straightness of lines.The parallelism of lines in the source is not necessarily preserved in the output.

Constructor used (more available).
PerspectiveTransform(ulx, uly, urx, ury, lrx, lry, llx, lly)

Parameters:
ulx - the x coordinate of upper left corner
uly - the y coordinate of upper left corner
urx - the x coordinate of upper right corner
ury - the y coordinate of upper right corner
lrx - the x coordinate of lower right corner
lry - the y coordinate of lower right corner
llx - the x coordinate of lower left corner
lly - the y coordinate of lower left corner

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine 
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.effect.PerspectiveTransform;

public class Perspective2 extends Application 
{
    public void start(Stage stage) 
    {
        final Group rootgroup = new Group();       
       ImageView viewcourt = new ImageView(new Image("O_V_courtyard_500.jpg"));
     
        PerspectiveTransform perspec = new PerspectiveTransform();
        perspec.setUlx(90);     // Upper-left point
        perspec.setUly(10);

        perspec.setUrx(380);    // Upper-right point
        perspec.setUry(10);

        perspec.setLlx(10);      // Lower-left point
        perspec.setLly(400); 

        perspec.setLrx(490);    // Lower-right point
        perspec.setLry(400);

        rootgroup.setEffect(perspec);        
        rootgroup.getChildren().add(viewcourt);
;
        Scene scene = new Scene(rootgroup, 510, 410, Color.BLACK);
        stage.setTitle("Oak&Vigne in perspective");
        stage.setScene(scene);
        stage.show();
    }
}
