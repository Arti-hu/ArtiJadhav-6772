

class Animal
{
	 void cal()
	  {
		int a=5,b=4,c;
		c=a+b;
		System.out.println(c);
	  }
}
class Test1
{
	void show()
	{
		System.out.println("Hello");
	}
}
public class Demo1 
{
 
	public static void main(String[] args)
	{
		Animal a1=new Animal();
		a1.cal();
		Test1 t1=new Test1();
		Test1 t2=new Test1();
		t1.show();
		t2.show();
		
		
	}

}
