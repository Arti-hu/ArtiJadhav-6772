package Collection;
import java.util.*;

public class UsingMap 
{

	public static void main(String[] args) 
	{
		HashMap<String,String>map=new HashMap<String,String>();
		map.put("Name", "Arti");
		map.put("Name1", "Riya");
		map.put("Name2", "Priya");
		map.put("Name3", "Neeta");
		
		System.out.println(map);//Display all key values
		System.out.println(map.get("Name"));//Pass only key to get()
		System.out.println(map.keySet());//Display all keys
		System.out.println(map.values());//Display all values
		Set s=map.entrySet();     //Gives all key values to Set
		map.replace("Name1", "Avni");
		
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry me=(Map.Entry)itr.next();
			System.out.println(me.getKey()+" "+me.getValue());
		}
		
	}

}
