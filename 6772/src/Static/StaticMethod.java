package Static;

class Student1
{
	int rollno;
	String name;
	static String College="ITS";
	
	
	static void change()
	{
		College="BBDIT";
	}
	 
	Student1(int r,String nm)
	{
		rollno=r;
		name=nm;
	}
	
	void display()
	{
		System.out.println("ROll No:  "+rollno+"  Name:  "+name+"  College Name: "+College);
	}
	
	
}



public class StaticMethod
{

	public static void main(String[] args) 
	{
		Student1 s1=new Student1(111,"Aryan");
		Student1 s2=new Student1(222,"Rachana");
		Student1 s3=new Student1(333,"Arti");
		
		
        Student1.change();
		
		s1.display();
		s2.display();
		s3.display();

	}

}
