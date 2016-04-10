package gui;

import java.io.IOException;
import connect.DatabaseMethods;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MainMenuController{
	DatabaseMethods db = new DatabaseMethods();
	public int f = 20;

	@FXML private Button golifetracker;

	public void gotoLifeTracker() throws IOException {
		Stage thisStage = ((Stage)golifetracker.getScene().getWindow());
		thisStage.hide();
//		DatabaseMethods dbm = new DatabaseMethods();
//		dbm.plusOneLife();
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("LifeTracker.fxml"));
			Parent root = loader.load();
			Test controller = (Test)loader.getController();
			Stage s = new Stage(StageStyle.UNIFIED);
			
			
			s.setScene(new Scene(root, 600, 400));
			s.centerOnScreen();
			
			s.setResizable(false);
			s.setTitle("lifetracker");
	
			s.show();
			s.toFront();
			
			getLife();
			controller.setLife(String.valueOf(f));
		} catch (Exception e) {
			e.printStackTrace();
		} 
	} 
	
	public void getLife(){
		f = db.setLife();
	}
}
