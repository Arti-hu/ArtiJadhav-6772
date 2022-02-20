package ExceptionHandling1;


class MyException1 extends Exception
{
	public MyException1(String msg)
	{
		super(msg);
	}
	public void show()
	{
		
	}
}


public class UserDefined 
{

	public void CheckAge(int age)throws MyException1
	{
		if(age<0)
		{
			throw new MyException1("Age must be greater then zero");
		}
    	else
    	{
    		System.out.println("Age is ok");
    	}
	}
	
	public static void main(String[] args) 
	{
		UserDefined obj=new UserDefined();
		try
		{
			obj.CheckAge(-1);
			
		}
		catch(MyException1 e)
		{
			System.out.println("Age is less than zero");
			e.printStackTrace();
		}

	}

}
