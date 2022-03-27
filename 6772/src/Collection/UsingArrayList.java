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
		
		
		ArrayList list1=new ArrayList(3);
//		list1.add(new String("Four"));
//		list1.add(new String("Five"));
//		list1.add(new String("Six"));
		//list1.add(new String("Seven"));
		
		ArrayList list2=(ArrayList) Collections.EMPTY_LIST;
		
		Collections.copy(list1, list);
		System.out.println(list1);
		
//		System.out.println(list);
//		System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));

	}

}
