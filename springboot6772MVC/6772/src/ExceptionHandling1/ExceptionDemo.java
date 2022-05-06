package ExceptionHandling1;



public class ExceptionDemo 
{

	int a=10;
	public void demo()
	{
		try         //create/throw the exception
		{
			System.out.println("Hello");
			int c=a/0;
			System.out.println("c");
		}
		catch(Exception e) //catch the exception
		{
			System.out.println("Exception is occured"+e);
		}
		
		System.out.println("Hello again");
	}
	void show()
	{
		System.out.println("Show method");
	}
	public static void main(String[] args)
	{
		ExceptionDemo e1=new ExceptionDemo();
		e1.demo();
		e1.show();
		

	}

}
