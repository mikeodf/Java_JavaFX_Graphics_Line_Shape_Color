// PolygonsUnion.java
/*
Display the intersection, subtraction and union of two shapes.
Polyine : javafx.scene.shape.Polyine

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine 
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.transform.*;

public class PolygonsUnion extends Application {

    public void start(Stage stage) 
    {              
           Group root = new Group();

          // The arrays that will be make up the Polygons.
          Double[] polypoints1 = {33.,121. , 83.,69. , 149.,70. , 265.,158. , 314.,159. , 329.,121. , 303.,89. , 260.,97. , 133.,198. , 70.,188. , 36.,156. };
          Double[] polypoints2 = {137.,117. , 167.,52. , 254.,27. , 360.,64. , 387.,131. , 340.,202. , 243.,225. , 176.,204. , 134.,138.};

            // Construct or instantiate two polygons
            Polygon polygon1 = new Polygon();
            Polygon polygon2 = new Polygon();

            // Make arrays into a polygons.
            polygon1.getPoints().addAll(polypoints1); // Add first array to a Polygon.
            polygon2.getPoints().addAll(polypoints2); // Add second array to a Polygon.
            
               polygon1.setStroke(Color.RED) ;  
               polygon1.setStrokeWidth(2) ;
               polygon1.setFill(Color.PINK) ;  
 
               polygon2.setStroke(Color.BLUE) ;  
               polygon2.setStrokeWidth(2) ;
               polygon2.setFill(Color.SKYBLUE) ;  

             // Construct or instantiate the intersection of two polygons.
             Shape intersection = Shape.intersect(polygon1, polygon2);
             intersection.setStroke(Color.BLACK);
             intersection.setStrokeWidth(6) ;
             intersection.setFill(Color.LIGHTGRAY);

             // Construct or instantiate the subtraction of two polygons.
             // Note the two possibilities, subtract(polygon1, polygon2) or subtract(polygon2, polygon3),
             //  that give different results.
             //Shape subtraction = Shape.subtract(polygon1, polygon2);
             Shape subtraction = Shape.subtract(polygon2, polygon1);
             subtraction.setStroke(Color.BLACK);
             subtraction.setStrokeWidth(6) ;
             subtraction.setFill(Color.LIGHTGRAY);

             // Construct or instantiate the union of two polygons.
             Shape uniona = Shape.union(polygon1, polygon2);
             uniona.setStroke(Color.BLACK);
             uniona.setStrokeWidth(6) ;
             uniona.setFill(Color.LIGHTGRAY);
   
              // Show the two original polygons.
               root.getChildren().add(polygon1) ; 
               root.getChildren().add(polygon2) ;  

               // Try out each in turn: intersection, subtraction and then union.
               //root.getChildren().add(intersection) ;  //Test 1. intersection.
               root.getChildren().add(subtraction) ;   //Test 2. subtraction.
               //root.getChildren().add(uniona) ;          //Test 3. union.    
          
        Scene scene = new Scene(root, 800, 800, Color.WHITE);
        stage.setTitle("Subtraction: Shape subtraction = Shape.subtract(polygon2, polygon1);");
        stage.setScene(scene);
        stage.show();
      
    }
}
