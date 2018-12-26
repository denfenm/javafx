package application;


import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
public class TwoScene extends Application {
	
	 Button btnscene1, btnscene2;
	 Label lblscene1, lblscene2;
	 FlowPane pane1, pane2;
	 Pane pane;
	 Scene scene1, scene2,scene3;
	 Stage thestage;
	 
	 public void start(Stage primaryStage) {
	      
	        thestage=primaryStage;
	        //can now use the stage in other methods
	       
	        //make things to put on panes
	        btnscene1=new Button("Click to go to Other Scene");
	        btnscene2=new Button("Click to go back to First Scene");
	       
	        lblscene1=new Label("Scene 1");
	        lblscene2=new Label("Scene 2");
	        //make 2 Panes
	        pane1=new FlowPane();
	        pane2=new FlowPane();
	        pane1.setVgap(10);
	        pane2.setVgap(10);
	        //set background color of each Pane
	        pane1.setStyle("-fx-background-color: blue;-fx-padding: 10px;");
	        pane2.setStyle("-fx-background-color: red;-fx-padding: 10px;");
	           
	        //add everything to panes
	        pane1.getChildren().addAll(lblscene1, btnscene1);
	        pane2.getChildren().addAll(lblscene2, btnscene2);
	        
	        BorderPane pane = new BorderPane();
	        pane.setRight(pane1);
	        pane.setLeft(pane2);
	        scene3= new Scene(pane,200,200);
	        
	        primaryStage.setTitle("Hello World!");
	        primaryStage.setScene(scene3);
	        primaryStage.show();
	    }
	 
	 public static void main(String [] args)
	 {
		 launch(args);
	 }

}


