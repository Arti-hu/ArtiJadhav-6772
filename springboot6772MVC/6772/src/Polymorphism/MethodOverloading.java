package Polymorphism;


class Poly
{
	void input(int r,String nm)
	{
		System.out.println("Roll no:  "+r+"\nName:  "+nm);
	}
	
	void input(String ph,String addr)
	{
		System.out.println("Contact No: "+ph+"\nAddress:  "+addr);
	}
	
	void input(int m1,int m2,int m3)
	{
		System.out.println("Marks in sub1: "+m1+"\nMarks in sub2:  "+m2+"\nMarks in sub3:  "+m3);
	}
	
	
}


public class MethodOverloading 
{

	public static void main(String[] args)
	{
		
       Poly p1=new Poly();
       p1.input(111, "Arti");
       
       p1.input("9518301421","Sangli");
       p1.input(80, 70, 75);
	}

}
