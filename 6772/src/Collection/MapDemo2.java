package Collection;
import java.util.*;

public class MapDemo2 
{

	public static void main(String[] args) 
	{
		Map<Integer,String> map=new LinkedHashMap<Integer,String>();
		map.put(103, "Pune");
		map.put(104, "Mumbai");
		map.put(102, "Kolhapur");
		map.put(101, "Sangli");
		
		System.out.println(map);
		Set l=map.entrySet();
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			
			Map.Entry m=(Map.Entry)itr.next();
			System.out.println(m.getKey()+"  "+m.getValue());
			
		}
	}

}
