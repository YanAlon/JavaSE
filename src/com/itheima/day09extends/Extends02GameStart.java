package com.itheima.day09extends;

import java.util.Scanner;

public class Extends02GameStart {
    public static void main(String[] args) {
        Scanner choose = new Scanner(System.in);
        System.out.println("Please select the JFrame you want to launch");
        switch (choose.nextLine()) {
            case "2": Extends02PuzzleFrame puzzleFrame = new Extends02PuzzleFrame();
            case "3": Extends03PuzzleDisruption puzzleDisruption = new Extends03PuzzleDisruption();
            case "4": Extends04PuzzleZero puzzleZero = new Extends04PuzzleZero();
            case "5": Extends05PuzzleButton puzzleButton = new Extends05PuzzleButton();
            case "6": Extends06PuzzleExchange puzzleExchange = new Extends06PuzzleExchange();
            case "7": Extends07PuzzleHelp puzzleHelp = new Extends07PuzzleHelp();
            case "8": Extends08PuzzleSuccess puzzleSuccess = new Extends08PuzzleSuccess();
        }
    }
}
