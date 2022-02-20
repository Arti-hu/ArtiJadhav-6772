package Operators;

public class ShiftOp 
{

	public static void main(String[] args)
	{
		int a=36;
		int b=45;
		System.out.println("Right shift 36 divided by 2 "+(a>>2));
		System.out.println("Right shift 45 divided by 2 "+(b>>2));
		System.out.println("Left shift 36 multiply by 2 "+(a<<2));
		System.out.println("Left shift 36 multiply by 2 "+(b<<2));
		System.out.println("Right shift zero fill to shift 20 "+(-1>>>20));

	}

}
