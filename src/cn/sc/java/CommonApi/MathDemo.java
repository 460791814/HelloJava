package cn.sc.java.CommonApi;

import java.util.Random;

public class MathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Math:提供了操作数学运算的方法。都是静态的。
		 * 
		 * 常用的方法：
		 * ceil():返回大于参数的最小整数。
		 * floor():返回小于参数的最大整数。
		 * round():返回四舍五入的整数。
		 * pow(a,b):a的b次方。
		 * 
		 */
		double d1 = Math.ceil(12.56);
		double d2 = Math.floor(12.56);
		double d3 = Math.round(12.46);
		
		Random random = new Random();
		System.out.println(random.nextInt(10));
	}

}
