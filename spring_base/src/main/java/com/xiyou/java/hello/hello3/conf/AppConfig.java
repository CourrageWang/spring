package com.xiyou.java.hello.hello3.conf;

import com.xiyou.java.hello.hello3.dao.impl.UserDaoImpl;
import com.xiyou.java.hello.hello3.service.UserServiceNormal;
import com.xiyou.java.hello.hello3.web.UserController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(value = "com.xiyou.java.hello.hello3")
//使用此方式的话，如果挪动类的位置需要更改以下配置信息。
//@ComponentScan(basePackages = {"com.xiyou.java.hello.hello3.service","com.xiyou.java.hello.hello3.dao","com.xiyou.java.hello.hello3.web"})

@ComponentScan(basePackageClasses ={UserController.class, UserDaoImpl.class, UserServiceNormal.class} )
public class AppConfig {
}
