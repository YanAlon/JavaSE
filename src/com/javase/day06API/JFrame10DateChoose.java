package com.javase.day06API;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    考勤查询
 */
public class JFrame10DateChoose {
    public static void main(String[] args) {
        //创建窗体对象
        JFrame jf = new JFrame();

        jf.setTitle("考勤查询");
        jf.setSize(400, 300);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);

        //显示考勤日期的文本
        JLabel dateLable = new JLabel("考勤日期");
        dateLable.setBounds(50, 20, 100, 20);
        jf.add(dateLable);

        //显示开始时间文本
        JLabel startDateLable = new JLabel("开始时间");
        startDateLable.setBounds(50, 70, 100, 20);
        jf.add(startDateLable);

        JFrame10DateChooser dateChooser1 = JFrame10DateChooser.getInstance("yyyy/MM/dd");
        JFrame10DateChooser dateChooser2 = JFrame10DateChooser.getInstance("yyyy/MM/dd");
        //开始时间输入框
        JTextField startDateField = new JTextField();
        startDateField.setBounds(50, 100, 100, 20);
        dateChooser1.register(startDateField);
        jf.add(startDateField);

        //显示结束时间文本
        JLabel endDateLable = new JLabel("结束时间");
        endDateLable.setBounds(250, 70, 100, 20);
        jf.add(endDateLable);

        //结束时间输入框
        JTextField endDateField = new JTextField();
        endDateField.setBounds(250, 100, 100, 20);
        dateChooser2.register(endDateField);
        jf.add(endDateField);

        //确定按钮
        JButton confirmButton = new JButton("确定");
        confirmButton.setBounds(250, 180, 60, 20);
        jf.add(confirmButton);

        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

                //获取开始时间和结束时间的字符串
                String startDateString = startDateField.getText();
                String endDateString = endDateField.getText();

                try {
                    Date startDate = sdf.parse(startDateString);
                    Date endDate = sdf.parse(endDateString);

                    JOptionPane.showMessageDialog(jf,startDate+"\n"+endDate);
                } catch (ParseException ex) {
                    ex.printStackTrace();
                }
            }
        });

        jf.setVisible(true);
    }
}
