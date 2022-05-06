package DecisionStmt;
import java.util.*;
public class IF_Else 
{

	public static void main(String[] args) 
	{
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age of person");
		age=sc.nextInt();
		
		if(age>18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			System.out.println(" Not eligible for voting");
		}
			

	}

}
