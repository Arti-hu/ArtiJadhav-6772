package Multithreading;

class AA1 extends Thread
{
	public void run()
	{
		//System.out.println("Thread A Start");
		try
		{
			for(int i=0;i<=5;i++)
			{
				//Thread.sleep(1000);
				System.out.println("Value of i in thread A "+i);
				Thread.yield();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		//System.out.println("Thread A exit");
	}
}
class BB1 extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			//Thread.sleep(1000);
			System.out.println("Value of i in thread B "+i);
			
		}
	
		//System.out.println("Thread B exit");
	}
}

public class UseYeild 
{

	public static void main(String[] args) 
	{
        AA1 a=new AA1();
        BB1 b=new BB1();
        //CC1 c=new CC1();
        a.start();
        b.start();
       // c.start();
       //  a.setPriority();
      //   b.setPriority();
      // c.setPriority(1);
        
	}

}
