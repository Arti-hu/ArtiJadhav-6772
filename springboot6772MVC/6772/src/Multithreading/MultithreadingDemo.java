package Multithreading;

class A implements Runnable
{
	public  void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("Method A "+i);
		}
		System.out.println("Exit A");
	}

	
}
class B implements Runnable
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("Method B "+i);
		}
		System.out.println("Exit B");
	} 
}
class C implements Runnable
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("Method c "+i);
		}
		System.out.println("Exit C");
	}
}

public class MultithreadingDemo 
{
	public static void main(String[] args) 
	{
		A a1=new A();
		B b1=new B();
		C c1=new C();
		Thread t=new Thread(a1);
		Thread t1=new Thread(b1);
		Thread t2=new Thread(c1);
		t.start();
		t1.start();
		t2.start();
		

	}

}
