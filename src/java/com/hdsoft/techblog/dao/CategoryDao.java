/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hdsoft.techblog.dao;

import com.hdsoft.techblog.models.Category;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Programmer Hrishav
 */
public interface CategoryDao extends GenericDao<Category, Long> {

    public abstract List<Category> findByDate(String date) throws SQLException;

    public abstract List<Category> findByUserId(long id) throws SQLException;

    public abstract boolean existsCategory(String category) throws SQLException;
}
