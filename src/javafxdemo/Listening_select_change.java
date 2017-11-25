package javafxdemo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//https://www.youtube.com/watch?v=WZGyP57IH6M
public class Listening_select_change extends Application{
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
		window.setTitle("listening");
		//make choice box
		ChoiceBox<String> choicebox1 = new ChoiceBox<>();
		choicebox1.getItems().addAll("wlu", "uw", "conestoga");
		choicebox1.setValue("wlu");
		
		//listenfor selection changes
		choicebox1.getSelectionModel().selectedItemProperty().addListener( (v, oldVal, newVal) -> 
		System.out.println(newVal));
		
		
		
		
		button = new Button("Click me");
		
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20,20,20,20));
		layout.getChildren().addAll(choicebox1,button);
		
		scene = new Scene(layout,300,250);
		window.setScene(scene);
		window.show();
	}

}

