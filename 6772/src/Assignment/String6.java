package Assignment;
import java.util.*;
public class String6 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Enter string"); //lionlivesinlife
		String s=sc.next();
		System.out.println("Enter Substring ");//life
		String s1=sc.next();
		
		int a=s1.length(); 
		char b=s1.charAt(0);
		char c=s1.charAt(a-1);
		String[]str=s.split("");
		
		int b1=s.indexOf(s1.charAt(0));
		int b2=s.indexOf(s1.charAt(a-1));
		System.out.println(b1);
		System.out.println(b2);
		String s3=s.substring(b1, b2);
		if(s3.equals(s1))
		{
			count++;
			
		}
		System.out.println(count);
		

	}

}
