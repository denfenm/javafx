package application;	
import javafx.application.Application;
	import javafx.event.ActionEvent;
	import javafx.event.EventHandler;
	import javafx.scene.Scene;
	import javafx.scene.control.Button;
	import javafx.scene.control.TextField;
	import javafx.scene.layout.GridPane;
	import javafx.scene.layout.HBox;
	import javafx.scene.layout.Pane;
	import javafx.scene.layout.VBox;
	import javafx.scene.text.Text;
	import javafx.stage.Stage;

	public class Calculator extends Application{

		@Override
		public void start(Stage primaryStage) throws Exception {

			TextField txtanswer= new TextField();
			GridPane numberpane = new GridPane();
			numberpane.add(txtanswer,0,0);
			numberpane.setColumnSpan(txtanswer, GridPane.REMAINING); // span the column
			numberpane.setVgap(5);
			numberpane.setHgap(5);

			String [] scientificsymbol ={"Rad","xyz","x!","(",")","%","AC","Inv","sin",
					"ln","7","8","9","/","pi","cos","log","4","5","6","x"};
			int k =0;
			Button btn[] =new Button[21];
			for (int i=1;i<4;i++)
			{
				for (int j=0;j<7;j++)
				{
		
					btn[k] = new Button(scientificsymbol[k]);
				    btn[k].setPrefWidth(50);
					numberpane.add(btn[k],j,i);
				
					
					btn[k].setOnAction(new EventHandler<ActionEvent>() {
				            @Override public void handle(ActionEvent e) {
				            	
				            	String text = ((Button)e.getSource()).getText();
				            	txtanswer.setText(text);
				            }
				        });
			        
					k++;			
				}
				
			}
			
			Scene scene= new Scene(numberpane);
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		
		public static void main(String[] args)
		{
			launch(args);
		}

	}
