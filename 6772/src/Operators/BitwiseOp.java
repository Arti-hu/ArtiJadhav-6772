package Operators;

public class BitwiseOp 
{

	public static void main(String[] args) 
	{
		int a=8,b=5,c;
		
		//Bitwise AND(&)operator
		c=a&b;
		System.out.println("a&z  "+c);
		
		
		//Bitwise OR(|)operator
		
		c=a|b;
		System.out.println("a|b  "+c);
		
		//Bitwise XOR(^)operator
		
		c=a^b;
		System.out.println("a^b  "+c);
		
		//Bitwise Complement(~)operator
		//c= ~b;
		System.out.println("~b "+(~b));

	}

}
