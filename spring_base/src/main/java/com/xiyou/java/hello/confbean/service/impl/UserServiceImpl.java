package com.xiyou.java.hello.confbean.service.impl;

import com.xiyou.java.hello.confbean.dao.UserDao;
import com.xiyou.java.hello.confbean.service.UserService;

public class UserServiceImpl implements UserService {

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl() {
    }

    private UserDao userDao;

    public void add() {
        userDao.add();
    }
}
