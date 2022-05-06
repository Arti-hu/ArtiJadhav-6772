package Java8;

import java.util.function.Predicate;

public class UsePredicate 
{

	public static void main(String[] args) 
	{
		Predicate<String> p1=s->(s=="Arti");
		System.out.println(p1.test("Arti"));
				
       
	}

}
