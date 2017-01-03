package cn.sc.java.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//true表示追加
        FileWriter fileWriter=new FileWriter("d://demo.txt", true);
        fileWriter.write("xxxxx");
        fileWriter.flush();
        //在关闭之前会先调用flush
        fileWriter.close();
        
	}

}
