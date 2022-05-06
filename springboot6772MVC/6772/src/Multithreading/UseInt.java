package Multithreading;
class Interrupt1 extends Thread
{
	public void run()
	{
		System.out.println("Thread 1 start");
		try 
		{
			Thread.sleep(1000);
			System.out.println("Hello Java");
		} 
		catch (InterruptedException e) 
		{
			System.out.println("Thread occured "+e);
			//e.printStackTrace();
		}
	}
}
class Interrupt2 extends Thread
{
	public void run()
	{
		System.out.println("Thread 2 start");
			for(int i=0;i<3;i++)
			{
				//Thread.sleep(1000);
				System.out.println("Hello Java 1");
			}
			
		} 
		
	}

public class UseInt 
{

	public static void main(String[] args) 
	{
		
		Interrupt1 i1=new Interrupt1();
		Interrupt2 i2=new Interrupt2();
		i1.start();
		i2.start();
		i1.interrupt();
//		System.out.println(i1.isInterrupted());
//		System.out.println(i2.isInterrupted());
	}

}
