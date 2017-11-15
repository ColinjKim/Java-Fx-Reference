package javafxdemo;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//changing scenes

public class SecMain extends Application{
	
	Stage window;
	Scene scene1, scene2;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		window = primaryStage;
		
		Label label1 = new Label("Welcome to the first scene!");
		Button button1 = new Button("Next Scene");
		button1.setOnAction(e ->{
			window.setScene(scene2);
		});
		Button button2 = new Button("Previous Scene");
		button2.setOnAction(e ->{
			window.setScene(scene1);
		});
		
		//Layout 1 - cildren are laid out in vertical column
		VBox layout1 = new VBox(20);
		layout1.getChildren().addAll(label1, button1);
		scene1 = new Scene(layout1, 300, 300);
		
		//Layout 2 
		StackPane layout2 = new StackPane();
		layout2.getChildren().add(button2);
		scene2 = new Scene(layout2 , 300, 300);
		
		window.setScene(scene1);
		window.setTitle("changing scenes");
		window.show();
		
	}
}
