// Assignment 1

package Collection;
import java.util.*;

public class UsingList 
{

	public static void main(String[] args) 
	{
		List<String>list=new ArrayList();
		list.add("Riya");
		list.add("Arti");
		list.add("Priya");
		list.add(null);
		
//		for(int i=0;i<list.size();i++)
//		{
//		     
//			System.out.println(list.get(i));
//			list.set(1,"Neha");
//		}
       // Collections.sort(list);
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
				
			System.out.println(itr.next());
			//list.add("Neha");	
		}
		//Collections.
		
//		System.out.println(list.indexOf("Priya"));
//		list.add(2,"Vaidahi");
//		list.remove(3);
//		list.set(0, "Avni");
		for(Object obj:list)
		{
			
			System.out.println(obj);
			
		}

	}

}
