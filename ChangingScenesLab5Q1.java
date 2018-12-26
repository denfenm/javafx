package application;


	import javafx.application.Application;
	import javafx.scene.Scene;
	import javafx.scene.control.Button;
	import javafx.scene.control.Label;
	import javafx.scene.layout.GridPane;
	import javafx.stage.Stage;

	//1.	Write a program that can switching to different screen by clicking the button.
	public class ChangingScenesLab5Q1 extends Application {
		@Override
		public void start(Stage stage) throws Exception {
			GridPane gp1 = new GridPane();
			GridPane gp2 = new GridPane();
			gp1.setMaxHeight(100);
			gp1.setMinWidth(200);
			gp2.setMaxHeight(100);
			gp2.setMinWidth(200);
			gp1.setStyle("-fx-background-color: yellow;-fx-padding: 10px;");
			gp2.setStyle("-fx-background-color: red;-fx-padding: 10px;");
			Label s1 = new Label("Scene 1");
			Button goTo = new Button("Click to go to Other Scene");
			Label empty = new Label(" ");
			Label s2 = new Label("Scene 2");
			Button goBack = new Button("Click to go back to First Scene");
			
			gp1.add(s1, 0,1);
			gp1.add(goTo, 0, 2);
			gp1.add(empty, 0, 3);
			gp2.add(s2, 0, 1);
			gp2.add(goBack, 0, 2);
			gp2.add(empty, 0, 3);
			
			Scene scene1 = new Scene(gp1);
			Scene scene2 = new Scene(gp2);
			
			goTo.setOnAction(value -> {
				stage.setTitle("Hello World!");
				stage.setScene(scene2);
				stage.show();
			});
			goBack.setOnAction(value -> {
				stage.setTitle("Hello World!");
				stage.setScene(scene1);
				stage.show();
			});
			
			stage.setTitle("Hello World!");
			stage.setScene(scene1);
			stage.show();
			
			
		}
		 
		 public static void main(String [] args)
		 {
			 launch(args);
		 }

	}


