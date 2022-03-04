/*Write a program that will have a Vector which is capable of
storing emp objects. Use an Iterator and enumeration to list
all the elements of the Vector.*/

package CollectionAssignment;
import java.util.*;

public class Assignment8 
{
	Scanner sc=new Scanner(System.in);
   
   int id;
   String nm,addr,ph;
   float sal;
   public void add()
   {
	   System.out.println("Enter id");
	   id=sc.nextInt();
	   System.out.println("Enter name");
	   nm=sc.next();
	   System.out.println("Enter address");
	   addr=sc.next();
	   System.out.println("Enter ph no.");
	   ph=sc.next();
	   System.out.println("Enter Salary");
	   sal=sc.nextFloat();   
   }
   
	@Override
     public String toString() 
	{
	return "id=" + id + ", nm=" + nm + ", addr=" + addr + ", ph=" + ph + ", sal=" + sal ;
    }
	
	public void show(Vector v1) //Using Iterator
	{
		System.out.println("Using Iterator");
		Iterator itr=v1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	public void show1(Vector v1) //Using Enumeration
	{
		System.out.println("Using Enumeration");
		Enumeration<Assignment8> e=Collections.enumeration(v1);
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}
	public static void main(String[] args) 
	{
		Vector v1=new Vector();
		Assignment8 as=new Assignment8();
		as.add();
		v1.add(as);
		as.show(v1);
		as.show(v1);
		//System.out.println(v1);

	}

}
