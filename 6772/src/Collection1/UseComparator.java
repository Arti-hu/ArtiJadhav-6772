
package Collection1;
import java.util.*;
class Student 
{
	int rollno,age;
	String name;
	 
	public Student(int r,String nm,int age)
	{
		this.rollno=r;
		this.name=nm;
		this.age=age;
	}

	@Override
	public String toString() {
		return "rollno=" + rollno + ", age=" + age + ", name=" + name ;
	}
	
	
	
	
}
class Stu1 implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) 
	{
		if(o1.rollno==o2.rollno)
		{
			return 0;
		}
		else if(o1.rollno > o2.rollno)     //4,3,5
		{
			return 1;
		}
		else
		{
			return -1;
		}
		
	}
	
}

class Stu2 implements Comparator<Student>
{

	public boolean equals(Student obj)
	{
		return false;
		
	}
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}

public class UseComparator 
{

	public static void main(String[] args) 
	{
		ArrayList<Student> list=new ArrayList();
	
	
	   list.add(new Student(4,"Arti",23));
	   list.add(new Student(3,"Priya",25));
	   list.add(new Student(5,"Avni",22));
	   
	   Collections.sort(list, new Stu1());
	   
	   for(Student st:list)
	   {
		   System.out.println(st);
	   }
	   

	}

	
}
