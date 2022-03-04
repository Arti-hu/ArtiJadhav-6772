package Collection;
import java.util.*;

public class UsingArrayList 
{

	public static void main(String[] args) 
	{
		ArrayList list=new ArrayList();
		list.add(new String("One"));
		list.add(new String("Two"));
		list.add(new String("Three"));
		
		
		System.out.println(list);
		System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

	}

}
