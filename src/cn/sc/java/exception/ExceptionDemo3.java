package cn.sc.java.exception;

//继承Exception 需要在代码里面已经异常处理，继承RuntimeException 无需在代码里面进行throw处理
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
			throw new NullPointerException("数组的引用不能为空！");

		if(index>=arr.length)
		{
			throw new ArrayIndexOutOfBoundsException("数组的角标越界啦，哥们，你是不是疯了？："+index);
		}
		if(index<0)
		{
			throw new FuShuIndexException("角标变成负数啦！！");
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
