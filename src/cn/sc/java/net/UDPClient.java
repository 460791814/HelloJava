package cn.sc.java.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("���Ͷ�����......");
		/*
		 * ����UDP����ķ��Ͷˡ� ˼·�� 1������udp��socket���� 2����Ҫ���͵����ݷ�װ�����ݰ��С�
		 * 3��ͨ��udp��socket�������ݰ����ͳ�ȥ�� 4���ر�socket����
		 */
		// 1,udpsocket����ʹ��DatagramSocket����
        //���Բ��ƶ��˿� ���ƶ���Ĭ��һ���˿�
		DatagramSocket dSocket = new DatagramSocket(9999);
		String str = "��������";
		byte[] bytes = str.getBytes();
         DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("10.1.14.236"),10000);
         dSocket.send(datagramPacket);
         dSocket.close();
	}

}
