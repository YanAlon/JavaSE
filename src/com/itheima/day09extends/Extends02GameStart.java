package com.itheima.day09extends;

import java.util.Scanner;

public class Extends02GameStart {
    public static void main(String[] args) {
        Scanner choose = new Scanner(System.in);
        System.out.println("Please select the JFrame you want to launch");
        switch (choose.nextLine()) {
            case "2": Extends02PuzzleFrame puzzleFrame = new Extends02PuzzleFrame();
            case "3": Extends03PuzzleDisruption puzzleDisruption = new Extends03PuzzleDisruption();
        }

    }
}
