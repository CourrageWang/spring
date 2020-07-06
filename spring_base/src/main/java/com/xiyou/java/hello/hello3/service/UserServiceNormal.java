package com.xiyou.java.hello.hello3.service;

import com.xiyou.java.hello.hello3.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class UserServiceNormal {

    @Autowired
    private UserDao userDao;

    public void add() {
        userDao.add();
    }
}