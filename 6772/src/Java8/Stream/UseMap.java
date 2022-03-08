package Java8.Stream;

import java.util.HashMap;
import java.util.Map;

public class UseMap 
{

	public static void main(String[] args) 
	{
		Map<Integer,String> map=new HashMap();
		map.put(101,"Arti");
		map.put(102,"Neha");
		map.put(103,"Avni");
		map.put(104,"Megha");
		map.put(105,"Pooja");
		
		map.forEach((k,v)->System.out.println("id " +k+", Name "+v));

	}

}
