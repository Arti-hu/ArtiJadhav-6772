package Multithreading;
class A1 extends Thread
{
	public void run()
	{
		System.out.println("Thread A Start");
		for(int i=0;i<=5;i++)
		{
			try 
			{
				Thread.sleep(2000);
			} catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Value of i in thread A "+i);
		}
		System.out.println("Thread A exit");
	}
}
class B1 extends Thread
{
	public void run()
	{
		System.out.println("Thread B Start");
		for(int i=0;i<=5;i++)
		{
			System.out.println("Value of i in thread B "+i);
		}
		System.out.println("Thread B exit");
	}
}
class C1 extends Thread
{
	public void run()
	{
		System.out.println("Thread C Start");
		for(int i=0;i<=5;i++)
		{
			System.out.println("Value of i in thread C "+i);
		}
		System.out.println("Thread C exit");
	}
}
public class UsingSleep 
{

	public static void main(String[] args) 
	{
		
         A1 a=new A1();
         B1 b=new B1();
         C1 c=new C1();
         a.start();
         b.start();
         c.start();
	}

}
