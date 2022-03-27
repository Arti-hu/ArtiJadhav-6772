package Multithreading;

import java.io.PrintStream;

class S1 extends Thread
{
	public void run()
	{
		Thread t = new Thread();
		t.setName("MyThread");
		
		System.out.println("Thread s1 start");
		t.setName("My First Thread  ");
		for(int i=0;i<=5;i++)
		{
			System.out.println(t.getName()+i);
		}
		
		
		System.out.println(Thread.currentThread());
		
	}
	
}
class S2 extends Thread
{
	public void run()
	{
		Thread t = new Thread();
		System.out.println("Thread s2 start");
		t.setName("My Second Thread  ");
		for(int i=0;i<=5;i++)
		{
			System.out.println(t.getName()+i);
		}
		
		
	}
	
}
class S3 extends Thread
{
	public void run()
	{    
		Thread t = new Thread();
		System.out.println("Thread s3 start");
		t.setName("My Third Thread  ");
		for(int i=0;i<=5;i++)
		{
			System.out.println(t.getName()+i);
		}
		
	}
	
}
public class UsingPriorities 
{

	public static void main(String[] args) 
	{
		S1 s=new S1();
		S2 s2=new S2();
		S3 s3=new S3();
		s.start();
		s2.start();
		s3.start();
		s.setPriority(s.MIN_PRIORITY);
		s2.setPriority(s2.NORM_PRIORITY);
		s3.setPriority(s3.MAX_PRIORITY);
		//System.out.println(Thread.currentThread());
	}
}
