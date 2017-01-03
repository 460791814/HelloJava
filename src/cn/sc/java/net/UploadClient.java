package cn.sc.java.net;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class UploadClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Socket socket = new Socket("10.1.14.236", 10002);
		OutputStream out = socket.getOutputStream();

		BufferedReader bufferedReader = new BufferedReader(new FileReader("d://demo.txt"));
		PrintWriter printWriter = new PrintWriter(out, true);
		String line = null;
		while ((line = bufferedReader.readLine()) != null) {
           printWriter.println(line);
		}
		//֪ͨ���������ͻ���д����
        socket.shutdownOutput();
		// ��ȡ����˷��ص�����,ʹ��socket��ȡ����
		BufferedReader bufin = new BufferedReader( new InputStreamReader( socket.getInputStream()));
		 
		System.out.println(bufin.readLine());

		// �ر���Դ��
		socket.close();
	}

}
