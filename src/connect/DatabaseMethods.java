package connect;

import java.sql.*;
//import gui.MainMenuController;

public class DatabaseMethods {
//	MainMenuController mainmenucontroller = new MainMenuController();
	private static Connection c;
	private static Statement stmt;
	private static ResultSet rs;
	int totallife = 0;
	
	public DatabaseMethods() {
		try{
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:playerlife.db");
	          
			stmt = c.createStatement();
			stmt.close();

		} 
		catch (Exception e) {
		  e.printStackTrace();
		}
	}
	

		
	public void createDB() {

		try {
		  String sql = "CREATE TABLE IF NOT EXISTS lifetotal " + 
					   "(ID INTEGER		PRIMARY KEY    	AUTOINCREMENT," +
					   " life         	INT)";
		  
		  
		  stmt.executeUpdate(sql);
		  
		  rs = stmt.executeQuery("SELECT * FROM lifetotal;");
		  if (!rs.next()) {
			  	String insert = "INSERT INTO lifetotal (life) VALUES(20);";
			  	for (int i=1; i<2; i++)										//for loop is needed for more players
			  	stmt.executeUpdate(insert);
			  	stmt.close();
			}
		} 
		catch (Exception e) {
		  e.printStackTrace();
		}
	}
	
	public int getLife() {
		return totallife;
	}

	public int setLife() {
		
		try {
			rs = stmt.executeQuery("SELECT life FROM lifetotal WHERE ID = 1");
			while (rs.next()) {
				int life = rs.getInt("life");
				totallife = life;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return totallife;
	}
	
	public void plusOneLife() {
		try { 
			rs = stmt.executeQuery( "SELECT life FROM lifetotal WHERE ID = 1" );
			while (rs.next()) {
				int life = rs.getInt("life");
				int plusOne = life + 1;
				PreparedStatement prep = c.prepareStatement("UPDATE lifetotal set life = ? WHERE ID = 1");
				prep.setInt(1, plusOne);
				prep.executeUpdate();
				totallife = plusOne;
			}
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
			}
	}
	
	public void minusOneLife() {
		try { 
			rs = stmt.executeQuery( "SELECT life FROM lifetotal WHERE ID = 1" );
			while (rs.next()) {
				int life = rs.getInt("life");
				int minusOne = life - 1;
				PreparedStatement prep = c.prepareStatement("UPDATE lifetotal set life = ? WHERE ID = 1");
				prep.setInt(1, minusOne);
				prep.executeUpdate();
				totallife = minusOne;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			}
	}

}


