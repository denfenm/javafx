
package application;
import java.io.FileInputStream;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CheckBoxExample extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception  {
		
		BorderPane pane = new BorderPane();//main container
		
		
		FlowPane lblpane = new FlowPane();// top pane
		HBox CenterPane = new HBox(); //center pane to hold image n textarea
		VBox vpanecheckbox = new VBox();//to add checkbox
		VBox vpaneradiobutton = new VBox();// to add radiobutton
		
		Pane txtpane= new Pane(); // to hold text area
		Pane btnpane = new Pane();//to hold button
		Pane imgpane = new Pane();// to hold image
		
		lblpane.setStyle("-fx-background-color: purple");
		btnpane.setStyle("-fx-background-color: yellow");
		
		Label lbl= new Label("MY JAVA FX");
		lblpane.getChildren().add(lbl);// add label to label pane
		lblpane.setAlignment(Pos.CENTER);
		

		Button btn= new Button("My first Button");
		btnpane.getChildren().add(btn);
		

		TextArea txtarea= new TextArea();//
		txtpane.getChildren().add(txtarea);
		
		
		FileInputStream file = new FileInputStream("Cat.png");
		Image image = new Image(file);
		ImageView imgview = new ImageView (image);
		imgpane.getChildren().add(imgview);

		imgview.setOnMouseDragged(e->{
			imgview.setX(e.getX());
			imgview.setY(e.getY());
		});
		
		btn.setOnAction(e->txtarea.appendText(btn.getText()+"\n"));
		
		
		CheckBox chckboxblue = new CheckBox("Blue");
		CheckBox chckboxred = new CheckBox("Red");
		chckboxblue.setOnAction(e->txtarea.appendText(chckboxblue.getText()+"\n"));
		chckboxred.setOnAction(e->txtarea.appendText(chckboxred.getText()+"\n"));

		

		RadioButton btnblue = new RadioButton("Blue");
		RadioButton btnred = new RadioButton("Red");
		
		ToggleGroup group = new ToggleGroup();
		btnblue.setToggleGroup(group);
		btnred.setToggleGroup(group);
		
		btnblue.setOnAction(e->
		{
			if(btnblue.isSelected())
			{
				lbl.setTextFill(Color.BLUE);
			}
		});
		btnred.setOnAction(e->lbl.setTextFill(Color.RED));
		
		vpaneradiobutton.getChildren().addAll(btnblue,btnred);
		
		ComboBox<String> combobox = new ComboBox<>();
		combobox.getItems().addAll("Blue","Green","Red");
		combobox.setOnAction(e->txtarea.setText(combobox.getValue()));
		

		
		btn.setOnMouseDragged(e->{
			btn.setLayoutX(e.getX());
			btn.setLayoutY(e.getY());
		});

		vpanecheckbox.getChildren().addAll(chckboxblue,chckboxred,combobox); 
		CenterPane.getChildren().addAll(txtpane,imgpane);// center pane to add image pane n textarea pane
		
		pane.setTop(lblpane);
		pane.setCenter(CenterPane);
		pane.setLeft(vpanecheckbox);
		pane.setBottom(btnpane);
		pane.setRight(vpaneradiobutton);
		
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
		
	}
	
	
	public static void main(String [] args)
	{
		Application.launch(args);
	}
	
	
	

}
