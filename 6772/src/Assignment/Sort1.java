package Assignment;

import java.util.Arrays;

public class Sort1 
{

	public static void main(String[] args) 
	{
		int[]arr=new int[] {2,3,4,5,8};
		
		System.out.println("Array elements are:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		 
		System.out.println("\nSort Array elements in descending order are:");
		Arrays.sort(arr);		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		
		
	}

}
