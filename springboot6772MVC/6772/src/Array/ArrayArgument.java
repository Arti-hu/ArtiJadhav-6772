package Array;

public class ArrayArgument 
{
  public void printArray(int[]arr)
  {
	  System.out.println("Here i pass array as a argument");
	  for(int i=0;i<arr.length;i++)
	  {
		  System.out.println("arr["+i+"]="+arr[i]);
	  }
	  
  }
	
	public static void main(String[] args) 
	{
		ArrayArgument obj1=new ArrayArgument();
		int[]myArray= {2,4,6,8,10};
		obj1.printArray(myArray);
		
	}

}
