// MenuSimple.java
/*
The default menu.
Note that the arrow keys on the keyboard toggle the choices.

Constructors:
1. Menu( text)
Constructs a Menu and sets the display text with the specified text.

2. Menu(text, Node graphic)
Constructs a Menu and sets the display text with the specified text and sets the graphic Node to the given node.

3. Menu( text, Node graphic, MenuItem... items)
Constructs a Menu and sets the display text with the specified text, the graphic Node to the given node,
 and inserts the given items into the items list.

Tested on: java version "java-8-oracle"
Author: Mike Ohlson de Fine.
*/
import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;

public class MenuSimple extends Application 
{

  public void start(Stage primaryStage) 
  {
    BorderPane root_pane = new BorderPane();
    Scene scene = new Scene(root_pane, 300, 250);

    MenuBar menuBar = new MenuBar();
    menuBar.prefWidthProperty().bind(primaryStage.widthProperty());
    root_pane.setTop(menuBar);

    // 1. Meat menu - Chicken, Beef, Mutton or go away.
    Menu MeatMenu = new Menu("Meat");
    MenuItem menuItem1 = new MenuItem("Chicken");
    MenuItem menuItem2 = new MenuItem("Beef");
    MenuItem menuItem3 = new MenuItem("Mutton");
    MenuItem exitMenuItem = new MenuItem("Exit");
    exitMenuItem.setOnAction(actionEvent -> Platform.exit());

    MeatMenu.getItems().addAll(menuItem1, menuItem2, menuItem3,
                               new SeparatorMenuItem(), exitMenuItem);

    // 2. Vegetable menu - Potatoes, Cabbage.
    //Menu webMenu = new Menu("Web");
    Menu VeggieMenu = new Menu("Vegetables");
    CheckMenuItem PotatoesItem = new CheckMenuItem("Vegetables");
    PotatoesItem.setSelected(true);
    VeggieMenu.getItems().add(PotatoesItem);

    CheckMenuItem CabbageItem = new CheckMenuItem("Cabbage");
    CabbageItem.setSelected(true);
    VeggieMenu.getItems().add(CabbageItem);

    Menu FruitMenu = new Menu("Fruit");
    ToggleGroup tGroup = new ToggleGroup();
    RadioMenuItem ApplesItem = new RadioMenuItem("Apples");
    ApplesItem.setToggleGroup(tGroup);

    RadioMenuItem OrangesItem = new RadioMenuItem("Oranges");
    OrangesItem.setToggleGroup(tGroup);
    OrangesItem.setSelected(true);

    FruitMenu.getItems().addAll(ApplesItem, OrangesItem,
        new SeparatorMenuItem());

    Menu RecipeMenu = new Menu("Recipes");
    RecipeMenu.getItems().addAll(
        new CheckMenuItem("Stewed Apple"),
        new CheckMenuItem("Orange Cocktail"),
        new CheckMenuItem("Apple-Orange Surprise"));

    FruitMenu.getItems().add(RecipeMenu);

    menuBar.getMenus().addAll(MeatMenu, VeggieMenu, FruitMenu);

    primaryStage.setScene(scene);
    primaryStage.show();
  }

}
