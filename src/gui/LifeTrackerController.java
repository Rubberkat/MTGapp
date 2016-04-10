package gui;


import java.net.URL;
import java.util.ResourceBundle;
import databasefunctions.DatabaseMethods;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class LifeTrackerController implements Initializable {
	
	DatabaseMethods db = new DatabaseMethods();
	Stage s = new Stage();
	
	@FXML private Label top;
	
	@FXML private Button gorolldice;
	@FXML private Button goflipcoin;
	@FXML private Button gomainmenu;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	public void plusLife() {
		db.plusOneLife();
		top.setText(String.valueOf(db.getLife()));
	}
	
	public void minusLife() {
	
		db.minusOneLife();
		top.setText(String.valueOf(db.getLife()));
	}
	public void resetLife() {
		db.resetLife();
		top.setText(String.valueOf(db.getLife()));
	}
	public void setLife(String l) {
		
		top.setText(l);
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
	
	public void goRollDice() {
		Stage thisStage = ((Stage)gorolldice.getScene().getWindow());
		thisStage.hide();
			
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("DiceRoll.fxml"));
			Parent root = loader.load();
			@SuppressWarnings("unused")
			DiceRollController controller = (DiceRollController)loader.getController();
		
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
}
