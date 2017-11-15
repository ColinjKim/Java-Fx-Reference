package javafxdemo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
//https://youtu.be/cwJK_WpseKQ
public class extractAndValidateInput extends Application{

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
		window.setTitle("Input extraction/validation");
		
		TextField nameInput = new TextField();
		nameInput.setPromptText("Username");
		
		button = new Button("Click me");
		button.setOnAction(e ->{
			isInt(nameInput, nameInput.getText());
		});
		
		
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20,20,20,20));
		layout.getChildren().addAll(nameInput, button);
		
		scene = new Scene(layout,300,250);
		window.setScene(scene);
		window.show();
		
	}

	private boolean isInt(TextField input, String message) {
		// TODO Auto-generated method stub
		try {
			int age = Integer.parseInt(input.getText());
			System.out.println("User is: " + age);
			return true;
		}catch(NumberFormatException e) {
			System.out.println("Error: " + message + " is not number");
			return false;
		}
	}
	
	
	
	    
}
