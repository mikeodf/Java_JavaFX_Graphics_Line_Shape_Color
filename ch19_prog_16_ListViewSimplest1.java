// ListViewSimplest1.java
/*
A scrollable list of items.

ListView: class:javafx.scene.control.ListView<T>
---------------------------------------

Constructors 
1. ListView()
1. ListView(listItems)

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.ListView ;
import javafx.scene.paint.Color;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ListViewSimplest1 extends Application {

  public void start(Stage stage) {
    Group root_group = new Group();
    Scene scene = new Scene(root_group, 120, 150);
    ObservableList<String> names = FXCollections.observableArrayList(
          "Peter", "Cassandra", "Suzanne", "Michael", "Astrid", "Genevieve", "Candace");
     ListView<String> listView = new ListView<String>(names);
    root_group.getChildren().add(listView);

    stage.setTitle("A ListView"); 
    stage.setScene(scene);
    stage.show();
  }
}

