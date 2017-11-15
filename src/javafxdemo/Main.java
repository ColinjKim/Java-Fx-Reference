package javafxdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application{
	Button button;
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception{
		primaryStage.setTitle("Java Fx Demo");
		button = new Button("Click");
		//button with one line fucntion
		//button.setOnAction(e -> System.out.println("this is better"));
		
		
		//to run alertbox
		/*
		button.setOnAction(e -> { 
				AlertBox.display("AlertBox", "this is alertbox");
		});
		*/
		
		//to run confirmbox
		button.setOnAction(e -> { 
			boolean result = ConfirmBox.display("Title of window", "are you sure you want to procceed?");
			System.out.println(result);
		});
		
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		Scene scene = new Scene(layout, 400,600);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	
	
}
