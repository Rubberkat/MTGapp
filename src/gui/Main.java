package gui;


import databasefunctions.DatabaseMethods;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    public void start(Stage primaryStage) throws Exception {
    	DatabaseMethods db = new DatabaseMethods();
    	db.createDB();
    	db.setLife();
		Parent root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));

		primaryStage.setResizable(true);
		primaryStage.setTitle("Login Screen");
		primaryStage.setScene(new Scene(root, 600, 400));
		primaryStage.show();
		primaryStage.toFront();
    }
    
	public static void main(String[] args) {
		launch(args);
	}
}
