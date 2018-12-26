package application;





import java.util.HashMap;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RTut9 extends Application{
	public class Item{
	    String item; int qty;
	    double price, total;
	    Item(String i,int q,double p,double t){
	        item = i;
	        qty = q;
	        price = p;
	        total = t;
	    }
	    //get functions are necessary, with correct naming : getXxx
	    public String getItem(){ return item; }
	    public int getQty(){ return qty; }
	    public double getPrice(){ return price; }
	    public double getTotal(){ return total; }
	   
	    //set functions required when you want to edit the table..
	}
	   
	public void start(Stage primaryStage) throws Exception {
	  
		BorderPane pane = new BorderPane();
		
		HBox fruit = new HBox();
		ObservableList<String> olFruits = 
			    FXCollections.observableArrayList(
			        "Mango",
			        "Berry",
			        "Apple"
			    );
		final ComboBox cbFruit = new ComboBox(olFruits);
		fruit.getChildren().add(new Label("Fruit: "));
		fruit.getChildren().add(cbFruit);
		TextField tfQuantity = new TextField();
		tfQuantity.setPrefColumnCount(5);
		fruit.getChildren().add(new Label("Quantity: "));
		fruit.getChildren().add(tfQuantity);
		
		//second row
		HBox others = new HBox();
		
		VBox secondRowFirstColumn = new VBox();
		ListView<String> lwVegetables = new ListView<String>();
		ObservableList<String> olVegetables =FXCollections.observableArrayList (
		    "Sugar", "Carrot", "Tomato", "Chicken", "Peanut");
		lwVegetables.setItems(olVegetables);
		secondRowFirstColumn.getChildren().add(new Label("Vegetable: "));
		secondRowFirstColumn.getChildren().add(lwVegetables);
		lwVegetables.setPrefWidth(5);
		lwVegetables.setPrefHeight(150);
		others.getChildren().add(secondRowFirstColumn);
		
		
	    //using TableView
	    TableView<Item> itemTable = new TableView<Item>();
	    itemTable.setPrefWidth(350);
	           
	    //prepare columns (header)
	    TableColumn itemCol = new TableColumn("Item");
	    TableColumn qtyCol = new TableColumn("Qty");
	    TableColumn priceCol = new TableColumn("Price");
	    TableColumn totalCol = new TableColumn("Total");
	    itemTable.getColumns().addAll(itemCol,qtyCol,priceCol,totalCol);
	 
	    //set the data for each column
	    itemCol.setCellValueFactory(new PropertyValueFactory<>("item"));
	    qtyCol.setCellValueFactory(new PropertyValueFactory<>("qty"));
	    priceCol.setCellValueFactory(new PropertyValueFactory<>("price"));
	    totalCol.setCellValueFactory(new PropertyValueFactory<>("total"));
	 
	    //assign data to the table
	    ObservableList<Item> data = FXCollections.observableArrayList();
	    itemTable.setItems(data);
	    others.getChildren().add(itemTable);
	    
	    HashMap<String,Double> priceList = new HashMap<String,Double>();
	    priceList.put("Apple", 2.00);
	    priceList.put("Tomato", 5.00);
	    priceList.put("Chicken", 12.50);
	    priceList.put("Peanut", 15.50);
	    priceList.put("Carrot", 3.50);
	    priceList.put("Sugar", 2.50);
	    priceList.put("Berry", 5.00);
	    priceList.put("Mango", 2.50);
	    
	    tfQuantity.setOnKeyPressed((e)->{
			System.out.println("You Pressed " + e.getCode());
			if(e.getCode() ==KeyCode.ENTER) {
				double total = 0;
				double price = 0;
				
				price = priceList.get(cbFruit.getValue().toString());

				total = price*Integer.parseInt(tfQuantity.getText());
				data.add(new Item(cbFruit.getValue().toString(),Integer.parseInt(tfQuantity.getText()),price,total));
			}
		});
	    
	    lwVegetables.setOnMouseClicked((e)->{
			System.out.println("You Clicked " + e.getClickCount());
			if(e.getClickCount() % 2 == 0) {
				double total = 0;
				double price = 0;
				price = priceList.get(lwVegetables.getSelectionModel().getSelectedItem());

				total = price*1;
				data.add(new Item(lwVegetables.getSelectionModel().getSelectedItem(),1,price,total));
			}
		});
	    
	    
	    
	    fruit.setPadding(new Insets(5,5,5,5));
	    secondRowFirstColumn.setPadding(new Insets(5,5,5,5));
	    others.setPadding(new Insets(5,5,5,5));
	    pane.setPadding(new Insets(50,50,50,50));
	    pane.setTop(fruit);
	    pane.setLeft(others);
	    Scene scene = new Scene(pane, 500, 500);
	    primaryStage.setScene(scene);
	    primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}

    

