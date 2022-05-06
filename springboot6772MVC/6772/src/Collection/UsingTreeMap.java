package Collection;
import java.util.*;

public class UsingTreeMap 
{

	public static void main(String[] args) 
	{
		Map<String,Integer> omap=new TreeMap<String,Integer>();
		Map<String,Integer> nmap=new TreeMap<String,Integer>();
		omap.put("RollNo1",new Integer(101));
		omap.put("RollNo2",new Integer(102));
		omap.put("RollNo3",new Integer(103));
		omap.put("RollNo4",new Integer(104));
		
		
		//System.out.println("Old map: "+omap);
		nmap.putAll(omap); //Copy old map into new map
		
		System.out.println("New map: "+nmap);
		omap.clear();      //clear old map
		System.out.println("Old map: "+omap);
		
		Collection c=nmap.values();
		Iterator itr=c.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}

	}

}
