package Java8.Stream;
import java.util.*;
import java.util.stream.Stream;
public class Student
{
  int rollno,age;
  String name;
    
  public Student(int r,String nm,int Age)
  {
	  rollno=r;
	  name=nm;
	  age=Age;
  }
  
  
	@Override
public String toString() 
	{
	return "rollno=" + rollno + ", age=" + age + ", name=" + name+"\n";
    }


	public static void main(String[] args) 
	{
		List<Student> list= new ArrayList();
		Student stu;
		list.add(new Student(1,"Arti",23));
		list.add(new Student(3,"Priya",24));
		list.add(new Student(2,"Neha",25));
		list.add(new Student(4,"Utkarsha",23));
		
		//System.out.println(list);
		 Stream stream1=list.stream();
		 stream1.forEach(a->System.out.println(a));//uses consumer
		 
		 
		 
		
		
		
	}

}
