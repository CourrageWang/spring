package com.xiyou.java.hello.hello2.service.impl;

import com.xiyou.java.hello.hello2.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("normal")
//@Qualifier("normal")
public class UserServiceImpl implements UserService {
    public void add() {
        System.out.println("添加用户。。");
    }
}
