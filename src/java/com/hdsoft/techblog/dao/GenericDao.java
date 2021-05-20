/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hdsoft.techblog.dao;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Programmer Hrishav
 */
public interface GenericDao<T, ID> {

    public abstract ID save(T t) throws SQLException;

    public abstract boolean update(T t) throws SQLException;

    public abstract boolean delete(T t) throws SQLException;

    public abstract List<T> findAll() throws SQLException;

    public abstract T findById(ID id) throws SQLException;

    public abstract int countAll() throws SQLException;

}
