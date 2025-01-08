package com.javasead.day01oop;

public class Object02ConstructorPerson {
    private String name;
    private int age;
    public Object02ConstructorPerson(){}
    public Object02ConstructorPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void show() {
        System.out.println(name + "···" + age);
    }
}
