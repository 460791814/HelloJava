package cn.sc.java.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import cn.sc.java.xuxi.interfaceDemo;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ����ת�������أ�
		 * 
		 * ʹ�õľ���Collection�ӿ��е�toArray������
		 * 
		 * ����ת�����飺���ԶԼ����е�Ԫ�ز����ķ��������޶�����������������ɾ��
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
		 * ��������е�Ԫ���Ƕ�����ôת�ɼ���ʱ��ֱ�ӽ������е�Ԫ����Ϊ�����е�Ԫ�ؽ��м��ϴ洢��
		 * 
		 * ��������е�Ԫ���ǻ���������ֵ����ô�Ὣ��������Ϊ�����е�Ԫ�ؽ��д洢��
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
	
	//toString�ľ���ʵ�֡�
	public static String myToString(int[] a){
		int iMax = a.length - 1;
		if (iMax == -1)
	            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0;  ; i++) {//�м�ʡ�������жϣ������Ч�ʡ�
            b.append(a[i]);
	    if (i == iMax)
	    	return b.append(']').toString();
           b.append(", ");
        }
	}

}
