package com.lihuan.Practice.ClientAndServer;

import java.io.*;
import java.net.Socket;

/**
 * 客户端和服务器通信
 * 客户端需求：把一个图片文件发送到服务端并读取回馈信息
 * 服务端需求：接收客户端发送过来的图片数据
 * 进行存储后，回馈一个“上传成功”字样
 * 客户端
 */
public class PictureClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10086);
        System.out.println("开始上传！");
        try (
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("D:\\下载\\壁纸下载\\景观\\login.jpg"));
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        ) {
            //读取本地图片，上传到服务器
            int len = -1;
            while ((len = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(len);
            }
            bufferedOutputStream.flush();//刷新缓冲区
            //仅仅关闭输出流，不关闭socket
            socket.shutdownOutput();
            //接收服务器返回的响应
            System.out.println(bufferedReader.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
