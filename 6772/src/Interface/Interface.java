package Interface;

interface test
{
	final int a=20;
	abstract public void input();
	
}

interface test2    //Interface contains only constant values
{
	final int b=30;
	public void input2();
}


class CProg 
{
	public void input3()
	{
		System.out.println("THis is a class method");
	}
}


class B extends CProg implements test,test2
{

	@Override
	public void input2() 
	{
		System.out.println("THis is test2 interface method");
		
		
	}

	@Override
	public void input()
	{
		System.out.println("THis is test interface method");
		
	}
	
	
}


public class Interface 
{


	public static void main(String[] args) 
    {
	     B b1=new B();
	     b1.input();
	     b1.input2();
	     b1.input3();
	}

}