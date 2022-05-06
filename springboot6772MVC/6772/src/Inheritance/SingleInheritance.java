
package Inheritance;

class Sem1
{
	int c,cpp,java;
	public Sem1()
	{
		System.out.println("This sem1 constructor");		
	}
	 void input() 
	 {
		c=60;
		cpp=70;
		java=67;
	 }
	 
	 void output()
	 {
		 System.out.println("----------------Sem1 Marks--------------");
		 System.out.println("Marks in C: "+c+" \n Marks in CPP:  "+cpp+"\n  Marks in Java:  "+java);
	 }
	
	
}


class Sem2 extends Sem1
{
	int math,eng,DS;
	 
	public Sem2()
	{
		System.out.println("This sem2 constructor");
	}
	
	
	void input1()
	{
		math=60;
		eng=70;
		DS=56;
	}
	
	void output1()
	{
		
		 System.out.println("\n\n\n----------------Sem2 Marks--------------");
		 System.out.println("Marks in Maths: "+math+" \n Marks in English:  "+eng+"  \nMarks in Data Science:  "+DS);
	 
	}
}
public class SingleInheritance 
{

	public static void main(String[] args)
	{
		Sem2 s2=new Sem2();
		s2.input();
		s2.output();
		
		s2.input1();
		s2.output1();

	}

}
