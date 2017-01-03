package cn.sc.java.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * PrintWriter���ַ���ӡ����
		 * ���캯��������
		 * 1���ַ���·����
		 * 2��File����
		 * 3���ֽ��������
		 * 4���ַ��������
		 * 
		 */
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter printWriter = new PrintWriter(new FileWriter("D:/demo.txt"), true);
		String line =  null;
		while((line=bufferedReader.readLine())!=null){
			if("over".equals(line))
				break;
			printWriter.println(line.toUpperCase());
	      	printWriter.flush();  
		}
		
		printWriter.close();
		bufferedReader.close();
		
	}

}
