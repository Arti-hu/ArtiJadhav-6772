package Java8;

import java.util.function.Supplier;

public class UseSupplier 
{

	public static void main(String[] args) 
	{
		int a=10;
		Supplier s1=()->a/2;
		System.out.println(s1.get());

	}

}
