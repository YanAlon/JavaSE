package com.itheima.day09extends;

import javax.swing.*;

public class Extends02PuzzleFrame extends JFrame {

    public Extends02PuzzleFrame() {
        initPuzzle();

        paintPuzzle();

        this.setVisible(true);
    }

    public void paintPuzzle() {
        //
    }

    public void initPuzzle() {
        this.setTitle("Puzzle");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        this.setAlwaysOnTop(true);
        this.setLayout(null);
    }
}
