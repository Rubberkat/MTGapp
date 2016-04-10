package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import methods.MiscMethods;

public class DiceRollController {
	MiscMethods miscmethods = new MiscMethods();
	@FXML private Label dicenumber;
	
	public void diceRoll() {
		dicenumber.setText(String.valueOf(miscmethods.diceRoll()));
	}
}
