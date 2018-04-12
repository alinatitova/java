package com.company.Collections;

import com.company.AppConnection;
import com.company.models.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsersCollection {
    public static User getUser (String login, String password) throws SQLException {
        PreparedStatement ps= AppConnection.conn.prepareStatement ("SELECT*FROM users WHERE login=? AND password=? LIMIT 1");
        ps.setString(1, login);
        ps.setString(2, password);
        ResultSet result = ps.executeQuery();
        if (result.next()==false) {
            return null;
        }
            User u= new User();
        u.id=result.getInt("id");
        u.name=result.getString("name");
        u.login=result.getString("login");
        u.password=result.getString("password");
        return u;



    }

}
