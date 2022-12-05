package com.lihuan.Practice.GuessNumber;

import java.io.*;
import java.net.Socket;

public class GuessNumberClient {
    private BufferedReader br;
    private PrintWriter pw;

    public GuessNumberClient(Socket socket) {
        try {
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            pw = new PrintWriter(socket.getOutputStream());
            Reader reader = new Reader();
            Writer writer = new Writer();
            reader.start();
            writer.start();
            reader.join();
            writer.join();
            socket.close();
            pw.close();
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public class Writer extends Thread {
        public void run() {
            while (true) {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                try {
                    Thread.sleep(500);
                    String msg = br.readLine();
                    if (msg != null) {
                        if ("110".equals(msg)) {
                            pw.println(msg);
                            pw.flush();
                            break;
                        }
                        pw.println(msg);
                        pw.flush();
                    } else {
                        continue;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            System.exit(0);
        }
    }

    public class Reader extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(500);
                    String msg = br.readLine();
                    if ("110".equals(msg)) {//如果服务器返回110，说明服务器已经关闭
                        break;
                    }
                    System.out.println(msg);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            System.exit(0);
        }
    }

    public static void main(String[] args) throws IOException {
        String address = PropertiesUtils.properties.getProperty("address");
        int port = Integer.parseInt((String) PropertiesUtils.properties.get("port"));
        Socket client = new Socket(address, port);
        new GuessNumberClient(client);
    }
}
