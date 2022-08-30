package com.briup.java.day8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 飞机游戏的主窗口
 */



public class MyGameFrame extends JFrame {



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



    public void paint(Graphics g){
        Color c = g.getColor();
        Font f = g.getFont();
        g.setFont(new Font("楷体",Font.BOLD,50));
        g.setColor(Color.BLUE);
        g.drawLine(100, 50, 400, 400);
        g.drawRect(100, 50, 300, 300);
        g.drawOval(100, 50, 300, 300);
        g.fillRect(40,40,100,100);
        g.drawString("sdadas",100,100);

        g.setColor(c);
        g.setFont(f);
    }


}
