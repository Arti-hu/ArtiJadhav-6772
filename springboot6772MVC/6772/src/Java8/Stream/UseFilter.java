package Java8.Stream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UseFilter 
{

	public static void main(String[] args) 
	{
		List<Integer> list=new ArrayList();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		
		
		List<Integer> list1=list.stream().filter(a->a>300).collect(Collectors.toList());
		System.out.println(list1);
		IntSummaryStatistics list2=list.stream().collect(Collectors.summarizingInt(i->i+i));
		System.out.println(list2.getSum());
		

		List<String> list3=new ArrayList();
		list3.add("Arti");
		list3.add("null");
		list3.add(null);
		list3.add("Arti");
		list3.add("Priya");
		
		//Set<String>set=list3.stream().filter(a->a.startsWith("A")).collect(Collectors.toSet());
		Set<String>set1=list3.stream().collect(Collectors.toSet());
		System.out.println(set1);
		
//		for(Integer i:list)
//		{
//			if(i>200)
//			{
//				System.out.println(i);
//			}
//		}

	}

}
