package Java8.Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UseStream 
{

	public static void main(String[] args)
	{
		List<Integer> list=new ArrayList();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		
		Stream<Integer> coll=list.stream();
		
		list.stream().filter(a->a>300).forEach(a->System.out.println(a));
		
		
		
	  System.out.println("************************************");
		//Use limit
		coll.limit(3).forEach(a->System.out.println(a));
		
		
		//coll.forEach(a->System.out.println(a));
		
		list.stream().forEach(a->System.out.println(a));
		
		Stream<Integer> str=Stream.of(10,20,30,40,50,60);
		str.forEach(System.out::println);
		
		String[]arr= {"a","b","c","d"};
		Stream str1=Arrays.stream(arr);
		str1.forEach(System.out::println);
		
		
	

		
		

	}

}
