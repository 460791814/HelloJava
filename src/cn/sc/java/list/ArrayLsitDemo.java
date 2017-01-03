package cn.sc.java.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLsitDemo {
	public static void main(String[] args) {
		ArrayList aList = new ArrayList();
		aList.add(new Person("xiaoming", 12));
		aList.add(new Person("¿œ ¶", 18));
		
		
		Iterator iterator = aList.iterator();
		while (iterator.hasNext()) {
			Person object = (Person) iterator.next();
			System.out.println(object.getName() + "--" + object.getAge());
		}
	}
}
