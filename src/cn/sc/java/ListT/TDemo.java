package cn.sc.java.ListT;

import java.util.logging.Logger;

import cn.sc.java.string.stringdemo;

public class TDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterImpl2<Integer> impl2= new InterImpl2<Integer>();
		impl2.show(123);
		impl2.Logger(666);
		
	 C<A> c = new C<A>();
	 c.show(new B());
	}


}


interface Inter<T>{
	
	public void show(T t); 
}

class A{
	 

}
class B extends A{
	 
	
}
//�޶���T�÷�Χ A����A������
class C<T extends A>{
	public void show(T t) {
		// TODO Auto-generated method stub
		System.out.println(t);
		
	}
	
}

class InterImpl2<T> implements Inter<T>
{
    //���ⲿ�涨����
	@Override
	public void show(T t) {
		// TODO Auto-generated method stub
		System.out.println(t);
		
	}
	
	//�����Զ��巺��
	public <W> void Logger(W str)
	{ 
		System.out.println(str);
	}
	
	
	
}