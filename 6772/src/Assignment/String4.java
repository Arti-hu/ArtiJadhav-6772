//Program to compare two strings lexicographically,ignoring case differences 2

package Assignment;

public class String4 
{

	public static void main(String[] args) 
	{
		String s1="welcome";
		String s2="WELCOME";
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equals(s2));

	}

}
