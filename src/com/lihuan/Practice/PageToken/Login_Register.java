package com.lihuan.Practice.PageToken;

/**
 * @Author ：sunny
 * @Date ：Created in 2022/8/17 15:50
 * @Description ：
 */


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Login_Register extends JFrame{


    Login_Register() {
        init();
    }
    //登录界面初始化
    public void init() {
        JFrame frame = new JFrame("登录");
        frame.setLayout(null);

        JLabel nameStr = new JLabel("账号:");
        nameStr.setBounds(250, 200, 100, 25);
        frame.add(nameStr);

        JLabel passwordStr = new JLabel("密码:");
        passwordStr.setBounds(250, 250, 100, 25);
        frame.add(passwordStr);

        JTextField userID = new JTextField();
        userID.setBounds(300, 200, 270, 25);
        frame.add(userID);

        JPasswordField password = new JPasswordField();
        password.setBounds(300, 250, 270, 25);
        frame.add(password);

        JButton buttonlogin = new JButton("登录");
        buttonlogin.setBounds(275, 300, 70, 25);
        frame.add(buttonlogin);

        JButton buttonregister = new JButton("注册");
        buttonregister.setBounds(375, 300, 70, 25);
        frame.add(buttonregister);

        JButton updatepwd = new JButton("忘记密码");
        updatepwd.setBounds(475, 300, 100, 25);
        frame.add(updatepwd);

        frame.setBounds(400, 100, 800, 640);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        //为登录按钮添加监听器
        buttonlogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String ID = userID.getText();
                String passwd = new String (password.getPassword());

                //创建一个Admin用户，把输入框中的用户名密码和提出来
                Admin admin = new Admin();
                admin.setID(ID);
                admin.setPassword(passwd);

                //登录
                Login login = new Login();
                login.setAdmin(admin);

                if(login.JudgeAdmin()==0) {
                    //弹出账号或密码错误的窗口
                    JOptionPane.showMessageDialog(null, "账号或密码错误", "账号或密码错误", JOptionPane.WARNING_MESSAGE);
                    //清除密码框中的信息
                    password.setText("");
                    //清除账号框中的信息
                    userID.setText("");

                    //System.out.println("登陆失败");
                } else {
                    //弹出登录成功的窗口
                    JOptionPane.showMessageDialog(null, "登陆成功", "登陆成功", JOptionPane.NO_OPTION);
                    //点击确定后会跳转到主窗口
                    frame.setVisible(false);


                }

            }
        });

        //为注册按钮添加监听器
        buttonregister.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //注册页面
                frame.setVisible(false);
                AdminRegister ar = new AdminRegister();
            }
        });
    }

    public static void main(String []args) {
        //主程序
        //登录窗口
        Login_Register login_register = new Login_Register();
    }
}



