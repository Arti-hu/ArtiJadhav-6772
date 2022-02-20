package Inheritance;


class StuInfo
{
	int rollno;
	String name;
	
	void input(int r,String nm)
	{
		rollno=r;
		name=nm;
	}
	
	void output()
	{
		System.out.println("----------Student Information-----------");
		System.out.println("Roll No: "+rollno+"  Name " +name);
	}
}

class Marks extends StuInfo
{
	int sub1,sub2,sub3;
	
	void input1(int s1,int s2,int s3)
	{
		sub1=s1;
		sub2=s2;
		sub3=s3;
	}
	
	void output2()
	{
		System.out.println("Marks in C: "+sub1+"   \nMarks in Java: "+sub2+"  \nMarks in OS:  "+sub3);
	}
	
}

class Total extends Marks
{
	
	int total;
	void cal()
	{
	
	total=sub1+sub2+sub3;
	
	System.out.println("Total is  "+total);
	}
	
}
public class MultilevelInherit 
{

	public static void main(String[] args) 
	{
		 Total t1=new Total();
		 t1.input(111,"Riya");
		 t1.input1(67,56,70);
		  
		 t1.output();
		 t1.output2();
		 t1.cal();

	}

}
