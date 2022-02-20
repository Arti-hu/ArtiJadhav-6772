package Array;
import java.util.*;
public class TwoDimensional1 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows you want to store");
		int a=sc.nextInt();
		System.out.println("Enter number of columns you want to store");
		int b=sc.nextInt();
		
	    int[][]arr=new int[a][b];           
	    
	    System.out.println("Enter array elements");
	    for(int i=0;i<a;i++)
	    {
	    	for(int j=0;j<b;j++)
	    	{
	    		arr[i][j]=sc.nextInt();
	    	}
	    	System.out.println("\n");
	    }
	    
	    System.out.println("Array elements are:");
	    for(int i=0;i<arr.length;i++)  
	    {
	    	for(int j=0;j<arr[j].length;j++)
	    	{
	    		System.out.print(arr[i][j]+" ");
	    	}
	    	System.out.println("\n");
	    }

	}

}
