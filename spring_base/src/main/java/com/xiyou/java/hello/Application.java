package com.xiyou.java.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan // 组件扫描 扫描所有有Component的组件
//@Configuration
public class Application {
    public static void main(String[] args) {

        // 基于注解的方式加载spring 容器
        // 初始化spring 容器
        ApplicationContext ap = new AnnotationConfigApplicationContext(Application.class);

        // 从容器中获取对象
        MessageService ms = ap.getBean(MessageService.class);
        MessagePrinter mp = ap.getBean(MessagePrinter.class);

        System.out.println(mp);
        System.out.println(ms);
        mp.PrintMessage();
    }
}