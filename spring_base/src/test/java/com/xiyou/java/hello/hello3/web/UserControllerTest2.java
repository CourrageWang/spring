package com.xiyou.java.hello.hello3.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserControllerTest2 {

    @Autowired
    private UserController userController;

    @Test
    public void tesAdd2() {
        userController.add();
    }
}
