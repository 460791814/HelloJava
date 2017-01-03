package cn.sc.java.xuxi;
class Fu
{
	int num = 3;
	void show()
	{
		System.out.println("fu show");
	}

	static void method()
	{
		System.out.println("fu static method");
	}
}

class Zi extends Fu
{
	int num = 4;
	void show()
	{
		System.out.println("zi show");
	}

	static void method()
	{
		System.out.println("zi static method");
	}
}
interface Inter
{
	void show1();
	void show2();
}
public class duotai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fu.method();
		Zi.method();
		Fu f = new Zi();//
		f.method();
		f.show();
		System.out.println(f.num);
		
		show(new Inter() {
			
			@Override
			public void show2() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void show1() {
				// TODO Auto-generated method stub
				
			}
		});
		
	
	}
	public static void show(Inter in)
	{
		in.show1();
		in.show2();
	}

}
