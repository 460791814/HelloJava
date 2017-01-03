package cn.sc.java.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferedReaderDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader fReader = new FileReader("D://demo.txt");
		BufferedReader bufferedReader = new BufferedReader(fReader);
		String readLine = "";
		while ((readLine = bufferedReader.readLine()) != null) {
			System.out.println(readLine);
		}

		bufferedReader.close();
	}

}
