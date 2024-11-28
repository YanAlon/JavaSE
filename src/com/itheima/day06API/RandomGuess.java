package com.itheima.day06API;

import java.util.Random;
import java.util.Scanner;

public class RandomGuess {
    public static boolean randomGuess() {
        Scanner scanner = new Scanner(System.in);
        int number;
        Random random = new Random();
        int i = 100;
        int n =random.nextInt(100);
        do {
            number = scanner.nextInt();
            if (number < n) {
                System.out.println("Please input a number greater than " + number);
            } else if (number > n) {
                System.out.println("Please input a number less than " + number);
            }
        } while (number != n);
        System.out.println("Congratulations! You guessed it! The number is " + n);
        return true;
    }

    public static void main(String[] args) {
        randomGuess();
    }
}
