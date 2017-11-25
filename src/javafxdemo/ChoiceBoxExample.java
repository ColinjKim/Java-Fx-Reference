package javafxdemo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
//https://www.youtube.com/watch?v=K3CenJ2bMok
public class ChoiceBoxExample extends Application{
	Stage window;
	 Scene scene;
	 Button button;
	 
	 public static void main(String[] args) {
		 launch(args);
	 }

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		window = primaryStage;
		window.setTitle("DropDownMenus");
		button = new Button("Click me");
		//make choice box
		ChoiceBox<String> choicebox1 = new ChoiceBox<>();
		
		//getitems returns the observablelist(choicebox) which you can add items to
		//choicebox1.getItems().add("wlu");
		//choicebox1.getItems().add("uw");
		//choicebox1.getItems().add("conestoga");
		
		//or 
		choicebox1.getItems().addAll("wlu", "uw", "conestoga");
		
		//set default value on choice
		choicebox1.setValue("wlu");
		
		
		
		
		button = new Button("Click me");
		button.setOnAction(e ->{
			getChoice(choicebox1);
		});
		
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20,20,20,20));
		layout.getChildren().addAll(choicebox1,button);
		
		scene = new Scene(layout,300,250);
		window.setScene(scene);
		window.show();
	}
	//to get the value choice 
	private void getChoice(ChoiceBox<String> choicebox1) {
		// TODO Auto-generated method stub
		
		System.out.println(choicebox1.getValue());
	}
}
