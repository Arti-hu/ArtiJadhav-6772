package Polymorphism;

class A
{
	int z;
	public A()
	{
		
		System.out.println("1 constructor");
	}
	
	public void show()
	{
		System.out.println("Show method in parent class"+z);
	}
}

class B extends A
{
	public B()
	{
		
		System.out.println("2 constructor");
	}
	
	public void show()
	{
		
		super.z=10;     //calls instance variable of parent class.
		super.show();   //calls method of parent class
		System.out.println("Show method in child class"+z);
	}
}


public class MethodOverriding1 
{

	public static void main(String[] args) 
	{
		B b1=new B();
		b1.show();
	}

}
