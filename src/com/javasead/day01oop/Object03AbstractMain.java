package com.javasead.day01oop;

public class Object03AbstractMain {
    public static void main(String[] args) {
        Object03AbstractDog dog = new Object03AbstractDog();
        dog.eat();
        dog.drink();
        System.out.println("===========================");
        Object03AbstractCat cat = new Object03AbstractCat();
        cat.eat();
        cat.drink();
    }
}
