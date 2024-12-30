package com.javase.day04method;

import java.util.Scanner;

public class Narcissus {

    public static boolean isNarcissus(int n) {
        if (n < 100 || n > 999) {
            return false;
        }
        int ones = n % 10;
        int tens = (n % 100 - ones) / 10;
        int hundreds = n /100;
        if (Math.pow(ones, 3) + Math.pow(tens, 3) + Math.pow(hundreds, 3) == n) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isNarcissus(n));
    }
}
