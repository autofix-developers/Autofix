package com.autofix.dev.database;

import java.sql.*;

class DBConnection {
	
	private static Connection connection = null;
	private static String dbURL = "jdbc:mysql://localhost:3306/autofixdb?zeroDateTimeBehavior=convertToNull";
	private static String dbUsername = "root";
	private static String dbPassword = "DB_root@7797";
	
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded");
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	static Connection getConnection(){
		
		try {
			connection = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
			System.out.println("Connection Established");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return connection;
	}
	
}
