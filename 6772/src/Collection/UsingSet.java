package Collection;

import java.util.*;

public class UsingSet 
{

	public static void main(String[] args) 
	{
		Set s1=new LinkedHashSet();
		s1.add(1);
		s1.add("Riya");
		s1.add(true);
		s1.add("Arti");
		
		System.out.println(s1);
		
		Iterator itr=s1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next().toString());
			
		}
		
		
		SortedSet s2=new TreeSet();
		s2.add("a");
		s2.add("c");
		s2.add("b");
		s2.add("e");
		s2.add("d");
		
		for(Object obj:s2)
		{
			System.out.println(obj);
		}
		
		
		
	}

}
