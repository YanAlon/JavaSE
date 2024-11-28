package com.itheima.day04method;

public class GetMax {
    static int a, b;
    public static int getMax(int a, int b) {

        if(a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        a =10;
        b = 20;
        System.out.println(getMax(a, b));
    }
}
