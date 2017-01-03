package cn.sc.java.io;

import java.io.Serializable;
/*
 * Serializable:���ڸ������л��������ID�š�
 * �����ж���Ͷ����Ƿ���ͬһ���汾�� 
 */
public class Person implements Serializable {
	/**
	 * transient:�Ǿ�̬���ݲ��뱻���л�����ʹ������ؼ������Ρ� 
	 */
	private static final long serialVersionUID = 9527l;
	//private transient String name;
	private String name;
	private static int age;
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}