package com.jdbc;

import java.sql.*;

// fetch the data of whole table
public class JDBCConectivity1 {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/LearnDatabase";
		String user = "root";
		String password = "einstein";

		try {

			Class.forName("com.mysql.jdbc.Driver");

			Connection connection = DriverManager.getConnection(url, user, password);

			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery("select * from student2");

			while (resultSet.next()) {
				String student = resultSet.getInt(1) + " : " + resultSet.getString(2);
				System.out.println(student);
			}

		} catch (Exception e) {

			System.out.println(e);

		}
	}

}
