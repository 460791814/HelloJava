package cn.sc.java.io;

import java.io.UnsupportedEncodingException;

public class StringEncodeDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String line = "���";
		// ����
		byte[] bytes = line.getBytes("Utf-8");
		// ����
		String string = new String(bytes, "utf-8");
		System.out.println(string);
	}

}
