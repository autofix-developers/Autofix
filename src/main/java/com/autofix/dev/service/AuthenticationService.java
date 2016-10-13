package com.autofix.dev.service;

import com.autofix.dev.model.User;
import java.sql.SQLException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.DatatypeConverter;

public class AuthenticationService {
    private UserService userService = new UserService();

    public boolean authenticate(String authCredentials) {

        if (null == authCredentials) {
            return false;
        }
        // header value format will be "Basic encodedstring" for Basic
        // authentication. Example "Basic YWRtaW46YWRtaW4="
        final String encodedUserPassword = authCredentials.replaceFirst("Basic"
                + " ", "");
        String usernameAndPassword = null;
        try {
            byte[] decodedBytes = DatatypeConverter.parseBase64Binary(encodedUserPassword);

            usernameAndPassword = new String(decodedBytes, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        final String username, password;
        try {
            final StringTokenizer tokenizer = new StringTokenizer(
            usernameAndPassword, ":");
            username = tokenizer.nextToken();
            password = tokenizer.nextToken();
        } catch (Exception e) {
            return false;
        }
        boolean authenticationStatus = false;
        try {
            User requestedUser = userService.getUserByUnameAndPass(username, password);
            authenticationStatus = requestedUser != null;
            } catch (SQLException ex) {
            Logger.getLogger(AuthenticationService.class.getName()).log(Level.SEVERE, null, ex);
        }
        // we have fixed the userid and password as admin
        // call some UserService/LDAP here
//        boolean authenticationStatus = "admin".equals(username)
//                && "admin".equals(password);
        return authenticationStatus;
    }
}
