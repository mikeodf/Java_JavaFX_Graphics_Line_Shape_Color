// ComboBoxSimplest.java
/*
The default menu.
Note that the arrow keys on the keyboard toggle the choices.
Constructor
ComboBox(ObservableList<T> items)
Creates a default ComboBox instance with the provided items list and a default selection model.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
public class ComboBoxSimplest extends Application 
{

  public void start(Stage stage) 
  {
    Scene scene = new Scene(new Group(), 450, 250);

    ComboBox<String> myComboBox = new ComboBox<String>();
    myComboBox.getItems().addAll("Cat","Dog","Mouse","Elephant","Ferret");
    myComboBox.setEditable(true);        
    
    Group root = (Group) scene.getRoot();
    root.getChildren().add(myComboBox);
    stage.setScene(scene);
    stage.show();

  }
}

