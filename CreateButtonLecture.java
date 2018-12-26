package application;
import javafx.application.Application;
import javafx.collections.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.*;
//print details, event handling
public class CreateButtonLecture extends Application {

	@Override
	public void start(Stage stage) {
		// TODO Auto-generated method stub
		Button btn = new Button("Add Details");
		
		TextArea txtArea = new TextArea("Details\n");
		txtArea.setPrefColumnCount(20);
		txtArea.setPrefRowCount(5);
		
		Label lbl = new Label("Your Name");
		TextField txtfield = new TextField("Your Name");
		
		CheckBox Hobbies1 = new CheckBox("Badminton");
		CheckBox Hobbies2 = new CheckBox("Football");
		
		FlowPane fp = new FlowPane();
		fp.getChildren().add(lbl);
		fp.getChildren().add(txtfield);
		
		btn.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				String name = txtfield.getText(); //get value from text
				txtArea.appendText(name + "\n");
				txtArea.appendText(Hobbies1.getText() + "\n");
				txtArea.appendText(Hobbies2.getText() + "\n");
				
			}
		});
		
		Hobbies1.setOnAction(new EventHandler<ActionEvent>() { //
			public void handle(ActionEvent event) {
				
				txtArea.appendText(Hobbies1.getText());
			}
		});
		
		VBox vBox = new VBox(); //container
		vBox.getChildren().add(fp); //add flowpane to vBox
		vBox.getChildren().addAll(Hobbies1, Hobbies2); //add checkbox 
		vBox.getChildren().add(btn);
		vBox.getChildren().add(txtArea);
		
		Scene scene = new Scene(vBox);
		stage.setScene(scene);
		stage.show();
	}

	  public static void main(String args[]){ 
	      launch(args); 
	   } 
	
	
}
