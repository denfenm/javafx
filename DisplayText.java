package application;
import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class DisplayText extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Pane pane=new FlowPane();
		
		
		
		Label [] lbl = new Label[5];
		for (int i=0;i<5;i++)
		{
			lbl[i]= new Label("Java");
			lbl[i].setRotate(90);
			
		}
		
		//pane.setRotate(90);
		pane.getChildren().addAll(lbl);
		Scene scene = new Scene(pane,200,100);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}

}
