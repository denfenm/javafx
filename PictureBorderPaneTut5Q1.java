package application;


	import javafx.application.*; 
	import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage; 

	         
	public class PictureBorderPaneTut5Q1  extends Application { 
	   @Override 
	   public void start(Stage stage) {      
	      //Instantiating the BorderPane class  
	      BorderPane bPane = new BorderPane();   
	       
	      Text txt = new Text("I am here");
	      
	      ImageView img2 = new ImageView(); //imageview object, it is a binary file
	      Image image1 = new Image(getClass().getResourceAsStream("/application/cat.jpeg")); //pass in location of file
	      img2.setImage(image1); //which image i wanna view
	      bPane.setBottom(img2); 
	      Button buttonimage = new Button("Accept", img2);
	      
	      ImageView buttoni = new ImageView();
	      Image bontot = new Image(getClass().getResourceAsStream("/application/WhatsApp Image 2018-08-01 at 3.14.33 PM.jpeg"));
	      buttoni.setImage(bontot);
	      Button butt = new Button("nat", buttoni);
	      //button image
	    
	      
	      img2.setImage(image1);
	     
	      
	      //Setting the top, bottom, center, right and left nodes to the pane 
	     
	      bPane.setTop(txt); 
	      //bPane.setBottom(new TextField("Bottom")); 
	      // bPane.setLeft(new TextField("Left")); 
	      bPane.setLeft(butt); 
	      bPane.setRight(new TextField("Right")); 
	      bPane.setCenter(new TextField("Center")); 
	      
	      
	     
	      //Creating a scene object 
	      Scene scene = new Scene(bPane);  
	      
	      //Setting title to the Stage
	      stage.setTitle("BorderPane Example"); 
	         
	      //Adding scene to the stage 
	      stage.setScene(scene);          
	      
	      //Displaying the contents of the stage 
	      stage.show(); 
	      
	      
	      
	      
	   } 
	   public static void main(String args[]){ 
	      launch(args); 
	   } 
	}


