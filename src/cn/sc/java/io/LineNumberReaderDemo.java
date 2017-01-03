package cn.sc.java.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.LineNumberReader;


//看上去没什么用的东西  可以用来判断读到第几行了
public class LineNumberReaderDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader fReader = new FileReader("d://demo.txt");
		LineNumberReader lineNumberReader = new LineNumberReader(fReader);
		String line = null;
		//设置行号 但是不会改变指针的位置 
		lineNumberReader.setLineNumber(2);
		while ((line = lineNumberReader.readLine()) != null) {
			//读取行号
			System.out.println(lineNumberReader.getLineNumber() + ":" + line);
		}
       lineNumberReader.close();
	}

}
