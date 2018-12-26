package application;

import javafx.application.Application;
import javafx.collections.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
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

public class ConvertCMCalcLab6Q1 extends Application{

	@Override
	public void start(Stage stage) {
		VBox vb = new VBox();
		vb.setPrefWidth(100);
		Button convert = new Button("Convert");
		convert.setMinWidth(20);
		
		
		
		Label l1 = new Label("Input in CM: ");
		TextField tf1 = new TextField("");
		tf1.setMinWidth(20);
		
		Label m = new Label("Meter");
		m.setMinWidth(20);
		
		Label ft = new Label("Feet");
		ft.setMinWidth(20);
		
		Label inch = new Label("Inch");
		inch.setMinWidth(20);
		
		TextField tfm = new TextField("0");
		tfm.setMinWidth(20);
		
		TextField tfft = new TextField("0");
		tfft.setMinWidth(20);
		
		TextField tfinch = new TextField("0");
		tfinch.setMinWidth(20);
		
		convert.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				Integer cm = Integer.valueOf(tf1.getText());
				
				Integer metre = 0;
				Integer feet = 0;
				Integer inches = 0;
				
			if(cm != 0) {
				metre = (cm/100);
				cm = cm - (metre*100);
				tfm.setText(String.valueOf(metre));
				
				if(cm != 0) {
				
				feet = (int) (cm / 30.48);
				cm = (int) (cm - (feet*30.48));
				tfft.setText(String.valueOf(feet));
					
					if(cm != 0) {
						inches = (int) (cm / 2.54);
						cm = (int) (cm - (inches*2.54));
						tfinch.setText(String.valueOf(inches));
						
					} else {
						
						tfinch.setText("0");
						
					}
					
				
				} else {
					tfft.setText("0");
				}
			} else {
				tfm.setText("0");
			}
			}
		});
		
		HBox hb1 = new HBox();
		hb1.getChildren().addAll(l1, tf1);
		hb1.setAlignment(Pos.CENTER);
		
		HBox hb2 = new HBox();
		hb2.getChildren().add(convert);
		hb2.setAlignment(Pos.CENTER_RIGHT);
		
		
		
		VBox v1 = new VBox();
		v1.getChildren().addAll(tfm, m);
		
		VBox v2 = new VBox();
		v2.getChildren().addAll(tfft, ft);
		
		VBox v3 = new VBox();
		v3.getChildren().addAll(tfinch, inch);
		
		HBox hb3 = new HBox();
		hb3.getChildren().addAll(v1, v2, v3);
		hb3.setAlignment(Pos.CENTER);
		
		
		vb.setSpacing(10);   
		vb.getChildren().addAll(hb1, hb3, hb2);
		
		Scene scene = new Scene(vb);
		stage.setTitle("Convertion");
		stage.setScene(scene);
		stage.show();
	}
	
	  public static void main(String args[]){ 
	      launch(args); 
	   } 
}
