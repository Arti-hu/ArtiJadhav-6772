package Java8.Stream;
import java.util.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class Operations 
{

	public static void main(String[] args) 
	{
		List<Integer>list= Arrays.asList(10,34,23,65,45,33);
		Stream str=list.stream();
		
		int x=list.stream().min((a,b)->a.compareTo(b)).get();
		System.out.println(x);
		
		System.out.println(list.stream().max((a,b)->a.compareTo(b)).get());
		
		System.out.println("****************************************");
		
		str.limit(4).forEach(a->System.out.println(a));
		
	}

}
