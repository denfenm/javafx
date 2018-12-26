package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class CheckBoxDemo extends Application {
	public static void main(String[] args) {
		launch(args);
	}
public void start(Stage primaryStage) throws Exception {
	
	//A checkbox without a caption
	CheckBox cb1 = new CheckBox();
	//A checkboc with a string caption
	CheckBox cb2 = new CheckBox("Second");
	
	cb1.setText("First");
	cb1.setSelected(true);
	
	FlowPane fl = new FlowPane();
	fl.getChildren().add(cb1);
	fl.getChildren().add(cb2);
	
	Scene scene = new Scene(fl, 200,200);
	primaryStage.setScene(scene);
	primaryStage.show();
}
}
