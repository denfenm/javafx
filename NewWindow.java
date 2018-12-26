package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class NewWindow  extends Application{
	

	public static void main(String[] args) {
	Application.launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
	
	Pane pane = new Pane();
	
	Button btn = new Button("Click here to go to other scene");
	pane.getChildren().add(btn);
	
	Pane pane2 = new Pane();
	Button btn2 = new Button("Click here to go to first scene");
	pane2.getChildren().add(btn2);

	btn.setOnAction(e ->
	{
		
		 pane2.setStyle("-fx-background-color: red;-fx-padding: 10px;");
		Scene scene2 = new Scene(pane2,200,200);
		Stage secondStage = new Stage();
		secondStage.setScene(scene2);
		secondStage.show();
		
		
	});
	
	btn2.setOnAction(e ->
	{
		
		
		 pane.setStyle("-fx-background-color: blue;-fx-padding: 10px;");
		Scene scene = new Scene(pane,200,200);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
	});
	
		
	

	
	Scene scene = new Scene(pane,200,200);
	primaryStage.setScene(scene);
	primaryStage.show();
	
	Scene scene2 = new Scene(pane2,200,200);
	Stage secondStage = new Stage();
	secondStage.setScene(scene2);
	secondStage.show();
			
			
		
		
	}

}
