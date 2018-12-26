package application;
import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TextAreaDemo extends Application {
public static void main(String[] args) {
	launch(args);
}



public void start(Stage primaryStage) throws Exception {
	TextArea txtarea = new TextArea("This is a text area.");
	txtarea.setPrefColumnCount(20);
	txtarea.setPrefRowCount(5);
	txtarea.setStyle("-fx-text-fill:red");//font color
	txtarea.setFont(Font.font("Times", 20));//set font
	
	StackPane root = new StackPane();
	root.getChildren().add(txtarea);
	Scene scene = new Scene(root,200,200);
	primaryStage.setScene(scene);
	primaryStage.show();
}
}
