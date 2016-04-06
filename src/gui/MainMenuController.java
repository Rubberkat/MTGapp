package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MainMenuController implements Initializable {
	@FXML private Button golifetracker;

	
	
	public void gotoLifeTracker() throws IOException {
		Stage thisStage = ((Stage)golifetracker.getScene().getWindow());
		thisStage.hide();
		
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("LifeTracker.fxml"));
			Parent root = loader.load();
			MainMenuController controller = (MainMenuController)loader.getController();
			Stage s = new Stage(StageStyle.UNIFIED);
			
			
			s.setScene(new Scene(root, 600, 400));
			s.centerOnScreen();
			
			s.setResizable(false);
			s.setTitle("lifetracker");
	
			s.show();
			s.toFront();
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	} 
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
}
