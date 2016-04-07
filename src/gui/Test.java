package gui;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

import connect.Connect;
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
//		Connect connect = new Connect();
//		Statement stmt = null;
		int g = mainmenucontroller.f + 1;
		top.setText(String.valueOf(g));
		mainmenucontroller.f = g;
//		ResultSet rs = stmt.executeQuery( "SELECT life FROM lifetotal WHERE ID = 1" );
//		
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
