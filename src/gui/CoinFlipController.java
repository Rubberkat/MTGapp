package gui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import methods.MiscMethods;

public class CoinFlipController {
	
	MiscMethods miscmethods = new MiscMethods();
	
	@FXML private Label landedcoin;
	
	@FXML private Button gomainmenu;
	@FXML private Button golifetracker;
	@FXML private Button gorolldice;
	
	public void flipACoin() throws InterruptedException {
		landedcoin.setText(miscmethods.coinFlip());
	}
	
	public void goMainMenu() {
		Stage thisStage = ((Stage)gomainmenu.getScene().getWindow());
		thisStage.hide();
			
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("MainMenu.fxml"));
			Parent root = loader.load();
			@SuppressWarnings("unused")
			MainMenuController controller = (MainMenuController)loader.getController();
			Stage s = new Stage(StageStyle.UNIFIED);
		
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
			Stage s = new Stage(StageStyle.UNIFIED);
		
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
	
	public void goRollDice() {
		Stage thisStage = ((Stage)gorolldice.getScene().getWindow());
		thisStage.hide();
			
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("DiceRoll.fxml"));
			Parent root = loader.load();
			@SuppressWarnings("unused")
			DiceRollController controller = (DiceRollController)loader.getController();
			Stage s = new Stage(StageStyle.UNIFIED);
		
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
