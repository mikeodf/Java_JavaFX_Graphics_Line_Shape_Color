// TextShowFonts2.java
/*
Inspect the appearance of fonts.
Note that a "null" font gives us a visually acceptable default font.
-----------------------------------
Lunas handwriting.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine
*/
import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.paint.Color; 
import javafx.stage.Stage; 
import javafx.scene.text.Font; 
import javafx.scene.text.FontPosture; 
import javafx.scene.text.FontWeight; 
import javafx.scene.text.Text; 

public class TextShowFonts3 extends Application
{ 

   public void start(Stage stage) 
   { 
/*
{"Abyssinica SIL","American Brewery Rough Demo","Beautiful Every Time","Carnivalee Freakshow","Christmas Season",
"Circus","Colored Crayons","DK Cool Crayon","
DejaVu Sans","DejaVu Sans Condensed","DejaVu Sans Light","DejaVu Sans Mono","DejaVu Serif","DejaVu Serif Condensed",
"Droid Arabic Kufi","Droid Arabic Naskh","Droid Naskh Shift Alt","Droid Sans","Droid Sans Arabic",
"Droid Sans Armenian","Droid Sans Ethiopic","Droid Sans Fallback","Droid Sans Georgian","Droid Sans Hebrew",
"Droid Sans Japanese","Droid Sans Mono","Droid Serif",

"FreeMono","FreeSans","FreeSerif","Garuda","KacstArt","KacstBook","KacstDecorative",
"KacstDigital","KacstFarsi","KacstLetter","KacstNaskh","KacstOffice","KacstOne","KacstPen",
"KacstPoster","KacstQurn","KacstScreen","KacstTitle","KacstTitleL",
"Kedage","Khmer OS","Khmer OS System","Kinnari","LKLUG",

"Laksaman","Liberation Mono","Liberation Sans","Liberation Sans Narrow","Liberation Serif",
"Little Lord Fontleroy NF","Lohit Bengali","Lohit Devanagari","Lohit Gujarati","Lohit Punjabi","Lohit Tamil",
"Loma","Lucida Bright","Lucida Sans","Lucida Sans Typewriter","Luna's Handwriting ","Mallige",

"MathJax_AMS",
"MathJax_Caligraphic","MathJax_Fraktur","MathJax_Main","MathJax_Math","MathJax_SansSerif","MathJax_Script",
"MathJax_Size1","MathJax_Size2","MathJax_Size3","MathJax_Size4","MathJax_Typewriter","MathJax_WinChrome",
"MathJax_WinIE6","Meera","Monospaced","Mukti Narrow","My Hands are Holding You",

"NanumBarunGothic","NanumGothic",
"NanumMyeongjo","Norasi","OpenSymbol","Padauk","Padauk Book","Phetsarath OT","Pothana2000","Purisa","Rachana",
"Rekha","Romantiques","STIX","STIX Math","STIXGeneral","STIXIntegralsD","STIXIntegralsSm","STIXIntegralsUp",
"STIXIntegralsUpD","STIXIntegralsUpSm","STIXNonUnicode","STIXSizeFiveSym","STIXSizeFourSym","STIXSizeOneSym",
"STIXSizeThreeSym","STIXSizeTwoSym","STIXVariants","Saab","SansSerif","Sawasdee","Serif","Symbola","System",


"TakaoPGothic","Tibetan Machine Uni","Tlwg Typist","Tlwg Typo","TlwgMono","TlwgTypewriter","UNIVERSAL-COLLEGE",
"Ubuntu","Ubuntu Condensed","Ubuntu Light","Ubuntu Mono","Umpush","Vemana2000",
"Victorian Parlor Vintage Alternate_free","Waree"," cmex10","cmmi10","cmr10","cmsy10","esint10","eufm10", 
"gargi","mry_KacstQurn","msam10","msbm10","rsfs10","stmary10","utkal","wasy10"}  
   

      String[] textArray = {"The Quick Brown Fox Jumps Over The Lazy Dog","Droid Arabic Kufi","Droid Arabic Naskh","Droid Naskh Shift Alt","Droid Sans","Droid Sans Arabic",
"Droid Sans Armenian","Droid Sans Ethiopic","Droid Sans Fallback","Droid Sans Georgian","Droid Sans Hebrew",
"Droid Sans Japanese","Droid Sans Mono","Droid Serif"} ;

      String[] textArray = {"FreeMono","FreeSans","FreeSerif","Garuda","KacstArt","KacstBook","KacstDecorative",
"KacstDigital","KacstFarsi","KacstLetter","KacstNaskh","KacstOffice","KacstOne","KacstPen",
"KacstPoster","KacstQurn","KacstScreen","KacstTitle","KacstTitleL",
"Kedage","Khmer OS","Khmer OS System","Kinnari","LKLUG"} ;
*/
      String[] textArray = {"FreeMono","FreeSans","FreeSerif","Garuda","KacstArt","KacstBook","KacstDecorative",
"KacstDigital","KacstFarsi","KacstLetter","KacstNaskh","KacstOffice","KacstOne","KacstPen",
"KacstPoster","KacstQurn","KacstScreen","KacstTitle","KacstTitleL",
"Kedage","Khmer OS","Khmer OS System","Kinnari","LKLUG","Laksaman","Liberation Mono","Liberation Sans","Liberation Sans Narrow","Liberation Serif",
"Little Lord Fontleroy NF","Lohit Bengali","Lohit Devanagari","Lohit Gujarati","Lohit Punjabi","Lohit Tamil",
"Loma","Lucida Bright","Lucida Sans","Lucida Sans Typewriter","Luna's Handwriting ","Mallige"} ;
/*
      // Some interesting ones here.
      String[] textArray = {"MathJax_AMS",
"MathJax_Caligraphic","MathJax_Fraktur","MathJax_Main","MathJax_Math","MathJax_SansSerif","MathJax_Script",
"MathJax_Size1","MathJax_Size2","MathJax_Size3","MathJax_Size4","MathJax_Typewriter","MathJax_WinChrome",
"MathJax_WinIE6","Meera","Monospaced","Mukti Narrow","My Hands are Holding You"} ;
/*
// Romantiques      
String[] textArray = {"NanumBarunGothic","NanumGothic",
"NanumMyeongjo","Norasi","OpenSymbol","Padauk","Padauk Book","Phetsarath OT","Pothana2000","Purisa","Rachana",
"Rekha","Romantiques","STIX","STIX Math","STIXGeneral","STIXIntegralsD","STIXIntegralsSm","STIXIntegralsUp",
"STIXIntegralsUpD","STIXIntegralsUpSm","STIXNonUnicode","STIXSizeFiveSym","STIXSizeFourSym","STIXSizeOneSym",
"STIXSizeThreeSym","STIXSizeTwoSym","STIXVariants","Saab","SansSerif","Sawasdee","Serif","Symbola","System"} ;

String[] textArray = {"NanumBarunGothic","NanumGothic",
"NanumMyeongjo","Norasi","OpenSymbol","Padauk","Padauk Book","Phetsarath OT","Pothana2000","Purisa","Rachana",
"Rekha","Romantiques","STIX","STIX Math","STIXGeneral","STIXIntegralsD","STIXIntegralsSm","STIXIntegralsUp",
"STIXIntegralsUpD","STIXIntegralsUpSm","STIXNonUnicode","STIXSizeFiveSym","STIXSizeFourSym","STIXSizeOneSym",
"STIXSizeThreeSym","STIXSizeTwoSym","STIXVariants","Saab","SansSerif","Sawasdee","Serif","Symbola","System"} ;


// Some interesting 0nes
String[] textArray = {"TakaoPGothic","Tibetan Machine Uni","Tlwg Typist","Tlwg Typo","TlwgMono","TlwgTypewriter","UNIVERSAL-COLLEGE",
"Ubuntu","Ubuntu Condensed","Ubuntu Light","Ubuntu Mono","Umpush","Vemana2000",
"Victorian Parlor Vintage Alternate_free","Waree"," cmex10","cmmi10","cmr10","cmsy10","esint10","eufm10", 
"gargi","mry_KacstQurn","msam10","msbm10","rsfs10","stmary10","utkal","wasy10" };
*/
      String font = "  font =  ";

      Group root = new Group() ;
      System.out.println("textArray.length: " + textArray.length );  // Checking on length of array.

      // Because our text objects are arrays we can process large numbers of objects compactly.
      Text[] txt = new Text[textArray.length]; 

      for (int i=0 ; i<(textArray.length)-1 ; i++)
      {  txt[i] =  new Text(font  + textArray[i+1] + " :: " + textArray[0] ); 
         txt[i].setFont(Font.font(textArray[i+1], 20));  
         txt[i].setY((i+1)*20); 
         root.getChildren().add(txt[i]);  
      } ; 
          
      Scene scene = new Scene(root, 1000,900);      
      stage.setTitle("A display of some interesting fonts.");       
      stage.setScene(scene);                        
      stage.show();                             
   }      
}      
