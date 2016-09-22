package com.autofix.dev.exception;

import javax.security.sasl.AuthenticationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.autofix.dev.model.ErrorMessage;

@Provider
public class AuthenticationExceptionMapper implements ExceptionMapper<AuthenticationException>{

	@Override
	public Response toResponse(AuthenticationException exception) {
		ErrorMessage errorMessage = new ErrorMessage(exception.getMessage(), 401, "Authentication Error");
		return Response.status(Status.UNAUTHORIZED).entity(errorMessage).build();
	}
	
}
