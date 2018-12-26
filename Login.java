package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Login extends Application {
	//screens to transition to other scenes
	Scene scene1,scene2;
	public static void main(String[] args)
	{
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Button btn = new Button("Login");// Button node
		Label lblname= new Label("Your Name");
		TextField txtfield = new TextField("Your Name");
		
        
       Text text = new Text("Login in Successfull");
       
       btn.setOnAction(new EventHandler<ActionEvent>() {
			
		      public void handle(ActionEvent event) {
		    	  
		    	  if(txtfield.getText().equals("Sarojini"))
		    	  {/// write to file here
		    			 primaryStage.setScene(scene2);
		    	  }
		    
		    	  
		    	  
		    	  
		      }
		      
		});
       HBox layout1 = new HBox(20);
       layout1.getChildren().addAll(lblname,txtfield,btn);
       
        VBox layout2 = new VBox(20);
        layout2.getChildren().add(text);
         
        scene2 = new Scene(layout2,600,300);
        scene1= new Scene(layout1,600,300);
         
       primaryStage.setScene(scene1);
       primaryStage.setTitle("Scene Switching");
       primaryStage.show();      
         
		
	}

}