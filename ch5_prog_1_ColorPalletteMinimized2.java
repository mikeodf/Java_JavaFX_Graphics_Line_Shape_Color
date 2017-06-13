// ColorPalletteMinimized2.java
/*
An array of rectangular Color samples arranged by hue.

Tested on: java version "java-8-oracle"
Author:Mike Ohlson de Fine 
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;

import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class ColorPalletteMinimized2 extends Application 
{
    public void start(Stage stage) 
    {
        Group root = new Group();

// Reds
 Color[] colorRed =
    {
       
       Color.PALEVIOLETRED, 
       Color.LIGHTCORAL, 
       Color.RED,     
       Color.CRIMSON, 
       Color.DARKRED, 
       Color.TOMATO,
       Color.FIREBRICK,    
    };

String[] NameReds =
    {
       "PALEVIOLETRED", 
       "LIGHTCORAL", 
       "RED",     
       "CRIMSON",   
       "DARKRED",
       "TOMATO",
       "FIREBRICK",    
    };

// Pinkss
 Color[] colorPink =
    {
       Color.MISTYROSE,  
       Color.PINK,
       Color.DEEPPINK, 
       Color.HOTPINK,
       Color.MEDIUMVIOLETRED,
    };

String[] NamePinks =
    {
       "MISTYROSE",     
       "PINK",
       "DEEPPINK", 
       "HOTPINK",
       "MEDIUMVIOLETRED"
    };

// Greens
Color[] colorGreen =
    {
      Color.GREENYELLOW,      
      Color.LAWNGREEN, 
      Color.SPRINGGREEN,
      Color.LIME, 
      Color.LIMEGREEN, 
      Color.FORESTGREEN, 
      Color.GREEN, 
      Color.SEAGREEN,       
    };

String[] NameGreens =  
    {     
      "GREENYELLOW", 
      "LAWNGREEN", 
      "SPRINGGREEN", 
      "LIME", 
      "LIMEGREEN",   
      "FORESTGREEN", 
      "GREEN", 
      "SEAGREEN",       
    };

// Yellows
 Color[] colorYellow =
    {
     Color.LIGHTYELLOW, 
     Color.KHAKI, 
     Color.YELLOW, 
     Color.GOLD, 
     Color.GOLDENROD, 
     Color.DARKGOLDENROD,
     Color.ORANGE, 
     Color.DARKORANGE,
     Color.ORANGERED,    
    };
String[] NameYellows =  
    {
      "LIGHTYELLOW", 
      "KHAKI",
      "YELLOW", 
      "GOLD", 
      "GOLDENROD", 
      "DARKGOLDENROD", 
      "ORANGE", 
      "DARKORANGE",
      "ORANGERED",    
    };


// Blues
 Color[] colorBlue =
    {
     Color.AZURE, 
     Color.POWDERBLUE, 
     Color.DEEPSKYBLUE, 
     Color.DODGERBLUE,
     Color.BLUE, 
     Color.MEDIUMBLUE, 
     Color.DARKBLUE,
     Color.MIDNIGHTBLUE, 
      } ;

String[] NameBlues =  
    {
     "AZURE",  
     "POWDERBLUE", 
     "DEEPSKYBLUE", 
     "DODGERBLUE",
     "BLUE", 
     "MEDIUMBLUE", 
     "DARKBLUE",
     "MIDNIGHTBLUE", 
    };

// Cyans
 Color[] colorCyan =
    {
     Color.LIGHTCYAN, 
     Color.PALETURQUOISE, 
     Color.CYAN, 
     Color.TURQUOISE,
     Color.DARKTURQUOISE, 
     Color.TEAL,  
     };

String[] NameCyans =  
    {
     "LIGHTCYAN", 
     "PALETURQUOISE", 
     "CYAN", 
     "TURQUOISE", 
     "DARKTURQUOISE",    
     "TEAL",  
    };

// Voilets
 Color[] colorViolet =
    {
     Color.LAVENDERBLUSH, 
     Color.MEDIUMORCHID, 
     Color.DARKVIOLET,
     Color.DARKMAGENTA, 
     Color.PURPLE,
     Color.INDIGO,  
     };

String[] NameViolets =  
    {
      "LAVENDERBLUSH", 
      "MEDIUMORCHID", 
      "DARKVIOLET",
      "DARKMAGENTA", 
      "PURPLE",
      "INDIGO",  
    };

// Browns
Color[] colorBrown =
    {
    Color.BEIGE,   
    Color.WHEAT, 
    Color.BURLYWOOD, 
    Color.PERU, 
    Color.SIENNA,  
    Color.SADDLEBROWN, 
    Color.BROWN,
    };

String[] NameBrowns =  
    {
     "BEIGE", 
     "WHEAT", 
     "BURLYWOOD",
     "PERU", 
     "SIENNA",  
     "SADDLEBROWN", 
     "BROWN",
    };

// Greys
Color[] colorGrey =  
    {
     Color.LIGHTGREY, 
     Color.SILVER, 
     Color.DARKGREY,   
     Color.GREY, 
     Color.DIMGRAY, 
     Color.SLATEGREY, 
     Color.DARKSLATEGREY,
     Color.BLACK, 
    };

String[] NameGreys =  
    {
     "LIGHTGREY", 
     "SILVER", 
     "DARKGREY",   
     "GREY", 
     "DIMGRAY", 
     "SLATEGREY", 
     "DARKSLATEGREY",
     "BLACK" 
    };

    int colorGreyLen = colorGrey.length ;
    int colorBrownLen = colorBrown.length ;
    int colorVioletLen = colorViolet.length ;
    int colorCyanLen = colorCyan.length ;
    int colorBlueLen = colorBlue.length ;
    int colorYellowLen = colorYellow.length ;
    int colorGreenLen = colorGreen.length ;
    int colorRedLen = colorRed.length ;
    int colorPinkLen = colorPink.length ;

    System.out.println("Length of colorGrey " + colorGreyLen);  
           double xx, yy, ww, hh, gap, txtOffset ;
           xx = 10;
           yy = 10;
           ww = 134;
           hh = 30;
           gap = 2;
           txtOffset = 4 ;
               for(int i=0; i<colorGrey.length; i++)
               {
                   Text txt1 = new Text(xx+txtOffset, yy+20, NameGreys[i]);
                   txt1.setFill(Color.BLACK);
                   txt1.setFont(Font.font(java.awt.Font.MONOSPACED, FontWeight.BOLD, 14));

                   Rectangle rect = new Rectangle(xx,yy,ww,hh);
                   yy += hh + gap ;
                   rect.setFill(colorGrey[i]);
                   root.getChildren().add(rect); 
                   root.getChildren().add(txt1);

               }

        xx += ww + gap ;  
        yy = 10;
        System.out.println("Length of colorBrown " + colorBrownLen);         
               for(int i=0; i<colorBrown.length; i++)
               {
                   Text txt1 = new Text(xx+txtOffset, yy+20, NameBrowns[i]);
                   txt1.setFill(Color.BLACK);
                   txt1.setFont(Font.font(java.awt.Font.MONOSPACED, FontWeight.BOLD, 14));

                   Rectangle rect = new Rectangle(xx,yy,ww,hh);
                   yy += hh + gap ;
                   rect.setFill(colorBrown[i]);
                   root.getChildren().add(rect);  
                   root.getChildren().add(txt1);
               }   

        xx += ww + gap ;  
        yy = 10;
        System.out.println("Length of colorRed " + colorRedLen);          
               for(int i=0; i<colorRed.length; i++)
               {
                   Text txt1 = new Text(xx+txtOffset, yy+20, NameReds[i]);
                   txt1.setFill(Color.BLACK);
                   txt1.setFont(Font.font(java.awt.Font.MONOSPACED, FontWeight.BOLD, 14));

                   Rectangle rect = new Rectangle(xx,yy,ww,hh);
                   yy += hh + gap ;
                   rect.setFill(colorRed[i]);
                   root.getChildren().add(rect); 
                   root.getChildren().add(txt1);   
               }  

       xx += ww + gap ;  
        yy = 10;
        System.out.println("Length of colorPink " + colorPinkLen);         
               for(int i=0; i<colorPink.length; i++)
               {
                   Text txt1 = new Text(xx+txtOffset, yy+20, NamePinks[i]);
                   txt1.setFill(Color.BLACK);
                   txt1.setFont(Font.font(java.awt.Font.MONOSPACED, FontWeight.BOLD, 14));

                   Rectangle rect = new Rectangle(xx,yy,ww,hh);
                   yy += hh + gap ;
                   rect.setFill(colorPink[i]);
                   root.getChildren().add(rect); 
                   root.getChildren().add(txt1);   
               }  
  
        xx += ww + gap ;  
        yy = 10;
        System.out.println("Length of colorGreen " + colorGreenLen);          
               for(int i=0; i<colorGreen.length; i++)
               {
                   Text txt1 = new Text(xx+txtOffset, yy+20, NameGreens[i]);
                   txt1.setFill(Color.BLACK);
                   txt1.setFont(Font.font(java.awt.Font.MONOSPACED, FontWeight.BOLD, 14));

                   Rectangle rect = new Rectangle(xx,yy,ww,hh);
                   yy += hh + gap ;
                   rect.setFill(colorGreen[i]);
                   root.getChildren().add(rect);
                   root.getChildren().add(txt1);    
               }   

        xx += ww + gap ;  
        yy = 10;
        System.out.println("Length of colorBlue " + colorBlueLen);          
               for(int i=0; i<colorBlue.length; i++)
               {
                   Text txt1 = new Text(xx+txtOffset, yy+20, NameBlues[i]);
                   txt1.setFill(Color.BLACK);
                   txt1.setFont(Font.font(java.awt.Font.MONOSPACED, FontWeight.BOLD, 14));

                   Rectangle rect = new Rectangle(xx,yy,ww,hh);
                   yy += hh + gap ;
                   rect.setFill(colorBlue[i]);
                   root.getChildren().add(rect);  
                   root.getChildren().add(txt1);
               } 

               xx += ww + gap ;  
               yy = 10;
               System.out.println("Length of colorYellow " + colorYellowLen);                   
               for(int i=0; i<colorYellow.length; i++)
               {
                   Text txt1 = new Text(xx+txtOffset, yy+20, NameYellows[i]);
                   txt1.setFill(Color.BLACK);
                   txt1.setFont(Font.font(java.awt.Font.MONOSPACED, FontWeight.BOLD, 14));

                   Rectangle rect = new Rectangle(xx,yy,ww,hh);
                   yy += hh + gap ;
                   rect.setFill(colorYellow[i]);
                   root.getChildren().add(rect);  
                  root.getChildren().add(txt1);
               } 

        xx += ww + gap ;  
        yy = 10;
        System.out.println("Length of colorViolet " + colorVioletLen);         
               for(int i=0; i<colorViolet.length; i++)
               {
                   Text txt1 = new Text(xx+txtOffset, yy+20, NameViolets[i]);
                   txt1.setFill(Color.BLACK);
                   txt1.setFont(Font.font(java.awt.Font.MONOSPACED, FontWeight.BOLD, 14));

                   Rectangle rect = new Rectangle(xx,yy,ww,hh);
                   yy += hh + gap ;
                   rect.setFill(colorViolet[i]);
                   root.getChildren().add(rect); 
                  root.getChildren().add(txt1); 
               } 

        xx += ww + gap ;  
        yy = 10;
        System.out.println("Length of colorCyan " + colorCyanLen);         
               for(int i=0; i<colorCyan.length; i++)
               {
                   Text txt1 = new Text(xx+txtOffset, yy+20, NameCyans[i]);
                   txt1.setFill(Color.BLACK);
                   txt1.setFont(Font.font(java.awt.Font.MONOSPACED, FontWeight.BOLD, 14));

                   Rectangle rect = new Rectangle(xx,yy,ww,hh);
                   yy += hh + gap ;
                   rect.setFill(colorCyan[i]);
                   root.getChildren().add(rect);  
                   root.getChildren().add(txt1); 
               } 

       Scene scene = new Scene(root, 1240, 320, Color.BLACK);
        stage.setTitle("A Reduced set of Color tiles, JavaFX");
        stage.setScene(scene);
        stage.show();
   }   
    
}


