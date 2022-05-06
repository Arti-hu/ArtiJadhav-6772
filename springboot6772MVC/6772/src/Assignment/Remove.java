//Program to remove an element from int array

package Assignment;
import java.util.*;
public class Remove 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int[]a=new int[] {1,2,3,4,5};
		System.out.println("Array elements are");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+ " ");
		}
		System.out.println("\n\nEnter array index you want to remove");
		int index =sc.nextInt(); //2
		
		for(int i=index;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		
		for(int i=0;i<a.length-1;i++)
		{
			System.out.print(a[i]+ " ");
		}


	}

}
