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
		 * ����tcp����˵�˼·��
		 * 1�����������socket����ͨ��ServerSocket����
		 * 2������˱�������ṩһ���˿ڣ�����ͻ����޷����ӡ�
		 * 3����ȡ���ӹ����Ŀͻ��˶���
		 * 4��ͨ���ͻ��˶����ȡsocket����ȡ�ͻ��˷��������� 
		 * 		����ӡ�ڿ���̨�ϡ�
		 * 5���ر���Դ���ؿͻ��ˣ��ط���ˡ� 
		 */
		ServerSocket serverSocket = new ServerSocket(10002);
		//��ȡ���ӹ����Ŀͻ��˶���
		Socket accept = serverSocket.accept();
		//��ȡ������
		 InputStream inputStream = accept.getInputStream();
		 byte[] buf=new byte[1024];
		 int len = inputStream.read(buf);
		String text = new String(buf,0,len);
		System.out.println(text);
		//��ȡ����� д������
		//OutputStream outputStream = accept.getOutputStream();
		//outputStream.write("�յ�".getBytes());
		serverSocket.close();
		accept.close();
	}

}
