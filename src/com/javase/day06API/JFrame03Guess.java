package com.javase.day06API;

import javax.swing.*;

public class JFrame03Guess {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setTitle("Guess Number");
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setSize(400, 300);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);
        // 文本内容
        JLabel textJL = new JLabel("Please guess a number(0 < number < 100).");
        textJL.setBounds(70, 50, 350, 20);
        jf.add(textJL);
        // 输入框
        JTextField inputJTF = new JTextField();
        inputJTF.setBounds(120, 100, 150, 20);
        jf.add(inputJTF);
        // 按钮
        JButton guessJB = new JButton("Guess");
        guessJB.setBounds(150, 150, 100, 20);
        jf.add(guessJB);

        jf.setVisible(true);
    }
}
