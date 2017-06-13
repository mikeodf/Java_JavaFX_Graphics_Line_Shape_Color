// LineLady2.java
/*
Line : javafx.scene.shape.Line
-------------------------------------
This is a drawing composed of 81 straight lines.
The objective is to have suitable, compact code to
encapsulate complex drawings.

The line segments were produced from a drawing in Inkscape.
The SVG paths were converted to line segments using inkscape2python.

Constructor:
a) Line(startX, startY, endX, endY) ;

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine 
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;

public class LineLady2 extends Application {

    public void start(Stage stage) 
    {      
           Group root = new Group();
                
            /* The 1-dimensional arrays of the positions of independent line segments
               making up each straight line segment of the drawing.*/   
           // 1- 10  
           double[] xy1 = {84.7, 127.3, 67.3, 134.6};
           double[] xy2 = {69.0, 135.7, 53.3, 168.7};
           double[] xy3 = {53.6, 170.9, 124.9, 314.6};
           double[] xy4 = {93.1, 255.1, 91.9, 277.8};
           double[] xy5 = {93.3, 279.7, 137.8, 352.9};
           double[] xy6 = {130.0, 343.7, 132.7, 380.3};
           double[] xy7 = {130.5, 375.8, 138.6, 387.0};
           double[] xy8 = {143.9, 386.5, 157.4, 387.1};
           double[] xy9 = {160.7, 385.7, 147.9, 376.1};
           double[] xy10 = {148.4, 384.0, 132.5, 320.2};

           // 11- 20  
           double[] xy11   =  {112.1, 254.8, 109.3, 278.6};
           double[] xy12   =  {110.7, 276.6, 137.5, 350.7};
           double[] xy13   =  {90.8, 160.6, 117.1, 281.1};
           double[] xy14   =  {110.9, 266.8, 119.9, 285.5};
           double[] xy15   =  {119.6, 286.7, 138.6, 347.};
           double[] xy16   =  {64.3, 199.7, 57.3, 218.2};
           double[] xy17   =  {57.3, 218.2, 31.0, 242.0};
           double[] xy18   =  {29.9, 242.5, 19.8, 316.3};
           double[] xy19   =  {19.0, 293.4, 8.6, 309.6};
           double[] xy20   =  {10.3, 309.0, 22.9, 336.5};
          
           // 21- 30  
          double[] xy21   =  {24.8, 337.0, 34.3, 338.7};
          double[] xy22   =  {31.8, 339.0, 47.8, 333.9};
          double[] xy23   =  {44.7, 332.8, 29.9, 326.9};
          double[] xy24   =  {27.6, 326.7, 27.3, 293.7};
          double[] xy25   =  {24.3, 304.9, 64.5, 221.8};
          double[] xy26   =  {118.5, 148.6, 49.7, 257.6};
          double[] xy27   =  {95.3, 167.3, 115.1, 149.1};
          double[] xy28   =  {119.3, 148.3, 115.1, 135.7};
          double[] xy29   =  {111.8, 154.4, 123.5, 108.9};
          double[] xy30   =  {123.5, 108.6, 112.6, 80.1};

           // 31- 40  
          double[] xy31   =  {114.3, 82.9, 100.3, 60.8};
          double[] xy32   =  {122.5, 99.1, 126.3, 87.6};
          double[] xy33   =  {126.6, 85.4, 107.3, 68.0};
          double[] xy34   =  {112.6, 75.6, 148.1, 20.8};
          double[] xy35   =  {145.9, 17.7, 98.6, 7.9};
          double[] xy36   =  {98.4, 57.4, 136.7, 20.5};
          double[] xy37   =  {137.5, 33.6, 100.3, 9.6};
          double[] xy38   =  {102.3, 151.6, 109.8, 111.4};
          double[] xy39   =  {87.7, 130.4, 113.7, 98.2};
          double[] xy40   =  {84.7, 142.7, 87.5, 117.3};

           // 41- 50  
          double[] xy41   =  {91.1, 118.1, 57.8, 85.4};
          double[] xy42   =  {56.1, 86.2, 78.5, 58.2};
          double[] xy43   =  {56.1, 82.9, 60.1, 57.4};
          double[] xy44   =  {59.2, 52.7, 51.1, 51.0};
          double[] xy45   =  {51.4, 52.7, 56.7, 12.4};
          double[] xy46   =  {62.6, 21.6, 77.7, 4.8};
          double[] xy47   =  {65.1, 83.4, 63.1, 22.7};
          double[] xy48   =  {68.4, 73.6, 84.9, 27.5};
          double[] xy49   =  {85.8, 25.8, 80.2, 7.6};
          double[] xy50   =  {81.0, 7.1, 79.1, 5.1};

            // 51- 60  
          double[] xy51   =  {81.9, 46.2, 92.8, 61.3  };
          double[] xy52   =  { 80.2, 44.3, 97.8, 49.9 };
          double[] xy53   =  { 98.4, 49.9, 104.5, 27.8 };
          double[] xy54   =  { 104.8, 26.6, 101.7, 20.5 };
          double[] xy55   =  { 102.8, 20.5, 107.3, 16.0 };
          double[] xy56   =  { 105.1, 15.2, 95.8, 5.4 };
          double[] xy57   =  { 85.5, 19.4, 94.5, 6.5 };
          double[] xy58   =  { 93.9, 6.8, 81.6, 9.9 };
          double[] xy59   =  { 70.7, 10.2, 57.8, 14.1 };
          double[] xy60   =  { 105.4, 21.9, 95.3, 12.4 };

           // 61- 70  
          double[] xy61   =  { 83.5, 26.9, 95.3, 14.1 };
          double[] xy62   =  { 86.4, 37.3, 98.1, 38.1 };
          double[] xy63   =  { 93.3, 60.8, 89.1, 49.3 };
          double[] xy64   =  { 74.6, 54.1, 87.2, 57.7 };
          double[] xy65   =  {75.4, 58.2, 105.6, 86.5  };
          double[] xy66   =  { 107.9, 87.9, 102.8, 101.3 };
          double[] xy67   =  { 81.9, 110.8, 100.9, 100.5 };
          double[] xy68   =  { 77.1, 103.3, 82.4, 85.4 };
          double[] xy69   =  {86.9, 87.0, 72.9, 62.4  };
          double[] xy70   =  {98.4, 97.1, 83.3, 88.2  };

           // 71- 81  
          double[] xy71   =  { 88.6, 168.1, 92.8, 145.2 };
          double[] xy72   =  { 94.2, 153.9, 87.7, 131.2 };
          double[] xy73   =  { 83.8, 151.4, 102.0, 222.9 };
          double[] xy74   =  { 75.2, 133.5, 85.5, 151.6 };
          double[] xy75   =  { 67.1, 136.8, 87.5, 159.7 };
          double[] xy76   =  { 62.9, 148.3, 85.8, 164.8 };
          double[] xy77   =  { 106.5, 100.5, 89.7, 114.4 };
          double[] xy78   =  { 82.1, 128.4, 89.7, 156.9 };
          double[] xy79   =  { 93.9, 118.1, 58.9, 84.0 };
          double[] xy80   =  { 96.1, 111.1, 61.5, 82.3 };
          double[] xy81   =  {96.4, 104.9, 64.5, 77.5  };  

             /* The 2-dimensional array of the line segments
               making up the complete drawing.*/             
          double[][] xy_all = { xy1,  xy2,  xy3,  xy4 , xy5,  xy6,  xy7,  xy8 , xy9, xy10,
                                xy11, xy12, xy13, xy14, xy15, xy16, xy17, xy18, xy19, xy20,
                                xy21, xy22, xy23, xy24, xy25, xy26, xy27, xy28, xy29, xy30,
                                xy31, xy32, xy33, xy34, xy35, xy36, xy37, xy38, xy39, xy40,
                                xy41, xy42, xy43, xy44, xy45, xy46, xy47, xy48, xy49, xy50,
                                xy51, xy52, xy53, xy54, xy55, xy56, xy57, xy58, xy59, xy60,
                                xy61, xy62, xy63, xy64, xy65, xy66, xy67, xy68, xy69, xy70,
                                xy71, xy72, xy73, xy74, xy75, xy76, xy77, xy78, xy79, xy80, 
                                xy81 };
      
           for (int i =1;  i< xy_all.length; i++ )
           {
             Line line1 = new Line(xy_all[i][0], xy_all[i][1], xy_all[i][2], xy_all[i][3] );
             line1.setStrokeWidth(5.0f);                    // Width of the line, pixels.
             line1.setStrokeLineCap(StrokeLineCap.ROUND);   // Rounded ends of lines.
             line1.setStroke(Color.SILVER);                 // Color of line.
             root.getChildren().add(line1);  

             Line line2 = new Line(xy_all[i][0], xy_all[i][1], xy_all[i][2], xy_all[i][3] );
             line2.setStrokeWidth(1.0f);                  // Width of the line, pixels.
             line2.setStrokeLineCap(StrokeLineCap.ROUND); // Rounded ends of lines.
             line2.setStroke(Color.GREY);                 // Color of line.
             root.getChildren().add(line2);  
           }
                    
        Scene scene = new Scene(root, 200, 400);
        stage.setTitle("Straight Lines, JavaFX");
        stage.setScene(scene);
        stage.show();      
    }
}



