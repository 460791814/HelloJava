package cn.sc.java.list;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TreeSet必须传入一个比较器   要么外部传  要么 添加的对象自身含有比较器
       TreeSet set=new TreeSet(new ComparatorName());
      set.add(new Person("d", 1));
      set.add(new Person("c", 3));
      set.add(new Person("b", 2));
      set.add(new Person("c", 1));
      
      Iterator iterator = set.iterator();
      while (iterator.hasNext()) {
    	  Person object = (Person) iterator.next();
		System.out.println(object.getName()+":"+object.getAge());
	}
      
	}

}
//比较器
 class ComparatorName implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		Person p1 = (Person)arg0;
		Person p2 = (Person)arg1;
		int temp=p1.getName().compareTo(p2.getName());
		
		return temp==0?p1.getAge()-p2.getAge():temp;
	}
	
	
}
