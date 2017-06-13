// CircleSet1.java
/*
Create a function that draws three concentric circles with no default parameters.
All parameters are specified explicitly.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;

public class CircleSet1 extends Application 
{
        Group root = new Group();

        // Purples.
        final Color purp1 = Color.web("rgb(81%, 55%, 70%)");   // rgb percent web color. 
        final Color purp2 = Color.web("rgb(55%, 19%,  39%)");           
        final Color purp3 = Color.web("rgb(28%, 0.4%, 16%)");           
        
        // Red-violets.  
        final Color yell1 = Color.web("rgb(80%, 60%, 100%)");          
        final Color yell2 = Color.web("rgb(80%, 20%, 60%)");          
        final Color yell3 = Color.web("rgb(80%,  0%, 20%)");          
      
    public void start(Stage stage) 
    {         
        // Position.
        double xx = 150;        
        double yy = 150;
       
        CircleSet(xx, yy, purp1, purp2, purp3, yell1, yell2, yell3, 8  ) ;  
        // Parameters: position x, y, 3 fill colors, 3 stroke colors, stroke width.

        Scene scene = new Scene(root, 300, 300, Color.web("#2c8437"));
        stage.setTitle("Specify Circle Parameters");
        stage.setScene(scene);
        stage.show();     
    }
     
     
     public void CircleSet(double xx, double yy, 
                           Color kula1fill, Color kula2fill, Color kula3fill,   
                           Color kula1stroke, Color kula2stroke, Color kula3stroke,
                           double outlineWidth ) 

     {  /* Method: Draw three concentric circles, each with unique appearance.
           Parameters: position x, y, 3 fill colors, 3 stroke colors, stroke width.
           Note that the parameters can still be modified within the method as
           we have done with the setStrokeWidth(...) parameter.  */

        double radiu1 = 40;
        double radiu2 = 80;
        double radiu3 = 120;

       // Outer Circle: Position, radius and fill color.
       Circle circ1 = new Circle();
       circ1.setCenterX(xx);
       circ1.setCenterY(yy);
       circ1.setRadius(radiu3);           
       circ1.setFill(kula1fill);

       // Outer Circle: outline width, color and dash pattern.
       circ1.setStroke(kula1stroke);
       circ1.setStrokeWidth(outlineWidth+8);
       circ1.setStrokeLineCap(StrokeLineCap.ROUND);
       circ1.getStrokeDashArray().addAll(40d);// fill, blank.
       root.getChildren().add(circ1);

       // Middle circle: Position, radius and fill color.
       Circle circ2 = new Circle();
       circ2.setCenterX(xx);
       circ2.setCenterY(yy);
       circ2.setRadius(radiu2);           
       circ2.setFill(kula2fill);

       circ2.setStrokeLineCap(StrokeLineCap.ROUND); // Middle Circle: outline 
       circ2.getStrokeDashArray().addAll(30d);
       circ2.setStroke(kula2stroke);
       circ2.setStrokeWidth(outlineWidth+4);
       root.getChildren().add(circ2);

       // Inner circle: Position, radius and fill color..
       Circle circ3 = new Circle();
       circ3.setCenterX(xx);
       circ3.setCenterY(yy);
       circ3.setRadius(radiu1);           
       circ3.setFill(kula3fill);

       circ3.setStroke(kula3stroke); // Inner Circle: outline 
       circ3.setStrokeLineCap(StrokeLineCap.ROUND);
       circ3.getStrokeDashArray().addAll(20d);
       circ3.setStrokeWidth(outlineWidth);
       root.getChildren().add(circ3);
       }
      
}


