package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
/*anonymous class - dont have to say what is the class. straight away do event handler which is what we have been doing.
 * */
public class RBGChangeTextTut7Q2 extends Application{
	Text txt;
	
	public void start(Stage primaryStage)throws Exception{
	
		RadioButton red = new RadioButton("red");
		RadioButton green = new RadioButton("green");
		RadioButton blue = new RadioButton("blue");
		
		Text awesome = new Text("Awesome");
		
		Button left = new Button("<");
		Button right = new Button(">");
		
		red.setOnAction(e->{
			if(red.isSelected())
			{
				awesome.setFill(Color.RED);
			}
		});
		
		green.setOnAction(e->{
			if(green.isSelected())
			{
				awesome.setFill(Color.GREEN);
			}
		});
		
		
		blue.setOnAction(e->{
			if(blue.isSelected())
			{
				awesome.setFill(Color.BLUE);
			}
		});
		
		//move awesome right or left
		left.setOnAction(e->{
			awesome.setTranslateX(awesome.getX()-50);
		});
	
		right.setOnAction(e->{
			awesome.setTranslateX(awesome.getX()+50);
		});
	/*
	Button btn = new Button ("CHANGE");
	txt = new Text(" Crocodile");
	FlowPane flowPane = new FlowPane ();
	*/
    
    //btn.setOnAction(new ButtonHandler2()); //inner class
	
/*	btn.setOnAction(new EventHandler<ActionEvent>() //anonymous class
	{
		@Override
		public void handle(ActionEvent e) {
			txt.setText("MONKEY");
		}
	});*/
	
	/*btn.setOnAction(e -> txt.setText("MONKEY")); //lambda expression which is under single abstract method. one method to simplify them
	
	btn.setOnAction(e-> {
		txt.setText("MONKEY");
		System.out.println("Monkey");
	});
	
	btn.setOnAction(e-> {
		txt.setText("MONKEY");
		System.out.println("MONKEY");
	});
    
    flowPane.getChildren().addAll(btn, txt);*/
		
		
    
	VBox vb = new VBox();
	vb.getChildren().addAll(red, blue, green, awesome, left, right);
    Scene scene = new Scene (vb);
	primaryStage.setScene(scene);
	primaryStage.show();
	

}
	
	/*class ButtonHandler2 implements EventHandler<ActionEvent>, MouseHandler{
		
		@Override
		public void handle(ActionEvent event) {
			txtfield.setText("MONKEY");
		}
	}*/
	
	
public static void main (String [] args)
{
launch(args);//call start method

}
}

/*package application;

import java.awt.Color;
import java.util.*;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.text.Font;

public class Q1 extends Application{

	
	public void start(Stage stage) {
		
		Pane pane = new Pane();
		Text t = new Text("Welcome to Java");
		t.setFill();
		pane.getChildren().add(t);
		
		
		
		RadioButton red = new RadioButton("Red");
		RadioButton green = new RadioButton("Green");
		RadioButton yellow = new RadioButton("Yellow");
		RadioButton blue = new RadioButton("Blue");
		RadioButton black = new RadioButton("Black");
		
		
		final ToggleGroup group = new ToggleGroup();
		red.setToggleGroup(group);
		green.setToggleGroup(group);
		yellow.setToggleGroup(group);
		blue.setToggleGroup(group);
		black.setToggleGroup(group);
		
		green.setSelected(true);
		
		text.setOnKeyPressed(e->{
			switch (e.getCode()) {
			case DOWN: text.setY(text.getY() + 10);
			break;
			case UP: text.setY(text.getY() - 10);
			break;
			case RIGHT: text.setX(text.getX() + 10);
			break;
			case LEFT: text.setX(text.getX()- 10);
			break;
			default:
				if(Character.isLetterOrDigit(e.getText().charAt(0)))
					text.setText(e.getText());
			}
		});
		
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.show();
		
		text.requestFocus();
	}
	
	





public static void main(String[] args) {
	launch(args);
}
}

*/