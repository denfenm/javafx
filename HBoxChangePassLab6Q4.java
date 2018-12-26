package application;
/*
Develop a JavaFX program to allow the user to change their password. 
You are flexible to design your own JavaFX interface (the below GUI just 
serve as an example).
*/
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.*;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class HBoxChangePassLab6Q4 extends Application {

	String user = "aqil10";
	String pass = "1234";
	public void start(Stage stage) throws Exception {
		Button submitBtn = new Button("Submit");
		Button resetBtn = new Button("Reset");
		
		Label lbl1 = new Label("Username");
		Label lbl2 = new Label("Old Password");
		Label lbl3 = new Label("New Password");
		Label lbl4 = new Label("Confirm New Password");
		Label lbl5 = new Label("Change Password");
		
		TextField tf1 = new TextField("Username");
		TextField tf2 = new TextField("Old Password");
		TextField tf3 = new TextField("New Password");
		TextField tf4 = new TextField("Confirm New Password");
		
		TextArea ta = new TextArea("Hello!\n");	
		ta.setPrefColumnCount(10);
		ta.setPrefRowCount(5);
		
		
		submitBtn.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				
				if(tf1.getText().equalsIgnoreCase(user)&& tf2.getText().equalsIgnoreCase(pass))
				{
					pass = tf3.getText();
					ta.appendText("\nHello aqil10,\n Your password has been updated!");
				}
					else
					ta.appendText("\nError: Username or Password can't be found");
			}
		});
		
		resetBtn.setOnAction(value->{
			ta.clear();
			tf1.clear();
			tf2.clear();
			tf3.clear();
			tf4.clear();
			
			pass = "1234";
		});
		
		HBox hb1 = new HBox();
		hb1.getChildren().addAll(lbl1,tf1);
		
		HBox hb2 = new HBox();
		hb2.getChildren().addAll(lbl2,tf2);
		
		HBox hb3 = new HBox();
		hb3.getChildren().addAll(lbl3,tf3);
		
		HBox hb4 = new HBox();
		hb4.getChildren().addAll(lbl4,tf4);
		
		HBox hb5 = new HBox();
		hb5.getChildren().addAll(submitBtn, resetBtn);
		
		VBox vb = new VBox();
		vb.getChildren().addAll(hb1, hb2, hb3, hb4, hb5);
		
		HBox hb6 = new HBox();
		hb6.getChildren().addAll(vb, ta);
		
		Scene s = new Scene(hb6);
		stage.setScene(s);
		stage.show();
		
		
	}
	public static void main(String args[]){ 
	      launch(args); 
	   } 
	
}
