package Array;

import java.util.Arrays;

public class ArrayReturn 
{
	public int[] arrayReturn()
	{
		int[]arr= {1,2,3,4,5};
		return arr;
	}


	public static void main(String[] args) 
	{
		ArrayReturn a1=new ArrayReturn();
		System.out.println("Array elements are: "+Arrays.toString(a1.arrayReturn()));
	}

}
