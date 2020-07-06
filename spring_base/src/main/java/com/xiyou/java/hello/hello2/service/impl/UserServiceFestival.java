package com.xiyou.java.hello.hello2.service.impl;

import com.xiyou.java.hello.hello2.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("festival")
@Component
//@Qualifier("festival")
public class UserServiceFestival implements UserService {
    public void add() {
        System.out.println("UserServiceFestival 注册用户 并发送优惠券。。");
    }
}
