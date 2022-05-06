package String;

public class UsingBuffer
{

	public static void main(String[] args)
	{
		StringBuffer s=new StringBuffer("Welcome to");
		System.out.println("Original string is: "+s);
		s.append(" Programming");
		System.out.println("After appending: " +s);
		
		//To check string length
		System.out.println("Length of string is: "+s.length());
		
		//Accessing characters is string
		for(int i=0;i<s.length();i++)
		{
			int p=i+1;
			System.out.println("Character at position "+i+" is: "+s.charAt(i));
		}
		
		//Inserting string in a middle
         int a=s.indexOf("Programming");
         s.insert(a, "Java ");
         System.out.println("After insertion: "+s);
         
         //Modifying character
         s.setCharAt(10,'-');
         System.out.println("After modifying "+s);
        s.delete(5, 10);
        System.out.println(s);
        
         
	}

}
