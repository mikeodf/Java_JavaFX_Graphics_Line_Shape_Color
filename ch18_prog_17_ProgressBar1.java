// ProgressBar1.java
/*
An alternative to the ProgressIndicator which is represented as a horizontal bar.
It indicates progress, either infinite or indeterminate (ie.going on and on without forever) or finite. 
Often used for representing progress of background Tasks.

Class ProgressBar: avafx.scene.control.ProgressBar
------------------------------------------
Constructors:
ProgressBar(): A new indeterminate ProgressIndicator.
ProgressBar(progress_value): A new ProgressIndicator with the given progress value.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.FlowPane;

public class ProgressBar1 extends Application 
{
 
    public void start(Stage stage) 
    { 
        ProgressBar progressBar = new ProgressBar(); 
        //progressBar.setProgress(0.47);   
        FlowPane root = new FlowPane();
        root.getChildren().addAll(progressBar);
 
        Scene scene = new Scene(root, 180, 40);
        stage.setTitle("ProgressBar "); 
        stage.setScene(scene);
        stage.show();
    } 
}
