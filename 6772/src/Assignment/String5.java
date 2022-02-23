//Program to count how many times the substring present at anywhere in a given string

package Assignment;
import java.util.*;

public class String5 
{
    
	public static void main(String[] args) 
	{
		int count=0;
		String s1="welcome to java ";
		String s2="welcome";
		String[]str=s1.split(" ");
		//String[]str2=s2.split("");
	
		
		for(int i=0;i<str.length;i++)
		{
			if(str[i].equals(s2))
			{
				++count;
			}
		}
		System.out.println(count);

	}
	

		
			
}

	

