package com.autofix.dev.validation;

import javax.ws.rs.BadRequestException;

import com.autofix.dev.model.User;

public class ClientRequestValidator {

	public void validateUser(User user){
		if(user.getUserType() == null){
			throw new BadRequestException("userType can't be null");
		}
		else if(user.getEmail() == null){
			throw new BadRequestException("email can't be null");
		}
		else if(user.getPassword() == null){
			throw new BadRequestException("password can't be null");
		}
		else if(user.getPhone() <= 0 || String.valueOf(user.getPhone()).length() != 10){
			throw new BadRequestException("either phone is null or incorrect. phone should be of 10 digit and positive numeric");
		}
	}	
}
