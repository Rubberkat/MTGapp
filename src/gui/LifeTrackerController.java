package gui;

import java.net.URL;
import java.util.ResourceBundle;

import connect.DatabaseMethods;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class LifeTrackerController implements Initializable {
	DatabaseMethods db = new DatabaseMethods();
	
	@FXML private Label top;
	
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
	
	public void setLife(String l) {
		
		top.setText(l);
	}
}
