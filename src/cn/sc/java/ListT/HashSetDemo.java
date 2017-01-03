package cn.sc.java.ListT;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   HashSet<Student> hSet=new HashSet<Student>();
   hSet.add(new Student("b",2));
   hSet.add(new Student("a",2));
    Iterator<Student> iterator = hSet.iterator();
    while (iterator.hasNext()) {
		Student student = (Student) iterator.next();
		System.out.println(student);
	}
	}

}
