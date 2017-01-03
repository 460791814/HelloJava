package cn.sc.java.xuxi;

class AA {
	int num = 1;

	void show() {
	}
}

class B extends AA {
	int num = 1;

	void show() {

	}

}

class Class1 {
	int num = 2;

	Class1() {

	}

}

class aaa extends Class1 {
	aaa() {

	}

	int num = 1;

}

public class interfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aaa vA = new aaa();
		B b = new B();
		b.num = 4;
		System.out.println(b.num);
	}

}
