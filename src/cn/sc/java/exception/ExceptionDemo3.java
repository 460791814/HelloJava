package cn.sc.java.exception;

//�̳�Exception ��Ҫ�ڴ��������Ѿ��쳣�����̳�RuntimeException �����ڴ����������throw����
class FuShuIndexException extends Exception
{
	FuShuIndexException()
	{}

	
	FuShuIndexException(String msg)
	{
		super(msg);
	}
}


class Demo
{
	public int method(int[] arr,int index) throws FuShuIndexException //throws NullPointerException//FuShuIndexException
	{		

		if(arr==null)
			throw new NullPointerException("��������ò���Ϊ�գ�");

		if(index>=arr.length)
		{
			throw new ArrayIndexOutOfBoundsException("����ĽǱ�Խ���������ǣ����ǲ��Ƿ��ˣ���"+index);
		}
		if(index<0)
		{
			throw new FuShuIndexException("�Ǳ��ɸ���������");
		}
		return arr[index];
	}
}
class Demo1
{
	public int method(int[] arr,int index) //throws NullPointerException//FuShuIndexException
	{		

	
		return arr[index];
	}
}

class  ExceptionDemo3
{
	public static void main(String[] args) throws FuShuIndexException //throws FuShuIndexException
	{
		int[] arr = new int[3];
		
//		Demo d = new Demo();
//		int num = d.method(arr,-30);
	//	System.out.println("num="+num);
	//	System.out.println("over");
	//	Demo1 dd=new Demo1();
	//	dd.method(arr,-1);
	}
	
}
