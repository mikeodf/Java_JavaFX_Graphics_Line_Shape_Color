// PasswordFieldSimplest.java
/*
A keyboard entered password is compared with a password embedded in the code.
Note that this is a very weak way to do passwords.
 
Constructor:
PasswordField()

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class PasswordFieldSimplest extends Application 
{
  final Label message = new Label("");

  public void start(Stage stage) 
  {
    Group root = new Group();   
    VBox vb = new VBox();
    HBox hb = new HBox();

    Label label = new Label("Password");
    final PasswordField pb = new PasswordField();

    // Event handler.
    pb.setOnAction(new EventHandler<ActionEvent>() 
    {
      public void handle(ActionEvent e)
      {
        if (!pb.getText().equals("abcd")) // "abcd" is the password.
        {
          message.setText("Your password is incorrect!");
          message.setTextFill(Color.web("red"));
        } else 
          {
          message.setText("Your password has been confirmed");
          message.setTextFill(Color.web("black"));
          }
        pb.setText("");
      }
    });

    hb.getChildren().addAll(label, pb);
    vb.getChildren().addAll(hb, message);
 
    Scene scene = new Scene(root, 260, 80);
    stage.setScene(scene);
    stage.setTitle("Password Field Demonstration");
    scene.setRoot(vb);
    stage.show();
  }

}
