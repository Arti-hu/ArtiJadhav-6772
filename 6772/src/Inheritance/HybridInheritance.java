package Inheritance;

interface A
{
	
	public default void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition "+c);
	}
}

interface B extends A
{
	public default void sub(int a,int b)
	{
		int c=a-b;
		System.out.println("Substraction "+c);
	}
}

interface C extends A
{
	public default void mul(int a,int b)
	{
		int c=a*b;
		System.out.println("Multiplication "+c);
	}
}

class D implements B,C
{
	public D()
	{
		System.out.println("Child class constructor");
	}
	public void div(int a,int b)
	{
		int c=a/b;
		System.out.println("Division "+c);
	}
}
public class HybridInheritance 
{

	public static void main(String[] args) 
	{
		D d1=new D();
		d1.add(6, 7);
		d1.sub(10, 5);
		d1.mul(5,6);
		d1.div(15, 3);

	}

}
