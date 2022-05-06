package byType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		ApplicationContext ac=new ClassPathXmlApplicationContext("byType/byType.xml");
		Employee e= ac.getBean(Employee.class,"employee");
		System.out.println(e.getEid());
		System.out.println(e.getName());
		System.out.println(e.getProject());

	}

}
