package cn.sc.java.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class listdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add("123");
		list.add("456");
		// 它可以实现在迭代过程中完成对元素的增删改查。
		// 注意：只有list集合具备该迭代功能.
		ListIterator listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			Object object = (Object) listIterator.next();
			System.out.println(object);
		 
		}
		//hasPrevious 逆序
		while (listIterator.hasPrevious()) {
			Object object = (Object) listIterator.previous();
			System.out.println(object);
			
		}
	
		for (int i = 0; i < list.size(); i++) {
	
			System.out.println(list.get(i));
		}
//		Iterator iterator = list.iterator();
//		while (iterator.hasNext()) {
//			Object object = (Object) iterator.next();
//			System.out.println(object);
//		}
		 
	}

}
