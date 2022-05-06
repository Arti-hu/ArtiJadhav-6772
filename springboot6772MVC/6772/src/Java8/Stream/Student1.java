package Java8.Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student1 
{
	int rollno,age;
	String name;

	public Student1(int r,String nm,int Age)
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
		List<Student1> list= new ArrayList();
		Student1 stu;
		list.add(new Student1(1,"Arti",23));
		list.add(new Student1(3,"Priya",24));
		list.add(new Student1(2,"Neha",25));
		list.add(new Student1(4,"Utkarsha",23));
		list.add(new Student1(5,"Avni",25));
		
		
		Stream<Student1>str=list.stream();
		
		//Using filter
		List<Student1> list1=str.filter(a->a.rollno>2).collect(Collectors.toList());
		list1.forEach(a->System.out.println(a));
		System.out.println("*************************************************************");
		
		//Sort in ascending order by rollno
		List list2=list.stream().sorted((a,b)->a.rollno > b.rollno?1:-1).collect(Collectors.toList());
		list2.forEach(a->System.out.println(a));
		
		
		
		System.out.println("*************************************************************");
		//sort in ascending order by name
		
		List list3=list.stream().sorted((a,b)->a.name.compareTo(b.name)).collect(Collectors.toList());
		list3.forEach(a->System.out.println(a));
		
		
		System.out.println("*************************************************************");
		
		//sort in descending order of age
		
		List list4=list.stream().sorted((a,b)->a.age < b.age ?1:-1).collect(Collectors.toList());
		list4.forEach(a->System.out.println(a));
		

		System.out.println("*************************************************************");
		
		//sort in descending order of name
		List list5=list.stream().sorted((a,b)->a.name.compareTo(b.name)).collect(Collectors.toList());
		 Collections.reverse(list5);
		list5.forEach(a->System.out.println(a));
		
		
		
	}
}
