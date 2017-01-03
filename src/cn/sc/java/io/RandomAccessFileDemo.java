package cn.sc.java.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		randomWrite();
	}
	public static void randomWrite() throws IOException{
		RandomAccessFile raf = new RandomAccessFile("d://random.txt", "rw");
		
		//往指定位置写入数据。
		raf.seek(3*8);
		
		raf.write("哈哈".getBytes());
		raf.writeInt(108);
		
		raf.close();
	}
	
	//读取文件
	static void readFile() throws Exception
	{
		 RandomAccessFile randomAccessFile=new RandomAccessFile("d://random.txt", "r");
		randomAccessFile.seek(1);
		byte[] buf=new byte[1024];
		randomAccessFile.read(buf);
		String line=new String(buf);
		System.out.println(line);
	}
	//写入
	static void writeFile() throws Exception
	{
		 RandomAccessFile randomAccessFile=new RandomAccessFile("d://random.txt", "rw");
		 randomAccessFile.write("asdsadsadsadsa".getBytes());
		 
		randomAccessFile.writeInt(97);
	
		randomAccessFile.close();
	}

}
