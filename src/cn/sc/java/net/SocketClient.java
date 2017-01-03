package cn.sc.java.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClient {
	public static void main(String[] args) throws Exception {
		/*
		 * Tcp���䣬�ͻ��˽����Ĺ��̡� 1������tcp�ͻ���socket����ʹ�õ���Socket����
		 * ����ö���һ��������ȷĿ�ĵء�Ҫ���ӵ������� 2��������ӽ����ɹ���˵�����ݴ���ͨ���ѽ����� ��ͨ������socket�� ,�ǵײ㽨���õġ�
		 * ��Ȼ������˵������������룬��������� ��Ҫ���������������󣬿�����Socket����ȡ��
		 * ����ͨ��getOutputStream(),��getInputStream()����ȡ�����ֽ����� 3��ʹ���������������д����
		 * 4���ر���Դ��
		 */

		Socket socket = new Socket("10.1.14.236", 10002);
		OutputStream out = socket.getOutputStream();

		out.write("tcp��ʾ������������!".getBytes());
		//��ȡ����˷��ص�����,ʹ��socket��ȡ���� 
		InputStream in = socket.getInputStream();
		byte[] buf = new byte[1024];
		
		int len = in.read(buf);
		
		String  text = new String(buf,0,len);
		
		System.out.println(text);
		
		
		
		//�ر���Դ��
		socket.close();
	}
}
