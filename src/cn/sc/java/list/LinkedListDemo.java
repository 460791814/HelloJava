package cn.sc.java.list;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LinkedList linkedList = new  LinkedList();
      linkedList.addFirst("1");
      linkedList.addFirst("3");
//		System.out.println(link);
//		System.out.println(link.getFirst());//��ȡ��һ������ɾ����
//		System.out.println(link.getFirst());
		
//		System.out.println(link.removeFirst());//��ȡԪ�ص��ǻ�ɾ����
//		System.out.println(link.removeFirst());
      while (!linkedList.isEmpty()) {
		System.out.println(linkedList.poll());
	}
	}

}
