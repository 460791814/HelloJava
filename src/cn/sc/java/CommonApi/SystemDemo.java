package cn.sc.java.CommonApi;

import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class SystemDemo {
	//��ȡϵͳ�Ļس����з� WINϵͳ��/r/n  linux��/r
     private static final String LINE_SEPARATOR=System.getProperty("line.separator");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("a"+ LINE_SEPARATOR+"b");
       demo();
	}
   static  void demo()
   {
	    Properties properties = System.getProperties();
	   Set<Entry<Object,Object>> entrySet = properties.entrySet();
	   for (Entry<Object, Object> entry : entrySet) {
		System.out.println(entry.getKey()+":"+entry.getValue());
	}
	   
   }
}
