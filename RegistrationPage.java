package application;
			import java.io.File;
			import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
			import java.io.PrintWriter;
			import java.time.LocalDate;
import java.util.ArrayList;

import javafx.application.Application;
			import javafx.beans.value.ChangeListener;
			import javafx.beans.value.ObservableValue;
			import javafx.collections.FXCollections;
			import javafx.collections.ObservableList;
			import javafx.event.ActionEvent;
			import javafx.event.EventHandler;
			import javafx.geometry.Insets;
			import javafx.scene.Scene;
			import javafx.scene.control.Button;
			import javafx.scene.control.CheckBox;
			import javafx.scene.control.ChoiceBox;
			import javafx.scene.control.ComboBox;
			import javafx.scene.control.DatePicker;
			import javafx.scene.control.Label;
			import javafx.scene.control.RadioButton;
			import javafx.scene.control.TextArea;
			import javafx.scene.control.TextField;
			import javafx.scene.control.Toggle;
			import javafx.scene.control.ToggleGroup;
			import javafx.scene.image.Image;
			import javafx.scene.image.ImageView;
			import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
			import javafx.scene.layout.VBox;
			import javafx.scene.paint.Color;
			import javafx.stage.Stage;

			public class RegistrationPage extends Application{
				String gender = "";
				String tech = "";
				String choice = "";
				public void start(Stage primaryStage) throws Exception {
					/*
					VBox vbox1 = new VBox();
					VBox vbox2 = new VBox();
					VBox vbox3 = new VBox();
					HBox hbox1 = new HBox();
					HBox hbox2 = new HBox();
					HBox hbox3 = new HBox();
					HBox hbox4 = new HBox();
					HBox hbox5 = new HBox();
					TextField name = new TextField();
					RadioButton male = new RadioButton("male");
					RadioButton female = new RadioButton("female");
					CheckBox java = new CheckBox("Java");
					CheckBox dotNet = new CheckBox("Dot Net");
					CheckBox yes = new CheckBox("Yes");
					CheckBox no = new CheckBox("No");
					ComboBox box = new ComboBox();
					Button process = new Button("Register");
					
					
					FlowPane flowPane = new FlowPane();
					DatePicker datePicker = new DatePicker();
					
				
					vbox1.getChildren().addAll(new Label("Name"), new Label("Date of birth"), new Label("Gender"),new Label("Reservation"),new Label("Technologies Known"));
					hbox1.getChildren().addAll(male, female);
					hbox2.getChildren().addAll(yes, no);
					hbox3.getChildren().addAll(java, dotNet);
					vbox2.getChildren().addAll(name, datePicker, hbox1, hbox2, hbox3);
					TextArea qualification = new TextArea();
					hbox4.getChildren().addAll(new Label("Educational qualification"), qualification);
					hbox5.getChildren().addAll(new Label("Location"), box);
					
					
					
					File file = new File("register.txt");
					ToggleGroup group = new ToggleGroup();
					ToggleGroup group2 = new ToggleGroup();
					male.setToggleGroup(group);
					female.setToggleGroup(group);
					ObservableList<String> names = FXCollections.observableArrayList("Engineering", "MCA", "MBA", "Graduation", "MTech", "Mphill", "Phd");
					ChoiceBox<String> location = new ChoiceBox();
					flowPane.getChildren().addAll(vbox1, vbox2, hbox4, hbox5, process);
					group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
						
						@Override
						public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
							if(group.getSelectedToggle() == male) {
								gender = male.getText();
							}
							else {
								gender = female.getText();
							}
						}
					});
					try {
						PrintWriter writer = new PrintWriter(file);
						
						yes.setOnAction(new EventHandler<ActionEvent>() {
							public void handle(ActionEvent event) {
								tech = "Yes";
							}
						});
						
						no.setOnAction(new EventHandler<ActionEvent>() {
							public void handle(ActionEvent event) {
								tech = "No";
							}
						});
						
						ArrayList<String> Technologies = new ArrayList<String>();
						
						process.setOnAction(new EventHandler<ActionEvent>() {
							@Override
							public void handle(ActionEvent event) {
								System.out.println("Name" + name.getText());
								LocalDate date = datePicker.getValue();
								System.out.println(date.toString());
								//radio button
								if(male.isSelected()) {
									System.out.println("male");
								} else
								{
									System.out.println("Female");
								}
								
								/*if(javaCheckBox.isSelected())
								  {System.out.println("Java");
								  Technologies.add(javaCheckBox.getText());
								  }
								  if(dotNetBox.isSelected())
								  {
								  System.out.println("Dot Net");
								  Technologies.add(dotnetCheckBox.getText());
								  }
								  Student a = new Student(date.toString(), nameText.getText(), gender, Technologies);
								  
								  
								  try(PrintWriter output = new PrintWriter(new FileOutputStream(new File("persons.txt"),true)))
						{
							System.out.println(a.name);
					
							output.print(a.toString()+"\n");
							
						}
						catch(Exception e){
							System.out.println("Error!");
						}
								
								
							}
						});
						
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					}
					*/
					
					TextField name = new TextField();
					DatePicker datePicker = new DatePicker();
					RadioButton female = new RadioButton("Female");
					RadioButton male = new RadioButton("Male");
					CheckBox yes = new CheckBox("Yes");
					CheckBox no = new CheckBox("No");
					CheckBox java = new CheckBox("Java");
					CheckBox dotnet = new CheckBox("Dot Net");
					ObservableList<String> names = FXCollections.observableArrayList("Engineering", "MCA", "MBA", "Graduation", "MTech", "Mphill", "Phd");
					ComboBox cb = new ComboBox(names);
					Button register = new Button("Register");
					ChoiceBox cb2 = new ChoiceBox(FXCollections.observableArrayList(
						    "Meow", "Mow", "Miao")
						); //this will be affected by application.css
					
					ToggleGroup group = new ToggleGroup();
					
					female.setToggleGroup(group);
					male.setToggleGroup(group);
					
					group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
						
						@Override
						public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
							if(group.getSelectedToggle() == male) {
								gender = male.getText();
							}
							else {
								gender = female.getText();
							}
						}
					});
					
					File file = new File("register.txt");
					
					try {
						PrintWriter writer = new PrintWriter(file);
						
						yes.setOnAction(new EventHandler<ActionEvent>() {
							public void handle(ActionEvent event) {
								tech = "Yes";
							}
						});
						
						no.setOnAction(new EventHandler<ActionEvent>() {
							public void handle(ActionEvent event) {
								tech = "No";
							}
						});
						
						ArrayList<String> Technologies = new ArrayList<String>();
						
						register.setOnAction(new EventHandler<ActionEvent>() {
							@Override
							public void handle(ActionEvent event) {
								System.out.println("Name: " + name.getText());
								LocalDate date = datePicker.getValue();
								//System.out.println(date.toString());
								//radio button
								System.out.println("Gender: ");
								if(male.isSelected()) {
									System.out.println("Male");
								} else
								{
									System.out.println("Female");
								}
								
								if(java.isSelected())
								  {System.out.println("Java");
								  Technologies.add(java.getText());
								  }
								  if(dotnet.isSelected())
								  {
								  System.out.println("Dot Net");
								  Technologies.add(dotnet.getText());
								  }
								  Student a = new Student(date.toString(), name.getText(), Technologies, gender);
								  
								  
								  try(PrintWriter output = new PrintWriter(new FileOutputStream(new File("persons.txt"),true)))
						{
							System.out.println(a.name);
					
							output.print(a.toString()+"\n");
							
						}
						catch(Exception e){
							System.out.println("Error!");
						}
								
								
							}
						}
						);
					} 
					catch(Exception e) {
						e.printStackTrace();
					}
					
					GridPane gp = new GridPane();
					
					gp.add(new Label("Name"), 0, 0);
					gp.add(name, 1, 0);
					gp.add(new Label("Date Of Birth"), 0, 1);
					gp.add(datePicker, 1, 1);
					gp.add(new Label("Gender"), 0, 2);
					gp.add(female, 1, 2);
					gp.add(male, 2, 2);
					gp.add(new Label("Reservation"), 0, 3);
					gp.add(yes, 1, 3);
					gp.add(no, 2, 3);
					gp.add(new Label("Technologies Known"), 0, 4);
					gp.add(java, 1, 4);
					gp.add(dotnet, 2, 4);
					gp.add(new Label("Educational Qualification"), 0, 5);
					gp.add(cb, 1, 5);
					gp.add(new Label("Location"), 0, 6);
					gp.add(cb2, 1, 6);
					gp.add(register, 2, 7);
					
					Scene scene = new Scene(gp);
					scene.getStylesheets().add("/application/application.css");
					primaryStage.setScene(scene);
					primaryStage.show();
				}
				public static void main(String[] args) {
					launch(args);
				}
			}
			

