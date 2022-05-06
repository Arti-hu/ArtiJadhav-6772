package Multithreading;
class Callme
{
	synchronized void call(String msg)
	{
		System.out.print("["+msg);
		try 
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) 
		{
		  System.out.println("Interrupt");
			//e.printStackTrace();
		}
		System.out.println("]");
	}
}
public class Syn2 implements Runnable
{
	String msg;
	static Callme c1;
//	public Syn2(Callme c,String m)
//	{
//		c1=c;
//		msg=m;
////		Thread t=new Thread();
////		t.start();
//	}
//	
   public void run()
   {
	   c1.call(msg);
   }
	public static void main(String[] args) 
	{
		
       c1=new Callme();
       Syn2 s1=new Syn2();
       Syn2 s2=new Syn2();
       Syn2 s3=new Syn2();
       s1.msg="Hello";
       s2.msg="World";
       s3.msg="Java";
       Thread t=new Thread(s1);
       t.start();
       Thread t1=new Thread(s2);
       t1.start();
       Thread t2=new Thread(s3);
       t2.start();
       
       
	}

}
