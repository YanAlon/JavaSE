package com.itheima.day09extends;

import javax.swing.*;

public class Extends02PuzzleFrame extends JFrame {

    public Extends02PuzzleFrame() {
        initPuzzle();

        paintPuzzle();

        this.setVisible(true);
    }

    public void paintPuzzle() {

        // 标题图片
        JLabel titlePictureJL = new JLabel(new ImageIcon("src\\com\\itheima\\day09Extends\\images\\title.png"));
        titlePictureJL.setBounds(354, 27, 232, 57);
        this.add(titlePictureJL);
        // 面板图
        JPanel gameJP = new JPanel();
        gameJP.setBounds(150, 114, 360, 360);
        this.setLayout(null);
        this.add(gameJP);
        // 参照图
        JLabel referenceJL = new JLabel(new ImageIcon("src\\com\\itheima\\day09extends\\images\\reference.png"));
        referenceJL.setBounds(574, 114, 122, 121);
        this.add(referenceJL);
        // 上按钮
        JButton upJB = new JButton(new ImageIcon("src\\com\\itheima\\day09extends\\images\\up.png"));
        upJB.setBounds(732, 265, 57, 57);
        this.add(upJB);
        // 下按钮
        JButton downJB = new JButton(new ImageIcon("src\\com\\itheima\\day09extends\\images\\down.png"));
        downJB.setBounds(732, 347, 57, 57);
        this.add(downJB);
        // 左按钮
        JButton leftJB = new JButton(new ImageIcon("src\\com\\itheima\\day09extends\\images\\left.png"));
        leftJB.setBounds(650, 347, 57, 57);
        this.add(leftJB);
        // 右按钮
        JButton rightJB = new JButton(new ImageIcon("src\\com\\itheima\\day09extends\\images\\right.png"));
        rightJB.setBounds(813, 347, 57, 57);
        this.add(rightJB);
        // 求助按钮
        JButton helpJB = new JButton(new ImageIcon("src\\com\\itheima\\day09extends\\images\\help.png"));
        helpJB.setBounds(626, 444, 108, 45);
        this.add(helpJB);
        // 重置按钮
        JButton resetJB = new JButton(new ImageIcon("src\\com\\itheima\\day09extends\\images\\reset.png"));
        resetJB.setBounds(786, 444, 108, 45);
        this.add(resetJB);
        // 背景图：需要写在最后，JLabel 按照顺序堆叠？
        JLabel backgroundJL = new JLabel(new ImageIcon("src\\com\\itheima\\day09extends\\images\\background.png"));
        backgroundJL.setBounds(0, 0, 960, 530);
        this.add(backgroundJL);
    }

    public void initPuzzle() {
        this.setTitle("Puzzle");
        this.setSize(960, 565);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        this.setAlwaysOnTop(true);
        this.setLayout(null);
    }
}
