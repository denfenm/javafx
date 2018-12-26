package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MouseEvent extends Application{
@Override
public void start(Stage stage) {
	Pane pane = new Pane();
	Text text = new Text(20,20,"Programming is fun");
	pane.getChildren().add(text);
	TextField tf = new TextField("");
	Label a = new Label("");
	Button n = new Button("a");
	pane.getChildren().add(n);
	text.setOnMouseDragged(e->{
		text.setX(e.getX());
		text.setY(e.getY());
		
		System.out.println(e.getX());
	});
	
	text.setOnKeyPressed(e->{
		switch (e.getCode()) {
		case DOWN: text.setY(text.getY() + 10); 
		break;
		case UP: text.setY(text.getY() - 10); 
		break;
		case RIGHT: text.setX(text.getX() + 10);
		break;
		case LEFT: text.setX(text.getX() - 10); 
		break;
		default:
			if(Character.isLetterOrDigit(e.getText().charAt(0)))
				text.setText(e.getText());
		}
	});
	
	//create a scene and place it in the stage
	Scene scene = new Scene(pane);
	stage.setTitle("Mouse&KeyEventDemo"); //set the stage title
	stage.setScene(scene);
	stage.show();//display the stage
	
	text.requestFocus();//text is focused to receive key input
}
public static void main(String[] args) {
	launch(args);
}
}
