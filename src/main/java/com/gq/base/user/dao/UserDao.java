package com.gq.base.user.dao;

import com.gq.base.user.model.User;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * Created by ZSL on 2017/7/14.
 */
@Repository(value = "userDao")
public interface UserDao {
    User select(Long id);
    int insert(User user);
    int delete(Long id);
    void updateCount(User user);
    void updateCountAddOne(Long id);
}
