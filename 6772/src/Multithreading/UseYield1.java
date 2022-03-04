package Multithreading;
class AAA extends Thread
{
	public void run()
	{
		
		//System.out.println("Thread A start");
		
		for(int i=0;i<=3;i++)
		{
			
			System.out.println("Thread A "+i);
			Thread.yield();
						
		}
		//System.out.println("Thread A exit");
	}
}


public class UseYield1 
{

	
	public static void main(String[] args) 
	{
		AAA a=new AAA();
		a.start();
		
		for(int i=0;i<=5;i++)
		{
			System.out.println("Value of i in main "+i);
		}

	}

}
