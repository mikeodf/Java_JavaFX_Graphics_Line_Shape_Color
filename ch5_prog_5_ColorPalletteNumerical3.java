// ColorPalletteNumerical3.java
/*
A reasonably compact color pallette of Primary and
intermediate colors in four levels of brightness.
The numerical values of each color channel are shown.

Tested on: java version "java-8-oracle"
Author:Mike Ohlson de Fine 
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import java.lang.reflect.Array; 

import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class ColorPalletteNumerical3 extends Application 
{
    public void start(Stage stage) 
    {
        Group root = new Group();

/*
Transparency can be added to a color by including an additional parameter 
defining the transparency in the range [0.0-1.0]

Key Variables
^^^^^^^^^^^^^^^^
red The RGB red value in the range [0.0-1.0]
green The RGB green value in the range [0.0-1.0]
blue The RGB blue value in the range [0.0-1.0]
opacity The transparency of the color in the range [0.0-1.0]
*/

// Handy Colors - numerical specification.
double[] Red1 = {  1, .75, .75 };// Pale 
double[] Red2 = {  1, .36, .36 };// Light
double[] Red3 = {  1,   0,   0 };// Saturated
double[] Red4 = {.25,   0,   0 };// Dark

double[] Orange1 = {  1, .84, .7 };//2
double[] Orange2 = {  1, .66, .38 };
double[] Orange3 = {  1, .45, .0 };
double[] Orange4 = {.31, .14, .0 };

double[] Yellow1 = {   1, .99, .79 };//3
double[] Yellow2 = {   1, .97, .38 };
double[] Yellow3 = {   1, .96, 0 };
double[] Yellow4 = { .31, .30, 0 };

double[] Olive1 = { .95, 1, .75 };//4
double[] Olive2 = { .82, 1, .33 };
double[] Olive3 = { .73, .98, 0 };
double[] Olive4 = { .17, .2, 0};

double[] LimeGreen1 = { .92,   1, .76 };//5
double[] LimeGreen2 = { .78,   1, .35 };
double[] LimeGreen3 = { .66,   1, 0 };
double[] LimeGreen4 = { .11, .16, .0 };

double[] Green1 = {.71,  1, .68 };//6
double[] Green2 = {.35,  1, .35 };
double[] Green3 = { .1, .9,  0 };
double[] Green4 = { 0,  .3,  0 };

double[] Forest1 = {.74,  1, .9 };//7
double[] Forest2 = {.32,  1, .7 };
double[] Forest3 = { 0,  .9,  .52 };
double[] Forest4 = { 0, .13,  0.1 };


double[] PastelBlue1 = {.68,  1, 1 };//8
double[] PastelBlue2 = {.35,  1, 1 };
double[] PastelBlue3 = { 0, .72, .75 };
double[] PastelBlue4 = { 0, .15, .15 };

double[] SkyBlue1 = { .78, .98,  1 };//9
double[] SkyBlue2 = { .33, .87,  1 };
double[] SkyBlue3 = {   0, .47, .83 };
double[] SkyBlue4 = {   0,  .1, .2 };

double[] Blue1 = {  .8, .86,   1 };//10
double[] Blue2 = { .43,  .6,   1 };
double[] Blue3 = {  .4, .31,   1 };
double[] Blue4 = {   0, .05, .15 };

double[] DeepPurple1 = { .87, .83,   1 }; // 11
double[] DeepPurple2 = { .57, .44,   1 }; 
double[] DeepPurple3 = { .22,   0, .89 }; 
double[] DeepPurple4 = {   0,   0, .2 };

double[] Purple1 = { .9, .82,  1 };//12
double[] Purple2 = { .7, .43,  1 };
double[] Purple3 = {.49,   0,  1 };
double[] Purple4 = { .1,   0, .2 };

double[] Violet1 = { .95, .82,   1 };//13
double[] Violet2 = {  .8, .38, .98 };
double[] Violet3 = { .64,   0, .94 };
double[] Violet4 = { .13,  .0,  .2 };

double[] PalePink1 = {  1, .81, .94 };//14
double[] PalePink2 = {  1, .37, .80 };
double[] PalePink3 = {.98,   0, .68 };
double[] PalePink4 = { .21,  .0, .1 };

double[] DeepPink1 = {  1, .84, .91 };//15
double[] DeepPink2 = {  1, .34, .63 };
double[] DeepPink3 = {.93,   0, .41 };
double[] DeepPink4 = {.22,   0, .1 };

double[] FireRed1 = {   1, .86,  .9 };//16
double[] FireRed2 = {   1,  .4, .55 };
double[] FireRed3 = { .98,   0, .25 };
double[] FireRed4 = { .25,   0, .0};

/* Arbitrary names. The important thing is to be able to assemble the array
called "pallette1" through which each color can be accessed using the integer
indices of the pallette1 array.
*/
double[][] yellow_pure   = { Yellow1, Yellow2, Yellow3, Yellow4 }; 
double[][] lime_green    = { LimeGreen1, LimeGreen2, LimeGreen3, LimeGreen4 };
double[][] green_green   = { Green1, Green2, Green3, Green4 }; 
double[][] forest_green   = { Forest1, Forest2, Forest3,Forest4 }; 
double[][] pastel_blue   = { PastelBlue1, PastelBlue2, PastelBlue3, PastelBlue4 }; 
double[][] sky_blue      = { SkyBlue1, SkyBlue2, SkyBlue3, SkyBlue4 }; 
double[][] blue_blue     = { Blue1, Blue2, Blue3, Blue4 };
double[][] deep_purple   = { DeepPurple1, DeepPurple2, DeepPurple3, DeepPurple4 }; 
double[][] purple_purple = { Purple1, Purple2, Purple3, Purple4 }; 
double[][] violet_violet = { Violet1, Violet2, Violet3, Violet4 }; 
double[][] pale_pink     = { PalePink1, PalePink2, PalePink3, PalePink4 };
double[][] deep_pink     = { DeepPink1, DeepPink2, DeepPink3, DeepPink4 }; 
double[][] fire_red      = { FireRed1, FireRed2, FireRed3, FireRed4 }; 
double[][] red_red       = { Red1, Red2, Red3, Red4 }; 
double[][] orange_red    = { Orange1, Orange2, Orange3, Orange4 };

// Assemble the 3-dimensional color pallette.
double[][][] pallette1 = { yellow_pure, lime_green, green_green, forest_green, pastel_blue,
sky_blue, blue_blue, deep_purple,  purple_purple, violet_violet, pale_pink, deep_pink, 
fire_red, red_red, orange_red };

           double xx, yy, ww, hh, gap, txtOffset ;
           xx = 10;
           yy = 10;
           ww = 110;
           hh = 180;
           gap = 0;
           txtOffset = 10 ;
           int num_colors = Array.getLength(pallette1) ; 

           for (int j=0; j< num_colors; j++)
           {

               yy = 10;
               for(int i=0; i<4; i++)
               {   
                   String str1 = String.valueOf(pallette1[j][i][0]) ;
                   String str2 = String.valueOf(pallette1[j][i][1]) ;
                   String str3 = String.valueOf(pallette1[j][i][2]) ;

                   Text txt1 = new Text(xx-txtOffset, yy+80, str1 + " |" + str2 + " |" + str3);
                   txt1.setRotate(60); // angle the text to fit inside the color swatch.
                   if (i==0 || i==1 || i==2) txt1.setFill(Color.BLACK); // For light colored swatches.
                   if (i==3) txt1.setFill(Color.WHITE);          // For dark colored swatches.   
                   txt1.setFont(Font.font(java.awt.Font.MONOSPACED, FontWeight.BOLD, 16));

                   Rectangle rect = new Rectangle(xx,yy,ww,hh);
                   yy += hh + gap ;
                   Color kula = Color.color(pallette1[j][i][0], 
                                            pallette1[j][i][1], 
                                            pallette1[j][i][2]);
                   rect.setFill(kula);
                   root.getChildren().add(rect); 
                   root.getChildren().add(txt1);
               }
               xx += ww;  
           }

        Scene scene = new Scene(root, 1680, 740, Color.BLACK);
        stage.setTitle("Numerical Color Palette: Red|Green|Blue values in the range 0 to 1,  JavaFX");
        stage.setScene(scene);
        stage.show();
   }      
}


