package Java8;

import java.util.function.BiConsumer;

public class UseBiConsumer 
{

	public static void main(String[] args) 
	{
	   BiConsumer<String,Integer> b1=(x,y)-> System.out.println(x.length()+y);
      //  b1.accept("Arti", 5);
        
        //Default
	   BiConsumer<Integer,Integer> b2=(x,y)->System.out.println(x+y);
	   BiConsumer<Integer,Integer> b3=(x,y)->System.out.println(x*x);
	   b2.andThen(b3).accept(10, 10);
	   
	  
	}

}
