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
	 * 获取 将正则规则进行对象的封装。 Pattern p = Pattern.compile("a*b");
	 * //通过正则对象的matcher方法字符串相关联。获取要对字符串操作的匹配器对象Matcher . Matcher m =
	 * p.matcher("aaaaab"); //通过Matcher匹配器对象的方法对字符串进行操作。 boolean b =
	 * m.matches();
	 * 
	 * 
	 */
	static void demo4() {
		String str = "da jia hao,ming tian bu fang jia!";

		String regex = "\\b[a-z]{3}\\b";
		// 将正则表达式封装成对象
		Pattern pattern = Pattern.compile(regex);
		// 通过正则获取匹配器对象
		Matcher matcher = pattern.matcher(str);
                 
		while (matcher.find()) {
			System.out.println(matcher.group());// 获取匹配的子序列

			System.out.println(matcher.start() + ":" + matcher.end());
		}

	}

	// 替换
	static void demo3() {
		String str = "zhangsanttttxiaoqiangmmmmmmzhaoliu";

		str = str.replaceAll("(.)\\1+", "$1");

		System.out.println(str);

		String tel = "15800001111";// 158****1111;

		tel = tel.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");

		System.out.println(tel);

	}

	/*
	 * 切割。
	 * 
	 * 组：((A)(B(C)))
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
		String regex = "[1-9][0-9]{4,14}";// 正则表达式。
		boolean matches = qq.matches(regex);
		System.out.println(matches);
	}
}
