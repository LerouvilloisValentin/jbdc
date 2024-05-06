package frdigi2024;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {

	public static void main(String[] args) throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:mysql://bbefrgii0bh6rhcnwmps-mysql.services.clever-cloud.com:3306/bbefrgii0bh6rhcnwmps","u1x0g0xahjzlykyt","");
		System.out.println(connection);
		connection.close();
	}

}
