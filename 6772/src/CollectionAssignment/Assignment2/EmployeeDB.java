package CollectionAssignment.Assignment2;
import java.util.*;

public class EmployeeDB 
{

	ArrayList<Employee>a1=new ArrayList();

	boolean addEmployee(Employee e)
	{
		
		return a1.add(e);
		
	}
	

	boolean deleteEmployee(int eid)
	{
		boolean isRemoved=false;
		for(int i=0;i<a1.size();i++)
		{
			
			if(a1.get(i).getEmpid()==eid)
			{
				isRemoved=true;
				a1.remove(i);  
			}
//			else
//			{
//			System.out.println("wrong id");
//			}
		}
		 isRemoved=true;
		return isRemoved;
	}

	String showPaySlip(int eCode)
	{  
		String paySlip="Invalid employee id";
		for(Employee e:a1)
		{
			if(e.empid==eCode)
			{
				paySlip="Payslip for employee id "+eCode+"is:Id: "+e.getEmpid()+" Name: "+e.getEname()+" Salary: "+ e.getSal();
			}
		}
		return paySlip;
	}
    public Employee[] listAll()
    {
    	Employee[]emp=new Employee[a1.size()];
    	for(int i=0;i<a1.size();i++)
    	{
    		emp[i]=a1.get(i);
    		System.out.println(emp[i]);
    	}
    	return  emp;
         	
    }
	
    public static void main(String[]args)
    {
    	char c;
		EmployeeDB ed=new EmployeeDB();
		Employee e;

		Scanner sc=new Scanner(System.in);
		System.out.println("1.Add employee");
		System.out.println("2.Show employee");
		System.out.println("3.Remove employee");
		System.out.println("4.Display Pay Slip");
		//System.out.println("5.Display All");
		
		do
		{
			
			System.out.println("Enter choice");
			int a=sc.nextInt();
			switch(a)
			{
			case 1: 
				    //ed=new EmployeeDB();
				    e=new Employee();
				    System.out.println("Add employee");
					System.out.println("Add employees");
					System.out.println("Enter employee id");
			        int id = sc.nextInt();
					System.out.println("Enter employee name");
					String name=sc.next();
					System.out.println("Enter employee address");
					String address=sc.next();
					System.out.println("Enter employee phno");
					String phno=sc.next();
					System.out.println("Enter employee salary");
					float sal=sc.nextFloat();
					
					e.setEmpid(id);
					e.setEname(name);
					e.setAddress(address);
					e.setPhno(phno);
					e.setSal(sal);			
	                ed.addEmployee(e);
					
					break;
			case 2: System.out.println("Show employee");
					
					ed.listAll();
					break;
			case 3: System.out.println("Remove Employee");
					int r=sc.nextInt();
					System.out.println(ed.deleteEmployee(r));
					break;
			case 4:System.out.println("Display payslip");
					int r1=sc.nextInt();
					System.out.println(ed.showPaySlip(r1));
					break;
			
			      

			default:  System.out.println("Invalid Input");     
			}

			System.out.println("Do you want to continue");
			c=sc.next().charAt(0);

		}while(c=='y'||c=='Y');


	}

 }

