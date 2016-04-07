package gui.methods;

import java.sql.*;

public class DatabaseMethods {

	
	public static void connectDB() {
		Statement stmt = null;		
		Connection c = null;
		
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
		
	public static void createDB() {
		Statement stmt = null;
		
		connectDB();
		try {
		  String sql = "CREATE TABLE IF NOT EXISTS lifetotal " + 
					   "(ID INTEGER		PRIMARY KEY    	AUTOINCREMENT," +
					   " life         	INT)";
		  stmt.executeUpdate(sql);
		  stmt.close();
		  
		  ResultSet rs = stmt.executeQuery("SELECT * FROM lifetotal;");
		  if (!rs.next()) {
			  	String insert = "INSERT INTO lifetotal (life) VALUES(20);";
			  	for (int i=1; i<3; i++)										//for loop is needed for more players
			  	stmt.executeUpdate(insert);
			  	stmt.close();
			}
		} 
		catch (Exception e) {
		  e.printStackTrace();
		}
	}
}

