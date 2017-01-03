package cn.sc.java.io;

import java.util.ArrayList;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> al = new ArrayList<String>();
		
		al.add("haha");
		al.add("abc");
		al.add("abc");
		al.add("abc");
		
//		int size = al.size();
		
		for(int x=0; x<al.size(); x++){
			if("abc".equals(al.get(x))){
				al.remove(x);
				x--;
			}
		}
		
		System.out.println(al);
	}

}
