package cn.sc.java.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// LinkedHashMap可以吧原本无序的的HashMap变得有序
       HashMap<Integer, String> hMap=new LinkedHashMap<Integer,String>();
       hMap.put(1, "a");
       hMap.put(4, "d");
       hMap.put(2, "b");
        Set<Entry<Integer,String>> entrySet = hMap.entrySet();
        for (Entry<Integer, String> entry : entrySet) {
			
        	System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}

}
