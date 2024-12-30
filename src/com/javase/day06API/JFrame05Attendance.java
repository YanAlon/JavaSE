package com.javase.day06API;

import javax.swing.*;

public class JFrame05Attendance {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(400, 300);
        jf.setTitle("Attendance Search");
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);
        // 考勤日期
        JLabel contentJL = new JLabel("Attendance Date");
        contentJL.setBounds(50, 20, 100, 20);
        jf.add(contentJL);
        // 开始时间
        JLabel startTimeJL = new JLabel("Start Time");
        startTimeJL.setBounds(50, 70, 100, 20);
        jf.add(startTimeJL);
        // 结束时间
        JLabel endTimeJL = new JLabel("End Time");
        endTimeJL.setBounds(250, 70, 100, 20);
        jf.add(endTimeJL);
        // 开始时间输入框
        JTextField startTimeJTF = new JTextField();
        startTimeJTF.setBounds(50, 100, 100, 20);
        jf.add(startTimeJTF);
        // 结束时间输入框
        JTextField endTimeJTF = new JTextField();
        endTimeJTF.setBounds(250, 100, 100, 20);
        jf.add(endTimeJTF);
        // 确定按钮
        JButton searchJB = new JButton("Search");
        searchJB.setBounds(150, 180, 100,20);
        jf.add(searchJB);

        jf.setVisible(true);
    }
}
