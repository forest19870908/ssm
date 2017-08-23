package com.gq.base.user.service;

import com.gq.base.user.model.User;

/**
 * Created by ZSL on 2017/7/14.
 */
public interface IUserService {
    User getUserByID(Long id);
    void updateCount(Long id, Integer count);
    void updateCountAddOne(Long id);
}
