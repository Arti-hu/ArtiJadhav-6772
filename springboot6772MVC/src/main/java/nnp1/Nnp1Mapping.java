package nnp1;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Nnp1Mapping {

	public static void main(String[] args) 
	{
		Configuration con=new Configuration();
		con.configure("HibernateMaven.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.getSessionFactory().openSession();
		 
		//List<Class1> list=session.createQuery("from Class1",Class1.class).getResultList();
		List<Class1> list=session.createQuery("from Class1 cc JOIN fetch cc.student",Class1.class).getResultList();
		
		for(Class1 cl:list)
		{
			System.out.println("Class Details...................");
			System.out.println(cl.getClassId()+"\t"+cl.getClassName());
			 
			List<Student11>list2=cl.getStudent();
			for(Student11 stu:list2)
			{
				//System.out.println("*************************");
				System.out.println(stu.getStuId()+"\t"+stu.getName());
				
			}
			
			
		}
		
		/*
		 * Session session=sf.openSession(); Transaction tf= session.beginTransaction();
		 * 
		 * Class1 c=new Class1(); c.setClassName("Computer");
		 * 
		 * 
		 * Class1 c1=new Class1(); c1.setClassName("Physics");
		 * 
		 * 
		 * 
		 * 
		 * Student11 s=new Student11(); s.setStuId(11); s.setName("Arti");
		 * s.setClass1(c);
		 * 
		 * Student11 s1=new Student11(); s1.setStuId(22); s1.setName("Avni");
		 * s1.setClass1(c);
		 * 
		 * Student11 s2=new Student11(); s2.setStuId(33); s2.setName("Pooja");
		 * s2.setClass1(c1);
		 * 
		 * Student11 s3=new Student11(); s3.setStuId(44); s3.setName("Megha");
		 * s3.setClass1(c1);
		 * 
		 * Student11 s4=new Student11(); s4.setStuId(55); s4.setName("Geeta");
		 * s4.setClass1(c1);
		 * 
		 * List<Student11> list1=new ArrayList(); list1.add(s); list1.add(s1);
		 * 
		 * List<Student11> list2=new ArrayList(); list2.add(s2); list2.add(s3);
		 * list2.add(s4);
		 * 
		 * c.setStudent(list1); c1.setStudent(list2);
		 * 
		 * session.save(c); session.save(c1);
		 * 
		 * tf.commit();
		 */
		 
	}

}
