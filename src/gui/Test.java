package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class Test implements Initializable {
	MainMenuController mainmenucontroller = new MainMenuController();
	@FXML private Label top;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	public void plusLife() {
		int g = mainmenucontroller.f + 1;
		top.setText(String.valueOf(g));
		mainmenucontroller.f = g;
	}
	
	public void minusLife() {
		int g = mainmenucontroller.f - 1;
		top.setText(String.valueOf(g));
		mainmenucontroller.f = g;
	}
	public void setLife(String l) {
		top.setText(l);
	}
}
