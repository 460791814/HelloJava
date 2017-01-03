package cn.sc.java.CommonApi;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getStrings();
	}
	   private static void getStrings() {
	        String str = "rrwerqq84461376qqasfdasdfrrwerqq84461377qqasfdasdaa654645aafrrwerqq84461378qqasfdaa654646aaasdfrrwerqq84461379qqasfdasdfrrwerqq84461376qqasfdasdf";
	        Pattern p = Pattern.compile("qq(.*?)qq");
	        Matcher m = p.matcher(str);
	        ArrayList<String> strs = new ArrayList<String>();
	        while (m.find()) {
	            strs.add(m.group(1));            
	        } 
	        for (String s : strs){
	            System.out.println(s);
	        }        
	    }
	/*
	 * ��ȡ �����������ж���ķ�װ�� Pattern p = Pattern.compile("a*b");
	 * //ͨ����������matcher�����ַ������������ȡҪ���ַ���������ƥ��������Matcher . Matcher m =
	 * p.matcher("aaaaab"); //ͨ��Matcherƥ��������ķ������ַ������в����� boolean b =
	 * m.matches();
	 * 
	 * 
	 */
	static void demo4() {
		String str = "da jia hao,ming tian bu fang jia!";

		String regex = "\\b[a-z]{3}\\b";
		// ��������ʽ��װ�ɶ���
		Pattern pattern = Pattern.compile(regex);
		// ͨ�������ȡƥ��������
		Matcher matcher = pattern.matcher(str);
                 
		while (matcher.find()) {
			System.out.println(matcher.group());// ��ȡƥ���������

			System.out.println(matcher.start() + ":" + matcher.end());
		}

	}

	// �滻
	static void demo3() {
		String str = "zhangsanttttxiaoqiangmmmmmmzhaoliu";

		str = str.replaceAll("(.)\\1+", "$1");

		System.out.println(str);

		String tel = "15800001111";// 158****1111;

		tel = tel.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");

		System.out.println(tel);

	}

	/*
	 * �и
	 * 
	 * �飺((A)(B(C)))
	 */
	public static void Demo2() {

		String str = "zhangsanttttxiaoqiangmmmmmmzhaoliu";

		String[] names = str.split("(.)\\1+");// str.split("\\.");

		for (String name : names) {
			System.out.println(name);
		}

	}

	static void demo1() {
		String qq = "123k4567";
		String regex = "[1-9][0-9]{4,14}";// ������ʽ��
		boolean matches = qq.matches(regex);
		System.out.println(matches);
	}
}
