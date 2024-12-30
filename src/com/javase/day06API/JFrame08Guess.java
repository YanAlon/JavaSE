package com.javase.day06API;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/*
    1:系统产生一个1-100之间的随机数
    2:猜的内容不能为空
    3:每次根据猜的数字给出相应的提示
*/
public class JFrame08Guess {
    public static void main(String[] args) {
        //创建窗体对象
        JFrame jf = new JFrame();

        jf.setTitle("猜数字");
        jf.setSize(400, 300);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);

        //系统产生一个1-100之间的随机数
        Random r = new Random();
        int number = r.nextInt(100) + 1;

        //提示信息
        JLabel messageJL = new JLabel("系统产生了一个1-100之间的数据，请猜一猜");
        messageJL.setBounds(70, 50, 350, 20);
        jf.add(messageJL);

        //输入要猜的数字
        JTextField numberJTF = new JTextField();
        numberJTF.setBounds(120, 100, 150, 20);
        jf.add(numberJTF);

        //猜数字的按钮
        JButton guessJB = new JButton("Guess");
        guessJB.setBounds(150, 150, 100, 20);
        jf.add(guessJB);

        guessJB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //猜的内容不能为空
                String stringNumber = numberJTF.getText().trim();
                if(stringNumber.equals("")) {
                    JOptionPane.showMessageDialog(jf,"The number can't be empty!");
                    return;
                }

                //每次根据猜的数字给出相应的提示
                int guessNumber = Integer.parseInt(stringNumber);

                if(guessNumber > number) {
                    JOptionPane.showMessageDialog(jf,"Your number "+guessNumber+" is bigger.");
                    numberJTF.setText("");
                } else if(guessNumber < number) {
                    JOptionPane.showMessageDialog(jf,"Your number "+guessNumber+" is lesser");
                    numberJTF.setText("");
                } else  {
                    JOptionPane.showMessageDialog(jf,"Congratulations! You guessed the number "+guessNumber+"!");
                }
            }
        });

        jf.setVisible(true);
    }
}
