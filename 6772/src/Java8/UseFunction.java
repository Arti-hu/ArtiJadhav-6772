package Java8;

import java.util.function.Function;

public class UseFunction 
{

	public static void main(String[] args) 
	{
		Function<Integer,Double>fun=a->a/2.0;
		
		System.out.println(fun.andThen(a->a*3).apply(10));
		//System.out.println(fun.apply(10));
		
		
		Function<Integer,Integer> f1=a->a*a;
		Function<Integer,Integer>f2=a->a+a;
		System.out.println(f1.apply(4));
		System.out.println(f2.apply(5));
		
		//Default fun
		System.out.println(f2.andThen(f1).apply(3));
		System.out.println(f1.compose(f2).apply(5));//f2 will perform first and then f1 will perform
		
		Function<Integer,Integer> i=Function.identity();
		System.out.println(i.apply(10));
		
		
		
	}

}
