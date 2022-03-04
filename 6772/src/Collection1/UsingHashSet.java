package Collection1;
import java.util.*;

public class UsingHashSet 
{
	
	public static void main(String[] args) 
	{
		
		HashSet hs=new HashSet();
		hs.add(1);
		hs.add("Arti");
		hs.add(true);
		hs.add(12.6);
		
		System.out.println(hs.hashCode());
		
		for(Object s:hs)
		{
			System.out.println(s);
		}
		
		System.out.println(hs);

	}

}
