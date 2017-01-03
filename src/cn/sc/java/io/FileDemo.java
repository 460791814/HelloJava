package cn.sc.java.io;

import java.io.File;
import java.io.FilenameFilter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir  = new File("d:\\demodir");
	//System.out.println(	dir.delete());
		removeDir(dir);
	}
public static void removeDir(File dir) {
		
		File[] files = dir.listFiles();
		
		for(File file : files){
			
			if(file.isDirectory()){
				removeDir(file);
			}else{
				System.out.println(file+":"+file.delete());
			}
		}
		System.out.println(dir+":"+dir.delete());
	}
	static void MkDel() {
		File file = new File("d:/dd");
		// file.mkdir();
		if (file.exists()) {
			file.delete();
		}

	}

	public static void getDemo() {
		// File file = new File("E:\\java0331\\day22e\\a.txt");
		File file = new File("d:/demo.txt");

		String name = file.getName();

		String absPath = file.getAbsolutePath();// ����·����

		String path = file.getPath();

		long len = file.length();

		long time = file.lastModified();

		Date date = new Date(time);

		// DateFormat dateFormat =
		// DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);

		// String str_time = dateFormat.format(date);
		String str_time = new SimpleDateFormat("yyyyMMdd").format(date);

		System.out.println("parent:" + file.getParent());

		System.out.println("name:" + name);
		System.out.println("absPath:" + absPath);
		System.out.println("path:" + path);
		System.out.println("len:" + len);
		System.out.println("time:" + time);
		System.out.println("str_time:" + str_time);

	}

	static void constructorDemo() {

		// ��ϵͳ�йص�Ĭ�����Ʒָ�����Ϊ�˷��㣬������ʾΪһ���ַ���
		File file = new File("d:" + File.separator + "demo.txt");
		System.out.println(file);
	}

	// ���ݹ���������
	static void ListFileByfilter() {

		File file = new File("D://");
		File[] listFiles = file.listFiles(new FilterByHidden());
		for (File file2 : listFiles) {
			System.out.println(file2);
		}

	}

	// �����ļ�������
	static void ListFileByfilterName() {
		File file = new File("D://");
		File[] listFiles = file.listFiles(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return name.endsWith(".txt");
			}

		});
		for (File file2 : listFiles) {
			System.out.println(file2);
		}
	}

	/*
	 * ��ȡ��ǰĿ¼�µ��ļ��Լ��ļ��е����ƣ����������ļ��� ����list������File�����з�װ�ı�����Ŀ¼��
	 * ����ᷢ��NullPointerException ������ʵ�ϵͳ��Ŀ¼Ҳ�ᷢ����ָ���쳣��
	 * 
	 * ���Ŀ¼���ڵ���û�����ݣ��᷵��һ�����飬���ǳ���Ϊ0.
	 * 
	 */
	static void ListFile() {
		File file = new File("D://");
		String[] list = file.list();
		for (String str : list) {
			System.out.println(str);
		}
	}

}
