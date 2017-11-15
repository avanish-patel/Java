package com.jdbc;

import java.sql.*;

public class JDBCConnectivity3 {
	
	// using prepared statement
	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/LearnDatabase";
		String user ="root";
		String password="einstein";
		
		int studentId= 5;
		String studentName="Navin";
		
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(url, user, password);
			
			PreparedStatement preparedStatement = connection.prepareStatement("insert into student2 values (?,?)");
			
			preparedStatement.setInt(1, studentId);
			preparedStatement.setString(2, studentName);
			
			int count = preparedStatement.executeUpdate();
			System.out.println(count+" row/s inserted.");
			
			
		} catch (Exception e) {
			
			System.out.println(e);
		}
		
		
	}

}
