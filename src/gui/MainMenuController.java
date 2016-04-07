package gui;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import gui.LifeMethods;

public class MainMenuController{

	private int f = 20;
	private LifeMethods lifemethods;
	@FXML private Button golifetracker;


	


	public void gotoLifeTracker() throws IOException {
		Stage thisStage = ((Stage)golifetracker.getScene().getWindow());
		thisStage.hide();
		
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
		
			controller.setLife(String.valueOf(f));
		} catch (Exception e) {
			e.printStackTrace();
		} 
	} 
	

}
