//Program to find occurence of given character

package Assignment;
import java.util.*;
public class String3 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s="welcome to edubridge";
		System.out.println(s);
       int a=s.length();
       System.out.println("Enter any character");
       String ch=sc.next();
       int b=s.replace(ch, "").length();
       int count=a-b;
       System.out.println("Number of occurrences of "+ ch +" is "+count);
       
	}

}