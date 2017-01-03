package cn.sc.java.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Write();
		copy();
	}

	// 读取数据
	static void Read() throws Exception {
		FileInputStream fileInputStream = new FileInputStream("d://demo.txt");
		byte[] buf = new byte[1024];
		int len = 0;
		while ((len = fileInputStream.read(buf)) != -1) {
			System.out.println(new String(buf, 0, len));
			System.out.println("------------------" + len + "-----------------");
		}
		fileInputStream.close();
	}

	// 写入数据
	static void Write() throws Exception {
		FileOutputStream fileOutputStream = new FileOutputStream("f://demo.txt");
		fileOutputStream.write("aaaaaa".getBytes());
		fileOutputStream.close();
		System.out.println("完毕");
	}

	// 复制文件
	static void copy() throws Exception {
		// 输入
		FileInputStream fileInputStream = new FileInputStream("D://demo.txt");
		BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
		// 输出
		FileOutputStream fileOutputStream = new FileOutputStream("f://demo.txt");
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

		byte[] buf = new byte[1024];
		int len = 0;
		while ((len = bufferedInputStream.read(buf)) != -1) {
              bufferedOutputStream.write(buf, 0, len);
              //缓冲区满了自动会flush 
              bufferedOutputStream.flush();
		}
		
		fileInputStream.close();
		fileOutputStream.close();
	}
}
