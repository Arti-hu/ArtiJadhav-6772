package CollectionAssignment.Assignment2;
import java.util.*;

public class Employee
{
	int empid;
	char ch1;
	float sal;
	String ename,address,phno;
	Scanner sc=new Scanner(System.in);
	public int getEmpid() 
	{
		return empid;
	}
	public void setEmpid(int empid) 
	{
		this.empid = empid;
	}
	public float getSal() 
	{
		return sal;
	}
	public void setSal(float sal) 
	{
		this.sal = sal;
	}
	public String getEname() 
	{
		return ename;
	}
	public void setEname(String ename)
	{
		this.ename = ename;
	}
	public String getAddress() 
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public String getPhno() 
	{
		return phno;
	}
	public void setPhno(String phno) 
	{
		this.phno = phno;
	}
	@Override
	public String toString() 
	{
		return "empid=" + empid + ", sal=" + sal + ", ename=" + ename + ", address=" + address + ", phno="
				+ phno;
	}
	
	}
	
	
//	public String EmpDetail()
//	{
//		return "Emp Id="+empid+" ,Emp Name= "+ename+" ,Emp Address="+address+", Contact No= "+phno+" , Salary= "+sal;
//	}
	
	

	







