package com.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorMain 
{

	public static void main(String[] args) 
	{
		ApplicationContext ac =new ClassPathXmlApplicationContext("com/constructor/SpringConstructor.xml");
        Laptop lap=(Laptop) ac.getBean("laptop");
        System.out.println(lap);
        
        Laptop lap1= (Laptop) ac.getBean("laptop1");	
        System.out.println(lap1);
	}
	
	

}
