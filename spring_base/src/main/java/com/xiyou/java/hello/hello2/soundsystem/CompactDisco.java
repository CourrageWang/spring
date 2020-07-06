package com.xiyou.java.hello.hello2.soundsystem;


import org.springframework.stereotype.Component;

@Component
public class CompactDisco {

    public CompactDisco() {
        System.out.println("CompactDisco 的无参构造参数");
    }

    public void play() {
        System.out.println("正在播放音乐、。。。。");
    }
}