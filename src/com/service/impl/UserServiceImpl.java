package com.service.impl;

import com.dao.UserDao;
import com.entity.User;
import com.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public void selectUser() {
        List<User> users = userDao.selectUser();
    }
}
