package Collection;
import java.util.*;

public class HashTableDemo 
{

	public static void main(String[] args) 
	{
		Hashtable<String,Integer> hs=new Hashtable<String,Integer>();
		
		hs.put("One", 1);
		hs.put("Two", 2);
		hs.put("Three",3);
		hs.put("Four", 4);
		hs.put("Five", 5);
		
		System.out.println(hs);
		
//		for(Map.Entry me:hs.entrySet())
//		{
//			
//		}
		
		System.out.println(hs.contains(1));
		hs.replace("Five",6);
		System.out.println(hs.get("Five"));
		System.out.println(hs.get("One"));
		System.out.println(hs.get("Two"));
		System.out.println(hs.get("Four"));
		//System.out.println(hs);

	}

}
