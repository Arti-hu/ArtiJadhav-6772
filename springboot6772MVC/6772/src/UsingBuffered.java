import java.io.*;
public class UsingBuffered 
{

	public static void main(String[] args) 
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter string");
			String s1=br.readLine();
			System.out.println("Enter numeric value");
			//String b=br.readLine();
			float a=Float.parseFloat(br.readLine());
			
			System.out.println("String "+s1);
			System.out.println("FLoat is "+a);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
