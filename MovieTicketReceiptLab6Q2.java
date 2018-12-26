package application;

/*
Design a JavaFX program to calculate amount that a user need to pay for movie tickets. Given the detail of the movie ticket as below. You are flexible to design your own JavaFX interface.
Price and discount
Adult RM12.00/pc
Kid RM8.00/pc
Quantity more than 5 tickets discount 5%
Quantity more than 10 tickets discount 10%

*/

import javafx.application.Application;
import javafx.collections.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.*;



public class MovieTicketReceiptLab6Q2 extends Application{

	public Integer ticketCount = 0;
	public Integer totalAdult = 0;
	public Integer totalKid = 0;
	
	@Override
	public void start(Stage stage) throws Exception {
		
		Button adultBtn = new Button("Adult @ RM12.00/pc");

		Button kidBtn = new Button("Kid @ RM8.00/pc");
		
		TextArea txtArea = new TextArea("Details\n");
		txtArea.setPrefColumnCount(20);
		txtArea.setPrefRowCount(10);
		
		Button submitBtn = new Button("SUBMIT");
		
		Button resetBtn = new Button("RESET");
		
		adultBtn.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				ticketCount++;
				totalAdult+=12;
				txtArea.appendText("Adult\t+ RM12\t1pc\n");
			}
		});
		
		kidBtn.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				ticketCount++;
				totalKid+=8;
				txtArea.appendText("Kid\t\t+RM8\t1pc\n");
			}
		});
		
		submitBtn.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				txtArea.appendText("\nTotal tickets: " + ticketCount + "\nTotal price: RM" + (totalKid + totalAdult));
			
				
			}
		});
		
		resetBtn.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				ticketCount = 0;
				totalKid = 0;
				totalAdult = 0;
				txtArea.setText(null);
			}
		});
		
		VBox vb = new VBox();
		
		vb.getChildren().addAll(adultBtn, kidBtn, txtArea, resetBtn, submitBtn);
		
		Scene scene = new Scene(vb);
		stage.setTitle("Movie Tickets");
		stage.setScene(scene);
		stage.show();
		
		
	}
	 public static void main(String args[]){ 
	      launch(args); 
	   } 
}
