package com.javase.day06API;

import javax.swing.*;

public class JFrame02Chat {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(400, 300);
        jf.setTitle("Chat Room");
        jf.setLocationRelativeTo(null); // 窗体在中央位置弹出
        jf.setLayout(null);
        jf.setDefaultCloseOperation(3);
        jf.setAlwaysOnTop(true); // 设置窗体置顶
        // 内容显示区
        JTextArea contentJTA = new JTextArea();
        contentJTA.setBounds(10, 10, 360, 200);
        contentJTA.setEditable(false);
        jf.add(contentJTA);
        // 输入框
        JTextField inputJT = new JTextField();
        inputJT.setBounds(10, 230, 180, 20);
        jf.add(inputJT);
        // 发送按钮
        JButton sendJB = new JButton("Send");
        sendJB.setBounds(200, 230, 70, 20);
        jf.add(sendJB);
        // 清空按钮
        JButton clearJB = new JButton("Clear");
        clearJB.setBounds(280, 230, 100, 20);
        jf.add(clearJB);

        jf.setVisible(true);
    }
}
