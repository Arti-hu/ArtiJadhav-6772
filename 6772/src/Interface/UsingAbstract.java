package Interface;
 
abstract class ABC
{
	int a;
	
	
	public ABC()
	{
		System.out.println("This is a constructor");
	}
	
	public int cal(int a, int b) //N
	{
		return a*b;
	}
	
	abstract  void show();  //Abstract method
	
	
}


public class UsingAbstract  extends ABC
{
	

	public static void main(String[] args) 
	{
		UsingAbstract u1=new UsingAbstract();
		int c=u1.cal(6, 7);
		System.out.println("Multiplication is  "+c);
		u1.show();
	}
	void show()
	{
		System.out.println("This is  abstract method ");
	}

}
