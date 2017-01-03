package cn.sc.java.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

//Collections是集合框架的工具类 里面的方法都是静态的
public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo_3();
	}

	public static void demo_3() {
		// Collections.reverseOrder原本的顺序取反
		TreeSet<String> ts = new TreeSet<String>(Collections.reverseOrder(new ComparatorByLength()));

		ts.add("abc");
		ts.add("hahaha");
		ts.add("zzz");
		ts.add("aa");
		ts.add("cba");

		System.out.println(ts);

	}

	public static void demo_1() {

		List<String> list = new ArrayList<String>();

		list.add("abcde");
		list.add("cba");
		list.add("aa");
		list.add("zzz");
		list.add("cba");
		list.add("nbaa");
	
		System.out.println(list);

		// 对list集合进行指定顺序的排序。
		Collections.sort(list);
		System.out.println(list);

		// 按照指定的排序规则进行排序 指定的规则会覆盖默认的排序规则
		Collections.sort(list, new ComparatorByLength());
		System.out.println(list);
	}
}
