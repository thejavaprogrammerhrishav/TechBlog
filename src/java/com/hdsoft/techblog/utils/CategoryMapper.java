/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hdsoft.techblog.utils;

import com.hdsoft.techblog.models.Category;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Programmer Hrishav
 */
public class CategoryMapper {

    public static Category map(ResultSet rs) throws SQLException {
        Category category = new Category(rs.getLong("id"), rs.getString("category"), rs.getString("description"), rs.getString("date"));
        category.setUserId(rs.getLong("userId"));
        return category;
    }
}
