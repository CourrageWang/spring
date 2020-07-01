package com.xiyou.java.Bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class PersonTest {
    public static void test01() {
        ApplicationContext ap = new ClassPathXmlApplicationContext("ioc.xml");
        Person perSon01 = (Person) ap.getBean("PerSon01");
        System.out.println(perSon01.toString());
    }

    public static void test02() {
        ApplicationContext ap = new ClassPathXmlApplicationContext("ioc.xml");
        Person perSon01 = (Person) ap.getBean("person2");
        System.out.println(perSon01.toString());
    }

    public static void main(String[] args) {
        test02();
    }
}