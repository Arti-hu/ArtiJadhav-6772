
//Program to convert given string in lower and upper case
package Assignment;
import java.util.*;

public class String1 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string");
		String s1=sc.next();
		System.out.println("String after lowercase: "+s1.toLowerCase());
		System.out.println("String after uppercase: "+s1.toUpperCase());
	}

}
