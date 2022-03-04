package Polymorphism;


class Area
{
	int z,ar;
	public Area(int b)
	{
	    System.out.println("This is parent class constructor"+b);
		
	}
	
	public void display(int s)
	{
		
		System.out.println("Area of square is  "+(ar=s*s));
	}
}

class Area1 extends Area
{
	int ar;
	public Area1(int a)
	{
			
		super(a);
		 System.out.println("This is Child class constructor" +a);
	}
	
	
	public void display(int l, int b)
	{
		
		super.display(8);
		System.out.println("Area of rectangle is "+(ar=l*b));
	}
}
public class MethodOverriding 
{

	public static void main(String[] args) 
	{
		Area1 a1=new Area1(5);
		a1.display(6, 7);

	}

}
