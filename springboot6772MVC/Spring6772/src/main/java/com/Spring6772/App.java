package com.Spring6772;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.bean.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
        Student s=(Student) context.getBean("stud");
        System.out.println(s);
        
        
        Student s1=(Student) context.getBean("stud1");
        System.out.println(s1);
        
        Student s2=(Student) context.getBean("stud2");
        System.out.println(s2);
    }
}
