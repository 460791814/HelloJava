package cn.sc.java.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileWriter fWriter = new FileWriter("D://demo.txt");
		// ������һ���ַ�д���� �Ļ��������󣬲���ָ��Ҫ����������������
		BufferedWriter bufferedWriter = new BufferedWriter(fWriter);
	    bufferedWriter.write("dddddddd");
	    bufferedWriter.newLine();//����
	    bufferedWriter.flush();//ʹ�û�������ˢ�·���������ˢ��Ŀ�ĵ�
	    //��ʵ���ǹرձ������������
	    bufferedWriter.close();
	    System.out.println("over");
	}

}
