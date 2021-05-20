/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hdsoft.techblog.utils;

import com.hdsoft.techblog.models.Like;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Programmer Hrishav
 */
public class LikeMapper {

    public static Like map(ResultSet rs) throws SQLException {
        return new Like(rs.getLong("id"), rs.getLong("userid"), rs.getLong("postid"), rs.getString("date"));
    }
}
