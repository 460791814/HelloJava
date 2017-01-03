package cn.sc.java.CommonApi;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		getMethodDemo();
	}

	// 获取class对象
	static void GetClass() throws Exception {
		// * 要想要对字节码文件进行解剖，必须要有字节码文件对象.
		// * 如何获取字节码文件对象呢？
		String className = "cn.sc.java.CommonApi.Person";
		Class class1 = Class.forName(className);

		Class class2 = Person.class;
		Class class3 = new Person().getClass();

	}

	// 反射通过构造函数获取对象
	static void CreateNewObject() throws Exception {
		String className = "cn.sc.java.CommonApi.Person";
		Class class1 = Class.forName(className);
		Constructor constructor = class1.getConstructor(String.class, int.class);
		Object obj = constructor.newInstance("小三", 18);
		((Person) obj).show();

	}

	// 通过无参数的构造函数进行对象创建
	public static void createNewObject2()
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		// 早期：new时候，先根据被new的类的名称找寻该类的字节码文件，并加载进内存，
		// 并创建该字节码文件对象，并接着创建该字节文件的对应的Person对象.
		// cn.itcast.bean.Person p = new cn.itcast.bean.Person();

		// 现在：
		String name = "cn.sc.java.CommonApi.Person";
		// 找寻该名称类文件，并加载进内存，并产生Class对象。
		Class clazz = Class.forName(name);
		// 如何产生该类的对象呢？
		Object obj = clazz.newInstance();

	}

	// 获取字段 并赋值
	static void GetField() throws Exception {
		String name = "cn.sc.java.CommonApi.Person";
		// 找寻该名称类文件，并加载进内存，并产生Class对象。
		Class clazz = Class.forName(name);
		// 只获取本类，但包含私有
		Field field = clazz.getDeclaredField("age");
		// 对私有字段的访问取消权限检查。暴力访问。
		field.setAccessible(true);
		Object obj = clazz.newInstance();
		field.set(obj, 88);
		Object object = field.get(obj);
		System.out.println(object);
	}
	//获取空参的方法
	static void GetMethod1() throws Exception
	{
		String name = "cn.sc.java.CommonApi.Person";
		// 找寻该名称类文件，并加载进内存，并产生Class对象。
		Class clazz = Class.forName(name);
		Method method = clazz.getMethod("show", null);
		Constructor constructor = clazz.getConstructor(String.class,int.class);
		Object obj = constructor.newInstance("小明",37);
		method.invoke(obj, null);
	}
	//获取带参数的方法
	static void GetMethod2() throws Exception
	{
		String name = "cn.sc.java.CommonApi.Person";
		// 找寻该名称类文件，并加载进内存，并产生Class对象。
		Class clazz = Class.forName(name);
		Method method = clazz.getMethod("paramMethod", String.class,int.class);
 
		Object obj = clazz.newInstance();
		method.invoke(obj, "小三",18);
	}
	public static void getMethodDemo() throws Exception {
		
		Class clazz = Class.forName("cn.sc.java.CommonApi.Person");
		
		Method[] methods  = clazz.getMethods();//获取的都是公有的方法。 
		methods = clazz.getDeclaredMethods();//只获取本类中所有方法，包含私有。 
		for(Method method : methods){
			System.out.println(method);
		}
		
		
	}
}
