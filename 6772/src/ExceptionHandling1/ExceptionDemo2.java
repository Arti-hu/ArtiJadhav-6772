package ExceptionHandling1;



class MyException extends Exception
{
	public MyException(String msg)
	{
		super(msg);
	}
}

class Arti extends Exception
{
	public Arti(String msg)
	{
		super(msg);
	}
	
}
public class ExceptionDemo2 
{
	int age;
	
	public void checkAge(int age)throws MyException
	{
		if(age<0)
		{
			MyException m1=new MyException("Age must greater than zero");
			throw m1;
		}
		else
		{
			System.out.println("Age is greater than zero");
		}
	}

	
     public void checkName(String nm)throws Arti
     {
	   if(nm!="Arti")
	   {
		   throw new Arti("Name should be Arti");
		   
	   }
	   else
	   {
		   System.out.println("name is right");
	   }
     }
	public static void main(String[] args) 
	{
		
	  ExceptionDemo2 obj=new ExceptionDemo2();
		
		
		try
		{
			obj.checkAge(3);
			obj.checkName("Arti");
		}
		catch(Exception e)
		{
			System.out.println("Exception occured"+e);
			e.printStackTrace();
			
		}
		
	}

}
