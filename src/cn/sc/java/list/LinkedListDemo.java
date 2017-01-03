package cn.sc.java.list;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LinkedList linkedList = new  LinkedList();
      linkedList.addFirst("1");
      linkedList.addFirst("3");
//		System.out.println(link);
//		System.out.println(link.getFirst());//获取第一个但不删除。
//		System.out.println(link.getFirst());
		
//		System.out.println(link.removeFirst());//获取元素但是会删除。
//		System.out.println(link.removeFirst());
      while (!linkedList.isEmpty()) {
		System.out.println(linkedList.poll());
	}
	}

}
