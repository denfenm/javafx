package application;

import java.io.InputStream;
import java.io.Serializable;
import java.net.URL;

import javafx.application.*;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.chart.Chart;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class PracRadioButton extends Application {
	
	public void start(Stage stage) throws Exception{
		final ToggleGroup group = new ToggleGroup();
		
		RadioButton rb1 = new RadioButton("Elephant");
		rb1.setToggleGroup(group);
		rb1.setSelected(true);
		
		RadioButton rb2 = new RadioButton("Aligator");
		rb2.setToggleGroup(group);
		
		RadioButton rb3 = new RadioButton("Cat");
		rb3.setToggleGroup(group);
		//ele ali cat are in one group of toggles 
		//their property is toggle
		
		Label lbl = new Label("");
		lbl.setTextFill(Color.RED);
		
		InputStream is1 = getClass().getResourceAsStream("/application/cat.jpeg");
		Image img1 = new Image(is1);
		rb3.setGraphic(new ImageView(img1));
		
		
		
		
		
		//group selectedtoggleproperty().addlisterner(new change lstener<toggle>() //add listener to toggle group
		//kena @override
		//toggle group only does grouping
		
		group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
			@Override	
			public void changed(ObservableValue<? extends Toggle>observable, Toggle oldValue, Toggle newValue) {
				if(group.getSelectedToggle() != null) {
					RadioButton button = (RadioButton) group.getSelectedToggle();
					System.out.println("Button: " + button.getText());
					lbl.setText("You are " + button.getText());
				
					
				}
			}
		});
		
		FlowPane vbox = new FlowPane();
		vbox.getChildren().add(rb1);
		vbox.getChildren().add(rb2);
		vbox.getChildren().add(rb3);
		vbox.getChildren().add(lbl);
		
		Scene scene = new Scene(vbox, 200, 200);
		stage.setScene(scene);
		stage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
