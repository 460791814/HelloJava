package cn.sc.java.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.LineNumberReader;


//����ȥûʲô�õĶ���  ���������ж϶����ڼ�����
public class LineNumberReaderDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader fReader = new FileReader("d://demo.txt");
		LineNumberReader lineNumberReader = new LineNumberReader(fReader);
		String line = null;
		//�����к� ���ǲ���ı�ָ���λ�� 
		lineNumberReader.setLineNumber(2);
		while ((line = lineNumberReader.readLine()) != null) {
			//��ȡ�к�
			System.out.println(lineNumberReader.getLineNumber() + ":" + line);
		}
       lineNumberReader.close();
	}

}
