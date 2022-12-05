package com.lihuan.Practice.EchartDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 需求：一个客户端发送了信息，其他客户端可以看到该客户端发的信息（类似群聊）
 * 提示：
 * 客户端 发信息到客户端
 * 服务器 读取某客户端的信息 将该信息广播给其他客户端
 */

public class MyServer {
    //定义线程安全的成员变量 集合
    public static List<Socket> socketList = Collections.synchronizedList(new ArrayList<Socket>());

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(10086);
        while (true) {
            Socket accept = server.accept();
            System.out.println(accept);
            socketList.add(accept);
            //启动处理客户数据的线程 并且将当前客户端传给线程去处理
            new Thread(new ServerThread(accept)).start();
        }
    }
}

//每个线程对应了一个客户端的socket
class ServerThread implements Runnable {
    //定义当前的那个客户端 外部获取
    private Socket socket;
    BufferedReader reader;

    ServerThread(Socket socket) throws IOException {
        this.socket = socket;
        //定义从socket获取的包装输入流
        reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    }

    //客户端处理逻辑
    @Override
    public void run() {
        //获取来自客户端的信息
        String line = null;
        //循环从客户端获取数据
        //readFromClient 此处封装了读取信息的方法 为了处理异常
        while ((line = readFromClient()) != null) {
            System.out.println(line);
            //将来自客户端的信息 广播发给所有客户端
            for (Socket s : MyServer.socketList) {
                PrintStream print = null;
                try {
                    if (socket != s) {
                        print = new PrintStream(s.getOutputStream());
                        print.println(line);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //封装了读取客户端信息的方法 如果异常 则将集合中的那个socket移除
    public String readFromClient() {
        try {
            return reader.readLine();
        } catch (Exception e) {
            //表明该socket对应的客户端已经关闭
            MyServer.socketList.remove(socket);
            e.printStackTrace();
        }
        return null;
    }
}