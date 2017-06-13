// pathPicassoCubicCurve1.java
/*
Constructor:
CubicCurveTo(double controlX1, double controlY1, double controlX2, double controlY2, double x, double y)
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
         Scene scene = new Scene(group, 600, 600);
         stage.setScene(scene);
         stage.setTitle("Comparing CubicCurve and QuadCurve Paths");

//***********************************************************************************
/*   Picasso Lady Parameters from  Inkscape SVG file. 
path1:     d="M 355,359.5 C 
355,359.5 358.6,362.7 358.2,367.2 C    1.
357.7,371.7 355.9,372.1 350.9,371.7 C  2. 
346,371.2 343.7,379.8 343.7,383.8 C    3.
343.7,387.9 344.2,396.4 344.2,396.4"   4. 

path2:      d="M 300.9,404.6 C 
300.9,404.6 313.1,403.2 317.2,401 C    1.
321.2,398.7 322.3,395.3 328.3,395.6 C  2.
331.5,395.7 334.8,399.1 337.6,399.2 C  3.
341,399.3 345.8,397.3 350.3,398.2 C    4.
354.8,399.2 357,405.3 360.4,406.8 C    5. 
 362.9,407.9 370.3,409.5 370.3,409.5"  6.

*/      // Nostril, top lip ridge
        Path path1 = new Path(); // Instantiate a path.
        MoveTo moveTo1 = new MoveTo(355,359.5); // Define start of path.
        CubicCurveTo crv1 = new CubicCurveTo(355,359.5, 358.6,362.7, 358.2,367.2);
        CubicCurveTo crv2 = new CubicCurveTo(357.7,371.7, 355.9,372.1, 350.9,371.7);
        CubicCurveTo crv3 = new CubicCurveTo(346,371.2, 343.7,379.8, 343.7,383.8);
        CubicCurveTo crv4 = new CubicCurveTo(343.7,387.9, 344.2,396.4, 344.2,396.4);

        path1.getElements().add(moveTo1); // Go to Start
        path1.getElements().add(crv1); // 
        path1.getElements().add(crv2); //
        path1.getElements().add(crv3); // 
        path1.getElements().add(crv4); // 
        path1.setStroke(Color.GREY);
        path1.setStrokeWidth(5);

        // Top Lip
        Path path2 = new Path(); // Instantiate a path.
        MoveTo moveTo2 = new MoveTo(300.9,404.6); // Define start of path.
        CubicCurveTo crv21 = new CubicCurveTo(300.9,404.6, 313.1,403.2, 317.2,401);
        CubicCurveTo crv22 = new CubicCurveTo(321.2,398.7, 322.3,395.3, 328.3,395.6);
        CubicCurveTo crv23 = new CubicCurveTo(331.5,395.7, 334.8,399.1, 337.6,399.2);
        CubicCurveTo crv24 = new CubicCurveTo(341,399.3, 345.8,397.3, 350.3,398.2);
        CubicCurveTo crv25 = new CubicCurveTo(354.8,399.2, 357,405.3, 360.4,406.8);
        CubicCurveTo crv26 = new CubicCurveTo(362.9,407.9, 370.3,409.5, 370.3,409.5);

        path2.getElements().add(moveTo2); // Go to Start
        path2.getElements().add(crv21); // 
        path2.getElements().add(crv22); //
        path2.getElements().add(crv23); // 
        path2.getElements().add(crv24); // 
        path2.getElements().add(crv25); // 
        path2.getElements().add(crv26); //
        path2.setStroke(Color.PINK);
        path2.setStrokeWidth(5);
/*
path3:      d="M 308.2,404.9 C      
313.1,405.7 322.1,404.4 325.8,402.5 C  1. 
329.1,400.8 335.7,407.1 335.7,407.1 C 
335.7,407.1 340.7,404 344.8,404.4 C    3. 
352.3,405.7 359.4,408.6 367.5,410.3 C 
367.5,410.3 368.5,410 363.6,412.2 C    5. 
358.6,414.5 352.4,418.9 335.2,418.5 C 
322.7,418.2 310.4,411.9 308.6,409.2"   7.
*/        

        // Bottom Lip
        Path path3 = new Path(); // Instantiate a path.
        MoveTo moveTo3 = new MoveTo(308.2,404.9 ); // Define start of path.
        CubicCurveTo crv31 = new CubicCurveTo(313.1,405.7, 322.1,404.4, 325.8,402.5 );
        CubicCurveTo crv32 = new CubicCurveTo(329.1,400.8, 335.7,407.1, 335.7,407.1 );
        CubicCurveTo crv33 = new CubicCurveTo(335.7,407.1, 340.7,404, 344.8,404.4 );
        CubicCurveTo crv34 = new CubicCurveTo( 352.3,405.7, 359.4,408.6, 367.5,410.3);
        CubicCurveTo crv35 = new CubicCurveTo(367.5,410.3, 368.5,410, 363.6,412.2 );
        CubicCurveTo crv36 = new CubicCurveTo(358.6,414.5, 352.4,418.9, 335.2,418.5 );
        CubicCurveTo crv37 = new CubicCurveTo(322.7,418.2, 310.4,411.9, 308.6,409.2 );

        path3.getElements().add(moveTo3); // Go to Start
        path3.getElements().add(crv31); // 
        path3.getElements().add(crv32); //
        path3.getElements().add(crv33); // 
        path3.getElements().add(crv34); // 
        path3.getElements().add(crv35); // 
        path3.getElements().add(crv36); //
        path3.getElements().add(crv37); //
        path3.setStroke(Color.GREY);
        path3.setStrokeWidth(5);

/*
path4:      d="M 253.6,296.9 C 
253.6,296.9 271,277.5 285.8,278.5 C  1.
301.8,279.5 316.3,300.5 316.3,300.5 C 
316.3,300.5 295.4,286.7 285.6,287 C   3.
270.6,287.4 256.3,296 256.3,296 C 
256.3,296 273.9,311.8 285.8,310.9 C   5.
300.4,309.7 311.3,299.6 311.3,299.6"
*/
        // Left Eyelids
        Path path4 = new Path(); // Instantiate a path.
        MoveTo moveTo4 = new MoveTo( 253.6,296.9 ); // Define start of path.
        CubicCurveTo crv41 = new CubicCurveTo( 253.6,296.9, 271,277.5, 285.8,278.5 );
        CubicCurveTo crv42 = new CubicCurveTo( 301.8,279.5, 316.3,300.5, 316.3,300.5 );
        CubicCurveTo crv43 = new CubicCurveTo( 316.3,300.5, 295.4,286.7, 285.6,287 );
        CubicCurveTo crv44 = new CubicCurveTo( 270.6,287.4, 256.3,296, 256.3,296  );
        CubicCurveTo crv45 = new CubicCurveTo( 256.3,296, 273.9,311.8, 285.8,310.9  );
        CubicCurveTo crv46 = new CubicCurveTo( 300.4,309.7, 311.3,299.6, 311.3,299.6  );

        path4.getElements().add(moveTo4); // Go to Start
        path4.getElements().add(crv41); // 
        path4.getElements().add(crv42); //
        path4.getElements().add(crv43); // 
        path4.getElements().add(crv44); //
        path4.getElements().add(crv45); // 
        path4.getElements().add(crv46); //
        path4.setStroke(Color.PINK);
        path4.setStrokeWidth(5);

/*
path5:      d="M 360.4,306.3 C 
360.4,306.3 373.7,285 391.5,284.7 C 1.
410.5,284.4 419.2,303.6 422.1,310.9 C 2.
412.1,298.6 402.1,291.7 391.8,292.1 C 
381.4,292.6 361.8,302.7 361.8,302.7 C 4.
361.8,302.7 375.7,319.8 388.3,319.9 C 
411.1,320.1 424.4,298.2 424.4,298.2"  6.
*/
        // Left Eyelids
        Path path5 = new Path(); // Instantiate a path.
        MoveTo moveTo5 = new MoveTo( 360.4,306.3  ); // Define start of path.
        CubicCurveTo crv51 = new CubicCurveTo( 360.4,306.3, 373.7,285, 391.5,284.7  );
        CubicCurveTo crv52 = new CubicCurveTo( 410.5,284.4, 419.2,303.6, 422.1,310.9  );
        CubicCurveTo crv53 = new CubicCurveTo( 412.1,298.6, 402.1,291.7, 391.8,292.1  );
        CubicCurveTo crv54 = new CubicCurveTo( 381.4,292.6, 361.8,302.7, 361.8,302.7   );
        CubicCurveTo crv55 = new CubicCurveTo( 361.8,302.7, 375.7,319.8, 388.3,319.9   );
        CubicCurveTo crv56 = new CubicCurveTo( 411.1,320.1, 424.4,298.2, 424.4,298.2   );

        path5.getElements().add(moveTo5); // Go to Start
        path5.getElements().add(crv51); // 
        path5.getElements().add(crv52); //
        path5.getElements().add(crv53); // 
        path5.getElements().add(crv54); //
        path5.getElements().add(crv55); // 
        path5.getElements().add(crv56); //
        path5.setStroke(Color.PINK);
        path5.setStrokeWidth(5);

/*
path6:      d="M 361.3,279 C 
361.3,279 373.9,272.8 390.8,272 C      1. 
404.4,271.3 414.7,271.1 420.8,276.4 C 
425.4,280.3 430.5,288.5 430.5,288.5 C  3. 
430.5,288.5 424.1,265.7 392.7,265.7 C 
373,265.7 361.6,272.4 357.3,283.4 C    5.
353,294.4 351.8,358.2 351.8,358.2 C 
351.8,358.2 354.1,364.9 350,367.2 C    7.
346,369.4 332.5,364.5 329.8,365.8 C 
327.1,367.2 323.5,370.3 325.3,370.8 C  9. 
327.1,371.2 335.2,369 336.5,373 C 
337.9,377.1 337,387.4 337,387.4 L      11.
336.5,391"
*/
        // Brow and nose on right.
        Path path6 = new Path(); // Instantiate a path.
        MoveTo moveTo6 = new MoveTo(  361.3,279   ); // Define start of path.
        CubicCurveTo crv61 = new CubicCurveTo( 361.3,279,  373.9,272.8,  390.8,272   );
        CubicCurveTo crv62 = new CubicCurveTo(  404.4,271.3,  414.7,271.1,  420.8,276.4  );
        CubicCurveTo crv63 = new CubicCurveTo( 425.4,280.3,  430.5,288.5,  430.5,288.5   );
        CubicCurveTo crv64 = new CubicCurveTo(  430.5,288.5,  424.1,265.7,  392.7,265.7   );
        CubicCurveTo crv65 = new CubicCurveTo(  373,265.7,  361.6,272.4,  357.3,283.4   );
        CubicCurveTo crv66 = new CubicCurveTo(  353,294.4,  351.8,358.2,  351.8,358.2   );
        CubicCurveTo crv67 = new CubicCurveTo(  351.8,358.2,  354.1,364.9,  350,367.2  );
        CubicCurveTo crv68 = new CubicCurveTo(  346,369.4,  332.5,364.5,  329.8,365.8  );
        CubicCurveTo crv69 = new CubicCurveTo(  327.1,367.2,  323.5,370.3, 325.3,370.8  );
        CubicCurveTo crv610 = new CubicCurveTo(  337.9,377.1,  337,387.4, 337,387.4   );
        LineTo crv611 = new LineTo(  336.5,391   );

        path6.getElements().add(moveTo6); // Go to Start
        path6.getElements().add(crv61); // 
        path6.getElements().add(crv62); //
        path6.getElements().add(crv63); // 
        path6.getElements().add(crv64); //
        path6.getElements().add(crv65); // 
        path6.getElements().add(crv66); //
        path6.getElements().add(crv67); // 
        path6.getElements().add(crv68); //
        path6.getElements().add(crv69); // 
        path6.getElements().add(crv610); //
        path6.getElements().add(crv611); // 
        path6.setStroke(Color.BLUE);
        path6.setStrokeWidth(5);

/*
path7:      d="M 325.8,273.1 C 
325.8,273.1 327.4,262.4 308.6,256.1 C 1. 
293.4,251 269.9,246.4 269.9,246.4 L   2. 
247.6,268.4 L 268.5,247.3 C           3&4. 
268.5,247.3 314,260.8 321.2,272.6 C   5. 
328.4,284.3 331.6,304.5 332.5,317.2 C 
333.4,329.8 335.7,344.1 335.2,349.6 C 7. 
334.5,357.3 331.6,358.2 331.6,358.2"  8. 
*/
        //Brow on left.
        Path path7 = new Path(); // Instantiate a path.
        MoveTo moveTo7 = new MoveTo( 325.8,273.1   ); // Define start of path.
        CubicCurveTo crv71 = new CubicCurveTo( 325.8,273.1, 327.4,262.4, 308.6,256.1   );
        CubicCurveTo crv72 = new CubicCurveTo( 293.4,251, 269.9,246.4, 269.9,246.4  );
        LineTo crv73 = new LineTo(  247.6,268.4   );
        LineTo crv74 = new LineTo(  268.5,247.3   );
        CubicCurveTo crv75 = new CubicCurveTo(  268.5,247.3, 314,260.8, 321.2,272.6  );
        CubicCurveTo crv76 = new CubicCurveTo(  328.4,284.3, 331.6,304.5, 332.5,317.2   );
        CubicCurveTo crv77 = new CubicCurveTo(  333.4,329.8, 335.7,344.1, 335.2,349.6   );
        CubicCurveTo crv78 = new CubicCurveTo(  334.5,357.3, 331.6,358.2, 331.6,358.2   );
        //CubicCurveTo crv77 = new CubicCurveTo(    );

        path7.getElements().add(moveTo7); // Go to Start
        path7.getElements().add(crv71); // 
        path7.getElements().add(crv72); //
        path7.getElements().add(crv73); // 
        path7.getElements().add(crv74); //
        path7.getElements().add(crv75); // 
        path7.getElements().add(crv76); //
        path7.getElements().add(crv77); //
        path7.getElements().add(crv78); //
        path7.setStroke(Color.RED);
        path7.setStrokeWidth(5);
/*
 path8:     d="M 272.6,290.1 C 
272.6,290.1 271,307.9 282.7,307.5 C 1.
298,307 297.7,290.3 297.7,290.3 L   2.
289.3,287.6 C                       3.
289.3,287.6 289.5,296.1 284.1,296.5 C 4.
278.7,296.9 279.2,288 279.2,288"      5. 
*/
       //Eye on left.
        Path path8 = new Path(); // Instantiate a path.
        MoveTo moveTo8 = new MoveTo(  272.6,290.1   ); // Define start of path.
        CubicCurveTo crv81 = new CubicCurveTo( 272.6,290.1, 271,307.9, 282.7,307.5    );
        CubicCurveTo crv82 = new CubicCurveTo(  298,307, 297.7,290.3, 297.7,290.3  );
        LineTo crv83 = new LineTo(289.3,287.6 );
        CubicCurveTo crv84 = new CubicCurveTo( 289.3,287.6, 289.5,296.1, 284.1,296.5    );
        CubicCurveTo crv85 = new CubicCurveTo(  278.7,296.9, 279.2,288, 279.2,288    );
        //CubicCurveTo crv77 = new CubicCurveTo(      );
        //CubicCurveTo crv78 = new CubicCurveTo(      );
        //CubicCurveTo crv77 = new CubicCurveTo(    );

        path8.getElements().add(moveTo8); // Go to Start
        path8.getElements().add(crv81); // 
        path8.getElements().add(crv82); //
        path8.getElements().add(crv83); // 
        path8.getElements().add(crv84); //
        path8.getElements().add(crv85); // 
        //path8.getElements().add(crv86); //
        
        path8.setStroke(Color.GREY);
        path8.setStrokeWidth(5);
/*
path9:      d="M 378.8,296.1 C 
378.8,296.1 376.4,316 387.2,317.6 C 1.
404.3,320.2 400.9,294 400.9,294 L 2.
396.2,292.8 C                       3.  
396.2,292.8 396.2,304 391.5,305.2 C 4.
384.5,306.9 385.6,294.4 385.6,294.4 L 5.
385.6,294.4"                          6.
*/
//Eye on left.
        Path path9 = new Path(); // Instantiate a path.
        MoveTo moveTo9 = new MoveTo(  378.8,296.1   ); // Define start of path.
        CubicCurveTo crv91 = new CubicCurveTo( 378.8,296.1,   376.4,316,   387.2,317.6   );
        CubicCurveTo crv92 = new CubicCurveTo( 404.3,320.2,   400.9,294,   400.9,294  );
        LineTo crv93 = new LineTo( 396.2,292.8 );
        CubicCurveTo crv94 = new CubicCurveTo(  396.2,292.8,   396.2,304,   391.5,305.2   );
        CubicCurveTo crv95 = new CubicCurveTo(  384.5,306.9,   385.6,294.4, 385.6,294.4   );

        path9.getElements().add(moveTo9); // Go to Start
        path9.getElements().add(crv91); // 
        path9.getElements().add(crv92); //
        path9.getElements().add(crv93); // 
        path9.getElements().add(crv94); //
        path9.getElements().add(crv95); //         
        path9.setStroke(Color.GREY);
        path9.setStrokeWidth(5);
/*
path10:      d="M 223.5,260.6 C 
223.5,260.6 220.5,278.9 220.1,294.2 C 1.
219.6,309.5 218.1,328.2 221.9,348.2 C 
225.8,368.3 233.2,411.2 245.3,426.2 C 3.
 259.8,444 276.4,450.5 283.4,455.2 C 
290.4,460 300.4,470.3 315.2,469.9 C  5.
337.4,469.2 333,464.3 346.4,459.5 C 
359.6,454.8 379.1,449 394.9,434.5 C  7.
415.3,415.8 420.8,396.7 422.8,376.9 C
 424.8,357 425.3,331.8 428.9,317.2 C 9.
432.5,302.5 439.7,282 439.9,272.3 C 
440.1,262.6 439.7,233.7 439.7,233.7" 11.

*/
        Path path10 = new Path(); // Instantiate a path.
        MoveTo moveTo10 = new MoveTo(  223.5,260.6   ); // Define start of path.
        CubicCurveTo crv101 = new CubicCurveTo( 223.5,260.6,  220.5,278.9,  220.1,294.2   );
        CubicCurveTo crv102 = new CubicCurveTo(  219.6,309.5,  218.1,328.2,  221.9,348.2  );
        CubicCurveTo crv103 = new CubicCurveTo(  225.8,368.3,  233.2,411.2,  245.3,426.2  );
        CubicCurveTo crv104 = new CubicCurveTo(   259.8,444,  276.4,450.5,  283.4,455.2   );
        CubicCurveTo crv105 = new CubicCurveTo( 290.4,460,  300.4,470.3,  315.2,469.9    );
        CubicCurveTo crv106 = new CubicCurveTo( 337.4,469.2,  333,464.3,  346.4,459.5    );
        CubicCurveTo crv107 = new CubicCurveTo( 359.6,454.8,  379.1,449,  394.9,434.5    );
        CubicCurveTo crv108 = new CubicCurveTo( 415.3,415.8,  420.8,396.7,  422.8,376.9  );
        CubicCurveTo crv109 = new CubicCurveTo(  424.8,357,  425.3,331.8,  428.9,317.2   );
        CubicCurveTo crv1010 = new CubicCurveTo( 432.5,302.5,  439.7,282,  439.9,272.3   );
        CubicCurveTo crv1011 = new CubicCurveTo( 440.1,262.6,  439.7,233.7,  439.7,233.7 );

        path10.getElements().add(moveTo10); // Go to Start
        path10.getElements().add(crv101); // 
        path10.getElements().add(crv102); //
        path10.getElements().add(crv103); // 
        path10.getElements().add(crv104); //
        path10.getElements().add(crv105); // 
        path10.getElements().add(crv106); //
        path10.getElements().add(crv107); // 
        path10.getElements().add(crv108); //
        path10.getElements().add(crv109); // 
        path10.getElements().add(crv1010); // 
        path10.getElements().add(crv1011); //        
        path10.setStroke(Color.GREY);
        path10.setStrokeWidth(5);

        group.getChildren().addAll(path1, path2, path3, path4, path5, path6, path7, path8, path9,  path10); 
//***********************************************************************************

          stage.show();
     }
       
}
