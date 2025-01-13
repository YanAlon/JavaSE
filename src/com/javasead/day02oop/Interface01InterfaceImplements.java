package com.javasead.day02oop;

public class Interface01InterfaceImplements implements Interface01InterfaceA, Interface01InterfaceB {
    // 一个类可以实现多个接口
    public void play() {
        System.out.println("Playing MP3.");
    }

    public void pause() {
        System.out.println("Pausing MP3.");
    }

    public void stop() {
        System.out.println("Stopping MP3.");
    }
    // 重写接口中的抽象方法
    @Override
    public void show() {
        System.out.println("Showing MP3.");
    }

    @Override
    public int getData() {
        return 1000;
    }
}
