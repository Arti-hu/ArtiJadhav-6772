package JUnitCase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import JUnit.Sum;

public class TestCaseSum 
{
	@Before
   public void before()
   {
	   System.out.println("Before Test");
   }
	@Test
	public void test() 
	{
		Sum obj=new Sum();
		System.out.println("This is test case");
		int a=obj.mul(5, 5);
		Assert.assertEquals(25, a);
	}
	@After
	public void after()
	{
		System.out.println("After test");
	}

}
