package com.javase.day05object;

// JavaBean
public class Phone {
    private String brand;   // 封装
    private double price;

    public Phone() {    // 无参构造方法
    }

    public String getBrand() {  // 对外提供获取成员变量的方法
        return brand;
    }
    public void setBrand(String brand) {    // 对外提供修改成员变量的值的方法
        this.brand = brand;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}


