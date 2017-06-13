// pathPicassoCubicCurve1.java
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

public class pathPicassoCubicCurve1 extends Application 
{
     public void start(Stage stage)  throws Exception 
     {
         final Group group = new Group();
         Scene scene = new Scene(group, 450, 450);
         stage.setScene(scene);
         stage.setTitle("Picasso's ' Muse as CubicCurve Paths");

      // Nostril, top lip ridge
        Path path1 = new Path(); // Instantiate the first path.
        MoveTo moveTo1 = new MoveTo(355,359.5); // Define start of the path.
        CubicCurveTo crv1 = new CubicCurveTo(355,359.5, 358.6,362.7, 358.2,367.2);
        CubicCurveTo crv2 = new CubicCurveTo(357.7,371.7, 355.9,372.1, 350.9,371.7);
        CubicCurveTo crv3 = new CubicCurveTo(346,371.2, 343.7,379.8, 343.7,383.8);
        CubicCurveTo crv4 = new CubicCurveTo(343.7,387.9, 344.2,396.4, 344.2,396.4);

        path1.getElements().add(moveTo1); // Go to the start
        path1.getElements().add(crv1); // First cubic curve of first path.
        path1.getElements().add(crv2); // Second cubic curve of first path.
        path1.getElements().add(crv3); // Third cubic curve of first path. 
        path1.getElements().add(crv4); // Fourth cubic curve of first path. 
        path1.setStrokeWidth(3);

        // Top Lip
        Path path2 = new Path(); // Instantiate the second path.
        MoveTo moveTo2 = new MoveTo(300.9,404.6); // Define start of the path.
        CubicCurveTo crv21 = new CubicCurveTo(300.9,404.6, 313.1,403.2, 317.2,401);
        CubicCurveTo crv22 = new CubicCurveTo(321.2,398.7, 322.3,395.3, 328.3,395.6);
        CubicCurveTo crv23 = new CubicCurveTo(331.5,395.7, 334.8,399.1, 337.6,399.2);
        CubicCurveTo crv24 = new CubicCurveTo(341,399.3, 345.8,397.3, 350.3,398.2);
        CubicCurveTo crv25 = new CubicCurveTo(354.8,399.2, 357,405.3, 360.4,406.8);
        CubicCurveTo crv26 = new CubicCurveTo(362.9,407.9, 370.3,409.5, 370.3,409.5);

        path2.getElements().add(moveTo2); // Go to Start
        path2.getElements().add(crv21);  
        path2.getElements().add(crv22); 
        path2.getElements().add(crv23);  
        path2.getElements().add(crv24);  
        path2.getElements().add(crv25);  
        path2.getElements().add(crv26); 
        path2.setStrokeWidth(3);

        // Bottom Lip
        Path path3 = new Path(); 
        MoveTo moveTo3 = new MoveTo(308.2,404.9 ); 
        CubicCurveTo crv31 = new CubicCurveTo(313.1,405.7, 322.1,404.4, 325.8,402.5 );
        CubicCurveTo crv32 = new CubicCurveTo(329.1,400.8, 335.7,407.1, 335.7,407.1 );
        CubicCurveTo crv33 = new CubicCurveTo(335.7,407.1, 340.7,404, 344.8,404.4 );
        CubicCurveTo crv34 = new CubicCurveTo( 352.3,405.7, 359.4,408.6, 367.5,410.3);
        CubicCurveTo crv35 = new CubicCurveTo(367.5,410.3, 368.5,410, 363.6,412.2 );
        CubicCurveTo crv36 = new CubicCurveTo(358.6,414.5, 352.4,418.9, 335.2,418.5 );
        CubicCurveTo crv37 = new CubicCurveTo(322.7,418.2, 310.4,411.9, 308.6,409.2 );

        path3.getElements().add(moveTo3);
        path3.getElements().add(crv31);
        path3.getElements().add(crv32);
        path3.getElements().add(crv33); 
        path3.getElements().add(crv34); 
        path3.getElements().add(crv35); 
        path3.getElements().add(crv36);
        path3.getElements().add(crv37);
        path3.setStrokeWidth(3);


        // Left Eyelids
        Path path4 = new Path();
        MoveTo moveTo4 = new MoveTo( 253.6,296.9 );
        CubicCurveTo crv41 = new CubicCurveTo( 253.6,296.9, 271,277.5, 285.8,278.5 );
        CubicCurveTo crv42 = new CubicCurveTo( 301.8,279.5, 316.3,300.5, 316.3,300.5 );
        CubicCurveTo crv43 = new CubicCurveTo( 316.3,300.5, 295.4,286.7, 285.6,287 );
        CubicCurveTo crv44 = new CubicCurveTo( 270.6,287.4, 256.3,296, 256.3,296  );
        CubicCurveTo crv45 = new CubicCurveTo( 256.3,296, 273.9,311.8, 285.8,310.9  );
        CubicCurveTo crv46 = new CubicCurveTo( 300.4,309.7, 311.3,299.6, 311.3,299.6  );

        path4.getElements().add(moveTo4);
        path4.getElements().add(crv41); 
        path4.getElements().add(crv42); 
        path4.getElements().add(crv43); 
        path4.getElements().add(crv44); 
        path4.getElements().add(crv45);  
        path4.getElements().add(crv46); 
        path4.setStrokeWidth(3);

        // Left Eyelids
        Path path5 = new Path(); 
        MoveTo moveTo5 = new MoveTo( 360.4,306.3  ); 
        CubicCurveTo crv51 = new CubicCurveTo( 360,306, 373,285, 391,284  );
        CubicCurveTo crv52 = new CubicCurveTo( 410,284, 419,303, 422,310  );
        CubicCurveTo crv53 = new CubicCurveTo( 412,298, 402,291, 391,292  );
        CubicCurveTo crv54 = new CubicCurveTo( 381,292, 361,302, 361,302   );
        CubicCurveTo crv55 = new CubicCurveTo( 361,302, 375,319, 388,319   );
        CubicCurveTo crv56 = new CubicCurveTo( 411,320, 424,298, 424,298   );

        path5.getElements().add(moveTo5); 
        path5.getElements().add(crv51);  
        path5.getElements().add(crv52); 
        path5.getElements().add(crv53);  
        path5.getElements().add(crv54); 
        path5.getElements().add(crv55);  
        path5.getElements().add(crv56); 
        path5.setStrokeWidth(3);

        // Brow and nose on right.
        Path path6 = new Path(); 
        MoveTo moveTo6 = new MoveTo(  361.3,279   );
        CubicCurveTo crv61 = new CubicCurveTo( 361,279,  373,272,  390,272   );
        CubicCurveTo crv62 = new CubicCurveTo(  404,271,  414,271,  420,276  );
        CubicCurveTo crv63 = new CubicCurveTo( 425,280,  430,288,  430,288   );
        CubicCurveTo crv64 = new CubicCurveTo(  430,288,  424,265,  392,265  );
        CubicCurveTo crv65 = new CubicCurveTo(  373,265,  361,272,  357,283  );
        CubicCurveTo crv66 = new CubicCurveTo(  353,294,  351,358,  351,358  );
        CubicCurveTo crv67 = new CubicCurveTo(  351,358,  354,364,  350,367  );
        CubicCurveTo crv68 = new CubicCurveTo(  346,369,  332,364,  329,365  );
        CubicCurveTo crv69 = new CubicCurveTo(  327,367,  323,370, 325,370  );
        CubicCurveTo crv610 = new CubicCurveTo(  337,377,  337,387, 337,387   );
        LineTo crv611 = new LineTo(  336.5,391   );

        path6.getElements().add(moveTo6); 
        path6.getElements().add(crv61);  
        path6.getElements().add(crv62); 
        path6.getElements().add(crv63);  
        path6.getElements().add(crv64); 
        path6.getElements().add(crv65);  
        path6.getElements().add(crv66); 
        path6.getElements().add(crv67);  
        path6.getElements().add(crv68); 
        path6.getElements().add(crv69); 
        path6.getElements().add(crv610); 
        path6.getElements().add(crv611); 
        path6.setStrokeWidth(3);

        //Brow on left.
        Path path7 = new Path(); 
        MoveTo moveTo7 = new MoveTo( 325.8,273.1   ); 
        CubicCurveTo crv71 = new CubicCurveTo( 325,273, 327,262, 308,256   );
        CubicCurveTo crv72 = new CubicCurveTo( 293,251, 269,246, 269,246  );
        LineTo crv73 = new LineTo(  247,268   );
        LineTo crv74 = new LineTo(  268,247   );
        CubicCurveTo crv75 = new CubicCurveTo(  268,247, 314,260, 321,272  );
        CubicCurveTo crv76 = new CubicCurveTo(  328,284, 331,304, 332,317   );
        CubicCurveTo crv77 = new CubicCurveTo(  333,329, 335,344, 335,349   );
        CubicCurveTo crv78 = new CubicCurveTo(  334,357, 331,358, 331,358   );

        path7.getElements().add(moveTo7); 
        path7.getElements().add(crv71);  
        path7.getElements().add(crv72); 
        path7.getElements().add(crv73);  
        path7.getElements().add(crv74); 
        path7.getElements().add(crv75);  
        path7.getElements().add(crv76); 
        path7.getElements().add(crv77); 
        path7.getElements().add(crv78); 
        path7.setStrokeWidth(3);
        group.getChildren().addAll(path1, path2, path3, path4, path5, path6, path7);

        stage.show();
     }      
}
