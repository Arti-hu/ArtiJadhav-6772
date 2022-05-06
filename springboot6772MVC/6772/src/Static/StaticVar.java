package Static;

class Student
{
	int rollno;
	String name;
	static String College="ITS";
	 
	Student(int r,String nm)
	{
		rollno=r;
		name=nm;
	}
	
	void display()
	{
		System.out.println("ROll No:  "+rollno+"  Name:  "+name+"  College Name: "+College);
	}
	
	
}


public class StaticVar
{

	public static void main(String[] args) 
	{
		Student s1=new Student(111,"Aryan");
		Student s2=new Student(222,"Riya");
		
		Student.College="KRPKMI";
		
		s1.display();
		s2.display();

	}

}
