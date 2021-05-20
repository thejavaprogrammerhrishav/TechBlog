/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hdsoft.techblog.utils;

import com.hdsoft.techblog.models.User;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Programmer Hrishav
 */
public class UserMapper {

    public static User map(ResultSet rs) throws SQLException {
        User user = new User(rs.getLong("id"), rs.getString("name"), rs.getString("contact"), rs.getString("email"), rs.getString("about"), rs.getString("gender"),
                rs.getString("username"), rs.getString("password"), rs.getString("date"),rs.getString("facebook"),rs.getString("instagram"),rs.getString("twitter"));
        return user;
    }
}
