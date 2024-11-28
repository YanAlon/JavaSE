package gui_demo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
    事件监听机制

        什么是事件源?
            事件发生的地方,可以是按钮,文本,图片等
        什么是事件?
            发生了什么事情,例如鼠标点击事件,键盘按下事件
        事件绑定:
            把事件绑定到事件源上,发生某个事件则触发对应逻辑
        代码实现:
            事件源对象.addActionListener(new ActionListe...敲回车)
 */
public class test {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(400, 300);
        jf.setTitle("聊天室");//设置窗体标题
        jf.setLocationRelativeTo(null);//设置窗体位置在中央弹出
        jf.setDefaultCloseOperation(3);//设置窗体关闭停止程序
        jf.setAlwaysOnTop(true);//设置窗体置顶
        jf.setLayout(null);//取消默认布局

        //事件源(按钮)
        JButton btn = new JButton("点我叫你爸爸");
        btn.setBounds(50,50,200,100);
        jf.add(btn);

        //给按钮添加点击事件

        //2.创建实现类对象
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("爸爸~");
            }
        });

        jf.setVisible(true);//设置显示窗体(一般写在最后)
    }
}

