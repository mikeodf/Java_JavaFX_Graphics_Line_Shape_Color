// groupSceneStages1.java
/*
Group
A Group node contains the list of visible graphic children.
They are rendered in sequence (as written in the java code) whenever this parent node is rendered.

Program structure:
1. The program (application) is for display of graphics and is therefore establishes a Stage, called primaryStage.
2. We have a single graphic node or object which is  a label, called label1.
3. label1 is the child of a root node which is a Group, called rootGroup1.
4. A Scene is created, called scene1
5. scene1 is set up to appear on primaryStage.

The curtains open with the execution of  primaryStage.show(); and the spotlight shines on label1.
The application must specify the root node for the group.

Stage.
The JavaFX Stage class is the top level JavaFX container. 
The primary Stage is constructed by the platform. 
Additional Stage objects may be constructed by the application.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.paint.*;

public class groupSceneStage1 extends Application {

    public void start(Stage primaryStage) // 1. A Stage is needed for a graphic display.
       {
        primaryStage.setTitle("A Stage containing a scene");     
        Group rootGroup1 = new Group(); //2. Make a root node, the parent of children nodes.

        Label label1 = new Label("A single graphic node destined\n to appear in scene1.");
        rootGroup1.getChildren().add(label1);

        Scene scene1 = new Scene(rootGroup1, 300, 60, Color.LIGHTBLUE);  
        primaryStage.setScene(scene1);       
        primaryStage.show();
        }  
}
