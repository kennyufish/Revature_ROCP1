package jdbc_maven_demo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HelloJdbcAlt {

	public static void main(String[] args) {
		// id,name,age,teamName,gender,city
		List i1 = new ArrayList<>();
		i1.add(1090);
		i1.add("Ky");
		i1.add(21);
		i1.add("BestVolleyBall");
		i1.add("m");
		i1.add("Alhambra");

		Connection connection = null;
		PreparedStatement statement = null;
		try {
			// Step - 1 - Load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded Successfully");

			// Step - 2 - Open Connection(url,username,password)
			String url = "jdbc:mysql://localhost:3306/rocp-1";
			String username = "root";
			String password = "passwrod1234";
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connection sucessful");

			// Step - 3 - Create Statement
			String sql = "INSERT INTO player (id, name, age,teamName,gender, city) values ( ?, ?, ?, ?, ?, ?)";
			statement = connection.prepareStatement(sql);
			statement.setInt(1, new Integer((int) i1.get(0)));
			statement.setString(2, i1.get(1).toString());
			statement.setInt(3, new Integer((int) i1.get(2)));
			statement.setString(4, i1.get(3).toString());
			statement.setString(5, i1.get(4).toString());
			statement.setString(6, i1.get(5).toString());
			
			System.out.println(statement);
			

			System.out.println("Statement Created");

			// Step - 4 - Execute Query
			statement.execute();
			System.out.println("Query executed");

			// Step - 5 - Process Results
//			while(resultSet.next()) {
//				System.out.print("Id :  "+resultSet.getInt("id"));
//				System.out.print(" Name :  "+resultSet.getString("name"));
//				System.out.print(" Age :  "+resultSet.getInt("age"));
//				System.out.print(" Gender :  "+resultSet.getString("gender"));
//				System.out.print(" City :  "+resultSet.getString("city"));
//				System.out.println(" TeamName :  "+resultSet.getString("teamName"));
//			}
//			System.out.println("Results Processed");

		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		} finally {
			try {
				// Step - 6 - Close Connection
				connection.close();
				System.out.println("Connection closed");
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
	}

}
//Recreate the same and try doing Insert to the player table using Statement object only