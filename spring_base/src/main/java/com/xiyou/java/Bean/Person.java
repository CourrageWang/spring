package com.xiyou.java.Bean;

public class Person {
    private String lastName;
    private String Email;
    private Integer age;
    private String gender;

    public Person() {
    }

    public Person(String lastName, String email, Integer age, String gender) {
        this.lastName = lastName;
        Email = email;
        this.age = age;
        this.gender = gender;
        System.out.println("有参构造器。。。。");
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", Email='" + Email + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}