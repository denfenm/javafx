package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class TextFieldDemo extends Application{
@Override
public void start(Stage primaryStage) throws Exception {
	Label lblname = new Label("Your Name");
	TextField txtfield = new TextField("Your Name");
	
	FlowPane root = new FlowPane();
	root.getChildren().add(lblname);
	root.getChildren().add(txtfield);
	Scene scene = new Scene(root,200,200);
	primaryStage.setScene(scene);
	primaryStage.show();
}
public static void main(String[] args) {
	launch(args);
}

}
