package Multithreading;
class AA extends Thread
{
	public void run()
	{
		System.out.println("Thread A Start");
		for(int i=0;i<=5;i++)
		{
			try {
				sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				
				e.printStackTrace();
			}
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

public class UsingJoin 
{

	public static void main(String[] args) 
	{
		AA a=new AA();
		BB b=new BB();
		a.start();
		try 
		{
			a.join(5000);
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		b.start();
	}

}
