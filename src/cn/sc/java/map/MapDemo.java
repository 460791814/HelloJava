package cn.sc.java.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(4, "a");
		hashMap.put(2, "b");
	
		// 循环遍历
		Set<Integer> keySet = hashMap.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
			System.out.println(hashMap.get(integer));
		}
		//entrySet循环
		Set<Entry<Integer, String>> entrySet = hashMap.entrySet();
		Iterator<Entry<Integer, String>> iterator2 = entrySet.iterator();
		while (iterator2.hasNext()) {
			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) iterator2.next();
			System.out.println(entry.getKey() + ":" + entry.getValue());

		}
		//foreach循环
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

}
