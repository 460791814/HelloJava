package cn.sc.java.xuxi;
class outer {
	static int num = 1;
   static class inner{
	    public static void show()
	    {
	    	System.out.println(num);
	    }
	   
   }
  public void show(){
	  //  new inner().show();
	 final int a=50;
	   class max{
		   public void log() {
			System.out.println(a);
		}
		
	   }
	   max mm=new max();
	   mm.log();
   }
  
  public void method()
  {

	   new Demo(){
		   void show()
		   {
			   
			   System.out.println("111");
		   }
	   }.show();
	  
  }
}

public class InnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//outer.inner.show();
		//new outer().show();
		//new outer().method();
	}

}

abstract class Demo
{
	abstract void show();
}

