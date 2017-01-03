package cn.sc.java.list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //hashset存储是无序的
	HashSet hashSet = new HashSet();
	hashSet.add("heihei");
	hashSet.add("haha");
	hashSet.add("xixi");
	hashSet.add("hehe");
	Iterator iterator = hashSet.iterator();
	while (iterator.hasNext()) {
		System.out.println( iterator.next());
		
	}
	//有序的链表hashset
	LinkedHashSet linkedHashSet = new LinkedHashSet();
	linkedHashSet.add("heihei");
	linkedHashSet.add("haha");
	linkedHashSet.add("xixi");
	linkedHashSet.add("hehe");
	Iterator iterator2 = linkedHashSet.iterator();
	while (iterator2.hasNext()) {
		System.out.println( iterator2.next());
		
	}
	}

}
