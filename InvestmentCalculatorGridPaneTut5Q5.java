package application;
import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class InvestmentCalculatorGridPaneTut5Q5 extends Application {
@Override
public void start(Stage stage) throws Exception {
	GridPane gp = new GridPane();
	gp.setPadding(new Insets(10, 10, 10, 10));
    gp.setVgap(5);
    gp.setHgap(5);
    gp.setAlignment(Pos.CENTER);
    Scene scene = new Scene(gp, 300, 200);
	
    Label ia = new Label("Investment Amount: ");
    GridPane.setHalignment(ia, HPos.RIGHT);
    gp.add(ia, 0, 1);
    
    TextField iaf = new TextField();
    GridPane.setHalignment(iaf, HPos.RIGHT);
    gp.add(iaf, 1, 1);
    
    
    Label ny = new Label("Number of Years: ");
    GridPane.setHalignment(ny, HPos.RIGHT);
    gp.add(ny, 0, 2);
  
    
    
    
    TextField nyf = new TextField();
    GridPane.setHalignment(nyf, HPos.RIGHT);
    gp.add(nyf, 1,2 );
   
    
    
    
    Label air = new Label("Annual Interest Rate: ");
    GridPane.setHalignment(air, HPos.RIGHT);
    gp.add(air, 0, 3);
    
    TextField airf = new TextField();
    GridPane.setHalignment(airf, HPos.RIGHT);
    gp.add(airf, 1,3);
  
    
    
    
    Label fv = new Label("Future Value: ");
    GridPane.setHalignment(fv, HPos.RIGHT);
    gp.add(fv,0, 4);
    
    TextField fvf = new TextField();
    GridPane.setHalignment(fvf, HPos.RIGHT);
    gp.add(fvf, 1, 4);
   
    
    
    Button calc = new Button("Calculate");
    GridPane.setHalignment(calc, HPos.RIGHT);
    gp.add(calc, 1,6);
   calc.setOnAction(value -> {
	   
	   Integer inam = Integer.valueOf(iaf.getText());
	   Integer annintr = Integer.valueOf(airf.getText());
	   Integer numyears = Integer.valueOf(nyf.getText());
	   
	   Integer answer =  inam*numyears*(annintr/100);
			fvf.setText(String.valueOf(answer));
   });
    
    stage.setTitle("Investment Calculator");
    stage.setScene(scene);
    stage.show();
}
public static void main(String[] args)
{
	launch(args);
}

}
