package byConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorMain {

	public static void main(String[] args) 
	{
		ApplicationContext ac=new ClassPathXmlApplicationContext("byConstructor/byConstructor.xml");
		
		Laptop lap= ac.getBean(Laptop.class,"laptop");
		System.out.println(lap.getName());
		System.out.println(lap.getPrice());
		System.out.println(lap.getProcessor());
		
	}

}
