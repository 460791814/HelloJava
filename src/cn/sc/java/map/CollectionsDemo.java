package cn.sc.java.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

//Collections�Ǽ��Ͽ�ܵĹ����� ����ķ������Ǿ�̬��
public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo_3();
	}

	public static void demo_3() {
		// Collections.reverseOrderԭ����˳��ȡ��
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

		// ��list���Ͻ���ָ��˳�������
		Collections.sort(list);
		System.out.println(list);

		// ����ָ������������������ ָ���Ĺ���Ḳ��Ĭ�ϵ��������
		Collections.sort(list, new ComparatorByLength());
		System.out.println(list);
	}
}
