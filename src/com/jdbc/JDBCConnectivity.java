package com.jdbc;

// import the package
import java.sql.*;

// fetch the data of one entity
public class JDBCConnectivity {

	public static void main(String[] args) {

		
		String url = "jdbc:mysql://localhost:3306/LearnDatabase";
		String user = "root";
		String password = "einstein";

		try {
			// load and register the driver

			Class.forName("com.mysql.jdbc.Driver");

			// create the connection

			Connection connection = DriverManager.getConnection(url, user, password);

			// create the statement
			Statement statement = connection.createStatement();

			// execute the query

			ResultSet resultSet = statement.executeQuery("select * from student2 where studentId=2");

			// move the pointer
			resultSet.next();

			// process the result
			String name = resultSet.getString("studentName");

			System.out.println(name);

			// close the connection
			statement.close();
			connection.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
