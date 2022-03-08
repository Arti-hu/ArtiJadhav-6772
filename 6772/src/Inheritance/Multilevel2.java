package Inheritance;

class A1
{
	public A1(int a)
	{
		System.out.println(a);
	}
	  static void show()
	 {
		 System.out.println("Class A method");
	 }
}

class A2 extends A1
{
    
	public A2(int a) 
	{
		super(a);
	
	}

	 static void show()
	{
		A1.show();
		  
		System.out.println("Class B method");
	}
}
public class Multilevel2 
{

	public static void main(String[] args) 
	{
		A2 a=new A2(10);
		A2.show();

	}

}
