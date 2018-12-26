package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class GroceriesTableViewTut9 extends Application{
	public class Item {
    String item; int qty, price, total;
    Item(String i,int q,int p,int t){
        item = i;
        qty = q;
        price = p;
        total = t;
    }
    //get functions are necessary, with correct naming : getXxx
    public String getItem(){ return item; }
    public int getQty(){ return qty; }
    public int getPrice(){ return price; }
    public int getTotal(){ return total; }
   
    //set functions required when you want to edit the table..
}
   
public void start(Stage primaryStage) throws Exception {
    TextField qtyT = new TextField();
    qtyT.setOnKeyPressed((e)->{
        System.out.println("You pressed "+e.getCode());
    });
    ListView veg = new ListView();
    veg.setOnMouseClicked((e)->{
        System.out.println("You clicked mouse "+e.getClickCount()+" times");
    });
   
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
    
 
    //if you want to add data to the table, just add the "data" var
    data.add(new Item("Carrot",2,300,600));
    data.add(new Item("Burger",3,100,300));
    
    
}

public static void main(String[] args)
{
	launch(args);
}

}


