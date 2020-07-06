package com.xiyou.java.hello.hello3.web;

import com.xiyou.java.hello.hello3.service.UserServiceNormal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

//@Component

@Controller // 表示当前对象是控制层对象
public class UserController {

    @Autowired
    private UserServiceNormal userService;

    public void add() {
        userService.add();
    }
}