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
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
