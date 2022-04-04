package byName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		ApplicationContext ac= new ClassPathXmlApplicationContext("byName/byName.xml");
		Person p= (Person)ac.getBean("person");
		System.out.println(p);

	}

}
