package com.javasead.day02oop;

public class Interface01InterfaceStart {

    public static void main(String[] args) {

        Interface01InterfaceImplements mp3 = new Interface01InterfaceImplements();
        start(mp3);
    }

    public static void start(Interface01InterfaceImplements player) {
        player.play();
        player.pause();
        player.stop();

        player.show();
        System.out.println(player.getData());
    }
}
