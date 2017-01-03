package cn.sc.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

//Properties������ɾ�Ĳ�
public class PropertiesDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Read();
	}

	static void Create() throws Exception, IOException {
		Properties properties = new Properties();
		properties.setProperty("a", "1");
		properties.setProperty("b", "2");
		properties.setProperty("c", "3");
		// ��������ᴴ���ļ�
		FileOutputStream fileOutputStream = new FileOutputStream("d://proper.txt");
		// �洢��һ���ļ���
		properties.store(fileOutputStream, "create");
		fileOutputStream.close();
	}
	//�޸�
	static void Update() throws Exception
	{
		FileInputStream fileInputStream = new FileInputStream("d://proper.txt");
		Properties properties = new Properties();
		properties.load(fileInputStream);
		properties.setProperty("a", "100");
		FileOutputStream fileOutputStream = new FileOutputStream("d://proper.txt");
		// �洢��һ���ļ���
		properties.store(fileOutputStream, "update");
		fileOutputStream.close();
		
	}
	//ɾ��
	static void Del() throws Exception
	{
		FileInputStream fileInputStream = new FileInputStream("d://proper.txt");
		Properties properties = new Properties();
		properties.load(fileInputStream);
		properties.remove("a");
		FileOutputStream fileOutputStream = new FileOutputStream("d://proper.txt");
		// �洢��һ���ļ���
		properties.store(fileOutputStream, "update");
		fileOutputStream.close();
		fileInputStream.close();
		
	}
	//��
	static void Read() throws Exception
	{
		FileInputStream fileInputStream = new FileInputStream("d://proper.txt");
		Properties properties = new Properties();
		properties.load(fileInputStream);
		 Set<Entry<Object,Object>> entrySet = properties.entrySet();
		 for (Entry<Object, Object> entry : entrySet) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
	}

}
