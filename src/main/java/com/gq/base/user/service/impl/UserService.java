package com.gq.base.user.service.impl;

import com.gq.base.user.dao.UserDao;
import com.gq.base.user.model.User;
import com.gq.base.user.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by ZSL on 2017/7/14.
 */
@Service("userService")
public class UserService implements IUserService {
    @Resource(name="userDao")
    private UserDao userDao;
    @Override
    public User getUserByID(Long id) {
        userDao.select(id);
        return userDao.select(id);
    }

    @Override
    public void updateCount(Long id, Integer count) {
        synchronized (this){
            User user=getUserByID(id);
//            System.out.println("原始值："+user.getNumber()+",更新值："+(user.getNumber()+count));
            user.setNumber(user.getNumber()+count);
            userDao.updateCount(user);
        }
    }

    @Override
    public void updateCountAddOne(Long id) {
        userDao.updateCountAddOne(id);
    }
}
