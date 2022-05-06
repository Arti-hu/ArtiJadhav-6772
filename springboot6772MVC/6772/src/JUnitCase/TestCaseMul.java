package JUnitCase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import JUnit.Mul;

public class TestCaseMul 
{
   
	
	@Test
	public void test()
	{
		Mul m1=new Mul();
		int a=m1.cal(6, 7);
		int b=m1.div(12, 4);
		Assert.assertEquals(42, a);
		Assert.assertEquals(3, b);
	}
	@Test
	public void test2()
	{
		System.out.println("THis is another test method");
		Mul m2=new Mul();
		int a1=m2.cal(2, 3);
		Assert.assertTrue(6==a1);
		Assert.assertFalse(7==a1);
		
	}
	@Test
	public void test3()
	{
		int[]a= {1,2,3,4};
		int[]b= {1,2,3,4};
		Assert.assertArrayEquals(a, b);
			}
	
	@Test
	public void test4()
	{
		String s1="Edubridge";
		String s2="Edubridge";
		Assert.assertNotNull(s2);
	//	Assert.assertNull(s1);
		Assert.assertSame(s1,s2);;
       // Assert.assertNotSame(s1, s2);
		
	}
	
	
	

}
