package cn.sc.java.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//true��ʾ׷��
        FileWriter fileWriter=new FileWriter("d://demo.txt", true);
        fileWriter.write("xxxxx");
        fileWriter.flush();
        //�ڹر�֮ǰ���ȵ���flush
        fileWriter.close();
        
	}

}
