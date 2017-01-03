package cn.sc.java.map;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

import cn.sc.java.ListT.Student;

public class TreeMapDemo {

	public static void main(String[] args) {
	    TreeMap<Student,String> tm = new TreeMap<Student,String>(new CompByStuName());
		
		tm.put(new Student("lisi",38),"北京");
		tm.put(new Student("zhaoliu",24),"上海");
		tm.put(new Student("xiaoqiang",31),"沈阳");
		tm.put(new Student("wangcai",28),"大连");
		tm.put(new Student("zhaoliu",24),"铁岭");
		
		Iterator<Entry<Student, String>> iterator = tm.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<cn.sc.java.ListT.Student,java.lang.String> entry = (Entry<cn.sc.java.ListT.Student,java.lang.String>) iterator
					.next();
			System.out.println(entry.getKey().getName()+":"+entry.getKey().getAge()+":"+entry.getValue());
		}
		
	}

}
class CompByStuName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		int temp = o1.getName().compareTo(o2.getName());
		
		return temp==0? o1.getAge()-o2.getAge():temp;
	}
	
}

