package Polymorphism;

public class MethodOverloading1 
{
	public int area(int s)
	{
		return s*s;
		
	}
	
	public double area(double l, double b)
	{
		return l*b;
	}
	
     public String area(String s1,String s2)
     {
    	 return s1+s2;
     }
	public static void main(String[] args) 
	
	{
		MethodOverloading1 m1=new MethodOverloading1();
		System.out.println(m1.area(6));
		System.out.println(m1.area(3.4, 5.5));
		System.out.println(m1.area("Arti  "
				+ "", "Jadhav"));

	}

}
