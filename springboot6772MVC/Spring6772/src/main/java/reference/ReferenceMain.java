package reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReferenceMain 
{

	public static void main(String[] args) 
	{
		ApplicationContext ac=new ClassPathXmlApplicationContext("reference/SpringReference.xml");
		Person e=(Person) ac.getBean("person");
		System.out.println(e.getPid());
		System.out.println(e.getName());
		System.out.println(e.getPhone());
		System.out.println(e.getAddress());
		
	}

}
