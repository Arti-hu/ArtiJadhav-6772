package Java8;
import java.util.function.*;


public class UseConsumer 
{

	public static void main(String[] args) 
	{
	 Consumer<String> c1= msg->System.out.println(msg.toLowerCase());
	
	 Consumer<String> c2 =msg ->System.out.println(msg.toUpperCase());
	 
//	 Consumer<String> result=c1.andThen(c2);
//	 result.accept("Arti");   
//	  Consumer s1=s->System.out.println(s);
//      s1.accept("Hello world");		
           c1.andThen(c2).accept("Arti");
	}

}
