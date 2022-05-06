//Program to sort an integer and string array

package Assignment;
import java.util.*;

public class Sort 
{

	public static void main(String[] args) 
	{
		
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter how many integer array elements you want to enter ");
      int n=sc.nextInt();
      int[]arr=new int[n];
      
      System.out.println("Enterhow many string array elements you want to enter");
      int   a=sc.nextInt();
      String[]arr1= new String[a];
      
      System.out.println("Enter integer array elements");
      for(int i=0;i<n;i++)
      {
    	  arr[i]=sc.nextInt();
      }
      System.out.println("Enter string array elements");
      
    	  for(int i=0;i<a;i++)
          {
        	  arr1[i]=sc.next();
          }
      
    
     
      System.out.println("\nInteger Array Sorting in ascending order");
      Arrays.sort(arr);
      for(int i=0;i<arr.length;i++)
      {
    	 System.out.print(arr[i]+ " ");
      }
//      
      System.out.println("\nString Array Sorting in ascending order");
      Arrays.sort(arr1);
      for(int i=0;i<arr1.length;i++)
      {
    	 System.out.print(arr1[i]+ " ");
      }
      
    
	}

}
