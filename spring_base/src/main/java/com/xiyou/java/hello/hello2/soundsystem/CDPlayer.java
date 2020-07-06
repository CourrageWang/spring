package com.xiyou.java.hello.hello2.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer {
    public CDPlayer() {
        System.out.println("this is CD Player");
    }

    @Autowired
    private CompactDisco cp;
    @Autowired
    private Power power;


//    @Autowired
//    public CDPlayer(CompactDisco cp) {
//        this.cp = cp;
//        System.out.println("CD player 的有参构造方法。。。");
//    }

//    @Autowired
//    public CDPlayer(CompactDisco cp, Power power) {
//        this.cp = cp;
//        this.power = power;
//        System.out.println("CD player 的多参构造方法。。。");
//    }

    //@Autowired 注解用在任意方法上。
//    @Autowired
//    public void prepare(CompactDisco cd, Power power) {
//        this.cp = cd;
//        this.power = power;
//        System.out.println("prepare 方法被调用。。。。。");
//    }

    public void play() {
        power.supply();
        cp.play();
    }
}