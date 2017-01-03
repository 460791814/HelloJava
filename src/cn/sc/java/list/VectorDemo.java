package cn.sc.java.list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector vector = new Vector();
		vector.addElement("1");
		vector.addElement("2");
		Enumeration elements = vector.elements();
		while (elements.hasMoreElements()) {
			Object object = (Object) elements.nextElement();
			System.out.println(object);
		}
		Iterator iterator = vector.iterator();
		 while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
	}

}
