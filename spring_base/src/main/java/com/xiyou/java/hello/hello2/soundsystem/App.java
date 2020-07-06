package com.xiyou.java.hello.hello2.soundsystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        ApplicationContext ap = new AnnotationConfigApplicationContext(AppConfig.class);
        CDPlayer cp = ap.getBean(CDPlayer.class);
        cp.play();
    }
}