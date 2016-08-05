package com.autofix.dev.resources;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.autofix.dev.model.User;
import com.autofix.dev.service.UserService;

/**
 * Root resource (exposed at "users" path)
 */
@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserResource {
	
	private UserService userService = new UserService();

    @GET
    public List<User> getUsers() throws SQLException {
        return userService.getAllUsers();
    }
}
