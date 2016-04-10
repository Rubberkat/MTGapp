package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import methods.*;

public class CoinFlipController {
	MiscMethods miscmethods = new MiscMethods();
	@FXML private Label landedcoin;
	
	public void flipACoin() throws InterruptedException {
		landedcoin.setText(miscmethods.coinFlip());
	}
}
