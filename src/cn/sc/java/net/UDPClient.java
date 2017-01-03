package cn.sc.java.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("发送端启动......");
		/*
		 * 创建UDP传输的发送端。 思路： 1，建立udp的socket服务。 2，将要发送的数据封装到数据包中。
		 * 3，通过udp的socket服务将数据包发送出去。 4，关闭socket服务。
		 */
		// 1,udpsocket服务。使用DatagramSocket对象。
        //可以不制定端口 不制定会默认一个端口
		DatagramSocket dSocket = new DatagramSocket(9999);
		String str = "我是数据";
		byte[] bytes = str.getBytes();
         DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("10.1.14.236"),10000);
         dSocket.send(datagramPacket);
         dSocket.close();
	}

}
