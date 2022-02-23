//Program to find second largest value of int array

package Assignment;
import java.util.Arrays;

public class SecLargest 
{

	public static void main(String[] args) 
	{
		int[]a= {1,2,3,4,5};
		int[]b=new int[5];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					b[i]=a[i];
					
				}
				
			}
			//b[i]=a[0];
		}
		Arrays.sort(b);
		System.out.println("Second largest value is: "+(b.length-1));
		



	}

}
