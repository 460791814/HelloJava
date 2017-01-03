package cn.sc.java.CommonApi;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		getMethodDemo();
	}

	// ��ȡclass����
	static void GetClass() throws Exception {
		// * Ҫ��Ҫ���ֽ����ļ����н��ʣ�����Ҫ���ֽ����ļ�����.
		// * ��λ�ȡ�ֽ����ļ������أ�
		String className = "cn.sc.java.CommonApi.Person";
		Class class1 = Class.forName(className);

		Class class2 = Person.class;
		Class class3 = new Person().getClass();

	}

	// ����ͨ�����캯����ȡ����
	static void CreateNewObject() throws Exception {
		String className = "cn.sc.java.CommonApi.Person";
		Class class1 = Class.forName(className);
		Constructor constructor = class1.getConstructor(String.class, int.class);
		Object obj = constructor.newInstance("С��", 18);
		((Person) obj).show();

	}

	// ͨ���޲����Ĺ��캯�����ж��󴴽�
	public static void createNewObject2()
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		// ���ڣ�newʱ���ȸ��ݱ�new�����������Ѱ������ֽ����ļ��������ؽ��ڴ棬
		// ���������ֽ����ļ����󣬲����Ŵ������ֽ��ļ��Ķ�Ӧ��Person����.
		// cn.itcast.bean.Person p = new cn.itcast.bean.Person();

		// ���ڣ�
		String name = "cn.sc.java.CommonApi.Person";
		// ��Ѱ���������ļ��������ؽ��ڴ棬������Class����
		Class clazz = Class.forName(name);
		// ��β�������Ķ����أ�
		Object obj = clazz.newInstance();

	}

	// ��ȡ�ֶ� ����ֵ
	static void GetField() throws Exception {
		String name = "cn.sc.java.CommonApi.Person";
		// ��Ѱ���������ļ��������ؽ��ڴ棬������Class����
		Class clazz = Class.forName(name);
		// ֻ��ȡ���࣬������˽��
		Field field = clazz.getDeclaredField("age");
		// ��˽���ֶεķ���ȡ��Ȩ�޼�顣�������ʡ�
		field.setAccessible(true);
		Object obj = clazz.newInstance();
		field.set(obj, 88);
		Object object = field.get(obj);
		System.out.println(object);
	}
	//��ȡ�ղεķ���
	static void GetMethod1() throws Exception
	{
		String name = "cn.sc.java.CommonApi.Person";
		// ��Ѱ���������ļ��������ؽ��ڴ棬������Class����
		Class clazz = Class.forName(name);
		Method method = clazz.getMethod("show", null);
		Constructor constructor = clazz.getConstructor(String.class,int.class);
		Object obj = constructor.newInstance("С��",37);
		method.invoke(obj, null);
	}
	//��ȡ�������ķ���
	static void GetMethod2() throws Exception
	{
		String name = "cn.sc.java.CommonApi.Person";
		// ��Ѱ���������ļ��������ؽ��ڴ棬������Class����
		Class clazz = Class.forName(name);
		Method method = clazz.getMethod("paramMethod", String.class,int.class);
 
		Object obj = clazz.newInstance();
		method.invoke(obj, "С��",18);
	}
	public static void getMethodDemo() throws Exception {
		
		Class clazz = Class.forName("cn.sc.java.CommonApi.Person");
		
		Method[] methods  = clazz.getMethods();//��ȡ�Ķ��ǹ��еķ����� 
		methods = clazz.getDeclaredMethods();//ֻ��ȡ���������з���������˽�С� 
		for(Method method : methods){
			System.out.println(method);
		}
		
		
	}
}
