package com.autofix.dev.service;

import java.sql.SQLException;
import java.util.List;
import javax.ws.rs.core.NoContentException;

import com.autofix.dev.database.UserDBActions;
import com.autofix.dev.model.User;

public class UserService{
	
	public List<User> getAllUsers() throws SQLException{
		return UserDBActions.getAllUsers();
	}
	
	public User getUser(long userId) throws SQLException, NoContentException{
		User user = new User();
		user.setUserId(userId);
		user = UserDBActions.getUser(user);
		if (user == null){
			throw new NoContentException("User with id - " +userId +" not found");
		}
		return user;
	}
	
	public User addUser(User user) throws SQLException, NoContentException{
		user = UserDBActions.insertUserDB(user);
		if (user == null){
			throw new NoContentException("No record inserted");
		}
		return user;
	}

	public int removeUser(long userId) throws SQLException, NoContentException {
		User user = new User();
		user.setUserId(userId);
		int deletedCount = UserDBActions.deleteUserDB(user);
		if(deletedCount == 0){
			throw new NoContentException("User with id - " +userId +" not found");
		}
		return deletedCount;
	}

	public User updateUser(long userId, User user) throws SQLException, NoContentException {
		user.setUserId(userId);
		user = UserDBActions.updateUserDB(user);
		if (user == null){
			throw new NoContentException("User with id - " +userId +" not found");
		}
		return user;
	}
}