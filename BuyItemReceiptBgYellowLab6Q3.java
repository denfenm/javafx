/*Develop a JavaFX program to act as a cashier machine for 88 Hypermarket Sdn. Bhd. 
You are flexible to design your own JavaFX interface (the below GUI just serve as 
an example).
*/
package application;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.*;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;




public class BuyItemReceiptBgYellowLab6Q3 extends Application{
	public Integer totquant = 0;
	public Double sum = 0.0;
@Override

	public void start(Stage stage) throws Exception {
		Button btn = new Button("Add item");
		Button btn2 = new Button("Total all");
		btn.setMinWidth(100);
		btn2.setMinWidth(100);
		
		Label lbl1 = new Label("Item");
		TextField tf1 = new TextField("");
		tf1.setStyle("-fx-text-box-border: orange ; -fx-focus-color: orange");
		
		Label lbl2 = new Label("Quantity");
		TextField tf2 = new TextField("");
		tf2.setStyle("-fx-text-box-border: orange ; -fx-focus-color: orange");
		
		Label lbl3 = new Label("Price");
		TextField tf3 = new TextField("");
		tf3.setStyle("-fx-text-box-border: orange ; -fx-focus-color: orange");
		
		TextArea ta = new TextArea("Receipt:\n\nITEM\tDESC\tTOTAL");
		ta.setFont(Font.font("Arial",FontWeight.BOLD, 12));
		ta.setPrefColumnCount(30);
		ta.setPrefRowCount(30);
		
		/*Integer quant = Integer.valueOf(tf2.getText());
		Double price = Double.valueOf(tf2.getText());
		String item = tf1.getText();*/
		
		btn.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				Integer quant = Integer.valueOf(tf2.getText());
				Double price = Double.valueOf(tf2.getText());
				String item = tf1.getText();
				
				ta.appendText("\n"+ item + "\t");
				
				ta.appendText(quant + " @ RM" + price + "\t");
				
				Double total = price*quant;
				ta.appendText("\tRM"+String.valueOf(total));
				totquant+=quant;
				sum+=total;
				
				
			}
			});
			
		btn2.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				ta.appendText("\n"+totquant);
				ta.appendText("\nRM"+sum);
				
				
			}
	
			
		});
		VBox vb = new VBox();
		vb.setMargin(lbl1, new Insets(10, 10, 10, 10));  
		vb.setMargin(lbl2, new Insets(10, 10, 10, 10));
		vb.setMargin(lbl3, new Insets(10, 10, 10, 10));
		
		ObservableList list = vb.getChildren(); 
	      
	      //Adding all the nodes to the observable list 
	      list.addAll(lbl1,lbl2,lbl3); 
	      
	      VBox vb2 = new VBox();
			vb2.setMargin(tf1, new Insets(10, 10, 10, 10));  
			vb2.setMargin(tf2, new Insets(10, 10, 10, 10));
			vb2.setMargin(tf3, new Insets(10, 10, 10, 10));
			
			ObservableList list2 = vb2.getChildren(); 
		      
		      //Adding all the nodes to the observable list 
		      list2.addAll(tf1,tf2,tf3); 
		      
		      VBox vb3 = new VBox();
				vb3.setMargin(btn, new Insets(10, 20, 10, 10));  
				vb3.setMargin(btn2, new Insets(10, 20, 10, 10));
				
				
				ObservableList list3 = vb3.getChildren(); 
			      
			      //Adding all the nodes to the observable list 
			      list3.addAll(btn,btn2); 
		
		GridPane gp = new GridPane();
		gp.setMinSize(100, 200); 
		gp.setPadding(new Insets(10, 10, 10, 10)); 
		gp.setVgap(5); 
	    gp.setHgap(5); 
		gp.add(vb, 1, 1);
		/*gp.add(lbl2, 0, 1);
		gp.add(lbl3, 0, 2);*/
		//gp.add(tf1, 2, 0);
		gp.add(vb2, 2, 1);
		//gp.add(tf3, 2, 2);
		ta.setStyle("-fx-control-inner-background: yellow");
		//gp.add(ta, 4,1);
		vb3.setAlignment(Pos.CENTER_RIGHT); //why?
		
		BorderPane bp = new BorderPane();
		
		bp.setLeft(gp);
		bp.setCenter(vb3);
		bp.setRight(ta);
		
		
		Scene scene = new Scene(bp);
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String args[]){ 
	      launch(args); 
	   } 
	
}
