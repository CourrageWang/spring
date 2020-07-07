package com.xiyou.java.exec.service.impl;

import com.xiyou.java.exec.bean.User;
import com.xiyou.java.exec.dao.UserDao;
import com.xiyou.java.exec.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public void printUserInfo() {
        User u = new User();
        u.setAge(12);
        u.setName("wang");
        userDao.addUser(u);
    }
}
