package Java8;
@FunctionalInterface
interface A1
{
	public int add(int x,int y);
	public default void show()
	{
		System.out.println("This is default method");
	}
	
	public static void show1()
	{
		System.out.println("Static method");
	}
}
public class Demo 
{

	public static void main(String[] args) 
	{
		 A1 obj=(x,y)-> x+y;
		
		 
		 System.out.println(obj.add(4, 7));
		 
		 obj.show();
		 A1.show1();
	}

}
