package cn.sc.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

//Properties集合增删改查
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
		// 不存在则会创建文件
		FileOutputStream fileOutputStream = new FileOutputStream("d://proper.txt");
		// 存储到一个文件中
		properties.store(fileOutputStream, "create");
		fileOutputStream.close();
	}
	//修改
	static void Update() throws Exception
	{
		FileInputStream fileInputStream = new FileInputStream("d://proper.txt");
		Properties properties = new Properties();
		properties.load(fileInputStream);
		properties.setProperty("a", "100");
		FileOutputStream fileOutputStream = new FileOutputStream("d://proper.txt");
		// 存储到一个文件中
		properties.store(fileOutputStream, "update");
		fileOutputStream.close();
		
	}
	//删除
	static void Del() throws Exception
	{
		FileInputStream fileInputStream = new FileInputStream("d://proper.txt");
		Properties properties = new Properties();
		properties.load(fileInputStream);
		properties.remove("a");
		FileOutputStream fileOutputStream = new FileOutputStream("d://proper.txt");
		// 存储到一个文件中
		properties.store(fileOutputStream, "update");
		fileOutputStream.close();
		fileInputStream.close();
		
	}
	//查
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
