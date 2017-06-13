// SelectFileChooser1.java
/*
Open a folder and select a file.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.FileChooser;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.scene.control.Button;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import java.io.File;

public class SelectFileChooser1 extends Application 
{
	private Text actionStatus;
       
	public void start(Stage stage) 
        {
		Button button1 = new Button("Choose a file from the open folder.");
		button1.setOnAction(new SingleFcButtonListener());
		HBox buttonHb1 = new HBox(10);
		buttonHb1.getChildren().addAll(button1);

		actionStatus = new Text(); // Status message: file selected.

		VBox vbox = new VBox(30);
		vbox.getChildren().addAll(buttonHb1, actionStatus);

		Scene scene = new Scene(vbox, 300, 100); 
                stage.setTitle("File Chooser");
		stage.setScene(scene);
		stage.show();
	}

	private class SingleFcButtonListener implements EventHandler<ActionEvent> 
        {
		public void handle(ActionEvent e) 
                {
			showSingleFileChooser();
		}
	}

	private void showSingleFileChooser() 
        {	
		FileChooser fileChooser = new FileChooser();
		File selectedFile = fileChooser.showOpenDialog(null);

		if (selectedFile != null) 
                {
			actionStatus.setText("File selected: " + selectedFile.getName());
		}
		else 
                {
			actionStatus.setText("File selection cancelled.");
		}
	}
        
}
