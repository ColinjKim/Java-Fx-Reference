package javafxdemo;

import javafx.collections.ObservableList;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//www.youtube.com/watch?v=GbzKr46VvD0
public class ListViewExample extends Application{
	 Stage window;
	 Scene scene;
	 Button button;
	 ListView<String> listview;
	 
	 public static void main(String[] args) {
		 launch(args);
	 }

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		window = primaryStage;
		window.setTitle("listening");
		button = new Button("submit");

		listview = new ListView<>();
		listview.getItems().addAll(
				"wlu",
				"uw",
				"conestoga"
				);
		listview.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		
		button.setOnAction(e->ButtonClicked());
		
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20,20,20,20));
		layout.getChildren().addAll(listview,button);
		
		scene = new Scene(layout,300,250);
		window.setScene(scene);
		window.show();
	}

	private void ButtonClicked() {
		// TODO Auto-generated method stub
		String message = "";
		ObservableList<String> schools;
		schools = listview.getSelectionModel().getSelectedItems();
		
		for (String m: schools) {
			message += m + "\n";
		}
		System.out.println(message);
	}

}