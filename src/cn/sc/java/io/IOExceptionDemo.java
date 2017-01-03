package cn.sc.java.io;

import java.io.FileWriter;
import java.io.IOException;

public class IOExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fWriter = null;
		try {
			fWriter = new FileWriter("d://demo.txt");
			fWriter.write("dsadsadsadsa");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
			 throw new RuntimeException("πÿ±’ ß∞‹");
			}
		}

	}

}
