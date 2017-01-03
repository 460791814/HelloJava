package cn.sc.java.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import cn.sc.java.xuxi.interfaceDemo;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 集合转成数组呢？
		 * 
		 * 使用的就是Collection接口中的toArray方法。
		 * 
		 * 集合转成数组：可以对集合中的元素操作的方法进行限定。不允许对其进行增删。
		 * 
		 * 
		 */
		
		List<String> list = new ArrayList<String>();
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		
		String[] array = list.toArray(new String[list.size()]);
		System.out.println(Arrays.toString(array));
		
		/*
		 * 如果数组中的元素是对象，那么转成集合时，直接将数组中的元素作为集合中的元素进行集合存储。
		 * 
		 * 如果数组中的元素是基本类型数值，那么会将该数组作为集合中的元素进行存储。
		 * 
		 */
		
		int[] arr={1,2,3};
		List<int[]> asList = Arrays.asList(arr);
		for (int[] is : asList) {
			System.out.println(is);
		}
		
		String[] arrStr={"a","b"};
		List<String> asList2 = Arrays.asList(arrStr);
		for (String string : asList2) {
			System.out.println(string);
		}
		
	}
	
	//toString的经典实现。
	public static String myToString(int[] a){
		int iMax = a.length - 1;
		if (iMax == -1)
	            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0;  ; i++) {//中间省略条件判断，提高了效率。
            b.append(a[i]);
	    if (i == iMax)
	    	return b.append(']').toString();
           b.append(", ");
        }
	}

}
