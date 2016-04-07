package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class Test implements Initializable {
	@FXML private Label top;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}
	//public void setLifeTotal(String l) {
//		lifetotal = l;
	//}
	//public String getLifeTotal() {
//		return lifetotal;
////		lifetotal.setText(String.valueOf(lifemethods.getTotalHealth()));
	//}

	public void setLife(String l) {
		top.setText(l);
	}
}
