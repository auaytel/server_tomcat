package com.light.server;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Server {
    private static final String BLANK = " ";
    private static final String RN = "\r\n";

    private ServerSocket serverSocket ;

    public static void main(String[] args) {
        Server server = new Server();
        server.start();

    }

    public void start(){
        try {
            System.out.println("servet is starting...");
            serverSocket = new ServerSocket(8080);
            this.receiveData();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void receiveData(){
        try {
            Socket client = serverSocket.accept();
            byte[] data = new byte[10240];
            int len = client.getInputStream().read(data);
            System.out.println("len="+len);
            if(len>0){
                String requestInfo = new String(data,0,len);
                System.out.println(requestInfo);
            }
            String response = "<!DOCTYPE html>"+
                    "<html lang=\"zh\">"+
                    "<head>"+
                    "<meta charset=\"UTF-8\">"+
                    "<title>Test</title>"+
                    "</head>"+
                    "<body>"+
                    "<h3>Hello World!</h3>"+
                    "</body>"+
                    "</html>";
            StringBuilder sb = new StringBuilder();
            sb.append("HTTP/1.1").append(BLANK).append("200").append(BLANK).append("OK").append(RN);
            sb.append("Content-Length:").append(response.length()).append(RN);
            sb.append("Content-Type:text/html").append(RN);
            sb.append("Date:").append(new Date()).append(RN);
            sb.append("Server:nginx/1.12.1").append(RN);
            sb.append(RN);
            sb.append(response);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
            bw.write(sb.toString());
            bw.flush();
            bw.close();
            //OutputStream out = client.getOutputStream();
            //String ab = "HelloWorld";
            //byte[] bytes = sb.toString().getBytes();
            //out.write(bytes);
            //out.flush();
            //out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void stop(){

    }
}
