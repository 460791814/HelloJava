package cn.sc.java.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * 建立UDP接收端的思路。
		 * 1，建立udp socket服务,因为是要接收数据，必须要明确一个端口号。
		 * 2，创建数据包，用于存储接收到的数据。方便用数据包对象的方法解析这些数据.
		 * 3，使用socket服务的receive方法将接收的数据存储到数据包中。
		 * 4，通过数据包的方法解析数据包中的数据。
		 * 5，关闭资源 
		 */
		//1,建立udp socket服务。
		DatagramSocket ds = new DatagramSocket(10000);
		while (true) {
			byte[] buf=	new byte[1024];
			DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length);
			//使用接受方法将数据存储到数据包中
			ds.receive(datagramPacket);
			String ip = datagramPacket.getAddress().getHostAddress();//ip
			int port = datagramPacket.getPort();//端口
			
			//正文
			String context = new String( datagramPacket.getData(),0,datagramPacket.getLength());
			System.out.println(ip+":"+port+":"+context);
		}
		
	}

}
