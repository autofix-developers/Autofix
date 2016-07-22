package com.autofix.dev.database;

import java.sql.*;

class DBConnection {
	
	private Connection con;
	private String url = "jdbc:mysql://localhost:3306/calc_db";
	private String uname = "root";
	private String pass = "DB_root@7797";
	
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded");
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	Connection getConnection(){
		
		try {
			con = DriverManager.getConnection(url, uname, pass);
			System.out.println("Connection Established");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}
	
}
