package com.javase.day04method;

import java.util.Scanner;

public class RandomGame {
    public static void GuessNumber(int n) {
        int number;
        System.out.println("Please input a number(0 < number < 100)");
        do {
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();
            if (number < n) {
                System.out.println("Please input a number greater than " + number);
            } else if (number > n) {
                System.out.println("Please input a number less than " + number);
            }
        } while (number != n);
        System.out.println("Congratulation! The number is " + n + "!");
    }

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        GuessNumber(n);
    }
}
