package Collection;
import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;

public class VectorDemo
{

	public static void main(String[] args)
	{
		//CopyOnWriteArraySet<String> v=new CopyOnWriteArraySet<String>();
	     Vector<String>v= new Vector<String>();
	    v.add("One");
	    v.add("two");
	    v.add("Three");
	    v.add("Four");
	    
	   
	    
//	    System.out.println(v);
//	    v.addElement("Five");
//	    System.out.println(v.capacity());
//	    System.out.println(v.clone());
//	    System.out.println(v.isEmpty());
//	    System.out.println("Vector size is: "+v.size());
//	    System.out.println("Capacity: "+v.capacity());
//	    System.out.println(v.contains("Four"));
	    for(int i=0;i<v.size();i++)
	    {
	    	
	    	System.out.println(v.get(i));
	    	v.set(2, "Six");
	    }
	    
	}

}
