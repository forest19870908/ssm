package com.gq.base.user.dao;

import com.gq.base.user.model.User;

/**
 * Created by ZSL on 2017/7/14.
 */
public interface UserDao {
    User select(Long id);
    int insert(User user);
    int delete(long id);
}
