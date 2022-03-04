package Multithreading;
class AA extends Thread
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
class BB extends Thread
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
class CC extends Thread
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
public class UsingJoin 
{

	public static void main(String[] args) 
	{
		AA a=new AA();
		BB b=new BB();
		CC c=new CC();
		//a.start();
		
		b.start();
		try 
		{
			b.join();
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		a.start();
		c.start();
		

	}

}
