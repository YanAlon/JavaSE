package com.javase.day04method;

import java.util.Scanner;

public class ThreeMax {
    public static int isThreeMax(int a, int b, int c) {
        int max;
        if (a <= b && b <= c) {
            max = c;
        } else if (a >= b && b >= c) {
            max = a;
        } else {
            max = b;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(isThreeMax(a, b, c));
    }
}
