package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

public class LabelDemo extends Application {
@Override
public void start(Stage primaryStage) throws Exception {
	
	Label lbl = new Label("Hello Java");
	StackPane root = new StackPane();
	root.getChildren().add(lbl);
	Scene scene = new Scene(root);
	//primaryStage.setTitle("Hello world");
	primaryStage.setAlwaysOnTop(true);
	primaryStage.setScene(scene);
	primaryStage.show();
}
public static void main(String[] args) {
	launch(args);
}
}
