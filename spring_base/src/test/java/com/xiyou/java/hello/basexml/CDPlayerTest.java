package com.xiyou.java.hello.basexml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CDPlayerTest {

    @Test
    public void testPlayer(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ioc.xml");
        CDPlayer cdPlayer=(CDPlayer)applicationContext.getBean("cdPlayer");
        cdPlayer.play();
    }
}