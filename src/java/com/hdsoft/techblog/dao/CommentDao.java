/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hdsoft.techblog.dao;

import com.hdsoft.techblog.dao.GenericDao;
import com.hdsoft.techblog.models.Comment;
import java.util.List;

/**
 *
 * @author Programmer Hrishav
 */
public interface CommentDao extends GenericDao<Comment, Long> {

    public abstract List<Comment> findByUserid(long userid);

    public abstract List<Comment> findByDate(String date);
    
    public abstract List<Comment> findByPostId(long postid);

}
