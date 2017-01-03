package cn.sc.java.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * ����UDP���ն˵�˼·��
		 * 1������udp socket����,��Ϊ��Ҫ�������ݣ�����Ҫ��ȷһ���˿ںš�
		 * 2���������ݰ������ڴ洢���յ������ݡ����������ݰ�����ķ���������Щ����.
		 * 3��ʹ��socket�����receive���������յ����ݴ洢�����ݰ��С�
		 * 4��ͨ�����ݰ��ķ����������ݰ��е����ݡ�
		 * 5���ر���Դ 
		 */
		//1,����udp socket����
		DatagramSocket ds = new DatagramSocket(10000);
		while (true) {
			byte[] buf=	new byte[1024];
			DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length);
			//ʹ�ý��ܷ��������ݴ洢�����ݰ���
			ds.receive(datagramPacket);
			String ip = datagramPacket.getAddress().getHostAddress();//ip
			int port = datagramPacket.getPort();//�˿�
			
			//����
			String context = new String( datagramPacket.getData(),0,datagramPacket.getLength());
			System.out.println(ip+":"+port+":"+context);
		}
		
	}

}
