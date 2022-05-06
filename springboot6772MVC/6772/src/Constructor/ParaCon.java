package Constructor;

public class ParaCon
{
   //Area of square
	public ParaCon(int a)
	{
		int area=a*a;
		System.out.println("Area of Square is "+area);
	}
	
	//Area of rectangle
	public ParaCon(int l,int b)
	{
		int area=l*b;
		System.out.println("Area of Rectangle is "+area);
	}
	public static void main(String[] args)
	{
		ParaCon obj=new ParaCon(6);
		ParaCon obj1=new ParaCon(10,3);
		

	}

}
