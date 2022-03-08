package Java8;

import java.util.function.Predicate;

public class PreDefault 
{

	public static void main(String[] args) 
	{
       Predicate<Integer>p1=a->a>10;
       Predicate<Integer>p2=a->a<20;
       System.out.println(p1.and(p2).test(21)); //using and--false
       System.out.println(p1.or(p2).test(21));  //using or---true
       System.out.println(p1.and(p2).negate().test(15)); //using negate---false
       System.out.println(p1.or(p2).negate().test(5));
       
       
       //Static method  --isEqual()
       Predicate<String>name=Predicate.isEqual("Arti");
       System.out.println(name.test("arti"));

	}

}
