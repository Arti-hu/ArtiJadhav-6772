package Polymorphism;


class ABC
{
	int x;
	 ABC()
	{
		System.out.println("This is parent class constructor");
	}
	
	public void show()
	{
		System.out.println("This is a parent class show method  "+x);
	}
}

class DEF extends ABC
{
	 DEF()
	{
		System.out.println("This is a child class constructor");
	}
	
	public void show()
	{
		super.x=10;
		super.show();
		System.out.println("This is child class show method");
	}
}


	public class MethodOverriding2 

{

	public static void main(String[] args) 
	{
		
         DEF d1=new DEF();
         d1.show();
	}

}
