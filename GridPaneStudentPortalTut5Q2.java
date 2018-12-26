package application;
import javax.swing.ImageIcon;

import javafx.application.Application; 
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage; 
import javafx.geometry.*;
import javafx.scene.layout.StackPane;

public class GridPaneStudentPortalTut5Q2 extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		//text student portal
	      Text text1 = new Text("Name: ");       
	      
	      //creating label password 
	      Text text2 = new Text("ID: "); 
		  
	      //Creating Text Filed for email        
	      TextField textField1 = new TextField();       
	      
	      //Creating Text Filed for password        
	      TextField textField2 = new TextField();  
		
		Text text3 = new Text("Welcome To Taylor's University");
		Text text4 = new Text("Student Portal");
		text4.setFont(Font.font("Arial", 30));
		text4.setFill(Color.RED);
		//Creating Buttons 
	    Button button1 = new Button("Submit"); 
	    
	    //image
	    ImageView img = new ImageView();
	    Image icon = new Image(getClass().getResourceAsStream("/application/iconq2t5.png"));
	    img.setImage(icon);
	    img.setFitHeight(100);
	    img.setFitWidth(100);
	    
	    GridPane gridPane = new GridPane(); 
	    gridPane.setMinSize(500, 200); 
	    gridPane.setPadding(new Insets(5, 5, 5, 5));
	    
	    gridPane.setVgap(5); 
	    gridPane.setHgap(5);  
	    
	    gridPane.setAlignment(Pos.CENTER); 
	    
	      gridPane.add(text4, 3,1);
	      gridPane.add(text1, 2,2); 
	      gridPane.add(textField1, 3, 2); //gridPane.add(textField1, 1(column,x), 0(row,y)); 
	      gridPane.add(text2, 2, 3);       
	      gridPane.add(textField2, 3, 3); 
	      gridPane.add(button1, 4, 3); //draw ON POPOERapae paeper
	      gridPane.add(text3, 3, 5);
	      gridPane.add(img, 1, 1);
	      //Creating a scene object 
	      Scene scene2 = new Scene(gridPane);  
	      
	      //Setting title to the Stage 
	     
	         
	      //Adding scene to the stage 
	      stage.setScene(scene2); 
	         
	      //Displaying the contents of the stage 
	      stage.show();
	      
	      //top part boleh guna label 
	      //kalau guna border pane, label l = new label(student portal)
	      //b.settop(l);
	      //nak set center, gridpane gp
	      //gp.add(new label(name), 0, 0);
	      //gp.add(new textfield(""));
	      //imageview iv = new imageview("student.png");
	      //b.setleft(iv);
	      //resize image
	      //iv.setfitwidth
	      
}
}