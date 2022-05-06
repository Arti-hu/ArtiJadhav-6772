/*Create an ArrayList of Employee( id,name,address,sal) objects
and search for particular Employee object based on id number.*/

package CollectionAssignment;
import java.util.*;


public class Assignment5 
{
		int id;
	String name,address;
	float sal;

	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public float getSal() {
		return sal;
	}


	public void setSal(float sal) {
		this.sal = sal;
	}


	@Override
	public String toString() {
		return "Assignment5 [id=" + id + ", name=" + name + ", address=" + address + ", sal=" + sal
				+ "]";
	}


	public static void main(String[] args) 
	{
		char ch1;

		Scanner sc=new Scanner(System.in);
		ArrayList<Assignment5> arr=new ArrayList();
		Assignment5 a5;
		
		do
		{
			System.out.println("-------------Employee Details--------------");
			System.out.println("1.Add employee");
			System.out.println("2.Show employee");
			System.out.println("3.Search employee");
			System.out.println("Enter choice");
			int ch=sc.nextInt();   	   
			switch(ch)
			{
			case 1:
				     a5=new Assignment5();
				
				    System.out.println("Add employees");
					System.out.println("Enter employee id");
			        int id = sc.nextInt();
					System.out.println("Enter employee name");
					String name=sc.next();
					System.out.println("Enter employee address");
					String address=sc.next();
					System.out.println("Enter employee salary");
					float sal=sc.nextFloat();
					a5.setId(id);
					a5.setName(name);
					a5.setAddress(address);
					a5.setSal(sal);
					arr.add(a5);
					break;
			case 2: System.out.println("Show employees");    
					System.out.println(arr+" \n");
					break;
			case 3: System.out.println("Enter employee id");
					int c=sc.nextInt();
					
					   for(int i=0;i<arr.size();i++)
					   {
						   if(arr.get(i).getId()==c)
							{
								System.out.println(arr.get(i));
								break;
							}
//							else
//							{
//								System.out.println("Invalid input");
//							}
					   }
					   break;
					
					

			default: System.out.println("Wrong choice");  

			}
			System.out.println("Do you want to continue");
			
			ch1=sc.next().charAt(0);
			

		}while(ch1=='y'||ch1=='Y');
		

	}

}
