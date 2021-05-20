/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hdsoft.techblog.dao;

import com.hdsoft.techblog.models.Like;
import java.util.List;

/**
 *
 * @author Programmer Hrishav
 */
public interface LikeDao extends GenericDao<Like, Long> {

    public abstract List<Like> findByUser(long userid);

    public abstract List<Like> findByPost(long postid);

    public abstract List<Like> findByDate(String date);

    public abstract boolean like(long userid, long postid);

    public abstract boolean dislike(long userid, long postid);

    public abstract boolean isliked(long userid, long postid);

    public abstract int countLikes(long userid, long postid);

    public abstract int countLikes(long postid);
}
