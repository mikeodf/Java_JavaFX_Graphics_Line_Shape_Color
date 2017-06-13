// ScrollBarEvent1.java
/*
Event Handling for Scrollbar

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/
import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.GridPane;

public class ScrollBarEvent1 extends Application 
{

    public void start(Stage stage) 
    {
        Group gruproot = new Group();
        Scene scene = new Scene(gruproot, 500, 200);
        stage.setScene(scene);
        
        ScrollBar skrolb1 = new ScrollBar();
        Label sliderValue = new Label( Double.toString(skrolb1.getValue()));
        GridPane grid = new GridPane();
        scene.setRoot(grid);
        //////////////////////////////////////////////////////////////////////
        ///////////   EventHandler for ScrollBar      ///////////////////////
        skrolb1.valueProperty().addListener((ObservableValue<? extends Number> ov, 
            Number old_val, Number new_val) -> 
        {
                System.out.println(new_val.doubleValue());
                sliderValue.setText(String.format("%.2f", new_val));
        });         
        //////////////////////////////////////////////////////////////////////
        GridPane.setConstraints(skrolb1, 1, 3); // The slider.
        grid.getChildren().add(skrolb1);

        GridPane.setConstraints(sliderValue, 2, 3);
        grid.getChildren().add(sliderValue);

        stage.show();
    }
}
