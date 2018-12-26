package application;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class StudentRegistration extends Application {

	
	MenuBar menuBar = new MenuBar();
    // File menu - new, save, exit
    Menu fileMenu = new Menu("File");
    MenuItem newMenuItem = new MenuItem("New Registration");
    MenuItem viewRegistration = new MenuItem("View Registration");
    MenuItem exitMenuItem = new MenuItem("Exit");
    
    
	GridPane pane = new GridPane();
	Student2 student;
	
	Label error_label = new Label("Valid");
    Font font=Font.font("castellar", 16);
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
	BorderPane root = new BorderPane();
	

			newMenuItem.setOnAction(e-> {registration_GUI();
		});
			viewRegistration.setOnAction(e-> {FileChooser fileChooser = new FileChooser();
			fileChooser.setTitle("Open Resource File");
			fileChooser.showOpenDialog(primaryStage);
			});
			exitMenuItem.setOnAction(e->Platform.exit());
			pane.setStyle("-fx-background-color:aqua;-fx-border-width:3;-fx-border-color:black;");   

		  // add menuitems to menu
		  fileMenu.getItems().addAll(newMenuItem,new SeparatorMenuItem(),viewRegistration, exitMenuItem);
		  menuBar.prefWidthProperty().bind(primaryStage.widthProperty());// set menubar to fit to the stage
		  
		  menuBar.getMenus().add(fileMenu);// adding filemenu to menubar
		  root.setTop(menuBar);
		  root.setCenter(pane);

		Scene scene = new Scene(root,400,400);
		primaryStage.sizeToScene();
		primaryStage.setScene(scene);
		primaryStage.show();

		
		
	}
	
	public static void main(String args[])
	{
		launch(args);
	}
	
	public void register(String name, String address, int age)
	{
		
		
		student = new Student2(name,address,age);
		
	
	}
	
	public void result()
	{
	
		
		pane.add(new Label("Student Name : "+ student.getName()),3,0);
		pane.add(new Label("Student Address : "+student.getAddress()),3,1);

	
	}
	
	public boolean isValidName(String s){    
		

	     String regex="[A-Za-z\\s]+";      
	      return s.matches(regex);//returns true if input and regex matches otherwise false;
	 }
	
	
	public void registration_GUI()
	{
		
		Label name = new Label("Student Name");
		TextField txtname = new TextField();
		
		Label address = new Label("Address");
		TextField txtadd = new TextField();
		
		Label studentID = new Label("Student ID");
		TextField txtId = new TextField();
		
		
		Button btnregister = new Button("Register");
		
	
		try {
		
			btnregister.setOnAction(e->{
				
				String name1 = txtname.getText();
				String address1 = txtadd.getText();
				int age = Integer.parseInt(txtId.getText());
			
			register(name1, address1, age);
			result();
			
			});
		
		
		txtname.setOnKeyReleased( value -> {

		   if( isValidName(txtname.getText()) ){      
		        
		              error_label.setStyle("-fx-text-fill:green");
		              error_label.setText("Valid");
		              error_label.setFont(font);
		        	  pane.add(error_label, 2, 0);
		        	  System.out.println("hi2222");
		     
		  }else{              
		           error_label.setText("Invalid User Name");
		           error_label.setStyle("-fx-text-fill:red");
		           error_label.setFont(font);
		     	   pane.add(error_label, 2, 0);
		     	   System.out.println("hi");
		  
		 }
		  }      
		     
		     
		 );
		}catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		pane.add(name,0, 0);
		pane.add(txtname,1, 0);
		
		pane.add(address,0, 1);
		pane.add(txtadd,1, 1);	
		
		pane.add(studentID,0, 2);
		pane.add(txtId,1, 2);	
		
		
		pane.add(btnregister,1, 3);
		//  pane.add(error_label, 2, 0);
		  pane.setStyle("-fx-background-color:aqua;-fx-border-width:3;-fx-border-color:black;"); 
		
	
	}
	

}
