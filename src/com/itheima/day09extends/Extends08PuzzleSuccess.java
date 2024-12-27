package com.itheima.day09extends;
/*
     判断游戏是否成功
        定义游戏成功的winDatas数组,前15张图片到位
        定义方法isSuccess判断游戏是否成功
            遍历任意一个数组
            如果有一个元素不一样,返回false
            都一样则返回true
        在每次移动(按钮事件)后调用方法判断
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Extends08PuzzleSuccess extends JFrame {

    // 图片编号数组
    private int[][] pictures = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };

    // 定义成功
    private int[][] winPictures = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };

    // 记录0号图片
    // x0：在哪一维数组；y0：在一维数组的位置。
    private int x0;
    private int y0;
    // 将上下左右、求助、重置等按钮，提到成员变量的位置
    private JButton upJB;
    private JButton downJB;
    private JButton leftJB;
    private JButton rightJB;
    private JButton helpJB;
    private JButton resetJB;

    private JPanel gameJP;

    // 拼图重绘
    private void rePaintView() {
        gameJP.removeAll(); // 移除所有组件
        // 重绘
        for (int i = 0; i < pictures.length; i++) {
            for (int j = 0; j < pictures[i].length; j++) {
//                System.out.println(pictures[i][j]);
                JLabel segmentPicture = new JLabel(new ImageIcon("src\\com\\itheima\\day09Extends\\images\\" + pictures[i][j] + ".png"));
                segmentPicture.setBounds(j * 90, i * 90, 90, 90);
                gameJP.add(segmentPicture);
            }
        }
        this.add(gameJP);
        gameJP.repaint(); // Java提供的重绘方法
    }

    private void help() {
        pictures = new int[][] {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        // 设置上下左右按钮失效
        upJB.setEnabled(false);
        downJB.setEnabled(false);
        leftJB.setEnabled(false);
        rightJB.setEnabled(false);
    }

    public boolean isSuccess() {
        for (int i = 0; i < pictures.length; i++) {
            for (int j = 0; j < pictures[i].length; j++) {
                // 如果有一个不同，则说明未成功
                if (pictures[i][j] != winPictures[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    // 给Up按钮添加
    private void addButtonEvent() {
        upJB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Up");
                // 1.边界处理
                if (x0 == 0) {
                    System.out.println("The Top Puzlle, Can't move.");
                    return;
                }
                // 2.交换
                pictures[x0][y0] = pictures[x0 - 1][y0];
                pictures[x0 - 1][y0] = 0;
                x0 = x0 - 1;

                //调用方法判断,如果游戏成功,设置按钮不能点击
                if (isSuccess()) {
                    help();
                }

                // 3.重绘方法
                rePaintView();
            }
        });
        downJB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.println("Down");
                // 1.边界处理
                if (x0 == 3) {
                    System.out.println("The Bottom Puzlle, Can't move.");
                    return;
                }
                // 2.交换
                pictures[x0][y0] = pictures[x0 + 1][y0];
                pictures[x0 + 1][y0] = 0;
                x0 = x0 + 1;

                //调用方法判断,如果游戏成功,设置按钮不能点击
                if (isSuccess()) {
                    help();
                }

                // 3.重绘方法
                rePaintView();
            }
        });
        leftJB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.println("Left");
                // 1.边界处理
                if (y0 == 0) {
                    System.out.println("The far left Puzlle, Can't move.");
                    return;
                }
                // 2.交换
                pictures[x0][y0] = pictures[x0][y0 - 1];
                pictures[x0][y0 - 1] = 0;
                y0 = y0 - 1;

                //调用方法判断,如果游戏成功,设置按钮不能点击
                if (isSuccess()) {
                    help();
                }

                // 3.重绘方法
                rePaintView();
            }
        });
        rightJB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.println("Right");
                // 1.边界处理
                if (y0 == 3) {
                    System.out.println("The far right Puzlle, Can't move.");
                    return;
                }
                // 2.交换
                pictures[x0][y0] = pictures[x0][y0 + 1];
                pictures[x0][y0 + 1] = 0;
                y0 = y0 + 1;

                //调用方法判断,如果游戏成功,设置按钮不能点击
                if (isSuccess()) {
                    help();
                }

                // 3.重绘方法
                rePaintView();
            }
        });
        helpJB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.println("Help");
                help();
                rePaintView();
            }
        });
        resetJB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Reset");
            }
        });
    }

    // 构造类
    public Extends08PuzzleSuccess() {
        initPuzzle();

        randomPicture();

        paintPuzzle();

        addButtonEvent();

        setVisible(true);
    }

    public void paintPuzzle() {

        // 标题图片
        JLabel titlePictureJL = new JLabel(new ImageIcon("src\\com\\itheima\\day09Extends\\images\\title.png"));
        titlePictureJL.setBounds(254, 27, 232, 57);
        this.add(titlePictureJL);
        // 面板图
        gameJP = new JPanel();
        gameJP.setBounds(150, 114, 360, 360);
        gameJP.setLayout(null);
        for (int i = 0; i < pictures.length; i++) {
            for (int j = 0; j < pictures[i].length; j++) {
//                System.out.println(pictures[i][j]);
                JLabel segmentPicture = new JLabel(new ImageIcon("src\\com\\itheima\\day09Extends\\images\\" + pictures[i][j] + ".png"));
                segmentPicture.setBounds(j * 90, i * 90, 90, 90);
                gameJP.add(segmentPicture);
            }
        }
        this.add(gameJP);
        // 参照图
        JLabel referenceJL = new JLabel(new ImageIcon("src\\com\\itheima\\day09extends\\images\\reference.png"));
        referenceJL.setBounds(574, 114, 122, 121);
        this.add(referenceJL);
        // 上按钮
        upJB = new JButton(new ImageIcon("src\\com\\itheima\\day09extends\\images\\up.png"));
        upJB.setBounds(732, 265, 57, 57);
        this.add(upJB);
        // 下按钮
        downJB = new JButton(new ImageIcon("src\\com\\itheima\\day09extends\\images\\down.png"));
        downJB.setBounds(732, 347, 57, 57);
        this.add(downJB);
        // 左按钮
        leftJB = new JButton(new ImageIcon("src\\com\\itheima\\day09extends\\images\\left.png"));
        leftJB.setBounds(650, 347, 57, 57);
        this.add(leftJB);
        // 右按钮
        rightJB = new JButton(new ImageIcon("src\\com\\itheima\\day09extends\\images\\right.png"));
        rightJB.setBounds(813, 347, 57, 57);
        this.add(rightJB);
        // 求助按钮
        helpJB = new JButton(new ImageIcon("src\\com\\itheima\\day09extends\\images\\help.png"));
        helpJB.setBounds(626, 444, 108, 45);
        this.add(helpJB);
        // 重置按钮
        resetJB = new JButton(new ImageIcon("src\\com\\itheima\\day09extends\\images\\reset.png"));
        resetJB.setBounds(786, 444, 108, 45);
        this.add(resetJB);
        // 背景图：需要写在最后，JLabel 按照顺序堆叠？
        JLabel backgroundJL = new JLabel(new ImageIcon("src\\com\\itheima\\day09extends\\images\\background.png"));
        backgroundJL.setBounds(0, 0, 968, 530);
        this.add(backgroundJL);
    }

    private void initPuzzle() {
        this.setTitle("Puzzle");
        this.setSize(960, 565);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        this.setAlwaysOnTop(true);
        this.setLayout(null);
    }

    public void randomPicture() {
        Random random = new Random();
        for (int i = 0; i < pictures.length; i++) {
            for (int j = 0; j < pictures[i].length; j++) {
                int x = random.nextInt(pictures.length);
                int y = random.nextInt(pictures[x].length);
                // 交换
                int temp = pictures[i][j];
                pictures[i][j] = pictures[x][y];
                pictures[x][y] = temp;
//                System.out.println(pictures[i][j]);
            }
        }

        /*
            遍历打乱后的数组，定位0号的位置
            lo：循环标号，给循环气的名字，当break时，该循环结束
         */
        lo:
        for (int i = 0; i < pictures.length; i++) {
            for (int j = 0; j < pictures[i].length; j++) {
                if (pictures[i][j] == 0) {
                    x0 = i;
                    y0 = j;
                    break lo;
                }
            }
        }
        System.out.println(x0 + " " + y0);
    }
}
