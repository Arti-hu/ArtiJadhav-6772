package com.HibernateProject;

import java.util.*;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

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
         
		Criteria cr=session.createCriteria(Student.class);
		cr.add(Restrictions.gt("age",18));
		List list=cr.list();
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		Criteria cr1=session.createCriteria(Student.class);
		cr1.add(Restrictions.le("age",21));
		List list1=cr1.list();
		for(int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i));
		}
		
		Criteria cr2=session.createCriteria(Student.class);
		cr2.add(Restrictions.between("age",21,25));
		List list2=cr2.list();
		for(int i=0;i<list2.size();i++)
		{
			System.out.println(list2.get(i));
		}
		
		Criteria cr3=session.createCriteria(Student.class);
		cr3.add(Restrictions.like("name", "%i"));
		List list3=cr3.list();
		for(int i=0;i<list3.size();i++)
		{
			System.out.println(list3.get(i));
		}
		
		Criteria cr4=session.createCriteria(Student.class);
		cr4.addOrder(Order.desc("age"));
		List list4=cr4.list();
		for(int i=0;i<list4.size();i++)
		{
			System.out.println(list4.get(i));
		}
		
		Criteria cr5=session.createCriteria(Student.class);
		cr5.setProjection(Projections.min("age"));
		List list5=cr5.list();
		System.out.println("Minimum age is  "+list5);
		
		Criteria cr6=session.createCriteria(Student.class);
		cr6.setProjection(Projections.max("age"));
		List list6=cr6.list();
		System.out.println("Max age is  "+list6);
		
		Criteria cr7=session.createCriteria(Student.class);
		cr7.setProjection(Projections.avg("age"));
		List list7=cr7.list();
		System.out.println("avg is  "+list7);
		
		Criteria cr8=session.createCriteria(Student.class);
		cr8.setFirstResult(1);
		cr8.setMaxResults(3);
		List list8=cr8.list();
		for(int i=0;i<list8.size();i++)
		{
			System.out.println(list8.get(i));
		}
		
		
		/*between
		 * Student s0=new Student(); s0.setRollno(1); s0.setName("Avni");
		 * s0.setEmail("avni@gmail.com"); s0.setAge(20);
		 * 
		 * Student s=new Student(); s.setRollno(2); s.setName("Priyanka");
		 * s.setEmail("priyanka@gmail.com"); s.setAge(18);
		 * 
		 * Student s1=new Student(); s1.setRollno(3); s1.setName("Manasi");
		 * s1.setEmail("manasi@gmail.com"); s1.setAge(21);
		 * 
		 * Student s2=new Student(); s2.setRollno(4); s2.setName("Pooja");
		 * s2.setEmail("pooja@gmail.com"); s2.setAge(24);
		 * 
		 * Student s3=new Student(); s3.setRollno(5); s3.setName("Vaidahi");
		 * s3.setEmail("vaidahi@gmail.com"); s3.setAge(25);
		 * 
		 * session.save(s0); session.save(s); session.save(s1); session.save(s2);
		 * session.save(s3);
		 * 
		 * tf.commit();
		 */
        
		/*
		 * Criteria crr=session.createCriteria(Student.class); crr.setFirstResult(1);
		 * //check 1 index crr.setMaxResults(3); List list=crr.list();
		 * System.out.println(list);
		 * 
		 * 
		 * // Restrictions result particular data Criteria
		 * cr=session.createCriteria(Student.class);
		 * cr.add(Restrictions.between("age",20,24)); List list1=cr.list(); for(int
		 * i=0;i<list1.size();i++) { System.out.println(list1.get(i)); }
		 * 
		 * System.out.println("****************************************");
		 * 
		 * Criteria cr1=session.createCriteria(Student.class);
		 * cr1.add(Restrictions.like("name", "P%")); List listt=cr1.list(); for(int
		 * i=0;i<list.size();i++) { System.out.println(list.get(i)); }
		 * 
		 * System.out.println("****************************************"); Criteria
		 * cr2=session.createCriteria(Student.class); cr2.addOrder(Order.asc("name"));
		 * List list2=cr2.list(); for(int i=0;i<list2.size();i++) {
		 * System.out.println(list2.get(i)); }
		 * 
		 * System.out.println("****************************************");
		 * 
		 * //Projections fetch particular column
		 * 
		 * Criteria cr3=session.createCriteria(Student.class);
		 * cr3.setProjection(Projections.property("name")); List list3=cr3.list();
		 * for(int i=0;i<list3.size();i++) { System.out.println(list3.get(i)); }
		 * 
		 * System.out.println("****************************************");
		 * 
		 * Criteria cr4=session.createCriteria(Student.class);
		 * cr4.setProjection(Projections.min("age")); List list4=cr4.list();
		 * System.out.println("\nminimum age: "+list4);
		 * 
		 * cr4.setProjection(Projections.rowCount()); List list5=cr4.list();
		 * System.out.println("row count : "+list5);
		 * 
		 * cr4.setProjection(Projections.avg("age")); List list6=cr4.list();
		 * System.out.println("Avg age: "+list6);
		 */
        
        
//        Student s=session.get(Student.class, 1);        
//        Student s1=session.load(Student.class, 3);
//        System.out.println(s1);
//        
//        String s1="from  Student";
//        Query query=session.createQuery(s1);
//        List<Student>list=query.list();
//        System.out.println(list);
        
        
        
        
        
    }
}
