package cn.sc.java.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = new ServerSocket(10002);
		//��ȡ���ӹ����Ŀͻ��˶���
		Socket accept = serverSocket.accept();
		//��ȡ������
		 InputStream inputStream = accept.getInputStream();
			BufferedReader bufIn = new BufferedReader(new InputStreamReader(accept.getInputStream()));
			
			//4,
			BufferedWriter bufw = new BufferedWriter(new FileWriter("c:\\server.txt"));
			
			String line = null;
			
			while((line=bufIn.readLine())!=null){
				
//				if("over".equals(line))
//					break;
				bufw.write(line);
				bufw.newLine();
				bufw.flush();
			}
			PrintWriter out = new PrintWriter(accept.getOutputStream(),true);
			out.println("�ϴ��ɹ�");
			
			bufw.close();
		 
		serverSocket.close();
		accept.close();
	}

}
