package Java8;

import java.util.function.BiFunction;
import java.util.function.Function;

public class UseBiFunction
{

	public static void main(String[] args) 
	{
		BiFunction<String,String,Integer> fun1=(a,b)->a.length()+b.length();
		System.out.println(fun1.apply("Arti", "Manisha"));
		
		
		BiFunction<Integer,Integer,Integer> fun2=(a,b)->a+b;
		System.out.println(fun2.apply(10, 15));
		
		System.out.println("****************************************");
		//Default
		  //andThen
		BiFunction<Integer,Integer,Integer>fun3=(a,b)->a+b;
         System.out.println(fun3.andThen(b->b).apply(5, 7));
         
         BiFunction<String,String,Integer>fun4=(a,b)->a.length()+b.length();
   
         System.out.println(fun4.andThen(a->a+a).apply("Arti", "Arnav"));
	}

}
