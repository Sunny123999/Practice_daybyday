package com.lihuan.Practice.ClientAndServer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 客户端和服务器通信
 * 客户端需求：把一个图片文件发送到服务端并读取回馈信息
 * 服务端需求：接收客户端发送过来的图片数据
 * 进行存储后，回馈一个“上传成功”字样
 * 服务端
 */
public class PictureServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10086);
        Socket socket = serverSocket.accept();
        try (
                PrintStream printStream = new PrintStream(socket.getOutputStream());
                BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("new.jpg"));
        ) {
            //读取客户端发的图片，写到本地路径
            int len = -1;
            while ((len = bufferedInputStream.read()) != -1) {
                out.write(len);
                out.flush();
            }
            System.out.println("服务器已经接受到图片！");
            System.out.println(socket);
            //给客户端返回响应
            printStream.println("上传成功！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
