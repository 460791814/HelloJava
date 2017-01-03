package cn.sc.java.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileWriter fWriter = new FileWriter("F://demo.txt");
		FileReader fReader = new FileReader("D://demo.txt");
		int len = 0;
		/*  第一种拷贝方法
		
		while ((len = fReader.read()) != -1) {
			fWriter.write(len);
		}
		*/
		char[] buf=new char[1024];
		while ((len = fReader.read(buf)) != -1) {
			fWriter.write(buf,0,len);
		}
		fWriter.close();
		fReader.close();
		System.out.println("拷贝成功");
	}

}
