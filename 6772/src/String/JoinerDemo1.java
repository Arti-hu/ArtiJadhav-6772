package String;

import java.util.StringJoiner;

public class JoinerDemo1 
{

	public static void main(String[] args)
	{
		StringJoiner s1=new StringJoiner(",","[","]");//passing comma and open closed square bracket
        s1.add("C");
        s1.add("C++");
        s1.add("Java");
        s1.add("Python");
        System.out.println(s1);
        
	}

}
