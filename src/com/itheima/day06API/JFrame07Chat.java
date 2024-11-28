package com.itheima.day06API;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
    1:把文本框的内容发送到文本域中
    2:每次发送的文本内容不带前后空格
    3:多次发送的内容在文本域以追加的方式呈现
    4:清空聊天就是把文本域的内容设置为空
 */
public class JFrame07Chat {
    public static void main(String[] args) {
        //创建窗体对象
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

        sendJB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //获取文本框的内容
//                String message = messageField.getText();
//                messageField.setText("");

                //每次发送的文本内容不带前后空格
//                String message = messageField.getText();
//                message = message.trim();
                String message = inputJT.getText().trim(); //链式调用
                inputJT.setText("");


                //把文本框的内容发送到文本域中
//                messageArea.setText(message);
                //多次发送的内容在文本域以追加的方式呈现
                contentJTA.append(message+"\n");
            }
        });

        clearJB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //清空聊天就是把文本域的内容设置为空
                contentJTA.setText("");
            }
        });

        jf.setVisible(true);
    }
}
