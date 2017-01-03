package cn.sc.java.io;

import java.beans.VetoableChangeListenerProxy;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.nio.charset.Charset;

//输入输出流转换
public class TreansStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// PrintToFile();

	}

	// 输出到屏幕
	static void PrintOut() throws Exception {
		InputStream in = System.in;
		// 字节流转换成字符流
		InputStreamReader inputStreamReader = new InputStreamReader(in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		OutputStream out = System.out;
		// 字节流转换成字符流
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(out);
		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

		String line = null;
		while ((line = bufferedReader.readLine()) != null) {
			if (line.contains("over")) {
				break;

			}
			bufferedWriter.write(line.toUpperCase());
			bufferedWriter.newLine();
			// 把流里面的数据刷到输出流中
			bufferedWriter.flush();

		}

	}

	/// 输出到文件
	static void PrintToFile() throws IOException {
		InputStream in = System.in;
		// 字节流转换成字符流
		InputStreamReader inputStreamReader = new InputStreamReader(in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		OutputStream out = System.out;
		FileOutputStream fileOutputStream = new FileOutputStream("d://demo.txt");
		// 字节流转换成字符流
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "gb2312");
		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

		String line = null;
		while ((line = bufferedReader.readLine()) != null) {
			if (line.contains("over")) {
				break;

			}
			bufferedWriter.write(line.toUpperCase());
			bufferedWriter.newLine();
			// 把流里面的数据刷到输出流中
			bufferedWriter.flush();

		}

	}

	/**
	 * 制定编码读数据
	 * 
	 * @throws Exception
	 */
	static void EnCodeReader() throws Exception {
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(new FileInputStream("d://demo.txt"), "gb2312"));

		String line = null;
		while ((line = bufferedReader.readLine()) != null) {
			System.out.println(line);
		}
	}

	// 编码相关
	static void EnCode() throws Exception {

		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("d://demo.txt"), "GBK");
		FileWriter writer = new FileWriter("d://demo.txt");
		// 上面两句代码的功能是等同的额
		// filewriter其实就是转换流指定了本机默认编码的体现。而且这个转换流的子类对象可以很方便的操作文本对象
		// 简单说：操作文件的字节流+本机默认的编码表。
		// 这是按照默认码表来操作文件的便捷类。
		// 如果操作文本文件需要明确具体的编码。FileWriter就不行了。必须用转换流。
	}
}
