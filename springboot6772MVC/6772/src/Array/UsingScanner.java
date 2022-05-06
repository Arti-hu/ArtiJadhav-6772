package Array;
import java.util.*;

public class UsingScanner 
{
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element you want to enter");
		int n=sc.nextInt();
		System.out.println("Enter array elements");
		int[]a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array elements are");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
