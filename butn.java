
package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;


public class butn extends Application {
public void start(Stage primaryStage) throws Exception {
Button btn = new Button("Hello");//node

StackPane root = new StackPane(); //container
root.getChildren().add(btn); //add button to container

Scene scene  = new Scene(root, 200, 200);//create a scene
primaryStage.setScene(scene);//add scene to stage
primaryStage.show();//show the stage
}

public static void main(String[] args )
{
launch(args); //call start method 
}

}