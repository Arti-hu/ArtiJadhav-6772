package Array;

public class ArrayDemo 
{

	public static void main(String[] args) 
	{
		int x[]= {10,20,30};
		int x1[]=new int[] {40,50,60};
		
		int y[]=new int[5];
		y=new int[10];       //using this method to use same reference variable to refer new array-
		
		y[0]=11;
		y[4]=10;
		System.out.println("Element at index 0:"+y[0]);
		System.out.println("Element at index 1:"+y[1]);
		System.out.println("Element at index 4:"+y[4]);
		System.out.println("Element at index 7:"+y[7]);
	}

}
