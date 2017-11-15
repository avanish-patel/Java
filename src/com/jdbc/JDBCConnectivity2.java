package com.jdbc;

import java.sql.*;

public class JDBCConnectivity2 {
	
	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/LearnDatabase";
		String user="root";
		String password="einstein";
		
		
		
		try {
			
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(url, user, password);
			
			Statement statement = connection.createStatement();
			
			
			// instead of executeQuery use execute update
			int count= statement.executeUpdate("insert into student2 values(3,'Pranav')");
			
			System.out.println(count+" row/s updated");
			
			statement.close();
			connection.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
