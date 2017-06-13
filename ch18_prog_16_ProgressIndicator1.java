// ProgressIndicator1.java
/*
A circular control which is used for indicating progress, either infinite or indeterminate (ie.going on and on without forever) or finite. Often used for representing progress of background Tasks.
Real progress indication:
To set the amount of progress indicated by the progress indicator, you call the setProgress method, 
passing it a double value between 0.0 and 1.0. For example, to set the progress to 63 percent:
prog_bar.setProgress(0.45);

Class ProgressIndicatorr: javafx.scene.control.ProgressIndicator
------------------------------------------
Constructors:
ProgressIndicator(): A new indeterminate ProgressIndicator.
ProgressIndicator(progress_value): A new ProgressIndicator with the given progress value.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.FlowPane;


public class ProgressIndicator1 extends Application 
{
    public void start(Stage stage) 
    {
        ProgressIndicator progressIndicator = new ProgressIndicator(); 
        //progressIndicator.setProgress(0.63);   
        FlowPane root = new FlowPane();
        root.getChildren().addAll( progressIndicator);
 
        Scene scene = new Scene(root, 300, 70);
        stage.setTitle("ProgressIndicator/Throbber. ");
        stage.setScene(scene);
        stage.show();
    }
}
