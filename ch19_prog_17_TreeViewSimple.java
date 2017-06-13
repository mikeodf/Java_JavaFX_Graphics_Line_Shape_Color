// TreeViewSimple.java
/*
Note that the arrow keys on the keyboard toggle the choices.
Constructor
TreeView(TreeItem<T> root)
Creates a TreeView with the provided root node.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;

public class TreeViewSimple extends Application {

  public void start(Stage primaryStage)
  {
     TreeItem<String> rootItem = new TreeItem<>("Root");
    rootItem.setExpanded(true);

    TreeItem<String> item = new TreeItem<>("A");
    rootItem.getChildren().add(item);
    
    item = new TreeItem<>("B");
    rootItem.getChildren().add(item);

    TreeView<String> tree = new TreeView<>(rootItem);
    StackPane root = new StackPane();
    root.getChildren().add(tree);
    primaryStage.setScene(new Scene(root, 300, 250));
    primaryStage.show();
  }
}
