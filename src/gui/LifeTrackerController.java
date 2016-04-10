package gui;

import java.net.URL;
import java.util.ResourceBundle;

import connect.DatabaseMethods;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class LifeTrackerController implements Initializable {
	MainMenuController mainmenucontroller = new MainMenuController();
	@FXML private Label top;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	public void plusLife() {
		DatabaseMethods db = new DatabaseMethods();
		db.plusOneLife();
		top.setText(String.valueOf(db.getLife()));
	}
	
	public void minusLife() {
		DatabaseMethods db = new DatabaseMethods();
		db.minusOneLife();
		top.setText(String.valueOf(db.getLife()));
	}
	
	public void setLife(String l) {
		
		top.setText(l);
	}
}
