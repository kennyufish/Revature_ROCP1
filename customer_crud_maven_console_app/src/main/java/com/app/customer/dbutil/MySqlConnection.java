package com.app.customer.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection {

	private static Connection connection;

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/rocp-1";
		String username = "root";
		String password = "passwrod1234";
		connection = DriverManager.getConnection(url, username, password);
		return connection;
	}
}
//SingleTon Java Class