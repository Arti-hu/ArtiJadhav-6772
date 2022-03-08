package Java8.Stream;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student2 
{
	int rollno,age;
	String name;

	public Student2(int r,String nm,int Age)
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
		List<Student2> list= new ArrayList();
		Student2 stu;
		list.add(new Student2(1,"Arti",23));
		list.add(new Student2(3,"Priya",24));
		list.add(new Student2(2,"Neha",25));
		list.add(new Student2(4,"Utkarsha",23));
		list.add(new Student2(5,"Avni",25));
		
		Stream str=list.stream();
		
		List<Integer> list1=list.stream().map(a->a.age+a.age).collect(Collectors.toList());
		list1.forEach(a->System.out.println(a));
		
		System.out.println("*************************************************************");
		//Using filter and map
		
		List list2=list.stream().filter(a->a.name.startsWith("A")).map(a->a.rollno+a.rollno).collect(Collectors.toList());
		list2.forEach(b->System.out.println(b));
    
		System.out.println("*************************************************************");
		
		
		IntSummaryStatistics iss1=list.stream().filter(x->x.age>23).collect(Collectors.summarizingInt(x->x.age));
		System.out.println("sum is "+iss1.getSum());
		
		Integer iss2=list.stream().filter(x->x.age>23).collect(Collectors.summingInt(a->a.age));
		System.out.println("sum is "+iss2);
		
		System.out.println("*************************************************************");
		
		//Using count
		long b=list.stream().filter(a->a.name.startsWith("A")).count();
		System.out.println("count is" +b);
		
		System.out.println("*************************************************************");
		
		//Use limit
		str.limit(3).forEach(a->System.out.println(a));
		
		System.out.println("*************************************************************");
		
		//Use match
		System.out.println(list.stream().anyMatch(a->a.name.startsWith("A")));
		
		
		System.out.println("*************************************************************");
		
		//All match
		
		System.out.println(list.stream().allMatch(a->a.name.startsWith("A")));
	}

}
