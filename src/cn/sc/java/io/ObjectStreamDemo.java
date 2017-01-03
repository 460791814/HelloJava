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
    //序列化对象
		 ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D://obj.object"));
		 objectOutputStream.writeObject(new Person("a", 1));
		 objectOutputStream.close();
		 
		 //反序列化对象
		 
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D://obj.object"));
		Person readObject = (Person)objectInputStream.readObject();
		System.out.println(readObject.getName()+":"+readObject.getAge());
		objectInputStream.close();
	}

}
