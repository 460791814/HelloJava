package cn.sc.java.string;

public class stringdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  String s1="abc";
//  String s2=s1.intern();
// 
//  System.out.println(s1.equals(s2));
  
	String s = "abc";//创建一个字符串对象在常量池中。		
	String s1 = new String("abc");//创建两个对象一个new一个字符串对象在堆内存中。
	
	System.out.println(s==s1);//false
	
	System.out.println(s.equals(s1));
	
	StringBuilder sBuilder=new StringBuilder();
	sBuilder.append("xsxs");
	System.out.println(sBuilder.toString());
	 Integer integer=new Integer("11");
	System.out.println(integer);
	Integer a = new Integer("301");
	Integer b = new Integer(300);
	
	System.out.println(a==b);
	System.out.println(a.equals(b));
	
	//System.out.println(a.compare(2, 2));
	System.out.println(a.compareTo(b));
	 
	}

}
