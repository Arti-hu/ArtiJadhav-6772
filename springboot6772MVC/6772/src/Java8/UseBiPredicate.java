package Java8;

import java.util.function.BiPredicate;

public class UseBiPredicate 
{

	public static void main(String[] args) 
	{
		BiPredicate<Integer,Integer>pre=(a,b)->a>b;
		System.out.println(pre.test(20, 15));
		
		BiPredicate<Integer,Integer>pre1=(a,b)->a<b;
		System.out.println(pre1.test(5, 15));
		
		
		BiPredicate<String,String> pre2=(a,b)->a==b;
		System.out.println(pre2.test("Arti", "Avni"));
		
		System.out.println("*************************");
      
		//Default methods 
		   //and
		System.out.println(pre.and(pre1).test(25, 10));
		
		   //or
		System.out.println(pre.or(pre1).test(25, 10));
		
		   //negate
		System.out.println(pre.and(pre1).negate().test(10, 15));
		
		System.out.println(pre.or(pre1.negate()).test(2, 5));
		
		//Static methods
		
		//System.out.println(pre4.equals(pre4));
	}

}
