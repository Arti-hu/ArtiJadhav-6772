//Program to find second largest value of int array

package Assignment;
import java.util.Arrays;

public class SecLargest 
{

	public static void main(String[] args) 
	{
		int[]a= {4,6,3,2,7};
		int[]b=new int[5];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]>a[j])
				{
					b[i]=a[i];
					
				}
				
			}
			//b[i]=a[0];
		}
		Arrays.sort(b);
		System.out.println("Second largest value is: "+(b[3]));
		



	}

}
