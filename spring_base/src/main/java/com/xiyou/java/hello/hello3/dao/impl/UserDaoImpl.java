package com.xiyou.java.hello.hello3.dao.impl;

import com.xiyou.java.hello.hello3.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public class UserDaoImpl implements UserDao {
    public void add() {
        System.out.println("添加用户到数据库。。");
    }
}
