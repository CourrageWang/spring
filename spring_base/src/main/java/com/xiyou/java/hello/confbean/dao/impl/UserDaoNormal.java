package com.xiyou.java.hello.confbean.dao.impl;

import com.xiyou.java.hello.confbean.dao.UserDao;

public class UserDaoNormal implements UserDao {

    public void add() {
        System.out.println("我将添加用户到数据库中。。。");
    }
}
