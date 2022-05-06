//Program to find average of int arrays

package Assignment;
import java.util.*;

public class Average 
{

	public static void main(String[] args) 
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many elements you want to enter");
		int n=sc.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter the array elements: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("All array elements are:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"  ");
		}
		
		System.out.println("\n\nAverage of all array elements is:");
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			
		}
	     int average=sum/n;
	     
	     System.out.println(average);
		
	}

}
