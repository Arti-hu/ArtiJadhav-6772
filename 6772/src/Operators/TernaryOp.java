package Operators;
import java.util.*;
public class TernaryOp
{

	public static void main(String[] args) 
	{
		int a,b;
		String y="Yes",n="Not",c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age of person");
		a=sc.nextInt();
		
		 c=(a>18)?y:n;
		System.out.println("Person is eligible for voting or not:  "+c);
		

	}

}
