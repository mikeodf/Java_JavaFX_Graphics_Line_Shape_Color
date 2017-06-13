// Perspective1.java
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
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import javafx.scene.effect.PerspectiveTransform;

public class Perspective1 extends Application 
{
    int SIZE = 50; // Size of squares on board.

    public void start(Stage stage) 
    {
       StackPane root = new StackPane();        
        Pane chessboard = new Pane();
    
        // Make a Chessboard.    
        for (int row = 0; row < 8; row++) 
        {
            for (int col = 0; col < 8; col++) 
           {                
                Rectangle rect1 = new Rectangle(col * SIZE, row*SIZE, 
                                    SIZE, SIZE);
                
                if ((col+row) % 2 == 0) { rect1.setFill(Color.WHITE); } 
                   else {  rect1.setFill(Color.BLACK); }
                
                chessboard.getChildren().add(rect1);
           }
        }

        PerspectiveTransform perspec = new PerspectiveTransform();
        perspec.setUlx(80);     // Upper-left point
        perspec.setUly(50);
        perspec.setUrx(320);    // Upper-right point
        perspec.setUry(50);
        perspec.setLlx(0);      // Lower-left point
        perspec.setLly(200); 
        perspec.setLrx(400);    // Lower-right point
        perspec.setLry(200);
        chessboard.setEffect(perspec);
        
        root.getChildren().add(chessboard);

        Scene scene = new Scene(root, Color.BLACK);
        stage.setTitle("ChessBoard in perspective");
        stage.setScene(scene);
        stage.show();
    }
}
