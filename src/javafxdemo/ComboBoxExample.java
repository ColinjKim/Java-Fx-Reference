package javafxdemo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
//https://www.youtube.com/watch?v=Bg5VcIL2IhY

public class ComboBoxExample extends Application{
	 Stage window;
	 Scene scene;
	 Button button;
	 ComboBox<String> comboBox;
	 
	 public static void main(String[] args) {
		 launch(args);
	 }

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		window = primaryStage;
		window.setTitle("listening");
		button = new Button("Click me");
		
		//create combobox
		comboBox = new ComboBox<>();
		comboBox.getItems().addAll(
				"wlu",
				"uw",
				"conestoga"
				);
		
		//prompt text
		comboBox.setPromptText("What school do you go to?");
		comboBox.setEditable(true);
		comboBox.setOnAction(e -> System.out.println("User selected: "+ comboBox.getValue()));
		//button.setOnAction(e ->printSchool());
		
		
		
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20,20,20,20));
		layout.getChildren().addAll(comboBox,button);
		
		scene = new Scene(layout,300,250);
		window.setScene(scene);
		window.show();
	}
	private void printSchool() {
		// TODO Auto-generated method stub
		System.out.println(comboBox.getValue());
	}

}
