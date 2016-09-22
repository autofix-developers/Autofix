package com.autofix.dev.exception;

import javax.ws.rs.core.NoContentException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.autofix.dev.model.ErrorMessage;

@Provider
public class NoContentExceptionMapper implements ExceptionMapper<NoContentException>{

	@Override
	public Response toResponse(NoContentException exception) {
		ErrorMessage errorMessage = new ErrorMessage(exception.getMessage(), 404, "Data not found");
		return Response.status(Status.NOT_FOUND).entity(errorMessage).build();
	}
	
}
