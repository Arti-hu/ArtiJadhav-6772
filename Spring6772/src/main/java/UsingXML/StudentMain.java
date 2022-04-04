package UsingXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) 
	{
	    AbstractApplicationContext context=new ClassPathXmlApplicationContext("BeanLifeCycle/LifeCycle.xml");
		context.registerShutdownHook();
		Student s=(Student) context.getBean("student");
		
		System.out.println(s.getStudentId());
		System.out.println(s.getStudentName());
		System.out.println(s.getEducation());

	}

}
