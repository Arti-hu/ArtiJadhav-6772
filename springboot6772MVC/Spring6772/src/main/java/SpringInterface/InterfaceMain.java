package SpringInterface;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InterfaceMain 
{

	public static void main(String[] args) 
	{
       AbstractApplicationContext context= new ClassPathXmlApplicationContext("SpringInterface/SpringInterface.xml");
       context.registerShutdownHook();
       Student1 s=(Student1)context.getBean("student1");
       System.out.println(s);

	}

}
