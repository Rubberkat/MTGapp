package gui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import methods.MiscMethods;

public class DiceRollController {
	
	MiscMethods miscmethods = new MiscMethods();
	Stage s = new Stage();
	
	@FXML private Label dicenumber;
	
	@FXML private Button gomainmenu;
	@FXML private Button goflipcoin;
	@FXML private Button golifetracker;
	
	public void diceRoll() {
		dicenumber.setText(String.valueOf(miscmethods.diceRoll()));
	}
	
	public void goMainMenu() {
		Stage thisStage = ((Stage)gomainmenu.getScene().getWindow());
		thisStage.hide();
			
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("MainMenu.fxml"));
			Parent root = loader.load();
			@SuppressWarnings("unused")
			MainMenuController controller = (MainMenuController)loader.getController();
		
			s.setScene(new Scene(root, 600, 400));
			s.centerOnScreen();	
			s.setResizable(false);
			s.setTitle("Main menu");
			s.show();
			s.toFront();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public void goFlipCoin() {
		Stage thisStage = ((Stage)goflipcoin.getScene().getWindow());
		thisStage.hide();
			
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("CoinFlip.fxml"));
			Parent root = loader.load();
			@SuppressWarnings("unused")
			CoinFlipController controller = (CoinFlipController)loader.getController();
		
			s.setScene(new Scene(root, 600, 400));
			s.centerOnScreen();
			s.setResizable(false);
			s.setTitle("Main menu");
			s.show();
			s.toFront();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public void goLifeTracker() {
		Stage thisStage = ((Stage)golifetracker.getScene().getWindow());
		thisStage.hide();
			
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("LifeTracker.fxml"));
			Parent root = loader.load();
			@SuppressWarnings("unused")
			LifeTrackerController controller = (LifeTrackerController)loader.getController();
		
			s.setScene(new Scene(root, 600, 400));
			s.centerOnScreen();	
			s.setResizable(false);
			s.setTitle("Main menu");
			s.show();
			s.toFront();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
