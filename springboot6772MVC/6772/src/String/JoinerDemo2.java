package String;

import java.util.StringJoiner;

public class JoinerDemo2 
{

	public static void main(String[] args) 
	{
		StringJoiner s1=new StringJoiner(",","[","]");
		s1.add("Riya");
		s1.add("Priya");
		System.out.println("Before merge: "+s1);
		
		
		StringJoiner s2=new StringJoiner(":","#","#");
		s2.add("Aman");
		s2.add("Sachin");
		System.out.println("Before merge: "+s2);
		
		System.out.println("After merge two Stringjoiner");
		StringJoiner merge=s2.merge(s1);
		System.out.println(merge);
	}

}
