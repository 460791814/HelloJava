package cn.sc.java.list;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class collectiondemo {
	public static void main(String[] args) {
		Collection collection = new ArrayList();
		collection.add("123");
		collection.add("456");
		// for (Object object : collection) {
		// System.out.println(object);
		// }
		Iterator iterator = collection.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		
		
	
	}
}
