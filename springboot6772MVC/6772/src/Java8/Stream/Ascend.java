package Java8.Stream;
import java.util.*;
import java.util.stream.Collectors;

public class Ascend 
{

	public static void main(String[] args) 
	{
		//ArrayList<String>list=new ArrayList();
		//list.add("Red");
		
		List<String>list = Arrays.asList("Apple","Cat","Banana","Red","Grees");
		//List list7=List.of()
		
		//sort in ascending order
		
		List<String> list1=list.stream().sorted((o1,o2)->o1.compareTo(o2)).collect(Collectors.toList());
		System.out.println(list1);
		
		List<String>list2=list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println(list2);
		
		List<String>list3=list.stream().sorted().collect(Collectors.toList());
		System.out.println(list3);
		
		//sort in descending order
		
		List list4 =list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(list4);
		
		

	}

}
