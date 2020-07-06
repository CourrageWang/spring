package com.xiyou.java.hello.hello2.soundsystem;

import org.springframework.stereotype.Component;

@Component
public class Power {
    public Power() {
    }

    public  void supply(){
        System.out.println("电源供电中。。。。");
    }
}