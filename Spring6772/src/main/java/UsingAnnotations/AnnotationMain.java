package UsingAnnotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationMain {

	public static void main(String[] args) 
	{
		AbstractApplicationContext ac=new ClassPathXmlApplicationContext("UsingAnnotations/Annotation.xml");
		ac.registerShutdownHook();
        Student3 s= (Student3) ac.getBean("stud3");
        System.out.println(s);
	}

}
