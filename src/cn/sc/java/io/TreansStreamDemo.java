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

//���������ת��
public class TreansStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// PrintToFile();

	}

	// �������Ļ
	static void PrintOut() throws Exception {
		InputStream in = System.in;
		// �ֽ���ת�����ַ���
		InputStreamReader inputStreamReader = new InputStreamReader(in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		OutputStream out = System.out;
		// �ֽ���ת�����ַ���
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(out);
		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

		String line = null;
		while ((line = bufferedReader.readLine()) != null) {
			if (line.contains("over")) {
				break;

			}
			bufferedWriter.write(line.toUpperCase());
			bufferedWriter.newLine();
			// �������������ˢ���������
			bufferedWriter.flush();

		}

	}

	/// ������ļ�
	static void PrintToFile() throws IOException {
		InputStream in = System.in;
		// �ֽ���ת�����ַ���
		InputStreamReader inputStreamReader = new InputStreamReader(in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		OutputStream out = System.out;
		FileOutputStream fileOutputStream = new FileOutputStream("d://demo.txt");
		// �ֽ���ת�����ַ���
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "gb2312");
		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

		String line = null;
		while ((line = bufferedReader.readLine()) != null) {
			if (line.contains("over")) {
				break;

			}
			bufferedWriter.write(line.toUpperCase());
			bufferedWriter.newLine();
			// �������������ˢ���������
			bufferedWriter.flush();

		}

	}

	/**
	 * �ƶ����������
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

	// �������
	static void EnCode() throws Exception {

		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("d://demo.txt"), "GBK");
		FileWriter writer = new FileWriter("d://demo.txt");
		// �����������Ĺ����ǵ�ͬ�Ķ�
		// filewriter��ʵ����ת����ָ���˱���Ĭ�ϱ�������֡��������ת���������������Ժܷ���Ĳ����ı�����
		// ��˵�������ļ����ֽ���+����Ĭ�ϵı����
		// ���ǰ���Ĭ������������ļ��ı���ࡣ
		// ��������ı��ļ���Ҫ��ȷ����ı��롣FileWriter�Ͳ����ˡ�������ת������
	}
}
