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
//限定了T得范围 A或者A的子类
class C<T extends A>{
	public void show(T t) {
		// TODO Auto-generated method stub
		System.out.println(t);
		
	}
	
}

class InterImpl2<T> implements Inter<T>
{
    //从外部规定泛型
	@Override
	public void show(T t) {
		// TODO Auto-generated method stub
		System.out.println(t);
		
	}
	
	//方法自定义泛型
	public <W> void Logger(W str)
	{ 
		System.out.println(str);
	}
	
	
	
}