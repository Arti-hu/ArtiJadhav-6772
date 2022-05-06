package Modifier;
import OopsConcept.*;

class Display
{
	int a=2,b=3,c;
	
	void cal()
	{
		c=a+b;
		System.out.println("Addition is  "+c);
	}
	
}
public class Protected extends Simple
{


	public static void main(String[] args) 
	{
		Protected p1=new Protected();
		p1.Demo();
		System.out.println("Addition is:  "+p1.add(4, 5));

	}

}
