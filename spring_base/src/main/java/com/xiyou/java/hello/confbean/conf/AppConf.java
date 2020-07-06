package com.xiyou.java.hello.confbean.conf;

import com.xiyou.java.hello.confbean.dao.UserDao;
import com.xiyou.java.hello.confbean.dao.impl.UserDaoNormal;
import com.xiyou.java.hello.confbean.service.UserService;
import com.xiyou.java.hello.confbean.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConf {

    @Bean
    public UserDao userDaoNormal() {
        System.out.println("创建userdao 对象");
        return new UserDaoNormal();
    }

    @Bean
    public UserService userServiceNormal( UserDao userDao) {
        System.out.println("创建user无参构造方法！！");
//        UserDao userDao = userDaoNormal();
        return new UserServiceImpl(userDao);
    }

}
