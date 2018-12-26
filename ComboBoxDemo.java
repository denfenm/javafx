package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ComboBoxDemo extends Application{
public static void main(String[] args) {
	launch(args);
}

@Override
public void start(Stage primaryStage) throws Exception {
	ComboBox<String> cbo = new ComboBox<>();
	cbo.getItems().addAll("Item 1", "Item 2", "Item 3");
	cbo.setStyle("-fx-color:red"); //optional
	cbo.setValue("Select a value"); //default selection
	
	StackPane root = new StackPane ();
	root.getChildren().add(cbo);
	Scene scene = new Scene (root, 200, 200);
	primaryStage.setScene(scene);
	primaryStage.show();

}
}
 