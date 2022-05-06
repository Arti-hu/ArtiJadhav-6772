package collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionMain 
{

	public static void main(String[] args) 
	{
		ApplicationContext ac=new ClassPathXmlApplicationContext("collection/SpringCollection.xml");
		Employee e=ac.getBean(Employee.class,"employee");
		System.out.println(e.getEid());
		System.out.println(e.getName());
		System.out.println(e.getProject());
		System.out.println(e.getMobile());
		System.out.println(e.getEmail());

	}

}
