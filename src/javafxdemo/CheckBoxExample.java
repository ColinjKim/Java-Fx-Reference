package javafxdemo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// https://www.youtube.com/watch?v=JWxnoe6APUY&t=1s
public class CheckBoxExample extends Application{

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
		window.setTitle("CheckBox Example");
		
		//check boxes
		CheckBox box1 = new CheckBox("wlu");
		CheckBox box2 = new CheckBox("uw");
		CheckBox box3 = new CheckBox("conestoga");
		
		//how to have check box checked by default
		box1.setSelected(true);
		
		//button
		button = new Button("Click me");
		button.setOnAction(e ->{
			handleOptions(box1,box2,box3);
		});
		
		
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20,20,20,20));
		layout.getChildren().addAll(box1,box2,box3,button);
		
		scene = new Scene(layout,300,250);
		window.setScene(scene);
		window.show();
		
	}
	//handle checkbox options
	private void handleOptions(CheckBox box1, CheckBox box2, CheckBox box3) {
		// TODO Auto-generated method stub
		String message = "User goes to ";
		if(box1.isSelected())
			message += "wlu";
		if(box2.isSelected())
			message += "uw";
		if(box3.isSelected())
			message += "conestoga";
		System.out.println(message);
			
	}


	
	
	    
}

