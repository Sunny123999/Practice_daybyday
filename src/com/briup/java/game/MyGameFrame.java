package com.briup.java.game;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 飞机游戏的主窗口
 */

public class MyGameFrame extends JFrame {

    //将背景图片与飞机图片定义为成员变量
    Image bgImg = GameUtil.getImage("images/bg.jpg");
    Image planeImg = GameUtil.getImage("images/plane.png");

    //paint方法作用是：画出整个窗口及内部内容。被系统自动调用。
    @Override
    public void paint(Graphics g) {
        g.drawImage(bgImg, 0, 0, null);
        g.drawImage(planeImg, 200, 200, null);
    }



    /**
     * 初始化窗口
     */
    public void  launchFrame(){
        setTitle("打飞机");
        setVisible(true);
        setSize(500,500);
        setLocation(300,300);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        MyGameFrame f =new MyGameFrame();
        f.launchFrame();
    }



}
