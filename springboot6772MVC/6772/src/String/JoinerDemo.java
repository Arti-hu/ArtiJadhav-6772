package String;
import java.util.*;


public class JoinerDemo 
{

	public static void main(String[] args) 
	{
		StringJoiner s1=new StringJoiner(",");//passing comma as a delimeter
		
		//adding value to StringJoiner
		s1.add("Arti");
		s1.add(null);
		s1.add("Jadhav");
		s1.add("Java");
		System.out.println(s1);
		

	}

}
