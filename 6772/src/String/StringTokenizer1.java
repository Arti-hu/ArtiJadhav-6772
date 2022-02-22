package String;

import java.util.*;

public class StringTokenizer1 
{

	public static void main(String[] args)
	{
		StringTokenizer s1=new StringTokenizer("Hello I am Arti Jadhav"," ");
		while(s1.hasMoreElements())
		{
			System.out.println(s1.nextElement());
		}
		
		StringTokenizer s2=new StringTokenizer("\nJava:is:OOPs:Language",":",true);
		while(s2.hasMoreTokens())
		{
			System.out.println(s2.nextToken());
		}
		
		
	}

}
