package com.autofix.dev.database;

import java.sql.*;
import java.util.*;

import com.autofix.dev.model.User;

public class DBActions {
    private static final DBConnection db = new DBConnection();
    private static Connection con = null;
	
    public static List<User> getAllUsers() throws SQLException{
		Map<Long, User> users = new HashMap<>();
		String query = "select * from user where delete_status = 'No'";
		try{
            con = db.getConnection();
            ResultSet res = db.executeSelectQuery(query);
            while(res.next()){
            	users.put(res.getLong("user_id"), new User(res.getLong("user_id"), res.getString("user_type"), 
						res.getString("username"), res.getString("password"), res.getString("name"), 
						res.getString("email"), res.getString("gender"), res.getLong("phone"), 
						res.getString("address_1"), res.getString("address_2"), res.getString("address_3"), 
						res.getString("city"), res.getString("state"), res.getString("country"), 
						res.getString("zip_code"), res.getTimestamp("created_at"), res.getTimestamp("modified_at"), 
						res.getString("delete_status"), res.getTimestamp("deleted_at")));
            }
            res.close();
            db.closeConnection(con);
		}catch(Exception e){
			throw new SQLException(e);
		}
		return new ArrayList<User>(users.values());
	}
    
    public static User getUser(User user) throws SQLException{
		String query = "select * from user where delete_status = 'No' and user_id = " +user.getUserId();
		try{
            con = db.getConnection();
            ResultSet res = db.executeSelectQuery(query);
            if(res.isBeforeFirst()){
            	while(res.next()){
                	user = new User(res.getLong("user_id"), res.getString("user_type"), 
    				res.getString("username"), res.getString("password"), res.getString("name"), 
    				res.getString("email"), res.getString("gender"), res.getLong("phone"), 
    				res.getString("address_1"), res.getString("address_2"), res.getString("address_3"), 
    				res.getString("city"), res.getString("state"), res.getString("country"), 
    				res.getString("zip_code"), res.getTimestamp("created_at"), res.getTimestamp("modified_at"), 
    				res.getString("delete_status"), res.getTimestamp("deleted_at"));
                }
            }
            else{
            	user = null;
            }
            res.close();
            db.closeConnection(con);
		}catch(Exception e){
			throw new SQLException(e);
		}
		return user;
	}
    
    public static boolean isUserExists(User user) throws SQLException{
    	String query = "select * from user where email = '" +user.getEmail() +"' or phone = " +user.getPhone();
    	try{
            con = db.getConnection();
            ResultSet res = db.executeSelectQuery(query);
            if(res.isBeforeFirst()){
            	return true;
            }
            res.close();
            db.closeConnection(con);
		}catch(Exception e){
			throw new SQLException(e);
		}
    	return false;
    }
	
	public static User insertUserDB(User user) throws SQLException{
		if(isUserExists(user)){
			throw new SQLException("SQLError - error while inserting user details in database. "
					+ "The email or phone already exists in the database");
		}
		int i=0;
		String query = "insert into user(user_type, username, password, name, gender, email, phone) values(?,?,?,?,?,?,?)";
		try {
			con = db.getConnection();
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1, user.getUserType());
			ps.setString(2, user.getUsername());
			ps.setString(3, user.getPassword());
			ps.setString(4, user.getName());
			ps.setString(5, user.getGender());
			ps.setString(6, user.getEmail());
			ps.setLong(7, user.getPhone());
			
			i = ps.executeUpdate();
			System.out.println(i +" Records successfully inserted.");
			
			if(i == 1){
				query = "select last_insert_id()";
				ResultSet res = db.executeSelectQuery(query);
				while(res.next()){
					user.setUserId(res.getLong("last_insert_id()"));
				}
				db.closeConnection(con);
				return user;
			}
		}
		catch (SQLException e) {
			throw new SQLException(e);
		}
		db.closeConnection(con);
		return null;
	}
	
	public static User updateUserDB(User user) throws SQLException{
		int i=0;
		String query = "update user set user_type=?, username=?, password=?, name=?, gender=?, email=?, phone=? "
				+ "where delete_status = 'No' and user_id=?";
		try {
			con = db.getConnection();
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1, user.getUserType());
			ps.setString(2, user.getUsername());
			ps.setString(3, user.getPassword());
			ps.setString(4, user.getName());
			ps.setString(5, user.getGender());
			ps.setString(6, user.getEmail());
			ps.setLong(7, user.getPhone());
			ps.setLong(8, user.getUserId());
			
			i = ps.executeUpdate();
			System.out.println(i +" Record successfully updated");
			
			if(i == 1){
				user = getUser(user);
				db.closeConnection(con);
				return user;
			}
		}
		catch (SQLException e) {
			throw new SQLException(e);
		}
		db.closeConnection(con);
		return null;
	}
	
	public static int deleteUserDB(User user) throws SQLException{
		int i=0;
		String query = "update user set delete_status='Yes', deleted_at=now() where delete_status = 'No' and user_id=?";
		try {
			con = db.getConnection();
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setLong(1, user.getUserId());
			
			i = ps.executeUpdate();
			System.out.println(i +" Record successfully deleted.");
			db.closeConnection(con);
		}
		catch (SQLException e) {
			throw new SQLException(e);
		}
		return i;
	}
	
	/*
	
	public int insertLog(String s1, String s2, String s3) throws SQLException{
		con = object.getConn();
		int i=0;
		String query = "insert into logs(username, session_id, login_attempt) values(?,?,?)";
		
		try {
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1, s1);
			ps.setString(2, s2);
			ps.setString(3, s3);
			
			i = ps.executeUpdate();
			System.out.println("Records successfully inserted");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		con.close();
		return i;
	}
	
	public int insertLeadDB(String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9, 
			String s10, String s11, String s12, String s13, String s14) throws SQLException{
		con = object.getConn();
		int i=0;
		String query = "insert into leads(lead_creator, name, lead_level, dob, gender, email, phone, location, address, occupation, "
				+ "income, marital, education, vehicle) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1, s1);
			ps.setString(2, s2);
			ps.setString(3, s3);
			ps.setString(4, s4);
			ps.setString(5, s5);
			ps.setString(6, s6);
			ps.setString(7, s7);
			ps.setString(8, s8);
			ps.setString(9, s9);
			ps.setString(10, s10);
			ps.setString(11, s11);
			ps.setString(12, s12);
			ps.setString(13, s13);
			ps.setString(14, s14);
			
			i = ps.executeUpdate();
			System.out.println(i +" Records successfully inserted");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		con.close();
		return i;
	}
	
	public int updateLeadDB(String s1, String s2, String s3, String s4,String s5, String s6, String s7, String s8, String s9, String s10, String s11, String s12, String s13, String s14, String s15) throws SQLException{
		con = object.getConn();
		int i=0;
		String query = "update leads set name=?, lead_level=?, dob=?, gender=?, email=?, phone=?, location=?, address=?, occupation=?, income=?, marital=?, education=?, vehicle=?, "
				+ "modified_date=now(), modified_by=? where sno=?";
		System.out.println("Current row Id :: "+s1);
		try {
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1, s2);
			ps.setString(2, s3);
			ps.setString(3, s4);
			ps.setString(4, s5);
			ps.setString(5, s6);
			ps.setString(6, s7);
			ps.setString(7, s8);
			ps.setString(8, s9);
			ps.setString(9, s10);
			ps.setString(10, s11);
			ps.setString(11, s12);
			ps.setString(12, s13);
			ps.setString(13, s14);
			ps.setString(14, s15);
			ps.setString(15, s1);
			
			i = ps.executeUpdate();
			System.out.println(i +" Record successfully updated");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		con.close();
		return i;
	}
	
	public int deleteLeadDB(String s1, String s2) throws SQLException{
		con = object.getConn();
		int i=0;
		String query = "update leads set deleted='Yes', deleted_date=now(), deleted_by=? where sno=?";
		System.out.println("Current row Id :: "+s1);
		try {
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1, s2);
			ps.setString(2, s1);
			
			i = ps.executeUpdate();
			System.out.println(i +" Record successfully updated");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		con.close();
		return i;
	}
	
	public boolean checkSessionId(String s1, String s2) throws SQLException{
		con = object.getConn();
		boolean match = false;
		
		String query = "select session_id from logs where username = '" +s1 +"'";
		
		try{
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet res = ps.executeQuery();
			
			while(res.next())
			{
				if(res.getString("session_id").equals(s2)){
					System.out.println("Both session ids : " +res.getString("session_id") +" && " +s2);
					match = true;
					break;
				}
			}
			res.close();
			ps.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		con.close();
		return match;
	}
	
	public boolean authentication(String s1, String s2) throws SQLException{
		con = object.getConn();
		boolean match = false;
		
		String query = "select * from user_login";

		try{
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet res = ps.executeQuery();
			
			while(res.next())
			{
				if(res.getString("username").equals(s1) && res.getString("password").equals(s2)){
					match = true;
					break;
				}
			}

		}catch(Exception e){
			e.printStackTrace();
		}
		
		con.close();
		return match;
	}
	
	public String getUsertype(String s1) throws SQLException{
		con = object.getConn();
		String user_type = "";
		
		String query = "select user_type from user_login where username = '" +s1 +"'";
		try{
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet res = ps.executeQuery();
			
			while(res.next())
			{
				user_type = res.getString("user_type");	
			}

		}catch(Exception e){
			e.printStackTrace();
		}
		
		con.close();
		return user_type;
	}
	
	
	public String showLeadsDetails(int i) throws SQLException{
		con = object.getConn();
		String response = "";
		String selectquery = "select * from leads where sno = " +i;
		
		try{
			PreparedStatement ps = con.prepareStatement(selectquery);
			ResultSet res = ps.executeQuery();
			while(res.next()){
				
				response = res.getString(3) +"///" +res.getString(4) +"///" +res.getString(5) +"///" +res.getString(6) +"///" +res.getString(7) +"///" +res.getString(8) +"///" +res.getString(9)
						+"///" +res.getString(10) +"///" +res.getString(11) +"///" +res.getString(12) +"///" +res.getString(13) +"///" +res.getString(14) +"///" +res.getString(15);
				
			}
			res.close();
			ps.close();

		}catch(Exception e){
			e.printStackTrace();
		}
		
		con.close();
		return response;
	}
	
	public String showUsersDetails() throws SQLException{
		con = object.getConn();
		String response = "";
		String selectquery = "select * from user_login where deleted = 'No'";

		try{
			PreparedStatement ps = con.prepareStatement(selectquery);
			ResultSet res = ps.executeQuery();
			while(res.next()){
				
				response = response + res.getString(1) +"///" +res.getString(3) +"///" +res.getString(4) +"///" +res.getString(10) +"\n\n\n";
				
			}
			res.close();
			ps.close();

		}catch(Exception e){
			e.printStackTrace();
		}
		con.close();
		return response;
	}
	
	public String showUsersDetails(int i) throws SQLException{
		con = object.getConn();
		String response = "";
		String selectquery = "select * from user_login where sno = " +i;
		
		try{
			PreparedStatement ps = con.prepareStatement(selectquery);
			ResultSet res = ps.executeQuery();
			while(res.next()){
				
				response = res.getString(3) +"///" +res.getString(4) +"///" +res.getString(5) +"///" +res.getString(6)
						+"///" +res.getString(7) +"///" +res.getString(8) +"///" +res.getString(9) +"///" +res.getString(10);
				
			}
			res.close();
			ps.close();

		}catch(Exception e){
			e.printStackTrace();
		}
		
		con.close();
		return response;
	}
	
	public int updateLeadLevel(String s1, String s2, String s3) throws SQLException{
		con = object.getConn();
		int i=0;
		String query = "update leads set lead_level=?, modified_date=now(), modified_by=? where sno=?";
		System.out.println("Current row Id :: "+s1);
		try {
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1, s2);
			ps.setString(2, s3);
			ps.setString(3, s1);
			
			i = ps.executeUpdate();
			System.out.println(i +" Record successfully updated");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		con.close();
		return i;
	}*/
	
}
