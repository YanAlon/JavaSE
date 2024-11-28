package com.itheima.day05object;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.setBrand("Xiaomi");
        p1.setPrice(4999);
        System.out.println(p1.getBrand() + ":" + p1.getPrice());
    }
}
