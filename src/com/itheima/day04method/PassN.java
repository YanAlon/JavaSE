package com.itheima.day04method;

import java.util.Scanner;

public class PassN {
    public static boolean passN(int number, int n) {
        if (number % n == 0) {
            return true;
        }
        String numberStr = Integer.toString(number);
        if (numberStr.contains(Integer.toString(n))) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(passN(number, n));
    }
}
