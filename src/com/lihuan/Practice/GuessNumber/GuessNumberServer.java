package com.lihuan.Practice.GuessNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class GuessNumberServer extends Thread {
    private BufferedReader br = null;   // 读取客户端发送的信息
    private PrintWriter pw = null;      // 向客户端发送信息
    private Socket socket;              // 与客户端通信的套接字

    /**
     * 构造方法
     *
     * @param socket
     */
    public GuessNumberServer(Socket socket) {
        try {
            this.socket = socket;
            br = new BufferedReader(new InputStreamReader((socket.getInputStream())));  //获取输入流
            pw = new PrintWriter(socket.getOutputStream());                             //获取输出流
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 重写run方法
     */
    public void run() {
        GuessNumber guess = new GuessNumber();
        guess.setNum(Math.round((float) Math.random() * 100));//设置随机数
        while (true) {//循环接收客户端信息
            guess.setNumGuesses(guess.getNumGuesses() + 1);//猜测次数加1
            pw.println("I think the number is between 0 and 100 :");
            pw.flush();//刷新输出流
            try {
                Thread.sleep(500);//线程休眠500毫秒
                String answer = br.readLine();//读取客户端发送的信息
                guess.setAnswer(answer);//设置客户端发送的信息
                int guessNum = Integer.parseInt(answer.trim());//将客户端发送的信息转换为整型
                if (guessNum == guess.getNum()) {//判断客户端发送的信息是否与随机数相等
                    guess.setSuccess(true);//设置猜测成功
                    pw.println("Congratulation! you got the num.And only " + guess.getNumGuesses() + " tries!");
                    pw.flush();
                    pw.println("Are you try again:y/n?");
                    pw.flush();
                    String isGo = br.readLine().trim();//获取用户输入
                    if ("y".equals(isGo)) {//判断用户输入是否为y
                        guess = new GuessNumber();//重新创建一个GuessNumber对象
                        guess.setNum(Math.round((float) Math.random() * 100));//设置随机数
                        continue;//继续循环
                    } else {
                        pw.println("110");//向客户端发送信息
                        pw.flush();
                        break;
                    }
                } else if ("110".equals(answer)) {//判断客户端发送的信息是否为110
                    pw.println("110");
                    pw.flush();
                    break;
                } else {
                    pw.println("good job! you are try " + guess.getNumGuesses() + " times!");
                    guess.setHint();
                    pw.println("But the number you guess is too " + guess.getHint());
                    pw.flush();
                    continue;
                }
            } catch (NumberFormatException e) {
                continue;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            if (br != null) {//关闭输入流
                br.close();
            }
            if (pw != null) {//关闭输出流
                pw.close();
            }
            if (socket != null) {//关闭套接字
                socket.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(Integer.parseInt(PropertiesUtils.properties.getProperty("port")));//创建服务器套接字
            System.out.println("server is running......");
            while (true) {
                Socket socket = server.accept();//接收客户端的连接
                new GuessNumberServer(socket).start();//启动线程
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
