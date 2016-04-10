package gui;

import java.io.IOException;
import databasefunctions.DatabaseMethods;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainMenuController {
	
	DatabaseMethods db = new DatabaseMethods();
	Stage s = new Stage();
	
	public int lifetotal = 0;

	@FXML private Button golifetracker;
	@FXML private Button gocoinflip;
	@FXML private Button godice;
	@FXML private Button exitbutton;

	public void gotoLifeTracker() throws IOException {
		Stage thisStage = ((Stage)golifetracker.getScene().getWindow());
		thisStage.hide();
		
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("LifeTracker.fxml"));
			Parent root = loader.load();
			LifeTrackerController controller = (LifeTrackerController)loader.getController();
				
			s.setScene(new Scene(root, 300, 400));
			s.centerOnScreen();
			s.setResizable(false);
			s.setTitle("lifetracker");
			s.show();
			s.toFront();
			
			getLife();
			controller.setLife(String.valueOf(lifetotal));
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	} 
	
	public void getLife(){
		lifetotal = db.setLife();
	}
	
	public void goCoinFlip() throws IOException {
		Stage thisStage = ((Stage)gocoinflip.getScene().getWindow());
		thisStage.hide();
		
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("CoinFlip.fxml"));
			Parent root = loader.load();
			@SuppressWarnings("unused")
			CoinFlipController controller = (CoinFlipController)loader.getController();
			
			s.setScene(new Scene(root, 600, 400));
			s.centerOnScreen();
			
			s.setResizable(false);
			s.setTitle("Coinflip");
	
			s.show();
			s.toFront();
			
			getLife();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	} 
	
	public void goDice() throws IOException {
		Stage thisStage = ((Stage)godice.getScene().getWindow());
		thisStage.hide();
		
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("DiceRoll.fxml"));
			Parent root = loader.load();
			@SuppressWarnings("unused")
			DiceRollController controller = (DiceRollController)loader.getController();
	
			s.setScene(new Scene(root, 600, 400));
			s.centerOnScreen();
			s.setResizable(false);
			s.setTitle("Dice");
			s.show();
			s.toFront();
			
			getLife();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	} 
	
	public void exit() {
		Stage thisStage = (Stage) exitbutton.getScene().getWindow();
		thisStage.close();
	}
}
