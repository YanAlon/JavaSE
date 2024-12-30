package com.javase.day06API;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrame06StringLogin {
    public static void main(String[] args) {
        // 窗体
        JFrame jf = new JFrame();
        jf.setSize(400, 300);
        jf.setTitle("Login");
        jf.setLocationRelativeTo(null); // 在窗体中央位置弹出
        jf.setDefaultCloseOperation(3);
        jf.setAlwaysOnTop(true); // 窗体总是置顶
        jf.setLayout(null); // 取消默认布局
        // 用户名
        JLabel usernameJL = new JLabel("Username");
        usernameJL.setBounds(50, 50, 80, 20);
        jf.add(usernameJL);
        // 密码
        JLabel passwordJL = new JLabel("Password");
        passwordJL.setBounds(50, 100, 80, 20);
        jf.add(passwordJL);
        // 用户名输入框
        JTextField usernameTF = new JTextField();
        usernameTF.setBounds(150, 50, 180, 20);
        jf.add(usernameTF);
        // 密码输入框
        JPasswordField passwordPF = new JPasswordField();
        passwordPF.setBounds(150, 100, 180, 20);
        jf.add(passwordPF);
        // 输入按钮
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(50, 200, 280, 20);
        jf.add(loginButton);
        // 设置窗体可见
        jf.setVisible(true);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(usernameTF.getText());
                System.out.println(passwordPF.getPassword());
                if (usernameTF.getText().equals("admin")) {
                    char[] password = passwordPF.getPassword();
                    String inputP = new String(password);
                    String p = "123456";
                    if (inputP.equals(p)){
                        System.out.println("Login Successful");
                    } else {
                        System.out.println("Username or Password Error!");
                    }
                } else {
                    System.out.println("Username or Password Error!");
                }
            }
        });
    }
}
