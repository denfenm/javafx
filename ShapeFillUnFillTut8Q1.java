package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ShapeFillUnFillTut8Q1 extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		final ToggleGroup group = new ToggleGroup();
		
		Circle c = new Circle(50, 50, 70);
		c.setFill(Color.TRANSPARENT);
		c.setStroke(Color.BLACK);
		c.setStrokeWidth(3);
		Label clb = new Label("Circle");
		RadioButton crb = new RadioButton();
		crb.setToggleGroup(group);
		
		Rectangle r = new Rectangle(50, 50, 60, 70);
		r.setFill(Color.TRANSPARENT);
		r.setStroke(Color.BLACK);
		r.setStrokeWidth(3);
		Label rlb = new Label("Rectangle");
		RadioButton rrb = new RadioButton();
		rrb.setToggleGroup(group);
		
		Ellipse e = new Ellipse(50, 50, 40, 30);
		e.setFill(Color.TRANSPARENT);
		e.setStroke(Color.BLACK);
		e.setStrokeWidth(3);
		Label elb = new Label("Ellipse");
		RadioButton erb = new RadioButton();
		erb.setToggleGroup(group);
		
		Label fill = new Label("Fill");
		
		CheckBox cb = new CheckBox();
		HBox hb = new HBox();
		hb.setMinHeight(5);
		hb.setMinWidth(80);
		hb.setAlignment(Pos.CENTER);
		hb.getChildren().addAll(clb,crb, rlb,rrb,elb,erb,cb, fill);
		
		VBox vb = new VBox();
		vb.setMinWidth(80);
		vb.setMinHeight(100);
		vb.setAlignment(Pos.CENTER);
				
		crb.setOnAction(value -> {
			vb.getChildren().clear();
			vb.getChildren().add(c);
			
		});
		
		rrb.setOnAction(value -> {
			vb.getChildren().clear();
			vb.getChildren().add(r);
		});
		
		erb.setOnAction(value -> {
			vb.getChildren().clear();
			vb.getChildren().add(e);
		});
		
		cb.setOnAction(value -> {
			
			if(crb.isSelected()) {
				c.setFill(Color.RED);
				c.setStroke(Color.GREEN);
				c.setStrokeWidth(10);
			
			} else if (rrb.isSelected()) {
				r.setFill(Color.YELLOW);
				r.setStroke(Color.RED);
				r.setStrokeWidth(10);
			
			}
		});
		
			
		
		
		/*toggleGroup.selectedToggleProperty.addChangeListener(
		 * RadioButton r = (RadioButton) tg.getSelectedTogle();
		 * String s = r.getText();
		 * )
		 * if (s.eqials("Circle")) {
		 * container.gc().asdkjaslkdja
		 * 
		 * 
		 * radio.setOnAction*/
		
		VBox cont = new VBox();
		cont.getChildren().addAll(vb, hb);
		Scene scene = new Scene(cont, 200, 200);
		stage.setTitle("Fun Of Shapes");
		stage.setScene(scene);
		stage.show();
		
		
	}
	public static void main(String[] args) {
		launch(args);
	}

	
}
