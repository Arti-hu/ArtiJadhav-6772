/* Create an ArrayList which will be able to store only numbers
like int,float,double,etc, but not any other data type.  */

package CollectionAssignment;
import java.util.*;

class Demo1 extends Exception
{
	public Demo1(String msg)
	{
		super(msg);

	}
}

public class Assignment4 
{
	public void checkList(ArrayList list)throws Demo1
	{
		for(Object d:list)
		{
			if(d instanceof String)
			{
				throw new Demo1("elements should not be String type");
			}
			else
			{
				System.out.println(d);
			}
		}
//		else
//		{
//			System.out.println("correct input");
//		}

	}

	public static void main(String[]args)
	{
		Assignment4 a4=new Assignment4();
		try
		{	
			ArrayList list=new ArrayList();
			list.add(1);
			list.add(123);
			list.add(12.56687d);
			list.add("Arti");
			list.add(1.5f);	
          // System.out.println(list);
			a4.checkList(list);
		}
	catch(Exception e)
	{
		e.printStackTrace();
	}

}


}
