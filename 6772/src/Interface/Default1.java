package Interface;

class C1
{
	int s=7,ar;
	public void area()
	{
		ar=s*s;
		
	}
	public void output()
	{
		System.out.println("Area of square is  "+ar);
	}
}

interface I1
{
	int r=6;
	public default void area()
	{
		float ar;
		ar=3.14f*r*r;
	
		//System.out.println("Area of circle is  "+ar);
	}
	
	
}
public class Default1 extends C1 implements I1
{
	public void area()
	{
		super.area();
		I1.super.area();
		float ar;
		ar=3.14f*r*r;
	
		System.out.println("Area of circle is  "+ar);
	}
	

	public static void main(String[] args)
	{
		Default1 d1=new Default1();
		d1.area();
		d1.output();
		//d1.area1();
	}

}
