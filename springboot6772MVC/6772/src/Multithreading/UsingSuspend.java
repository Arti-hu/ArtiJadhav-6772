package Multithreading;
class A11 extends Thread
{
	public void run()
	{
		System.out.println("Thread A Start");
		for(int i=0;i<=5;i++)
		{
			
			System.out.println("Value of i in thread A "+i);
		}
		System.out.println("Thread A exit");
	}
}
class B11 extends Thread
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
class C11 extends Thread
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
public class UsingSuspend 
{

	public static void main(String[] args) 
	{
		A11 a=new A11();
		B11 b=new B11();
		C11 c=new C11();
		a.start();
		a.suspend();
	    b.start();
		c.start();
		
		a.resume();

 
	}

}
