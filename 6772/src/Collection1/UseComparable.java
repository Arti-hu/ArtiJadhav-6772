package Collection1;
import java.util.*;
import java.lang.*;
class MyClass implements Comparable<MyClass>
{
	int rno;
	String name,phno;
	public MyClass(int rollno,String nm,String ph)
	{
		this.rno=rollno;
		this.name=nm;
		this.phno=ph;
	}
	

	@Override
	public String toString()
	{
		return "[rollno=" + rno + ", name=" + name + ", phno=" + phno + "]\n";
	}

@Override
public int compareTo(MyClass o) 
{
	return name.compareTo(o.name);
}
	
	
}
public class UseComparable 
{

	public static void main(String[] args) 
	{
		ArrayList<MyClass> list=new ArrayList();
		MyClass m= new MyClass(1,"Arti","9987456795");
		MyClass m1=new MyClass(3,"Priya","9876545678");
		MyClass m2=new MyClass(2,"Sneha","9566678895");
		
		 
		list.add(m);
		list.add(m1);
		list.add(m2);
		Collections.sort(list);
		//System.out.println(list+"\n");
		
		//System.out.println(m.compareTo(m1));
		for(MyClass m11:list)
		{
			System.out.println(m11);
		}
		
				

	}

}
