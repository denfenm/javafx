package application;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class YellowBoxKaraokeTutorial7Q1 extends Application {
	String loc = "";
	String paym = "";
	
public void start(Stage stage) throws Exception {
	ObservableList<String> time = FXCollections.observableArrayList("Lunch Hour (11am - 2pm)", "Happy Hour (1pm - 6pm)");
	ComboBox cb2 = new ComboBox(time);
	Label name = new Label("Name: ");
	TextField namef = new TextField();
	Label email = new Label("Email: ");
	TextField emailf = new TextField();
	Label contact = new Label("Contact: ");
	TextField contactf = new TextField();
	Label timeToCome = new Label("When to come?");
	
	Label adult = new Label("Number of Adult: ");
	TextField adultNo = new TextField();
	
	Label kid = new Label("Number of kid: ");
	TextField kidNo = new TextField();
	
	Label location = new Label("Location: ");
	Label notchosen = new Label("");
	RadioButton cheras = new RadioButton("Yellow Box Karaoke Cheras Selatan");
	RadioButton mid = new RadioButton("Yellow Box Karaoke Mid Valley");
	RadioButton klcc = new RadioButton("Yellow Box Karaoke KLCC");
	
	Label paymethod = new Label("Payment Method: ");
	RadioButton creditcard = new RadioButton("Credit Card");
	RadioButton cash = new RadioButton("Cash");
	
	Button checkout = new Button("CHECK OUT");
	
	final ToggleGroup group1 = new ToggleGroup();
	cheras.setToggleGroup(group1);
	mid.setToggleGroup(group1);
	klcc.setToggleGroup(group1);
	
	final ToggleGroup group2 = new ToggleGroup();
	creditcard.setToggleGroup(group2);
	cash.setToggleGroup(group2);
	
	TextArea total = new TextArea();
	TextArea orderdetail = new TextArea();
	TextArea custdetail = new TextArea();
	
	group1.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
		
		@Override
		public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
			if(group1.getSelectedToggle() == cheras) {
				loc = cheras.getText();
			}
			else if (group1.getSelectedToggle() == mid) {
				loc = mid.getText();
			} else {
				loc = klcc.getText();
			}
		}
	}); 

group2.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
	
	@Override
	public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
		if(group2.getSelectedToggle() == creditcard) {
			paym = creditcard.getText();
		
		} else {
			paym = cash.getText();
		}
	}
}); 

	
	checkout.setOnAction(value -> {
		Integer adultNum = Integer.valueOf(adultNo.getText());
		Integer kidNum = Integer.valueOf(kidNo.getText());
		
		Integer totalAdult = adultNum*20;
		Integer totalKid = kidNum*10;
		
		total.setText("Total: " + (totalAdult + totalKid) + "\n" + 
		adultNum + "Adults @ RM 20.00\n" + kidNum + " Kids @ RM 10.00");
		
		String val = (String) cb2.getValue();
		if(val.equals("")) {
			notchosen.setText("Nothing Chosen!");
		} 
		
		orderdetail.setText("Time: " + val + "\nLocation: " + loc + "\nPayment Mode: " + paym);
		
		custdetail.setText("Name: " + namef.getText() + "\nEmail: " + emailf.getText() + "\nContact: " + contactf.getText());
		
	});
		GridPane gp = new GridPane();
		gp.setPadding(new Insets(10, 10, 10, 10));
	    gp.setVgap(5);
	    gp.setHgap(5);
	    gp.setAlignment(Pos.CENTER);
	    
	    
	    gp.add(name, 0, 0);
	    gp.add(namef, 1, 0);
	    gp.add(email, 0, 1);
	    gp.add(emailf, 1, 1);
	    gp.add(contact, 0, 2);
	    gp.add(contactf, 1, 2);
	    gp.add(timeToCome,0, 3);
	    gp.add(cb2,1,3);
	    gp.add(adult, 0, 4);
	    gp.add(adultNo, 1, 4);
	    gp.add(kid, 2, 4);
	    gp.add(kidNo, 3, 4);
	    gp.add(location, 0, 5);
	    gp.add(cheras, 0, 6);
	    gp.add(klcc, 0, 7);
	    gp.add(mid, 0, 8);
	    gp.add(paymethod, 0, 9);
	    gp.add(creditcard, 1, 9);
	    gp.add(cash, 2, 9);
	    gp.add(checkout, 0, 10);
	    
	    HBox hb  = new HBox();
	    VBox vb = new VBox();
	    vb.getChildren().addAll(total, orderdetail, custdetail);
	    hb.getChildren().addAll(gp, vb);
	    Scene scene = new Scene(hb, 300, 200);
	    stage.setTitle("Yellow Box Karaoke");
	    stage.setScene(scene);
	    stage.show();
	
	
	
	
}

public static void main(String[] args)
{
	launch(args);
}
}
