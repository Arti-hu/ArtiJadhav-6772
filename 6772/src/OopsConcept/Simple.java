package OopsConcept;

public class Simple 
{
	  int x,y;  // data member
	
	public void Demo()  // Member Function
	{
		System.out.println("Welcome to Java");
	}
	
	public int add(int a,int b)
	{                                                                                                                                                                                                            
		return a+b;
	}
	 public static void show(int r)
	{
		int area =r*r;
		System.out.println("Area of square is  "+area);
	}

	public static void main(String[] args)
	{
		Simple s=new Simple();
		s.Demo();
		System.out.println("Addition is:  "+s.add(4, 5));
		Simple.show(6);

	}

}
