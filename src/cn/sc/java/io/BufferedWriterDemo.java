package cn.sc.java.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileWriter fWriter = new FileWriter("D://demo.txt");
		// 创建了一个字符写入流 的缓冲区对象，并合指定要被缓冲的流对象关联
		BufferedWriter bufferedWriter = new BufferedWriter(fWriter);
	    bufferedWriter.write("dddddddd");
	    bufferedWriter.newLine();//换行
	    bufferedWriter.flush();//使用缓冲区的刷新方法把数据刷到目的地
	    //其实就是关闭被缓冲的流对象
	    bufferedWriter.close();
	    System.out.println("over");
	}

}
