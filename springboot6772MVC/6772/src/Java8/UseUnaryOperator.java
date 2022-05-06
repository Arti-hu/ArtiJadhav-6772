package Java8;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UseUnaryOperator 
{

	public static void main(String[] args) 
	{
		
		//It is like BiFunction but it takes two parameter but i/p type o/p type same.
		//It use Function abstract method
		BinaryOperator<Integer> b1= (a,b)->a+b;   
		System.out.println(b1.apply(5, 5));
		
		System.out.println("-----------------------------------------------");
		//It takes only one parameter but input type and return type are same instead of function
		//use Function abstract method
		UnaryOperator<Integer> u1=a->a+a;
		System.out.println(u1.apply(5));
		
		UnaryOperator<String> u2= a->a.concat("  Java");
		System.out.println(u2.apply("Hello"));
		
	}

}
