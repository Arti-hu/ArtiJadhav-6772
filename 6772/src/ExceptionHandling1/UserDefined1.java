package ExceptionHandling1;
import java.util.*;
class MyClass extends Exception                                                    
{
	public MyClass(String msg)
	{
	   super(msg);
	}
}


public class UserDefined1 
{
	
	
   public void CheckAge(int age)throws MyClass
   {
	   if(age<18)
	   {
		   throw new MyClass("Age must be greater than 18");
	   }
	   else
	   {
		   System.out.println("You are eligible for voting");
	   }
   }
   
	
	public static void main(String[] args) 
	{
		UserDefined1 u1=new UserDefined1();
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		 int age=sc.nextInt();
		 
		 u1.CheckAge(age);
		}
		catch(Exception e)
		{
			System.out.println("Age is less than 18");
			e.printStackTrace();
		}
		 
		
		

	}

}
