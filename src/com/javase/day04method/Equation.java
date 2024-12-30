package com.javase.day04method;

import java.util.Scanner;

public class Equation {
    public static boolean isEquation(int a, int b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }

//        return a == b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(isEquation(a, b));
    }
}
