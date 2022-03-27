package Interface;

class AAA
{
	public void display()
	{
		
		System.out.println("This is class method");
	}
}
interface StuInfo
{
	public static void display1()
	{
		int r=1;
		String nm="Riya";
		System.out.println("THis is interface method");
		
	}
}


public class UsingDefault extends AAA implements StuInfo
{
	public void display()
	{
		super.display();//AAA class
		
		int r=2;
		String nm="Priya";
		System.out.println("Student roll number  "+r+"\nStudent name   "+nm);
		//StuInfo.super.display();	
		
	}

	public static void main(String[] args) 
	{
		
		UsingDefault u1=new UsingDefault();
		u1.display();
		StuInfo.display1(); /// static Interface

	}

}
