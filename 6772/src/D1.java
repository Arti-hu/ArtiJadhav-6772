import java.util.*;
public class D1
{
	int balance;
	int money;
	Scanner sc=new Scanner(System.in);
  
	public void account()
	{
		System.out.println("Enter amount");
		 balance=sc.nextInt();
	}
	public void depost()
	{
		System.out.println("Enter money to deposit");
		money=sc.nextInt();
		balance=balance+money;
		System.out.println("balance is "+balance);
	}
	public static void main(String[] args) 
	{
		D1 d=new D1();
	    d.account();
	    d.depost();

	}

}
