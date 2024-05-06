package frdigi2024;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;



public class TestInsertion {

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
		int nb = statement.executeUpdate("INSERT INTO FOURNISSEUR(ID,NOM) VALUES(4,'la maison de la peinture')");
		System.out.println(nb);
		
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			
		}
		System.out.println("fin du programme");
	}

}
