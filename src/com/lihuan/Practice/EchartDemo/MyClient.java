package com.lihuan.Practice.EchartDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

/**
 * 需求：一个客户端发送了信息，其他客户端可以看到该客户端发的信息（类似群聊）
 * 提示：
 * 客户端 发信息到客户端
 * 服务器 读取某客户端的信息 将该信息广播给其他客户端
 */

public class MyClient {
    private static String name = "vanse";

    public static void main(String[] args) throws IOException {
        //处理来自服务器广播的数据
        Socket s = new Socket("127.0.0.1", 10086);
        //开启线程 不断读取来自服务器的数据
        new Thread(new ClientThread(s)).start();
        //---------------获取键盘输入数据，将信息写给服务器---------------
        //获取对应的输出流
        PrintStream print = new PrintStream(s.getOutputStream());
        //获取键盘输入
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while ((line = reader.readLine()) != null) {
            //print.println(line);
            print.println(name + "说" + line);
        }
    }
}

class ClientThread implements Runnable {
    private Socket socket;
    BufferedReader reader;

    ClientThread(Socket socket) throws IOException {
        this.socket = socket;
        reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    }

    @Override
    public void run() {
        //处理来自服务器的数据
        String line = null;
        try {
            while ((line = reader.readLine()) != null) {
                //不断读取来自服务端的数据
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}