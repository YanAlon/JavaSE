package com.javase.day06API;

import javax.swing.*;

public class JFrame04DateAndTime {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(400, 300);
        jf.setTitle("Date And Time");
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(3);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);
        // 内容显示
        JLabel dateJL = new JLabel("Date");
        dateJL.setBounds(50, 50, 100, 20);
        jf.add(dateJL);
        JLabel dateMassageJL = new JLabel("YYYY年MM月DD日");
        dateMassageJL.setBounds(50, 80, 200, 20);
        jf.add(dateMassageJL);
        JLabel timeJL = new JLabel("Time");
        timeJL.setBounds(50, 150, 100, 20);
        jf.add(timeJL);
        JLabel timeMassageJL = new JLabel("HH : MM : SS");
        timeMassageJL.setBounds(50, 180, 200, 20);
        jf.add(timeMassageJL);

        jf.setVisible(true);
    }
}
