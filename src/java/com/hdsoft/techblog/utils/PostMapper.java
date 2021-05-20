/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hdsoft.techblog.utils;

import com.hdsoft.techblog.models.Post;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Programmer Hrishav
 */
public class PostMapper {

    public static Post getPost(ResultSet rs) throws SQLException {
        return new Post(rs.getLong("id"), rs.getLong("userid"), rs.getString("name"), rs.getString("title"),
                rs.getString("subtitle"), rs.getString("date"), rs.getString("time"), rs.getLong("categoryid"),
                rs.getString("content"), rs.getString("files"),rs.getString("privacy"));
    }
}
