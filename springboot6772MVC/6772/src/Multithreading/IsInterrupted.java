package Multithreading;
class T1 extends Thread
{
	public void run()
	{
		for(int i=0;i<=3;i++)
		{
		try 
			{
			
				Thread.sleep(500);
				System.out.println(i);
			
			} catch (InterruptedException e) 
			{
				System.out.println("Interrupt occured "+e);
				//e.printStackTrace();
			}
		  //System.out.println("runn");
			
		}
	}
}

public class IsInterrupted 
{

	public static void main(String[] args) 
	{
		T1 t=new T1();
		T1 t1=new T1();
	
		//System.out.println(t1.isInterrupted());
		t.start();
		t.interrupt();
		t1.interrupt();
		t1.start();
		System.out.println(t.isInterrupted());
		System.out.println(t1.isInterrupted());
		
		

	}

}
