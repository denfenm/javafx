package application;



import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxDemo extends Application {

	public static void main(String[] args) {
	launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		 //creating a text field   
	    TextField textField = new TextField();       
	    
	    //Creating the play button 
	    Button playButton = new Button("Play");       
	    
	    //Creating the stop button 
	    Button stopButton = new Button("stop"); 
	     
	    //Instantiating the HBox class  
	    HBox hbox = new HBox();    
	    
	    //Setting the space between the nodes of a HBox pane 
	    hbox.setSpacing(10);    
	    
	    //Setting the margin to the nodes 
	    hbox.setMargin(textField, new Insets(20, 20, 20, 20)); 
	    hbox.setMargin(playButton, new Insets(20, 20, 20, 20)); 
	    hbox.setMargin(stopButton, new Insets(20, 20, 20, 20));  
	    
	    //retrieving the observable list of the HBox 
	    ObservableList list = hbox.getChildren();  
	    
	    //Adding all the nodes to the observable list (HBox) 
	    list.addAll(textField, playButton, stopButton);       
	    
	    //Creating a scene object
	    Scene scene = new Scene(hbox);  
	    
	    //Setting title to the Stage 
	    primaryStage.setTitle("Hbox Example"); 
	       
	    //Adding scene to the stage 
	    primaryStage.setScene(scene); 
	       
	    //Displaying the contents of the stage 
	    primaryStage.show(); 
		
	}

}
