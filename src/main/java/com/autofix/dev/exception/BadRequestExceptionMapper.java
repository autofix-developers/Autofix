package com.autofix.dev.exception;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.autofix.dev.model.ErrorMessage;

@Provider
public class BadRequestExceptionMapper implements ExceptionMapper<BadRequestException>{

	@Override
	public Response toResponse(BadRequestException exception) {
		ErrorMessage errorMessage = new ErrorMessage(exception.getMessage(), 400, "Bad Request Error");
		return Response.status(Status.BAD_REQUEST).entity(errorMessage).build();
	}
	
}
