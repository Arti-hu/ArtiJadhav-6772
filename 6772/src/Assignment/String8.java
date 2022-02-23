package Assignment;

public class String8 
{

	public static void main(String[] args) 
	{
		String s="moon#night";
		
		String[] s1=s.split("#",2);
		
		if(s1[0].endsWith("n")&&(s1[1].startsWith("n")))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}	
		

	}

}
