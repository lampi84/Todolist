package de.palamb.javafx.todolist;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Hello world!
 *
 */
public class App extends Application
{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// Load FXML file for scene building
		Parent root = FXMLLoader.load(getClass().getResource("/todolist.fxml"));
	    
		// Setup Scene and Stage
		Scene scene = new Scene(root, 300, 275);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	
	public static void main(String[] args) {
		launch(args);
	}
}
