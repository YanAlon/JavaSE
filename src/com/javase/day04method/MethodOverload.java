package com.javase.day04method;

public class MethodOverload {
    public static boolean isEqual(byte a, byte b) {
        return (a == b);
    }
    public static boolean isEqual(short a, short b) {
        return (a == b);
    }
    public static boolean isEqual(int a, int b) {
        return (a == b);
    }
    public static boolean isEqual(long a, long b) {
        return (a == b);
    }

    public static void main(String[] args) {
        byte a = 1;
        byte b = 1;
        short c = 1;
        short d = 1;
        int e = 1;
        int f = 1;
        long g = 1;
        long h = 1;
        System.out.println(isEqual(a, b));
        System.out.println(isEqual(c, d));
        System.out.println(isEqual(e, f));
        System.out.println(isEqual(g, h));
    }
}
