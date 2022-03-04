
public class S1 
{

	public static void main(String[] args) 
	{
		int a=2,b=3,c;
		System.out.println("Before Swapping");
		System.out.println("a= "+a+" b= "+b);
//		a=a+b;    //a=2+3=5
//		b=a-b;    //b=5-3=2
//		a=a-b;    //a=5-2=3
//		
		
		c=a;  //c=2
		a=b;
		b=c;
		
		System.out.println("After swapping: a= "+a+" b= "+b);

	}

}
