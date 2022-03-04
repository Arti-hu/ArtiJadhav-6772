package Collection;
import java.util.*;

public class HashTableDemo2 
{

	public static void main(String[] args) 
	{
		Hashtable<String,Integer> ht=new Hashtable<String,Integer>();
		
		ht.put("One",1);
		ht.put("Two", 2);
		ht.put("Three", 3);
		ht.put("Four", 4);
		ht.put("Five", 5);
		
		
//		System.out.println(ht.get("One"));
//		System.out.println(ht.get("Two"));
//		System.out.println(ht.get("Three"));
//		System.out.println(ht.get("Four"));
//		System.out.println(ht.get("Five"));

		
		ht.remove("Four");
		System.out.println(ht.contains(4));
		ht.replace("Two", 6);
		Set s=ht.entrySet();
		Iterator itr=s.iterator();
		
		System.out.println();
		
		while(itr.hasNext())
		{
			Map.Entry me=(Map.Entry)itr.next();
			System.out.println(me.getKey()+ " "+me.getValue());
		}
		
		
		
		

	}

}
