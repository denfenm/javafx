package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class BorderPaneDemo extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		BorderPane bPane = new BorderPane();   
	       
	

		Image imageOk = new Image(getClass().getResourceAsStream("/application/cat.png"));
		Button buttonimage = new Button("Accept", new ImageView(imageOk));
		
		  bPane.setTop(buttonimage); 
	      bPane.setBottom(new TextField("Bottom")); 
	      bPane.setLeft(new TextField("Left")); 
	      bPane.setRight(new TextField("Right")); 
	      bPane.setCenter(new TextField("Center")); 
	      
	      //Creating a scene object 
	      Scene scene = new Scene(bPane);  
	      
	      //Setting title to the Stage
	      primaryStage.setTitle("BorderPane Example"); 
	         
	      //Adding scene to the stage 
	      primaryStage.setScene(scene);          
	      
	      //Displaying the contents of the stage 
	      primaryStage.show(); 
		
		
		
		
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}
	
	
	

}
