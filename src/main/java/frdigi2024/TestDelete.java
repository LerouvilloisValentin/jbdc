package frdigi2024;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;



public class TestDelete {

	private static final String DB_URL;
	private static final String DB_USER;
	private static final String DB_PWD;
	
	static {
		ResourceBundle dbConfig = ResourceBundle.getBundle("db");
		DB_URL = dbConfig.getString("db.url");
		DB_USER = dbConfig.getString("db.user");
		DB_PWD = dbConfig.getString("db.pwd");
	}
	
	public static void main(String[] args){
		
		try(Connection connection = DriverManager.getConnection(DB_URL,DB_USER,	DB_PWD);
		
		Statement statement = connection.createStatement();) {
		
		int nb3 = statement.executeUpdate("DELETE FROM FOURNISSEUR WHERE ID=4");
		System.out.println(nb3);
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			
		}
		System.out.println("fin du programme");
	}

}
