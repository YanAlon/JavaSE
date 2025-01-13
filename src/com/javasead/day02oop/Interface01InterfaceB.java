package com.javasead.day02oop;

public interface Interface01InterfaceB {

    // 接口中可以将抽象方法定义的public abstract省略
    void show(); // 编译时会自动补全为：public abstract void show();

    public int getData();
}
