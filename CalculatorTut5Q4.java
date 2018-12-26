package application;
import java.util.EventObject;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CalculatorTut5Q4 extends Application {
	

	@Override
	   public void start(Stage stage) throws Exception{ 
		     GridPane gp = new GridPane();
		     gp.setPadding(new Insets(10, 10, 10, 10));
		     gp.setVgap(5);
		     gp.setHgap(5);
		     gp.setAlignment(Pos.CENTER);
		     Scene scene = new Scene(gp, 300, 200);
		     //tezxts
		     Text n1 = new Text("Number1:");
		     Text n2 = new Text("Number2:");
		     Text re = new Text("Result:");
		     
		     
		     //input texrts
		     TextField tfn1 = new TextField();
		     tfn1.setPrefColumnCount(3);
		    
		     
		     TextField tfn2 = new TextField();
		     tfn2.setPrefColumnCount(3);
		     tfn2.getText();
		     
		     TextField tfre = new TextField();
		     tfre.setPrefColumnCount(3);
		    
		     
		     gp.add(n1, 0,0);
		     gp.add(tfn1, 1, 0);
		     gp.add(n2, 2, 0);
		     gp.add(tfn2, 3, 0);
		     gp.add(re, 4, 0);
		     gp.add(tfre,5, 0);
		
		   //two flow panes in one big gp 
		     //2 gp in one grid pane.
		     //can have vbox as well
		     
		     //flow pane
		     //fp.getchildren().addAll(new Label("N"),..); kalau textfield besar sangat boleh declare first
		     //textfield[] tf = new textfield[3];
		     //for(int i = 0; i <3 ; i++) {
		     //instantiate
		     //tf[i] = new textfield("");
		     //tf[i].setPrefColumnCount(3);
		     //}
		     //addAll(tf1, tf2....)
		     //new button().setAlignment for one element
		     Button addi = new Button("Add");
		     gp.add(addi, 1, 2);
		   addi.setOnAction(value ->  {
			   Integer num1 = Integer.valueOf(tfn1.getText());
	            Integer num2 = Integer.valueOf(tfn2.getText());
	            Integer answeradd = num1 + num2;
			tfre.setText(String.valueOf(answeradd));
			   });
		   
		   
		   
		     Button sub = new Button("Subtract");
		     gp.add(sub, 2, 2);
		     sub.setOnAction(value ->  {
				   Integer num1 = Integer.valueOf(tfn1.getText());
		            Integer num2 = Integer.valueOf(tfn2.getText());
		            Integer answersub = num1 - num2;
				tfre.setText(String.valueOf(answersub));
				   });
		     
		     Button mul = new Button("Multiply");
		     gp.add(mul, 3, 2);
		     mul.setOnAction(value ->  {
				   Integer num1 = Integer.valueOf(tfn1.getText());
		            Integer num2 = Integer.valueOf(tfn2.getText());
		            Integer answermul = num1 * num2;
				tfre.setText(String.valueOf(answermul));
				   });
		     
		     Button div = new Button("Divide");
		     gp.add(div, 4, 2);
		     div.setOnAction(value ->  {
				   Integer num1 = Integer.valueOf(tfn1.getText());
		            Integer num2 = Integer.valueOf(tfn2.getText());
		            Integer  answerdiv = num1 / num2;
				tfre.setText(String.valueOf(answerdiv));
				   });  	 
		     
		      
		       
		      
		      //Setting title to the Stage 
		      stage.setTitle("Calculator"); 
		         
		      //Adding scene to the stage 
		      stage.setScene(scene); 
		         
		      //Displaying the contents of the stage 
		      stage.show();
		

		      


	}

	   public static void main(String[] args)
		{
			launch(args);
		}
}
