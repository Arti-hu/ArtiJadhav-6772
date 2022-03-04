package Inheritance;

class A1
{
	 void show()
	 {
		 System.out.println("Class A method");
	 }
}

class A2 extends A1
{

	void show()
	{
		super.show();
		System.out.println("Class B method");
	}
}
public class Multilevel2 
{

	public static void main(String[] args) 
	{
		A2 a=new A2();
		a.show();

	}

}
