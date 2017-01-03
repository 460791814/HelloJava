package cn.sc.java.map;

//可变参数
public class ParamterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 System.out.println(newAdd(1,2));
	}

	public static int newAdd(int a, int...arr) {
		int sum = a;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
