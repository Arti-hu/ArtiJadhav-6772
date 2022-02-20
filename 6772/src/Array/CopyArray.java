package Array;

public class CopyArray {

	public static void main(String[] args) 
	{
		char a[]= {'A','B','C','D'};
		char b[]=new char[4];
 
		//arraycopy is static method of System class.
		System.arraycopy(a, 0, b, 0,a.length); //copy  a into b
		for(int i=0;i<b.length;i++)
		{
			System.out.println("Element at index "+i+" :" +b[i]);
		}
	}

}
