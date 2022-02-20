package DecisionStmt;
import java.util.*;
public class Nested_If 
{

	public static void main(String[] args)
	{
		int a,b,c,max;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value for a\n");
		a=s.nextInt();
		System.out.println("\nEnter value for b\n");
		b=s.nextInt();
		System.out.println("\nEnter value for c\n");
		c=s.nextInt();
		
		if(a>b)
		{
			if(a>c)
			{
				max=a;
				System.out.println("Greatest value is a"+max);
			}
			else
			{
				max=c;
				System.out.println("Greatest value is c"+max);
			}
		}
		else
		{
			if(b>c)
			{
				max=b;
				System.out.println("Greatest value is b"+max);
			}
			else
			{
				max=c;
				System.out.println("Greatest value is c"+max);
			}
		}
	}

}
