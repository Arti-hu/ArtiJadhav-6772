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
	
	
   public void CheckName(String nm1,String nm2)throws MyClass
   {
	   if(nm1.equals(" ")&&nm2.equals(" "))
	   {
		   throw new MyClass("Name should not be empty");
	   }
	   else
	   {
		   System.out.println(nm1+nm2);
	   }
   }
   
	
	public static void main(String[] args) 
	{
		UserDefined1 u1=new UserDefined1();
		try
		{
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter First Name");
		String nm1=sc.next();
		 
		 System.out.println("Enter second Name");
		 String nm2=sc.next();
		 
		 u1.CheckName(nm1,nm2);
		}
		catch(Exception e)
		{
			//System.out.println("Age is less than 18");
			e.printStackTrace();
		}
		 
		
		

	}

}
