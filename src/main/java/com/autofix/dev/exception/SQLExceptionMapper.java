package com.autofix.dev.exception;

import java.sql.SQLException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.autofix.dev.model.ErrorMessage;

@Provider
public class SQLExceptionMapper implements ExceptionMapper<SQLException>{

	@Override
	public Response toResponse(SQLException exception) {
		ErrorMessage errorMessage = new ErrorMessage(exception.getMessage(), 422, "Database Error");
		return Response.status(422).entity(errorMessage).build();
	}
}
