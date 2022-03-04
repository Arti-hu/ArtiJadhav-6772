package Multithreading;

class I1 extends Thread
{
	public void run()
	{
		Thread t=new Thread();
		t.setName("MyThread");
		for(int i=0;i<=5;i++)
		{
			
			try {
				Thread.sleep(2000);
				System.out.println(t.getName()+"  "+i);
			} catch (InterruptedException e) 
			{
				System.out.println("Thread interrupted"+e);
				
			}
		}
	}
	
}


public class UseInterrupt extends Thread
{
	 public void run()
	    {  
		 try 
		 {
			Thread.sleep(1000);
			System.out.println("java");
		} 
		 catch (InterruptedException e) 
		 {
			
			System.out.println("Exception handled "+e);
		}
		 System.out.println("thread is running...");
		 
 }
	public static void main(String[] args) 
	{
		
       I1 a=new I1();
       a.start();
       a.interrupt();
		UseInterrupt j1=new UseInterrupt();
		//UseInterrupt j2=new UseInterrupt();
		j1.start();
		j1.interrupt();
	}

}
