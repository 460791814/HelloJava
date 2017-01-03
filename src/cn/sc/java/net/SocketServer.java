package cn.sc.java.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * 建立tcp服务端的思路：
		 * 1，创建服务端socket服务。通过ServerSocket对象。
		 * 2，服务端必须对外提供一个端口，否则客户端无法连接。
		 * 3，获取连接过来的客户端对象。
		 * 4，通过客户端对象获取socket流读取客户端发来的数据 
		 * 		并打印在控制台上。
		 * 5，关闭资源。关客户端，关服务端。 
		 */
		ServerSocket serverSocket = new ServerSocket(10002);
		//获取链接过来的客户端对象
		Socket accept = serverSocket.accept();
		//获取输入流
		 InputStream inputStream = accept.getInputStream();
		 byte[] buf=new byte[1024];
		 int len = inputStream.read(buf);
		String text = new String(buf,0,len);
		System.out.println(text);
		//获取输出流 写出数据
		//OutputStream outputStream = accept.getOutputStream();
		//outputStream.write("收到".getBytes());
		serverSocket.close();
		accept.close();
	}

}
