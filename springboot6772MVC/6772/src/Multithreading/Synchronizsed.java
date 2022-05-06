package Multithreading;
import java.util.*;
class Ticket
{
	int total_ticket=10;
	synchronized public void MyTicket(int ticket1)
	{
		if(total_ticket >=ticket1)
		{
	   	total_ticket=total_ticket-ticket1;
	   	System.out.println(ticket1+" tickets  are booked by and remaining tickets are  "+total_ticket);
		}
		else
		{
			if(total_ticket>0)
			{
				System.out.println("Sorry.. only "+total_ticket+" tickets are available");
			}
			else
			{
				System.out.println("Tickets not available");
			}
		}
	}
}
public class Synchronizsed extends Thread
{
	Scanner sc=new Scanner(System.in);
	static Ticket t1;
    int tickets;
    
   public void run()
   { 
	   
	   t1.MyTicket(tickets);
	   
   }
	public static void main(String[] args) 
	{ 
		
		Synchronizsed s1=new Synchronizsed();
		Synchronizsed s2=new Synchronizsed();
		Synchronizsed s3=new Synchronizsed();
		
		t1=new Ticket();
		
		s1.tickets=6;
		s1.start();
		s2.tickets=5;
    	s2.start();
		s3.tickets=4;
		s3.start();
//		
		
		

	}

}
