package application;

import javafx.scene.image.ImageView;

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

public class PicResizeGridPaneTut5Q3 extends Application{
	public static void main(String[] args) {
		launch(args);
	}

@Override
public void start(Stage stage) throws Exception{
	
	final Image icon = new Image(getClass().getResourceAsStream("/application/cat.jpeg"));
	ImageView img1 = new ImageView(icon);
	ImageView img01 = new ImageView(icon);
	img1.setImage(icon);
	img1.setFitHeight(100);
	img1.setFitWidth(100);
	img01.setImage(icon);
	img01.setFitHeight(100);
	img01.setFitWidth(100);
	
	
	final Image icon2 = new Image(getClass().getResourceAsStream("/application/WhatsApp Image 2018-08-01 at 3.14.33 PM.jpeg"));
	ImageView img2 = new ImageView(icon2);
	ImageView img02 = new ImageView(icon2);
	img2.setImage(icon2);
	img2.setFitHeight(100);
	img2.setFitWidth(100);
	img02.setImage(icon2);
	img02.setFitHeight(100);
	img02.setFitWidth(100);
	
	
	GridPane gp = new GridPane();
	gp.setMinSize(200, 200); 

	    
	
	gp.add(img2,0,0);
	gp.add(img1,0,1);
	gp.add(img01,1,0);
	gp.add(img02,1,1);
	
	stage.setTitle("Question 1");
	
	Scene scene1 = new Scene(gp);
	stage.setScene(scene1);
	stage.show();
	
	
      
      //Displaying the contents of the stage 
      stage.show(); 
      
      //gridpane flags = new gridpane()
      //flags. add
	
}
}
