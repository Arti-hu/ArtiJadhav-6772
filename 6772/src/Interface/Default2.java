package Interface;

interface Simple
{
	//public void sub(int a,int b);
	public default void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition is "+c);
	}
}
public class Default2 
{

	public static void main(String[] args) 
	{
	   Simple s1=new Simple()
		{
		   public  void add(int a,int b)
			{
				int c=a+b;
				System.out.println("Addition is "+c);
			}
	    };
	    s1.add(12, 5);
	   
	}

}
