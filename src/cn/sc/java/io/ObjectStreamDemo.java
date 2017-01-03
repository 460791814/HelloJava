package cn.sc.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    //���л�����
		 ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D://obj.object"));
		 objectOutputStream.writeObject(new Person("a", 1));
		 objectOutputStream.close();
		 
		 //�����л�����
		 
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D://obj.object"));
		Person readObject = (Person)objectInputStream.readObject();
		System.out.println(readObject.getName()+":"+readObject.getAge());
		objectInputStream.close();
	}

}
