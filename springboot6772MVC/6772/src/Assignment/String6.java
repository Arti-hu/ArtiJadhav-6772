package Assignment;
import java.util.*;
import java.io.*;
public class String6 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.nextLine();
		//	boolean s1=s.matches("#");
		for(int i=1;i<s.length();i++) 
		{
			if(s.charAt(i)=='#')
			{
				if(s.charAt(i-1)==s.charAt(i+1))
				{
			      System.out.println("True");
				}
				else
				{
					System.out.println("false");
				}
			}
		}





	}






}


