package cn.sc.java.CommonApi;

import java.util.Random;

public class MathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Math:�ṩ�˲�����ѧ����ķ��������Ǿ�̬�ġ�
		 * 
		 * ���õķ�����
		 * ceil():���ش��ڲ�������С������
		 * floor():����С�ڲ��������������
		 * round():�������������������
		 * pow(a,b):a��b�η���
		 * 
		 */
		double d1 = Math.ceil(12.56);
		double d2 = Math.floor(12.56);
		double d3 = Math.round(12.46);
		
		Random random = new Random();
		System.out.println(random.nextInt(10));
	}

}
