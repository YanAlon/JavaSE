package com.itheima.day09extends;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Extends01Login extends JFrame {

    public Extends01Login() {
        initFrame();

        paintView();

        this.setVisible(true);
    }

    public void paintView() {
        // 用户名
        JLabel usernameJL = new JLabel("Username");
        usernameJL.setBounds(50, 50, 80, 20);
        this.add(usernameJL);

        // 密码
        JLabel passwordJL = new JLabel("Password");
        passwordJL.setBounds(50, 100, 80, 20);
        this.add(passwordJL);

        // 用户名输入框
        JTextField usernameJTF = new JTextField();
        usernameJTF.setBounds(150, 50, 180, 20);
        this.add(usernameJTF);

        // 密码输入框
        JTextField passwordJTF = new JTextField();
        passwordJTF.setBounds(150, 100, 180, 20);
        this.add(passwordJTF);

        // 登录按钮
        JButton loginJB = new JButton("Login");
        loginJB.setBounds(50, 200, 280, 20);
        this.add(loginJB);
    }

    public void initFrame() {
        this.setSize(400, 300);
        this.setTitle("Login");
        this.setDefaultCloseOperation(3);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(true);
    }
}
