package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class RadioButtonDemo extends Application{
	public static void main(String[] args) {
		launch(args);
	}
public void start(Stage primaryStage) throws Exception {
	
	final ToggleGroup group = new ToggleGroup();
	
	RadioButton rb1 = new RadioButton("Home");
	rb1.setToggleGroup(group);
	rb1.setSelected(true);
	
	RadioButton rb2 = new RadioButton("Calendar");
	rb2.setToggleGroup(group);
	
	RadioButton rb3 = new RadioButton("Contacts");
	rb3.setToggleGroup(group);
	
	FlowPane vbox = new FlowPane();
	vbox.getChildren().add(rb1);
	vbox.getChildren().add(rb2);
	vbox.getChildren().add(rb3);
	
	Scene scene = new Scene(vbox, 200, 200);
	primaryStage.setScene(scene);
	primaryStage.show();
	//javaframe work, exceptio handling and file handling (ch 1 & 6)
}
}
