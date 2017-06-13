// Javafx_Shapes1.java
/*
An experiment in class architecture - Separately compiled classes.
1. This class Javafx_CircleSet1 is only able to draw circles using the methods defined
 in completely separate classs:  "MakeCircles" and "MakeRectangles".
2a. MakeCircles is a completely separeate source file, compiled separately as a public class.
2b. MakeRectangles is a completely separeate source file, compiled separately as a public class.
3. The compiled classes are all inside a common directory folder, making them components of the same package.
4. Note that if the classes were included in the "Javafx_CircleSet1" cource code then they 
   may not be classified as a public class. They have to be private.
  
Draws three concentric circles and then three rectangles with no default parameters.
All parameters are specified explicitly in the "make_cir1" method.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;

public class Javafx_Shapes1 extends Application 
{
        Group root_node_grp = new Group();

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
        double xx = 300;        
        double yy = 220;
        double radiu1 = 100;
        double radiu2 = 120;
        double radiu3 = 160;

        // Instantiate our external classes.
        MakeCircles mkcir = new MakeCircles(); // Instantiate an external class
        MakeRectangles mkrec = new MakeRectangles(); // Instantiate the external class
       
        // Parameters: position x, y, radius, fill colors,stroke colors, stroke width.
        Circle circ1 = mkcir.make_cir1( xx,  yy, radiu1, yell1, purp1, 3);
        Circle circ2 = mkcir.make_cir1( xx,  yy, radiu2, yell2, purp2, 5);
        Circle circ3 = mkcir.make_cir1( xx,  yy, radiu3, yell3, purp3, 7);
   
        // Insert the drawings of circles.
        root_node_grp.getChildren().add(circ3);
        root_node_grp.getChildren().add(circ2);
        root_node_grp.getChildren().add(circ1);

        xx = 40 ;
        yy = 30 ;
        double width1 = 160 ;
        double height1 = 220 ;  
        // Parameters: position x, y, width, , height, fill colors, stroke colors, stroke width.
        Rectangle rect1 = mkrec.make_rec1( xx,  yy, width1, height1, yell1, purp1, 3);
        Rectangle rect2 = mkrec.make_rec1( xx+20,  yy+20, width1-40, height1-40, yell2, purp2, 5);
        Rectangle rect3 = mkrec.make_rec1( xx+40,  yy+40, width1-80, height1-80, yell3, purp3, 7);

        /* Note that once the graphic objects have been assigned as children of the root node,
           their parameter values are cast in concrete and cannot be changed.
           assigning new a different values to position, size and color will have no effect
           on graphic objects already assigned.  However any new graphic children created will have
           the new parameter values.
        */ 
   
        // Insert the drawings of circles.
        root_node_grp.getChildren().add(rect1);
        root_node_grp.getChildren().add(rect2);
        root_node_grp.getChildren().add(rect3);
  
        Scene scene = new Scene(root_node_grp, 500, 400, Color.web("#2c8437"));
        stage.setTitle("Multiple Source files. Specify Rectangle and Circle Parameters");
        stage.setScene(scene);
        stage.show();     
    }  
}


