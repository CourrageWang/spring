package com.xiyou.java.hello;

import org.springframework.stereotype.Component;

@Component // 通知容器该对象会通过spring自动加载
public class MessageService {

    public MessageService() {
        super();
        System.out.println("Message Service ！！");
    }

    public String getMessage() {
        return "this message is from MessageQueue";
    }
}