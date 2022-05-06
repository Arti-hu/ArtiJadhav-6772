package Collection1;
import java.util.*;

public class UsingArrayList 
{

	public static void main(String[] args)
	{
		ArrayList ar=new ArrayList();
		ar.add("Arti");
		ar.add(1);
		ar.add(true);
		ar.add(12.5);
		ar.add(1);
		ar.add(true);
		ar.add(12.5);		
		System.out.println(ar);
		
		//Add element
		ar.add(1, "Arnav");
		System.out.println(ar);
		
		//replace element
		ar.set(3, 125);
		System.out.println(ar);
		
		//remove
		ar.remove(5);   //using index
		System.out.println(ar);
		ar.remove("true");
		System.out.println(ar);
		
		
		
		

	}

}
