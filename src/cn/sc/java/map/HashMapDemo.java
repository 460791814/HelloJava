package cn.sc.java.map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import cn.sc.java.ListT.Student;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HashMap<Student, String> hm=new HashMap<Student,String>();
    hm.put(new Student("lisi",38),"����");
	hm.put(new Student("zhaoliu",24),"�Ϻ�");
	hm.put(new Student("xiaoqiang",31),"����");
	hm.put(new Student("wangcai",28),"����");
	hm.put(new Student("zhaoliu",24),"����");
	Set<Entry<Student,String>> entrySet = hm.entrySet();
	for (Entry<Student, String> entry : entrySet) {
		System.out.println(entry.getKey().getName()+":"+entry.getKey().getAge()+":"+entry.getValue());
	}
	
	}

}
