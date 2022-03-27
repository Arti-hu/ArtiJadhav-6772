package com.HibernateProject;

import java.util.*;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Configuration config=new Configuration();
        config.configure("HibernateMaven.cfg.xml");
        SessionFactory sf=config.buildSessionFactory();
        Session session=sf.openSession();          
        Transaction tf=session.beginTransaction(); 
        
//        Student s=new Student();
//        s.setRollno(3);
//        s.setName("Avni");
//        s.setEmail("avni@gmail.com");
//        session.save(s);
//        tf.commit();
        
       // Student s=session.get(Student.class, 1);
      
        
         Student s1=session.load(Student.class, 3);
         System.out.println(s1);
        
//       String s1="from  Student";
//      Query query=session.createQuery(s1);
//      List<Student>list=query.list();
//      System.out.println(list);
    }
}
