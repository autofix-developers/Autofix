package com.autofix.dev.service;

import java.sql.SQLException;
import java.util.List;

import com.autofix.dev.database.DBActions;
import com.autofix.dev.model.User;

public class UserService{
	
	public List<User> getAllUsers() throws SQLException{
		return DBActions.getAllUsers();
	}
	
	public User addUser(User user) throws SQLException{
		return DBActions.insertUserDB(user);
	}

	public int removeUser(long userId) throws SQLException {
		User user = new User();
		user.setUserId(userId);
		return DBActions.deleteUserDB(user);
	}

	public User updateUser(User user) throws SQLException {
		return DBActions.updateUserDB(user);
	}
}