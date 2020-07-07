package com.xiyou.java.exec.dao.impl;

import com.xiyou.java.exec.bean.User;
import com.xiyou.java.exec.dao.UserDao;
import org.springframework.stereotype.Component;

@Component
public class userDaoImpl implements UserDao {

    public String addUser(User user) {
        return user.getName() + ":" + user.getAge();
    }
}
