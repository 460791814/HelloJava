package cn.sc.java.io;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fileReader = new FileReader("d://demo.txt");
		
		
//		int ch = 0;
//		while ((ch = fileReader.read()) != -1) {
//
//			System.out.println(ch + ":" + (char) ch);
//		}
        System.out.println("=========");
		char[] buf = new char[1024];
		int len = 0;
		while ((len = fileReader.read(buf)) != -1) {

			System.out.println(len + ":" + new String(buf, 0, len));
		}
	 
		fileReader.close();
	}

}
