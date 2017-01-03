package cn.sc.java.ListT;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class GenericAdvanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         TreeSet<Student> treeSet=new TreeSet<Student>(new CompByStuName());
         treeSet.add(new Student("a", 1));
         treeSet.add(new Student("b", 2));
        
            Iterator<Student> iterator = treeSet.iterator();
            while (iterator.hasNext()) {
				Student student = (Student) iterator.next();
				System.out.println(student);
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

