package com.itheima.day08array;

import java.util.Random;

public class Array01RandomExchange {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++) {
            int index = random.nextInt(arr.length);
            int t = arr[index];
            arr[index] = arr[i];
            arr[i] = t;
        }
        // Ergodic
        for (int j : arr) {
            System.out.println(j);
        }
    }
}

