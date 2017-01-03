package cn.sc.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

//合并输出流
public class SequenceInputStreamDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ArrayList<FileInputStream> arrayList = new ArrayList<FileInputStream>();
		arrayList.add(new FileInputStream("d:/1.txt"));
		arrayList.add(new FileInputStream("d:/2.txt"));
		arrayList.add(new FileInputStream("d:/3.txt"));
		Enumeration<FileInputStream> enumeration = Collections.enumeration(arrayList);
	 SequenceInputStream sequenceInputStream = new 	SequenceInputStream(enumeration);
	 
	FileOutputStream fos = new FileOutputStream("d:/1234.txt");
		
		byte[] buf = new byte[1024];
		
		int len = 0;
		
		while((len=sequenceInputStream.read(buf))!=-1){
			fos.write(buf,0,len);
		}
		
		fos.close();
		sequenceInputStream.close();
	 
	}

}
