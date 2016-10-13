package com.autofix.dev.resources;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.NoContentException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.autofix.dev.model.User;
import com.autofix.dev.service.UserService;
import com.autofix.dev.validation.ClientRequestValidator;

/**
 * Root resource (exposed at "users" path)
 */
@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserResource {
	
	private UserService userService = new UserService();
	private ClientRequestValidator validator = new ClientRequestValidator();

    @GET
    public List<User> getUsers() throws SQLException {
        return userService.getAllUsers();
    }

    @GET
    @Path("/{userId}")
    public User getUser(@PathParam("userId") long userId) throws SQLException, NoContentException {
        return userService.getUser(userId);
    }
    
	@POST
	public Response addUser(User user) throws SQLException, NoContentException{
		validator.validateUser(user);
		User newUser = userService.addUser(user);
		return Response.status(Status.CREATED)
		.entity(newUser)
		.build();
	}
	
	@DELETE
	@Path("/{userId}")
	public String deleteUser(@PathParam("userId") long userId) throws SQLException, NoContentException{
		int deletedUserCount = userService.removeUser(userId);
		return deletedUserCount +" Records successfully deleted.";
	}
	
	@PUT
	@Path("/{userId}")
	public User updateUser(@PathParam("userId") long userId, User user) throws SQLException, NoContentException{
		validator.validateUser(user);
		return userService.updateUser(userId, user);
	}
}