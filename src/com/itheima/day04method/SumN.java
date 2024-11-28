package com.itheima.day04method;

public class SumN {
    public static int sumN(int n) {
        int sum = 0;
        sum = n * (n + 1) / 2;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumN(5));
    }
}
