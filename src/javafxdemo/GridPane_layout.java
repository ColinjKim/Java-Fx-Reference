package javafxdemo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

// using grid pane https://youtu.be/YtKF1JKtRWM
public class GridPane_layout extends Application{

	Stage window;
	Button button;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		window = primaryStage;
		window.setTitle("Grid Pane test");
		
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10,10,10,10));
		grid.setVgap(8);
		grid.setHgap(10);
		
		//Name label
		Label nameLabel = new Label("Username:");
		GridPane.setConstraints(nameLabel, 0, 0);
		
		//name input
		TextField nameInput = new TextField();
		nameInput.setPromptText("Username");
		GridPane.setConstraints(nameInput, 1,0);
		
		//Name label
		Label pwLabel = new Label("Password:");
		GridPane.setConstraints(pwLabel, 0, 1);
				
		//name input
		TextField pwInput = new TextField();
		pwInput.setPromptText("password");
		GridPane.setConstraints(pwInput, 1,1);
		
		Button loginButton = new Button("Log In");
		GridPane.setConstraints(loginButton, 1,2);
		
		grid.getChildren().addAll(nameLabel,nameInput,pwLabel,pwInput,loginButton);
		Scene scene = new Scene(grid,300,300);
		window.setScene(scene);
		window.show();
	}

}
