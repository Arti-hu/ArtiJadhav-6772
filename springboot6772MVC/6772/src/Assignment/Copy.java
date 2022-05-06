//Java code to copy one array into another array

package Assignment;
import java.util.*;
public class Copy
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of first array");
		int n=sc.nextInt();
		int[]arr=new int[n];
		int[]arr1=new int[n];
		
		
		System.out.println("Enter array elements for first array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
        
        
		
		System.out.println("Array elements of first array are");
        for(int i=0;i<n;i++)
        {
        	System.out.println("arr["+i+"]="+arr[i]);
        }
        
		
        System.arraycopy(arr, 0, arr1, 0, arr.length);
       
        
        System.out.println("\nArray after copy from first to second");
        
        for(int i=0;i<arr1.length;i++)
        {
        	System.out.println("arr1["+i+"]="+arr1[i]);
        	
        }
        		
        
	}

}
