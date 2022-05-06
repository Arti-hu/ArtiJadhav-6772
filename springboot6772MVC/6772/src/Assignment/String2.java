//Program to check whether string is palindrome or not

package Assignment;
import java.util.*;

public class String2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.next();
		String s1="";
		int a=s.length();
		for(int i=a-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
			
		}
		//System.out.print(s1);
		if(s1.equals(s))
		{
			System.out.println("\nString is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}
}
