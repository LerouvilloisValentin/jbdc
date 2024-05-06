package frdigi2024;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class App {

	private static final String DB_URL;
	private static final String DB_USER;
	private static final String DB_PWD;
	
	static {
		ResourceBundle dbConfig = ResourceBundle.getBundle("db");
		DB_URL = dbConfig.getString("db.url");
		DB_USER = dbConfig.getString("db.user");
		DB_PWD = dbConfig.getString("db.pwd");
	}
	
	public static void main(String[] args) throws SQLException {
		Connection connection = DriverManager.getConnection(DB_URL,DB_USER,	DB_PWD);
		System.out.println(connection);
		connection.close();
	}

}
